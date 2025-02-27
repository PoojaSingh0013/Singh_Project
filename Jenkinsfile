pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                script {
                    sh 'mvn clean package'  // Adjust this based on your build tool
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    sh 'mvn test'  // Run tests before deployment
                }
            }
        }

        stage('Deploy') {
            steps {
                script {
                    echo "Deploying application..."

                    // Stop existing service (if running)
                    sh 'pkill -f myapp.jar || true' 

                    // Copy JAR/WAR to the deployment location
                    sh 'cp target/myapp.jar /home/youruser/app/'

                    // Start the application (adjust port if needed)
                    sh 'nohup java -jar /home/youruser/app/myapp.jar > /home/youruser/app/app.log 2>&1 &'
                    
                    echo "Application deployed successfully!"
                }
            }
        }
    }
}
