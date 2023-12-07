# Stage 1: Build the application
FROM amazoncorretto:17 as build

WORKDIR /app

COPY ./build.gradle.kts ./settings.gradle.kts ./gradlew .
COPY ./gradle ./gradle
COPY . .

RUN chmod +x ./gradlew
# Convert line endings to Unix format
RUN find . -type f -exec dos2unix {} \;
RUN ./gradlew build || true

COPY ./src ./src

RUN ./gradlew clean build -x test

# Stage 2: Create a runtime container
FROM amazoncorretto:17 as runtime

WORKDIR /app

COPY --from=build /app/build/libs/*.jar /app/app.jar

CMD ["java", "-jar", "app.jar"]
