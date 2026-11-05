@Library('my-shared-lib') _

pipeline {
    agent any
    tools {
        maven 'maven3.10.0'
        jdk 'java21'
    }
    stages {
        stage ('checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/KrishnaPrasadkp1803/jenkins-shared-library.git'
            }
        }
        stage ('Build') {
            steps {
                mavenBuild()
            }
        }
        stage ('post-build') {
            steps {
                echo "Build completed successfully"
            }
        }
    }
}
