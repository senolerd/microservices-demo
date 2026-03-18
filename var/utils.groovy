// It is better if the library is loaded as Shared Library. For mobility purpose it 
// is used this way. 

def say_hello(Map config){
    echo "Hello from var/utils/say_hello with a message ${config.message}"
}

return this