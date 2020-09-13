plugins {
  `module-config`
  id("java-library")
  kotlin("jvm")
  id("maven-publish")
  id("com.vanniktech.maven.publish")
  `bintray-publish-config`
}

dependencies {
  implementation(Kotlin.stdlib.jdk8)

  testImplementation(Testing.junit4)
}
