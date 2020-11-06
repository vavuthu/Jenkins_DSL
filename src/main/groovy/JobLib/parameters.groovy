package JobLib

import javaposse.jobdsl.dsl.Job

class parameters {

    //PARAMETERS
    static void ocs_ci_repository_params(paramContext) {
        ocs_ci_repository = 'https://github.com/red-hat-storage/ocs-ci.git',
        ocs_ci_repository_branch = 'master'
        paramContext.with {
            stringParam('OCS_CI_REPOSITORY', ocs_ci_repository, 'OCS-CI Repository to clone.')
            stringParam('OCS_CI_REPOSITORY_BRANCH', ocs_ci_repository_branch, 'Name of branch from OCS-CI Repository to checkout')
        }
    }

    static void cluster_name_param(paramContext, cluster_name="RENAME") {
        paramContext.with {
            stringParam('CLUSTER_NAME', cluster_name,
                'Cluster Name (should start with your username!).')
        }
    }

}