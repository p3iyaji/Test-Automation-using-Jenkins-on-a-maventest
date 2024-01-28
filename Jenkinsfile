pipeline {
  agent any
 
  stages{
  stage("Compilation") {
          steps{
            sh 'mvn clean install'
          }
        
      }
      stage("Clone the project") {
          steps{
           script{
                mvn clean test
          }
      	}
    }


	}
}