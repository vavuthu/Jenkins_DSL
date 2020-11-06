import JobLib.parameters


def job = pipelineJob('vsphere_destroy') {
    displayName('vSphere Destroy ')
    properties {
        cachetJobProperty {
            requiredResources(true)
            resources([
                "gitlab.cee.redhat.com",
                ])
        }
        disableConcurrentBuilds()
    }
    definition {
        cpsScm {
            lightweight(lightweight = false)
            scm {
                git {
                    remote {
                        url('${JOBS_REPOSITORY}')
                    }
                    extension {
                        wipeOutWorkspace()
                    }
                    branch('${JOBS_REPOSITORY_BRANCH}')
                    }
                }
            }
            scriptPath('jobs/pipelines/vsphere_destroy/Jenkinsfile')
        }
    }
    parameters {
        parameters.cluster_name_param delegate
    }
}