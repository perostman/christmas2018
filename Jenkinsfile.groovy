pipeline {
    agent none
    options {
        durabilityHint 'PERFORMANCE_OPTIMIZED'
        skipDefaultCheckout()
        timestamps()
    }
//    triggers {
//        gitlab(
//                triggerOnPush: true,
//                triggerOnMergeRequest: false,
//                branchFilterType: 'All',
//                pendingBuildName: "Pending build name for pipeline",)
//    }

    stages {
        stage('1_Build') {
            agent any
            steps {
                checkout scm
                echo "Building christmas2018 from branch " + BRANCH_NAME
            }
        }
    }
}
