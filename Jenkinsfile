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

        // stage("Build 04/12 Currencyservice"){
        //     steps{
        //         sh "ls src/currencyservice"
        //     }
        // }

        // stage("Build 05/12 emailservice"){
        //     steps{
        //         sh "ls src/emailservice"
        //     }
        // }

        // stage("Build 06/12 Frontend"){
        //     steps{
        //         sh "ls src/frontend"
        //     }
        // }

        // stage("Build 07/12 Loadgenerator"){
        //     steps{
        //         sh "ls src/loadgenerator"
        //     }
        // }

        // stage("Build 08/12 Paymentservice"){
        //     steps{
        //         sh "ls src/paymentservice"
        //     }
        // }

        // stage("Build 09/12 Productcatalogservice"){
        //     steps{
        //         sh "ls src/productcatalogservice"
        //     }
        // }

        // stage("Build 10/12 Recommendationservice"){
        //     steps{
        //         sh "ls src/recommendationservice"
        //     }
        // }

        // stage("Build 11/12 Shippingservice"){
        //     steps{
        //         sh "ls src/shippingservice"
        //     }
        // }

        // stage("Build 12/12 Shoppingassistantservice"){
        //     // Source code is compiled, dependencies are resolved, and an executable artifact is created.
        //     steps{
        //         sh "ls src/shoppingassistantservice"
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