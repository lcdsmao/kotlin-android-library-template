import de.fayard.dependencies.bootstrapRefreshVersionsAndDependencies

pluginManagement {
  repositories {
    gradlePluginPortal()
    google()
    mavenCentral()
    jcenter()
  }
}

apply(from = "plugins.gradle.kts")

buildscript {
  repositories { gradlePluginPortal() }
  dependencies.classpath("de.fayard:dependencies:0.5.8")
}

bootstrapRefreshVersionsAndDependencies()

rootProject.name = ("kotlin-android-template")

include(
  "app",
  "library-android",
  "library-kotlin"
)
