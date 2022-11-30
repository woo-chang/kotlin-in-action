import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.21"
    //lombok
    kotlin("plugin.lombok") version "1.7.21"
    id("io.freefair.lombok") version "5.3.0"
}

group = "com.action"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

//lombok
kotlinLombok {
    lombokConfigurationFile(file("lombok.config"))
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}