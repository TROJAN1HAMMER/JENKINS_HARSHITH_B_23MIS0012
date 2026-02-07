pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'BUILD STAGE - HARSHITH B 23MIS0012'
            }
        }

        stage('Test') {
            steps {
                echo 'TESTING THE APPLICATION - HARSHITH B 23MIS0012'
            }
        }

        stage('Deploy') {
            steps {
                echo 'DEPLOY STAGE COMPLETED - HARSHITH B 23MIS0012'
            }
        }
    }
}
