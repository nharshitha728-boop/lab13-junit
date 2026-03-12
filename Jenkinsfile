pipeline {
    agent any
    tools {
        jdk 'JDK17'
        maven 'Maven3'
    }
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Build & Test') {
            steps {
                // IMPORTANT: Use 'bat' for Windows
                bat 'mvn clean test'
            }
        }
    }
    post {
        always {
            // This captures the XML files and shows them in the Jenkins UI
            junit '**/target/surefire-reports/*.xml'
        }
    }
}