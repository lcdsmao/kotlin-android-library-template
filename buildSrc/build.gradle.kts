plugins {
  `kotlin-dsl`
}

repositories {
  jcenter()
  google()
}

dependencies {
  implementation(GradlePlugin.kotlin)
  implementation(GradlePlugin.android)
  implementation(GradlePlugin.bintray)
}

object GradlePlugin {
  const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:_"
  const val android = "com.android.tools.build:gradle:_"
  const val bintray = "com.jfrog.bintray.gradle:gradle-bintray-plugin:_"
}
