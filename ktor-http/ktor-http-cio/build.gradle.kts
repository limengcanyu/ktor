description = ""

kotlin.sourceSets {
    commonMain {
        dependencies {
            api(project(":ktor-http"))
        }
    }

    jvmMain {
        dependencies {
            api(project(":ktor-network"))
        }
    }
}
