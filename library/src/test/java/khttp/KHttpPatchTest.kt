/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package khttp

import org.junit.Test
import kotlin.test.assertEquals

class KHttpPatchTest : KHttpTestBase() {

    @Test
    fun validateResponse() {
        val url = "https://httpbin.org/patch"
        val response = patch(url = url)

        assertEquals(url, response.jsonObject.getString("url"))
    }
}
