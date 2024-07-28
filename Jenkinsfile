pipeline {
    agent any

    stages {
        stage("Build") {
            steps {
                dir('book-service') {
                    sh 'mvn -DskipTests clean package'
                }
            }
        }
        stage("Test") {
            steps {
                dir('book-service') {
                    sh 'mvn test'
                }
            }
        }
    }
}
