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
}

object GradlePlugin {
  const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:_"
  const val android = "com.android.tools.build:gradle:_"
}
