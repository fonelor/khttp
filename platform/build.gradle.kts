/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
plugins {
    `java-platform`
}

dependencies {
    constraints {
        api(kotlin("stdlib-jdk8"))
        api(kotlin("reflect"))

        api("io.reactivex.rxjava2:rxjava:2.1.10")

        // https://mvnrepository.com/artifact/org.json/json
        api("org.json:json:20200518")

        // https://mvnrepository.com/artifact/com.google.code.gson/gson
        api("com.google.code.gson:gson:2.8.6")
        
        api("junit:junit:4.12")
        api(kotlin("test"))
    }
}
