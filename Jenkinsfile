def utils
def config
pipeline{
    agent any;
    environment{
        // hard coded Version? eww?!
        APP_VER = "v0.10.5"
        ECR_PROFILE = "ecr-user"
        ECR_REGION = "us-east-1"
        ECR_ADDR = "823899318117.dkr.ecr.us-east-1.amazonaws.com"
    }


    stages{
        stage("__init__") {
            steps{
                script{
                    // config = load "var/config.groovy"
                    utils = load "var/utils.groovy"
                }
            }
        }

        stage("Build 01/12 Adservice"){
            steps{
                script{
                    def API_NAME = "adservice"
                    dir("src/$API_NAME"){
                        // utils.runtimeCheck()
                        // utils.apiBuild()
                        // utils.pushImage("AWS")
                        // Podman/Buildah or older Docker versions) treat BUILDPLATFORM as redefining a reserved argument, which triggers the error.
                        // sh 'if rpm -q podman; then sed -i "s*ARG BUILDPLATFORM=linux/amd64*ARG BUILDPLATFORM*" Dockerfile; fi'
                            // ADSERVICE_VER = sh( 
                            //     script: "cat build.gradle | grep ^version|awk -F= {'print \$2'}",
                            //     returnStdout: true
                            //     ).trim()
                        
                        // sh "docker build -t $ECR_ADDR/$API_NAME:$APP_VER ."

                        // AWS Upload
                        // sh "aws ecr get-login-password --profile $ECR_PROFILE --region $ECR_REGION | docker login --username AWS --password-stdin $ECR_ADDR"
                        // sh "if aws ecr create-repository --profile=ecr-user --repository-name $API_NAME 2> /dev/null; then echo $API_NAME remote repo is created ;fi"
                        // sh "docker push $ECR_ADDR/$API_NAME:$APP_VER"
                    }
                }
            }
        }

        // stage("Build 02/12 Cartservice"){
        //     steps{
        //         script{
        //             def API_NAME = "cartservice"
        //             dir("src/$API_NAME/src"){
                        
        //                 // Podman/Buildah or older Docker versions) treat BUILDPLATFORM as redefining a reserved argument, which triggers the error.
        //                 sh 'if rpm -q podman; then sed -i "s*ARG BUILDPLATFORM=linux/amd64*ARG BUILDPLATFORM*" Dockerfile; fi'
        //                     // ADSERVICE_VER = sh( 
        //                     //     script: "cat build.gradle | grep ^version|awk -F= {'print \$2'}",
        //                     //     returnStdout: true
        //                     //     ).trim()
                        
        //                 sh "docker build -t $ECR_ADDR/$API_NAME:$APP_VER ."

        //                 // AWS Upload
        //                 sh "aws ecr get-login-password --profile $ECR_PROFILE --region $ECR_REGION | docker login --username AWS --password-stdin $ECR_ADDR"
        //                 sh "if aws ecr create-repository --profile=ecr-user --repository-name $API_NAME 2> /dev/null; then echo $API_NAME remote repo is created ;fi"
        //                 sh "docker push $ECR_ADDR/$API_NAME:$APP_VER"
        //             }
        //         }
        //     }
        // }

        // stage("Build 03/12 Checkoutservice"){
        //     steps{
        //         script{
        //             def API_NAME = "checkoutservice"
        //             dir("src/$API_NAME"){
                        
        //                 // Podman/Buildah or older Docker versions) treat BUILDPLATFORM as redefining a reserved argument, which triggers the error.
        //                 sh 'if rpm -q podman; then sed -i "s*ARG BUILDPLATFORM=linux/amd64*ARG BUILDPLATFORM*" Dockerfile; fi'
        //                     // ADSERVICE_VER = sh( 
        //                     //     script: "cat build.gradle | grep ^version|awk -F= {'print \$2'}",
        //                     //     returnStdout: true
        //                     //     ).trim()
                        
        //                 sh "docker build -t $ECR_ADDR/$API_NAME:$APP_VER ."

        //                 // AWS Upload
        //                 sh "aws ecr get-login-password --profile $ECR_PROFILE --region $ECR_REGION | docker login --username AWS --password-stdin $ECR_ADDR"
        //                 sh "if aws ecr create-repository --profile=ecr-user --repository-name $API_NAME 2> /dev/null; then echo $API_NAME remote repo is created ;fi"
        //                 sh "docker push $ECR_ADDR/$API_NAME:$APP_VER"
        //             }
        //         }
        //     }
        // }

        // stage("Build 04/12 Currencyservice"){
        //     steps{
        //         script{
        //             def API_NAME = "currencyservice"
        //             dir("src/$API_NAME"){
                        
        //                 // Podman/Buildah or older Docker versions) treat BUILDPLATFORM as redefining a reserved argument, which triggers the error.
        //                 sh 'if rpm -q podman; then sed -i "s*ARG BUILDPLATFORM=linux/amd64*ARG BUILDPLATFORM*" Dockerfile; fi'
        //                     // ADSERVICE_VER = sh( 
        //                     //     script: "cat build.gradle | grep ^version|awk -F= {'print \$2'}",
        //                     //     returnStdout: true
        //                     //     ).trim()
                        
        //                 sh "docker build -t $ECR_ADDR/$API_NAME:$APP_VER ."

        //                 // AWS Upload
        //                 sh "aws ecr get-login-password --profile $ECR_PROFILE --region $ECR_REGION | docker login --username AWS --password-stdin $ECR_ADDR"
        //                 sh "if aws ecr create-repository --profile=ecr-user --repository-name $API_NAME 2> /dev/null; then echo $API_NAME remote repo is created ;fi"
        //                 sh "docker push $ECR_ADDR/$API_NAME:$APP_VER"
        //             }
        //         }
        //     }
        // }

        // stage("Build 05/12 emailservice"){
        //     steps{
        //         script{
        //             def API_NAME = "emailservice"
        //             dir("src/$API_NAME"){
                        
        //                 // Podman/Buildah or older Docker versions) treat BUILDPLATFORM as redefining a reserved argument, which triggers the error.
        //                 sh 'if rpm -q podman; then sed -i "s*ARG BUILDPLATFORM=linux/amd64*ARG BUILDPLATFORM*" Dockerfile; fi'
        //                     // ADSERVICE_VER = sh( 
        //                     //     script: "cat build.gradle | grep ^version|awk -F= {'print \$2'}",
        //                     //     returnStdout: true
        //                     //     ).trim()
                        
        //                 sh "docker build -t $ECR_ADDR/$API_NAME:$APP_VER ."

        //                 // AWS Upload
        //                 sh "aws ecr get-login-password --profile $ECR_PROFILE --region $ECR_REGION | docker login --username AWS --password-stdin $ECR_ADDR"
        //                 sh "if aws ecr create-repository --profile=ecr-user --repository-name $API_NAME 2> /dev/null; then echo $API_NAME remote repo is created ;fi"
        //                 sh "docker push $ECR_ADDR/$API_NAME:$APP_VER"
        //             }
        //         }
        //     }
        // }

        // stage("Build 06/12 Frontend"){
        //     steps{

        //         script{
        //             def API_NAME = "frontend"
        //             dir("src/$API_NAME"){
                        
        //                 // Podman/Buildah or older Docker versions) treat BUILDPLATFORM as redefining a reserved argument, which triggers the error.
        //                 sh 'if rpm -q podman; then sed -i "s*ARG BUILDPLATFORM=linux/amd64*ARG BUILDPLATFORM*" Dockerfile; fi'
        //                     // ADSERVICE_VER = sh( 
        //                     //     script: "cat build.gradle | grep ^version|awk -F= {'print \$2'}",
        //                     //     returnStdout: true
        //                     //     ).trim()
                        
        //                 sh "docker build -t $ECR_ADDR/$API_NAME:$APP_VER ."

        //                 // AWS Upload
        //                 sh "aws ecr get-login-password --profile $ECR_PROFILE --region $ECR_REGION | docker login --username AWS --password-stdin $ECR_ADDR"
        //                 sh "if aws ecr create-repository --profile=ecr-user --repository-name $API_NAME 2> /dev/null; then echo $API_NAME remote repo is created ;fi"
        //                 sh "docker push $ECR_ADDR/$API_NAME:$APP_VER"
        //             }
        //         }
        //     }
        // }

        // stage("Build 07/12 Loadgenerator"){
        //     steps{
        //         script{
        //             def API_NAME = "loadgenerator"
        //             dir("src/$API_NAME"){
                        
        //                 // Podman/Buildah or older Docker versions) treat BUILDPLATFORM as redefining a reserved argument, which triggers the error.
        //                 sh 'if rpm -q podman; then sed -i "s*ARG BUILDPLATFORM=linux/amd64*ARG BUILDPLATFORM*" Dockerfile; fi'
        //                     // ADSERVICE_VER = sh( 
        //                     //     script: "cat build.gradle | grep ^version|awk -F= {'print \$2'}",
        //                     //     returnStdout: true
        //                     //     ).trim()
                        
        //                 sh "docker build -t $ECR_ADDR/$API_NAME:$APP_VER ."

        //                 // AWS Upload
        //                 sh "aws ecr get-login-password --profile $ECR_PROFILE --region $ECR_REGION | docker login --username AWS --password-stdin $ECR_ADDR"
        //                 sh "if aws ecr create-repository --profile=ecr-user --repository-name $API_NAME 2> /dev/null; then echo $API_NAME remote repo is created ;fi"
        //                 sh "docker push $ECR_ADDR/$API_NAME:$APP_VER"
        //             }
        //         }
        //     }
        // }

        // stage("Build 08/12 Paymentservice"){
        //     steps{
        //         script{
        //             def API_NAME = "paymentservice"
        //             dir("src/$API_NAME"){
                        
        //                 // Podman/Buildah or older Docker versions) treat BUILDPLATFORM as redefining a reserved argument, which triggers the error.
        //                 sh 'if rpm -q podman; then sed -i "s*ARG BUILDPLATFORM=linux/amd64*ARG BUILDPLATFORM*" Dockerfile; fi'
        //                     // ADSERVICE_VER = sh( 
        //                     //     script: "cat build.gradle | grep ^version|awk -F= {'print \$2'}",
        //                     //     returnStdout: true
        //                     //     ).trim()
                        
        //                 sh "docker build -t $ECR_ADDR/$API_NAME:$APP_VER ."

        //                 // AWS Upload
        //                 sh "aws ecr get-login-password --profile $ECR_PROFILE --region $ECR_REGION | docker login --username AWS --password-stdin $ECR_ADDR"
        //                 sh "if aws ecr create-repository --profile=ecr-user --repository-name $API_NAME 2> /dev/null; then echo $API_NAME remote repo is created ;fi"
        //                 sh "docker push $ECR_ADDR/$API_NAME:$APP_VER"
        //             }
        //         }
        //     }
        // }

        // stage("Build 09/12 Productcatalogservice"){
        //     steps{
        //         script{
        //             def API_NAME = "productcatalogservice"
        //             dir("src/$API_NAME"){
                        
        //                 // Podman/Buildah or older Docker versions) treat BUILDPLATFORM as redefining a reserved argument, which triggers the error.
        //                 sh 'if rpm -q podman; then sed -i "s*ARG BUILDPLATFORM=linux/amd64*ARG BUILDPLATFORM*" Dockerfile; fi'
        //                     // ADSERVICE_VER = sh( 
        //                     //     script: "cat build.gradle | grep ^version|awk -F= {'print \$2'}",
        //                     //     returnStdout: true
        //                     //     ).trim()
                        
        //                 sh "docker build -t $ECR_ADDR/$API_NAME:$APP_VER ."

        //                 // AWS Upload
        //                 sh "aws ecr get-login-password --profile $ECR_PROFILE --region $ECR_REGION | docker login --username AWS --password-stdin $ECR_ADDR"
        //                 sh "if aws ecr create-repository --profile=ecr-user --repository-name $API_NAME 2> /dev/null; then echo $API_NAME remote repo is created ;fi"
        //                 sh "docker push $ECR_ADDR/$API_NAME:$APP_VER"
        //             }
        //         }
        //     }
        // }

        // stage("Build 10/12 Recommendationservice"){
        //     steps{
        //         script{
        //             def API_NAME = "recommendationservice"
        //             dir("src/$API_NAME"){
                        
        //                 // Podman/Buildah or older Docker versions) treat BUILDPLATFORM as redefining a reserved argument, which triggers the error.
        //                 sh 'if rpm -q podman; then sed -i "s*ARG BUILDPLATFORM=linux/amd64*ARG BUILDPLATFORM*" Dockerfile; fi'
        //                     // ADSERVICE_VER = sh( 
        //                     //     script: "cat build.gradle | grep ^version|awk -F= {'print \$2'}",
        //                     //     returnStdout: true
        //                     //     ).trim()
                        
        //                 sh "docker build -t $ECR_ADDR/$API_NAME:$APP_VER ."

        //                 // AWS Upload
        //                 sh "aws ecr get-login-password --profile $ECR_PROFILE --region $ECR_REGION | docker login --username AWS --password-stdin $ECR_ADDR"
        //                 sh "if aws ecr create-repository --profile=ecr-user --repository-name $API_NAME 2> /dev/null; then echo $API_NAME remote repo is created ;fi"
        //                 sh "docker push $ECR_ADDR/$API_NAME:$APP_VER"
        //             }
        //         }
        //     }
        // }

        // stage("Build 11/12 Shippingservice"){
        //     steps{
        //         script{
        //             def API_NAME = "shippingservice"
        //             dir("src/$API_NAME"){
                        
        //                 // Podman/Buildah or older Docker versions) treat BUILDPLATFORM as redefining a reserved argument, which triggers the error.
        //                 sh 'if rpm -q podman; then sed -i "s*ARG BUILDPLATFORM=linux/amd64*ARG BUILDPLATFORM*" Dockerfile; fi'
        //                     // ADSERVICE_VER = sh( 
        //                     //     script: "cat build.gradle | grep ^version|awk -F= {'print \$2'}",
        //                     //     returnStdout: true
        //                     //     ).trim()
                        
        //                 sh "docker build -t $ECR_ADDR/$API_NAME:$APP_VER ."

        //                 // AWS Upload
        //                 sh "aws ecr get-login-password --profile $ECR_PROFILE --region $ECR_REGION | docker login --username AWS --password-stdin $ECR_ADDR"
        //                 sh "if aws ecr create-repository --profile=ecr-user --repository-name $API_NAME 2> /dev/null; then echo $API_NAME remote repo is created ;fi"
        //                 sh "docker push $ECR_ADDR/$API_NAME:$APP_VER"
        //             }
        //         }
        //     }
        // }

        // stage("Build 12/12 Shoppingassistantservice"){
        //     // Source code is compiled, dependencies are resolved, and an executable artifact is created.
        //     steps{
        //         script{
        //             def API_NAME = "shoppingassistantservice"
        //             dir("src/$API_NAME"){
                        
        //                 // Podman/Buildah or older Docker versions) treat BUILDPLATFORM as redefining a reserved argument, which triggers the error.
        //                 sh 'if rpm -q podman; then sed -i "s*ARG BUILDPLATFORM=linux/amd64*ARG BUILDPLATFORM*" Dockerfile; fi'
        //                     // ADSERVICE_VER = sh( 
        //                     //     script: "cat build.gradle | grep ^version|awk -F= {'print \$2'}",
        //                     //     returnStdout: true
        //                     //     ).trim()
                        
        //                 sh "docker build -t $ECR_ADDR/$API_NAME:$APP_VER ."

        //                 // AWS Upload
        //                 sh "aws ecr get-login-password --profile $ECR_PROFILE --region $ECR_REGION | docker login --username AWS --password-stdin $ECR_ADDR"
        //                 sh "if aws ecr create-repository --profile=ecr-user --repository-name $API_NAME 2> /dev/null; then echo $API_NAME remote repo is created ;fi"
        //                 sh "docker push $ECR_ADDR/$API_NAME:$APP_VER"
        //             }
        //         }
        //     }
        // }







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