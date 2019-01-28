pipeline{
  agent any
  
  stages{
    stage('build'){
      step{
        sh 'ant -f build.xml -v'
      }
    }
  }
  
  post{
	alway{
		archive 'dist/*.jar'
	}
  }
}
