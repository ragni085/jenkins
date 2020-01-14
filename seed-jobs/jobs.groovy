pipelineJob('sample-pipeline') {
    configure { flowdefinition ->
        flowerinition << delegate.'definition'(class:'org.jenkinsci.plugins.workflow.cps.CpsScmFlowDefinition',plugin:'workflow-cps') {
            'scm'(class:'hudson.plugins.git.GitSCM',plugin:'git') {
                'userRemoteConfigs' {
                     hudson.plugins.git.UserRemoteConfig' {
                        'url'('https://github.com/ragni085/jenkins.git')
                        'credentialId'('Git-User')
                    }
                }
            }
            'scriptPath'('pipeline-jobs/sample.Jenkinsfile')
            'lightweight'(true)
        }
    }
}