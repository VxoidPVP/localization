plugins {
    id("java")
    id("com.gradleup.shadow") version "8.9.3"
}

allprojects {
    group = "net.vxoidpvp"
    version = "0.0.1"
}

subprojects {
    version = rootProject.version

    apply(plugin = "java")

    repositories {
        maven("https://repo.papermc.io/repository/maven-public/")
        mavenCentral()
    }

    java {
        toolchain {
            languageVersion = JavaLanguageVersion.of(21)
        }
    }
}