    pipeline {
        tools { 
            maven 'MAVEN362'
            jdk "JAVA9" 
        }


        stages {
            stage('Build Jar') {
                steps {
                    sh "mvn clean package"
                }
            }

            stage('Build Docker Image') {   
                steps {
                    sh "docker image build -t cassionoronha/basicspringboot:0.2b ."
                    sh "docker push cassionoronha/basicspringboot:0.2b"
                    sh "docker rmi cassionoronha/basicspringboot:0.2b"
                }
            }

            stage('Deploy') {   
                steps {
                    script {
                        sh "kubectl apply -f ./kubernetes"
                    }
                }
            }
        }
    }
