/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package me.kyleclemens.khttp

import kotlin.test.assertEquals

class KHttpHeadSpec : MavenSpek() {
    override fun test() {
        given("a head request") {
            val request = head("https://httpbin.org/get")
            on("accessing the status code") {
                val status = request.status
                it("should be 200") {
                    assertEquals(200, status)
                }
            }
        }
    }
}