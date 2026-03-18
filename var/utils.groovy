// It is better if the library is loaded as Shared Library. For mobility purpose it 
// is used this way. 
APP_VER = "v0.10.5"
ECR_PROFILE = "ecr-user"
ECR_REGION = "us-east-1"
ECR_ADDR = "823899318117.dkr.ecr.us-east-1.amazonaws.com"

def say_hello(Map config){
    echo "Hello from var/utils/say_hello with a message ${config.message} second: ${config.second} App Ver: ${APP_VER}"
}

return this