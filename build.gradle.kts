import org.jetbrains.kotlin.gradle.dsl.KotlinCompile

/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    kotlin("jvm") version "1.4.10"
}

repositories {
    mavenCentral()
}

subprojects {
    group = "io.karn"

    buildscript {
        repositories {
            mavenCentral()
            google()
            jcenter()
        }
    }

    repositories {
        mavenCentral()
        google()
        jcenter()
    }

    tasks.withType<Test> {
        useJUnit()
    }
}