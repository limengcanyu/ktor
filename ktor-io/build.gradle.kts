kotlin {
//    targets {
//        configure(project.ext.nativeTargets) {
//            compilations.main.cinterops {
//                bits { defFile = file("posix/interop/bits.def") }
//                sockets { defFile = file("posix/interop/sockets.def") }
//            }
//
//            compilations.test.cinterops {
//                testSockets { defFile = file("posix/interop/testSockets.def") }
//            }
//        }
//    }
    sourceSets.commonTest {
        dependencies {
            api(project(":ktor-test-dispatcher"))
        }
    }
}

// Hack: register the Native interop klibs as outputs of Kotlin source sets:
kotlin.sourceSets {
//    bitsMain { dependsOn commonMain }
//    socketsMain { dependsOn commonMain }

    posixMain {
//        dependsOn(bitsMain)
//        dependsOn(socketsMain)
    }
}

//if (!project.ext.ideaActive) {
//    apply from: "$rootDir/gradle/interop-as-source-set-klib.gradle"
//    afterEvaluate {
//        registerInteropAsSourceSetOutput("bits", kotlin.sourceSets.bitsMain)
//        registerInteropAsSourceSetOutput("sockets", kotlin.sourceSets.socketsMain)
//    }
//}
