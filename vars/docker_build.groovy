def call(String projectName, String imageTag, String dockerHubUser) {

    sh "docker build --network=host -t ${dockerHubUser}/${projectName}:${imageTag} ."
}
