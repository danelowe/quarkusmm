plugins {
    id("io.quarkus")
    kotlin("jvm")
}

group = "com.example"
version = "1.0.0-SNAPSHOT"

val quarkusPlatformVersion: String by project

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":port"))
    implementation(project(":domain"))
    implementation(kotlin("stdlib-jdk8"))
    implementation("io.quarkus:quarkus-kotlin:$quarkusPlatformVersion")
    implementation("io.quarkus:quarkus-resteasy:$quarkusPlatformVersion")
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}