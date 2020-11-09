/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    kotlin("jvm")
    `java-library`
}

dependencies {
    api(platform(project(":platform")))

    api(kotlin("stdlib-jdk8"))
    api("io.reactivex.rxjava2:rxjava")

    api("org.json:json")

    api("com.google.code.gson:gson") // 2.8.6

    testImplementation(kotlin("test"))
    testImplementation("junit:junit")
    testImplementation("org.testcontainers:testcontainers:1.15.0")
}