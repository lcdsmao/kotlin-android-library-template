version = Coordinates.VERSION_NAME

plugins {
  `module-config`
  id("com.android.library")
  kotlin("android")
  id("kotlin-android-extensions")
  id("maven-publish")
}

dependencies {
  implementation(kotlin("stdlib-jdk7"))

  implementation(SupportLibs.ANDROIDX_APPCOMPAT)
  implementation(SupportLibs.ANDROIDX_CORE_KTX)

  testImplementation(TestingLib.JUNIT)

  androidTestImplementation(AndroidTestingLib.ANDROIDX_TEST_RUNNER)
  androidTestImplementation(AndroidTestingLib.ANDROIDX_TEST_EXT_JUNIT)
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
