def utils
def config
pipeline{
    agent any;
    environment{
        // hard coded Version? eww?!
        APP_VER = "v0.10.5"
        // ECR_PROFILE = "ecr-user"
        // ECR_REGION = "us-east-1"
        // ECR_ADDR = "823899318117.dkr.ecr.us-east-1.amazonaws.com"
    }


    stages{
        stage("__init__") {
            steps{
                script{
                    utils = load "var/utils.groovy"
                }
            }
        }

        stage("Build 01/12 Adservice"){
            steps{
                script{
                    API_NAME = "adservice"
                    dir("src/$API_NAME"){
                        utils.runtimeCheck()
                        utils.apiBuild()
                        utils.pushImage("AWS")
                    }
                }
            }
        }

        stage("Build 02/12 Cartservice"){
            steps{
                script{
                    API_NAME = "cartservice"
                    dir("src/$API_NAME/src"){
                        utils.runtimeCheck()
                        utils.apiBuild()
                        utils.pushImage("AWS")
                    }
                }
            }
        }

        stage("Build 03/12 Checkoutservice"){
            steps{
                script{
                    API_NAME = "checkoutservice"
                    dir("src/$API_NAME"){
                        utils.runtimeCheck()
                        utils.apiBuild()
                        utils.pushImage("AWS")
                    }
                }
            }
        }

        stage("Build 04/12 Currencyservice"){
            steps{
                script{
                    API_NAME = "currencyservice"
                    dir("src/$API_NAME"){
                        utils.runtimeCheck()
                        utils.apiBuild()
                        utils.pushImage("AWS")
                    }
                }
            }
        }

        stage("Build 05/12 emailservice"){
            steps{
                script{
                    API_NAME = "emailservice"
                    dir("src/$API_NAME"){
                        utils.runtimeCheck()
                        utils.apiBuild()
                        utils.pushImage("AWS")
                    }
                }
            }
        }

        stage("Build 06/12 Frontend"){
            steps{

                script{
                    API_NAME = "frontend"
                    dir("src/$API_NAME"){
                        utils.runtimeCheck()
                        utils.apiBuild()
                        utils.pushImage("AWS")
                    }
                }
            }
        }

        stage("Build 07/12 Loadgenerator"){
            steps{
                script{
                    API_NAME = "loadgenerator"
                    dir("src/$API_NAME"){
                        utils.runtimeCheck()
                        utils.apiBuild()
                        utils.pushImage("AWS")
                    }
                }
            }
        }

        stage("Build 08/12 Paymentservice"){
            steps{
                script{
                    API_NAME = "paymentservice"
                    dir("src/$API_NAME"){
                        utils.runtimeCheck()
                        utils.apiBuild()
                        utils.pushImage("AWS")
                    }
                }
            }
        }

        stage("Build 09/12 Productcatalogservice"){
            steps{
                script{
                    API_NAME = "productcatalogservice"
                    dir("src/$API_NAME"){
                        utils.runtimeCheck()
                        utils.apiBuild()
                        utils.pushImage("AWS")
                    }
                }
            }
        }

        stage("Build 10/12 Recommendationservice"){
            steps{
                script{
                    API_NAME = "recommendationservice"
                    dir("src/$API_NAME"){
                        utils.runtimeCheck()
                        utils.apiBuild()
                        utils.pushImage("AWS")
                    }
                }
            }
        }

        stage("Build 11/12 Shippingservice"){
            steps{
                script{
                    API_NAME = "shippingservice"
                    dir("src/$API_NAME"){
                        utils.runtimeCheck()
                        utils.apiBuild()
                        utils.pushImage("AWS")
                    }
                }
            }
        }

        stage("Build 12/12 Shoppingassistantservice"){
            // Source code is compiled, dependencies are resolved, and an executable artifact is created.
            steps{
                script{
                    API_NAME = "shoppingassistantservice"
                    dir("src/$API_NAME"){
                        utils.runtimeCheck()
                        utils.apiBuild()
                        utils.pushImage("AWS")
                    }
                }
            }
        }


        ////////////////////////////////// 
        // stage("Test"){
        //     // Automatic checks run to verify code quality, security vulnerabilities, and functional correctness (unit testing, SAST).
        //     steps{}
        // }

        // stage("Package/Staging"){
        //     // The build is packaged into a deployable format (e.g., a Docker image) and deployed to a staging environment that mirrors production.
        //     steps{}
        // }

        // stage("Acceptance/Dynamic Test"){
        //     // Further testing, including integration or performance tests (DAST), is performed in the staging environment.
        //     steps{}
        // }

        // stage("Deploy/Production"){
        //     // The validated application is released to the production environment.
        //     steps{}
        // }

    }
}





// adservice
// cartservice
// checkoutservice
// currencyservice
// emailservice
// frontend
// loadgenerator
// paymentservice
// productcatalogservice
// recommendationservice
// shippingservice
// shoppingassistantservice