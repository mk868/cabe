plugins {
    id("java")
}

extra["plugin_version"] = "2.1-beta2"
extra["processor_version"] = "2.1-beta2"
extra["annotations_version"] = "2.0"

subprojects {
    apply(plugin = "java")

    java {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
        withJavadocJar()
        withSourcesJar()
    }
}
