import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
val kmongo_version: String by project

plugins {
    java
    kotlin("jvm") version "1.6.21"
    id("org.jetbrains.kotlin.plugin.serialization") version "1.6.0"
    `maven-publish`
}

group = "cut.the.crap"
version = "0.2-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation ("org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.3")
    implementation("org.litote.kmongo:kmongo:$kmongo_version")

    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}


publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "cut.the.crap"
            artifactId = "data-contract"
            version = "1.0.1"

            from(components["java"])
        }
    }
}