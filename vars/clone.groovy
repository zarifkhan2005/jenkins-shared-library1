def call(String giturl , String branch){
echo "this is cloning the code"
git url: "$(giturl)", branch: "$(branch)"
echo "code cloning successfully"
}
