# SpringBoot Microservices with DevOps

## Overview
This repository showcases a SpringBoot microservices integrated with various DevOps tools and practices. The aim is to demonstrate a seamless CI/CD pipeline, containerization, and orchestration using modern tools.

## DevOps Tools

### Jenkins
- **Image:** lts-jdk17
- Jenkins is used as the Continuous Integration (CI) tool to automate the build and deployment process.

### Docker
- Docker is used for containerization, ensuring that the application runs consistently across different environments.

### Ngrok
- Ngrok is used for local testing by exposing Jenkins running on your local machine to the internet.

## Future Enhancements
- **Kubernetes:** Plan to implement local Kubernetes orchestration using Minikube to manage and deploy containerized applications.

## Getting Started

### Prerequisites
- Docker installed on your local machine
- Ngrok account for creating secure tunnels
- Jenkins Docker image with lts-jdk17

### Installation

1. **Clone the repository:**
   ```bash
   git clone https://github.com/your-username/springboot-microservices-devops.git
   cd springboot-microservices-devops
2. **Run jenkins using docker**
   ```bash
   docker run -p 8080:8080 -p 50000:50000 jenkins/jenkins:lts-jdk17
3. **Expose Jenkins with Ngrok:**
   ```bash
   ngrok http 8080


### Running the Microservices
- Detailed instructions on running the SpringBoot microservices will be provided soon.


