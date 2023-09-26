# Bill Reminder CronJob

This repository contains Kubernetes configuration files for setting up a CronJob to run a Spring Boot application called "bill-reminder-app." This application includes a command line runner bean that executes when the pod is created by the Kubernetes CronJob. The CronJob is scheduled to run at a specified interval to send bill reminders.

## Prerequisites

Before you proceed, make sure you have the following prerequisites installed:

- [kubectl](https://kubernetes.io/docs/tasks/tools/install-kubectl/): Kubernetes command-line tool.
- A running Kubernetes cluster. You can use [minikube](https://minikube.sigs.k8s.io/docs/start/) for local development/testing or any other Kubernetes cluster.

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
