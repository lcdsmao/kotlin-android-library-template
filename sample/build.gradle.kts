plugins {
  `module-config`
  id("com.android.application")
  kotlin("android")
  id("kotlin-android-extensions")
}

dependencies {
  implementation(Kotlin.stdlib.jdk8)

  implementation(project(":library-android"))
  implementation(project(":library-kotlin"))

  implementation(AndroidX.appCompat)
  implementation(AndroidX.constraintLayout)
  implementation(AndroidX.core.ktx)

  testImplementation(Testing.junit4)

  androidTestImplementation(AndroidX.test.ext.junitKtx)
  androidTestImplementation(AndroidX.test.rules)
  androidTestImplementation(AndroidX.test.espresso.core)
}
