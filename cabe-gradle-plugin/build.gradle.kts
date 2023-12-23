plugins {
    `java-gradle-plugin`
    `maven-publish`
    id("com.gradle.plugin-publish") version "1.2.1"
    id("com.github.ben-manes.versions") version "0.50.0"
}

version = project.findProperty("plugin_version") as String? ?: project.version

repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    implementation(project(":cabe-annotations"))
    implementation(project(":cabe-processor"))
    implementation("org.javassist:javassist:3.30.0-GA")
}

gradlePlugin {
    website = "https://github.com/xzel23/cabe"
    vcsUrl = "https://github.com/xzel23/cabe"

    plugins {
        create("cabePlugin") {
            id = "com.dua3.cabe"
            group = "com.dua3"
            displayName = "Plugin for adding assertions during compile time"
            description = "A plugin that adds assertions for annotated method parameters at compile time."
            tags = listOf("java", "NotNull", "Nullable", "null check", "assertion")
            implementationClass = "com.dua3.cabe.gradle.CabeGradlePlugin"
        }
    }
}