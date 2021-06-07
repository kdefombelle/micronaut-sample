pipeline {
    agent { label 'maven-jdk-8' }
    stages {
        stage('Environment') {
            steps {
                sh 'id' 
                sh 'java -version'
                sh 'mvn -version'
                sh 'pwd'
            }
        }
        stage('Version control') {
            steps {
				sh 'echo branch: ${BRANCH}'
                git credentialsId: 'kdefombelle', url: 'https://stash.murex.com/scm/~kdefombelle/micronaut-sample.git', branch: '${BRANCH}'
                sh 'ls -lrt'
            }
        }
        stage('Build') { 
            steps {
                configFileProvider([configFile(fileId: 'mvn-settings-intapac', variable: 'MAVEN_SETTINGS_XML')]) {
                    sh 'echo maven settings: $MAVEN_SETTINGS_XML'
                    //-B,--batch-mode
                    sh 'mvn -B -s $MAVEN_SETTINGS_XML clean install'
                }
            }
        }
        stage('QA') { 
            steps {
                configFileProvider([configFile(fileId: 'mvn-settings-intapac', variable: 'MAVEN_SETTINGS_XML')]) {
                    sh 'echo maven settings: $MAVEN_SETTINGS_XML'
                    sh 'mvn -B -s $MAVEN_SETTINGS_XML -Psonar sonar:sonar'
                }
            }
        }
        stage('Deploy') { 
            steps {
                configFileProvider([configFile(fileId: 'mvn-settings-intapac', variable: 'MAVEN_SETTINGS_XML')]) {
                    sh 'echo maven settings: $MAVEN_SETTINGS_XML'
                    //https://stackoverflow.com/questions/6308162/maven-the-packaging-for-this-project-did-not-assign-a-file-to-the-build-artifac
                    //calling jar:jar before deploy:deploy sets some info in context to enable deploy:deploy to work (but does not recreate the jar)
                    //quicker than simply -Dmaven.test.skip=true
                    sh 'mvn -B -s $MAVEN_SETTINGS_XML jar:jar deploy:deploy'
                }
            }
        }
    }
}
