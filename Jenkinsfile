pipeline{
    agent any;
    environment{
        // hard coded version? eww!
        APP_VER = "v0.10.5"
    }
    // tools {
    //   gradle 'myGradle 9.5.0'
    // }


    stages{

        stage("Build 01/12 Adservice"){
            steps{
                dir('src/adservice'){
                    // Podman/Buildah or older Docker versions) treat BUILDPLATFORM as redefining a reserved argument, which triggers the error.
                    sh 'if rpm -q podman; then sed -i "s*ARG BUILDPLATFORM=linux/amd64*ARG BUILDPLATFORM*" Dockerfile; fi'
                        // ADSERVICE_VER = sh( 
                        //     script: "cat build.gradle | grep ^version|awk -F= {'print \$2'}",
                        //     returnStdout: true
                        //     ).trim()
                    
                    sh "docker build -t adservice:$APP_VER ."
                }
            }
        }

        stage("Build 02/12 Cartservice"){
            steps{
                dir('src/cartservice/src'){
                    sh 'if rpm -q podman; then sed -i "s*ARG BUILDPLATFORM=linux/amd64*ARG BUILDPLATFORM*" Dockerfile; fi'
                    sh "docker build -t cartservice:$APP_VER ."
                }
            }
        }

        stage("Build 03/12 Checkoutservice"){
            steps{
                dir('src/checkoutservice'){
                    sh 'if rpm -q podman; then sed -i "s*ARG BUILDPLATFORM=linux/amd64*ARG BUILDPLATFORM*" Dockerfile; fi'
                    sh "docker build -t checkoutservice:$APP_VER ."
                }
            }
        }

        stage("Build 04/12 Currencyservice"){
            steps{
                dir('src/currencyservice'){
                    sh 'if rpm -q podman; then sed -i "s*ARG BUILDPLATFORM=linux/amd64*ARG BUILDPLATFORM*" Dockerfile; fi'
                    sh "docker build -t currencyservice:$APP_VER ."
                }
            }
        }

        stage("Build 05/12 emailservice"){
            steps{
                dir('src/emailservice'){
                    sh 'if rpm -q podman; then sed -i "s*ARG BUILDPLATFORM=linux/amd64*ARG BUILDPLATFORM*" Dockerfile; fi'
                    sh "docker build -t emailservice:$APP_VER ."
                }
            }
        }

        stage("Build 06/12 Frontend"){
            steps{
                dir('src/frontend'){
                    sh 'if rpm -q podman; then sed -i "s*ARG BUILDPLATFORM=linux/amd64*ARG BUILDPLATFORM*" Dockerfile; fi'
                    sh "docker build -t frontend:$APP_VER ."
                }
            }
        }

        stage("Build 07/12 Loadgenerator"){
            steps{
                dir('src/loadgenerator'){
                    sh 'if rpm -q podman; then sed -i "s*ARG BUILDPLATFORM=linux/amd64*ARG BUILDPLATFORM*" Dockerfile; fi'
                    sh "docker build -t loadgenerator:$APP_VER ."
                }
            }
        }

        stage("Build 08/12 Paymentservice"){
            steps{
                dir('src/paymentservice'){
                    sh 'if rpm -q podman; then sed -i "s*ARG BUILDPLATFORM=linux/amd64*ARG BUILDPLATFORM*" Dockerfile; fi'
                    sh "docker build -t paymentservice:$APP_VER ."
                }
            }
        }

        stage("Build 09/12 Productcatalogservice"){
            steps{
                dir('src/productcatalogservice'){
                    sh 'if rpm -q podman; then sed -i "s*ARG BUILDPLATFORM=linux/amd64*ARG BUILDPLATFORM*" Dockerfile; fi'
                    sh "docker build -t productcatalogservice:$APP_VER ."
                }
            }
        }

        stage("Build 10/12 Recommendationservice"){
            steps{
                dir('src/recommendationservice'){
                    sh 'if rpm -q podman; then sed -i "s*ARG BUILDPLATFORM=linux/amd64*ARG BUILDPLATFORM*" Dockerfile; fi'
                    sh "docker build -t recommendationservice:$APP_VER ."
                }
            }
        }

        stage("Build 11/12 Shippingservice"){
            steps{
                dir('src/shippingservice'){
                    sh 'if rpm -q podman; then sed -i "s*ARG BUILDPLATFORM=linux/amd64*ARG BUILDPLATFORM*" Dockerfile; fi'
                    sh "docker build -t shippingservice:$APP_VER ."
                }
            }
        }

        stage("Build 12/12 Shoppingassistantservice"){
            // Source code is compiled, dependencies are resolved, and an executable artifact is created.
            steps{
                dir('src/shoppingassistantservice'){
                    sh 'if rpm -q podman; then sed -i "s*ARG BUILDPLATFORM=linux/amd64*ARG BUILDPLATFORM*" Dockerfile; fi'
                    sh "docker build -t shoppingassistantservice:$APP_VER ."
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