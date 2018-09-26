def call() {
pipeline {  
  stages {
    stage('Build') {
      steps {
        echo "Building"
      }
    }
    stage('Test') {
      steps {
        echo "Testing"
      }
    }
    stage('Publish') {
      steps {
        echo "Publishing"
      }
    } 
  }
}
}
  
