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
                    // sh 'ls -la' // Linux
                }
            }
        }

        stage('Find and Validate POM') {
            steps {
                script {
                    def modules = ['ApiGateway', 'EurekaServer', 'MgmtService', 'UserInterface']
                    def pomFound = false
                    for (module in modules) {
                        if (fileExists("${module}/pom.xml")) {
                            echo "✅ Found pom.xml in ${module}"
                            pomFound = true
                            env.BUILD_DIR = module
                            break
                        }
                    }
                    if (!pomFound) {
                        error("❌ No pom.xml found! Ensure the repository has a valid Maven project.")
                    }
                }
            }
        }

        stage('Build') {
            steps {
                script {
                    echo "Building project inside ${env.BUILD_DIR}..."
                    bat "cd ${env.BUILD_DIR} && mvn clean package"
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    echo "Running tests..."
                    bat "cd ${env.BUILD_DIR} && mvn test"
                }
            }
        }

        stage('Deploy') {
            steps {
                script {
                    echo "Deploying application..."
                    // Add deployment logic
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
