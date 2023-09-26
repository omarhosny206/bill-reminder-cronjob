![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Kotlin](https://img.shields.io/badge/kotlin-%237F52FF.svg?style=for-the-badge&logo=kotlin&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Docker](https://img.shields.io/badge/docker-%230db7ed.svg?style=for-the-badge&logo=docker&logoColor=white)
![Kubernetes](https://img.shields.io/badge/kubernetes-%23326ce5.svg?style=for-the-badge&logo=kubernetes&logoColor=white)
![GitHub Actions](https://img.shields.io/badge/github%20actions-%232671E5.svg?style=for-the-badge&logo=githubactions&logoColor=white)
# Bill Reminder CronJob

This repository contains Kubernetes configuration files for setting up a CronJob to run a Spring Boot application called "bill-reminder-app." This application includes a command line runner bean that executes when the pod is created by the Kubernetes CronJob. The CronJob is scheduled to run at a specified interval to send bill reminders.

## How Kubernetes CronJobs Work

Kubernetes CronJobs automate tasks by creating Pods based on a predefined schedule. When a CronJob is scheduled to run, it creates a new Pod with the specified container image and runs the task. Once the task is completed, the Pod is terminated, ensuring that resources are efficiently managed in the cluster. CronJobs also offer features like retries and backoff limits, allowing you to control how tasks are executed and handle potential failures.

## Prerequisites

Before you proceed, make sure you have the following prerequisites installed:

- ⚙️ [kubectl](https://kubernetes.io/docs/tasks/tools/install-kubectl/): Kubernetes command-line tool.
- 🚀 A running Kubernetes cluster. You can use [minikube](https://minikube.sigs.k8s.io/docs/start/) for local development/testing or any other Kubernetes cluster.

## Usage

1. Clone this repository to your local machine:

   ```shell
   git clone https://github.com/omarhosny206/bill-reminder-cronjob.git
   cd bill-reminder-cronjob
   ```
2. Apply the Kubernetes configuration to create the CronJob:
   ```shell
   kubectl apply -f k8s.yml
   ```
3. Monitor the CronJob and its associated pods:
   ```shell
   kubectl get cronjob
   kubectl get pods
   ```
4. View the logs of the CronJob for a specific pod to see the output of the Spring Boot application:
   ```shell
   kubectl logs <pod_name>
   ```
