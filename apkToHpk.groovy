job('apkToHpk') {
    scm {
        git('https://bitbucket.org/suresh_itt/androidtraining.git')
    }
    triggers {
        scm('H/15 * * * *')
    }
    steps {
        gradle('check')
        gradle {
            tasks('clean')
            tasks('check')
            switches('--info')
        }
    }
}
