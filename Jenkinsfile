pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                bat 'mvn clean package'   // Use 'sh' for Linux/Mac
            }
        }
        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                bat 'echo Deploying Application...'
            }
        }
    }
}
