description = ""

kotlin.sourceSets.jvmMain {
    dependencies {
        api(project(":ktor-features:ktor-auth"))
    }
}
