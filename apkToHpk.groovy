job('apkToHpk') {
    scm {
        git('https://bitbucket.org/suresh_itt/androidtraining.git')
    }
    triggers {
        scm('H/15 * * * *')
    }
    steps {
        sh './gradlew build'
    }
}
