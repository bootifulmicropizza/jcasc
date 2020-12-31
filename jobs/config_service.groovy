multibranchPipelineJob('config-service') {
    branchSources {
        github {
            id('config-service')
            repoOwner('bootifulmicropizza')
            repository('config-service')
        }
    }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(0)
        }
    }
}