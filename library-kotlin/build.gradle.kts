version = Coordinates.VERSION_NAME

plugins {
  `module-config`
  id("java-library")
  kotlin("jvm")
  id("maven-publish")
}

dependencies {
  implementation(kotlin("stdlib-jdk7"))

  testImplementation(TestingLib.JUNIT)
}

publishing {
  publications {
    create<MavenPublication>("maven") {
      from(components["java"])
    }
  }
}
