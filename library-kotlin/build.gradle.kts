version = Coordinates.VERSION_NAME

plugins {
  `module-config`
  id("java-library")
  kotlin("jvm")
  id("maven-publish")
}

dependencies {
  implementation(Kotlin.stdlib.jdk8)

  testImplementation(Testing.junit4)
}

publishing {
  publications {
    create<MavenPublication>("maven") {
      from(components["java"])
    }
  }
}
