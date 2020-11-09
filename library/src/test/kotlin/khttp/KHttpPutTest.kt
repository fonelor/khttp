/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package khttp

import org.junit.Test
import kotlin.test.assertEquals

class KHttpPutTest : KHttpTestBase() {

    @Test
    fun validateRequest() {
        val url = "$host/put"
        val response = put(url = url)

        assertEquals(url, response.jsonObject.getString("url"))
    }
}
