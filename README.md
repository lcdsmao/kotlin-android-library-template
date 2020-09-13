# kotlin-android-library-template 🤖

![Android CI](https://github.com/lcdsmao/kotlin-android-template/workflows/Android%20CI/badge.svg)  ![License](https://img.shields.io/github/license/cortinico/kotlin-android-template.svg) ![Language](https://img.shields.io/github/languages/top/cortinico/kotlin-android-template?color=blue&logo=kotlin)

A simple Github template that lets you create an **Android/Kotlin** library.

Forked from [cortinico/kotlin-android-template](https://github.com/cortinico/kotlin-android-template).

## Features 🎨

- **100% Kotlin-only template**.
- 3 Sample modules (Android app, Android library, Kotlin library).
- 100% Gradle Kotlin DSL setup.
- Dependency versions managed via `versions.properties`.
- CI Setup with GitHub Actions.
- Deploy website and docs.
- Kotlin Static Analysis via `ktlint`, `spotless`, and `detekt`.
- Publishing Ready.
- Issues Template (bug report + feature request)
- Pull Request Template.

## Gradle Setup 🐘

This template is using [**Gradle Kotlin DSL**](https://docs.gradle.org/current/userguide/kotlin_dsl.html) as well as the [Plugin DSL](https://docs.gradle.org/current/userguide/plugins.html#sec:plugins_block) to setup the build.

Dependencies are centralized inside the [versions.properties](versions.properties) managed by [RefreshVersions](https://github.com/jmfayard/refreshVersions).

## Static Analysis 🔍

This template is using [**ktlint**](https://github.com/pinterest/ktlint) with the [spotless](https://github.com/diffplug/spotless) plugin to format your code. To reformat all the source code as well as the buildscript you can run the `spotlessApply` gradle task.

This template is also using [**detekt**](https://github.com/arturbosch/detekt) to analyze the source code, with the configuration that is stored in the [detekt.yml](config/detekt/detekt.yml) file (the file has been generated with the `detektGenerateConfig` task).

## CI ⚙️

This template is using [**GitHub Actions**](https://github.com/lcdsmao/kotlin-android-template/actions) as CI.

## Docs

This template deploy the website to the Github Pages via [**Material for MkDocs**](https://github.com/squidfunk/mkdocs-material) and [Dokka](https://github.com/Kotlin/dokka).

## Publishing 🚀

The template is setup to be **ready to publish** a library/artifact on a Maven Repository.

## Contributing 🤝

Feel free to open a issue or submit a pull request for any bugs/improvements.
