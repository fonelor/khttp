/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package khttp

import org.junit.Test
import kotlin.test.assertEquals

class KHttpDeleteTest : KHttpTestBase() {

    @Test
    fun validateResponse() {
        val url = "https://httpbin.org/delete"

        val result = delete(url = url)

        assertEquals(200, result.statusCode)
        assertEquals(result.jsonObject.getString("url"), url)
    }
}