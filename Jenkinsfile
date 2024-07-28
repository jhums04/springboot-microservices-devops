pipeline {
    agent any

    environment {
        DOCKER_CREDENTIALS_ID = 'jbonganciso04' // Docker credentials stored in Jenkins
        DOCKER_IMAGE = 'jbonganciso04/book-service:latest' // Change to your Docker repo and image name
    }

    stages {
        stage("Build") {
            steps {
                dir('book-service') {
                    sh 'mvn -DskipTests clean package'
                }
            }
        }

        stage("Docker Build") {
            steps{
                dir('book-service') {
                    sh 'docker build -t ${DOCKER_IMAGE} .'
                }
            }
            }
        }
    }
