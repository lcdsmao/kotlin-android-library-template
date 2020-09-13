plugins {
  `kotlin-dsl`
}

apply(from = "versions.gradle.kts")

repositories {
  jcenter()
  google()
}

val kotlinVersion = extra["version.kotlin"]

dependencies {
  implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
  implementation("com.android.tools.build:gradle:4.2.0-alpha10")
}
