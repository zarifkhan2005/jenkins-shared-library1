def call(String project, String imageTag, String dockerHubUser) {

    withCredentials([
        usernamePassword(
            credentialsId: 'dockerhubCred',
            usernameVariable: 'dockerHubUser',
            passwordVariable: 'dockerHubPass'
        )
    ]) {

        sh "echo ${dockerHubPass} | docker login -u ${dockerHubUser} --password-stdin"

        sh "docker push ${dockerHubUser}/${project}:${imageTag}"
    }
}
