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
}
