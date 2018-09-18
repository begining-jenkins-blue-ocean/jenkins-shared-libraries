def call() {
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
