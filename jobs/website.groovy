multibranchPipelineJob('website') {
    branchSources {
        github {
            id('website')
            repoOwner('bootifulmicropizza')
            repository('v2_website')
        }
    }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(0)
        }
    }
}