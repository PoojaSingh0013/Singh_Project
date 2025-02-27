pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                script {
                    echo "Checking out the repository..."
                    checkout scm
                    
                    echo "Listing files in workspace after checkout:"
                    bat 'dir'  // Windows
                    // sh 'ls -la' // Use this if running on Linux
                }
            }
        }

        stage('Validate POM') {
            steps {
                script {
                    def pomExists = fileExists('pom.xml')
                    if (!pomExists) {
                        error("❌ pom.xml not found in workspace! Make sure the repository has a valid Maven project.")
                    }
                }
            }
        }

        stage('Build') {
            steps {
                script {
                    echo "Building the project using Maven..."
                    bat 'mvn clean package'
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    echo "Running tests..."
                    bat 'mvn test'
                }
            }
        }

        stage('Deploy') {
            steps {
                script {
                    echo "Deploying application..."
                    // Add your deployment command here
                }
            }
        }
    }

    post {
        failure {
            echo "❌ Build failed! Check logs for details."
        }
        success {
            echo "✅ Build and deployment successful!"
        }
    }
}
