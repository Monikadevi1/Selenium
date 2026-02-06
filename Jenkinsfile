pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/Monikadevi1/GuviHackathonProject.git'
            }
        }

        stage('Run Tests') {
            steps {
                sh 'mvn clean test'
            }
        }
    }

    post {
        always {
            publishTestNGResults testResultsPattern: '**/test-output/testng-results.xml'
        }
    }
}
