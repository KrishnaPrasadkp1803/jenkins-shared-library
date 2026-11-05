def call() {
    stage ('Build using the shared library') {
        echo "running maven build from the shared library..."
        sh 'mvn clean package'
    }
}

