def call() {
pipeline {
  agent any
    stages {
      stage('Odd Stage') {
        steps {
          echo "The build number is odd"
        }
      }
    }
  }
}