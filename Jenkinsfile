pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                script {
                    bat 'mvn clean package'  // Use 'bat' instead of 'sh' for Windows
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    bat 'mvn test'
                }
            }
        }

        stage('Deploy') {
            steps {
                script {
                    echo "Deploying application..."
                    
                    // Stop the running application (if exists)
                    bat 'taskkill /F /IM java.exe || echo No existing process'
                    
                    // Copy JAR file to deployment location
                    bat 'copy target\\myapp.jar C:\\Deploy\\myapp.jar'
                    
                    // Start the application in the background
                    bat 'start /B java -jar C:\\Deploy\\myapp.jar > C:\\Deploy\\app.log 2>&1'
                    
                    echo "Application deployed successfully!"
                }
            }
        }
    }
}
