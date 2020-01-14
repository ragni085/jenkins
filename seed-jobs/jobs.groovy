pipelineJob('example') {
    definition {
        cps {
            scm {
                 git {
                     remote {
                        url('git@server:account/repo1.git')
                    }
                    extensions {
                        cleanAfterCheckout()
                        relativeTargetDirectory('repo1')
                    }
                }
            }
        }
    }
}