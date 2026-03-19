// It is better if the library is loaded as Shared Library. For mobility purpose it 
// is used this way. 

// # REPO SETTINGS
def REPO_ADDR = "823899318117.dkr.ecr.us-east-1.amazonaws.com"

// ## AWS repo settings 
def ECR_PROFILE = "ecr-user"
def ECR_REGION = "us-east-1"

// NEXUS repo settings


def say_hello(Map config){
    echo "Hello from var/utils/say_hello with a message ${config.message} second: ${config.second} App Ver: ${APP_VER}"
}

def runtimeCheck(){
    // Dockerfile is specialized for new version of Docker runtime by BUILDPLATFORM with a value. 
    // Podman/Buildah or older Docker versions) treat BUILDPLATFORM as redefining a reserved argument, which triggers the error.
    // So, if the runtime other than new version of Docker, BUILDPLATFORM's value should be removed. In this case, this function 
    // checks only if Podman is installed.

    sh 'if rpm -q podman; then sed -i "s*ARG BUILDPLATFORM=linux/amd64*ARG BUILDPLATFORM*" Dockerfile; fi'
}

def apiBuild(){
    // If the runtime is Podman, it is better to install podman-docker package to translate Docker commands for Podman
    sh "docker build -t $REPO_ADDR/$API_NAME:$APP_VER ."
}




def pushImage(String targetRepo){
    // Uploads depend on target type;
    // Valid repo(s): "AWS" for now. 

    if (targetRepo == "AWS") {
        echo "LOGIN AND PUSH TO AWS"
        // If the target repo is going to be AWS, the connection profile sould be configured on every node(s) with [ecr-user] 
        sh "aws ecr get-login-password --profile $ECR_PROFILE --region $ECR_REGION | docker login --username AWS --password-stdin $REPO_ADDR"
        sh "if aws ecr create-repository --profile=ecr-user --repository-name $API_NAME 2> /dev/null; then echo $API_NAME remote repo is created ;fi"
        sh "docker push $REPO_ADDR/$API_NAME:$APP_VER"
    }
}




return this