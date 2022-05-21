import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    java
    kotlin("jvm") version "1.6.21"
    `maven-publish`
}

group = "cut.the.crap"
version = "0.1-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
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