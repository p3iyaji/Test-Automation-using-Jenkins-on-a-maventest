pipeline {
  agent any
  tools{
    maven 'MAVEN'
  }
  stages{
      stage("Clone the project") {
          steps{
           script{
                mvn clean test
          }
      	}
    }


	}
}