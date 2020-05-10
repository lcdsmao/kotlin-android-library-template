plugins {
  `module-config`
  id("com.android.application")
  kotlin("android")
  id("kotlin-android-extensions")
}

dependencies {
  implementation(kotlin("stdlib-jdk7"))

  implementation(project(":library-android"))
  implementation(project(":library-kotlin"))

  implementation(SupportLibs.ANDROIDX_APPCOMPAT)
  implementation(SupportLibs.ANDROIDX_CONSTRAINT_LAYOUT)
  implementation(SupportLibs.ANDROIDX_CORE_KTX)

  testImplementation(TestingLib.JUNIT)

  androidTestImplementation(AndroidTestingLib.ANDROIDX_TEST_EXT_JUNIT)
  androidTestImplementation(AndroidTestingLib.ANDROIDX_TEST_RULES)
  androidTestImplementation(AndroidTestingLib.ESPRESSO_CORE)
}
