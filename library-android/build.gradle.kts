version = Coordinates.VERSION_NAME

plugins {
  `module-config`
  id("com.android.library")
  kotlin("android")
  id("kotlin-android-extensions")
  id("maven-publish")
}

dependencies {
  implementation(Kotlin.stdlib.jdk8)
  implementation(AndroidX.appCompat)
  implementation(AndroidX.coreKtx)

  testImplementation(Testing.junit4)

  androidTestImplementation(AndroidX.test.runner)
  androidTestImplementation(AndroidX.test.ext.junit)
}

afterEvaluate {
  publishing {
    publications {
      create<MavenPublication>("release") {
        from(components["release"])
      }
    }
  }
}
