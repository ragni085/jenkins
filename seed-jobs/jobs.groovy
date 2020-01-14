pipelineJob('sample-pipeline') {
    configure { flowdefinition ->
        flowerinition << delegate.'definition'(class:'org.jenkinsci.plugins.workflow.cps.CpsScmFlowDefinition',plugin:'workflow-cps') {
            'scm'(class:'hudson.plugins.git.GitSCM',plugin:'git') {
                'userRemoteConfigs' {
                    'hudson.plugins.git.UserRemoteConfig' {
                        'url'('https://github.com/ragni085/jenkins.git')
                        'credentialId'('Git-User')
                    }
                }
                'branches' {
                    'hudson.plugins.git.BranchSpec' {
                        'name'('*/master')
                    }
                }
            }
            'scriptPath'('pipeline-jobs/sample.Jenkinsfile')
            'lightweight'(true)
        }
    }
}

listView('student') {
    description('All  student jobs')
    filterBuildQueue()
    filterExecutors()
    jobs {
        name('CI-pipeline')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}

pipelineJob('CI-pipeline') {
    configure { flowdefinition ->
        flowerinition << delegate.'definition'(class:'org.jenkinsci.plugins.workflow.cps.CpsScmFlowDefinition',plugin:'workflow-cps') {
            'scm'(class:'hudson.plugins.git.GitSCM',plugin:'git') {
                'userRemoteConfigs' {
                    'hudson.plugins.git.UserRemoteConfig' {
                        'url'('https://github.com/ragni085/jenkins.git')
                        'credentialId'('Git-User')
                    }
                }
                'branches' {
                    'hudson.plugins.git.BranchSpec' {
                        'name'('*/master')
                    }
                }
            }
            'scriptPath'('pipeline-jobs/ci.Jenkinsfile')
            'lightweight'(true)
        }
    }
}