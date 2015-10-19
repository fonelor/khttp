/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package me.kyleclemens.khttp.requests

import org.json.JSONArray
import org.json.JSONObject
import java.io.InputStream

interface KHttpRequest {

    // Response
    /**
     * The status code from the request.
     */
    val status: Int
    /**
     * The headers from the request.
     */
    val headers: Map<String, String>
    /**
     * The raw response from the request.
     */
    val raw: InputStream
    /**
     * The response as a UTF-8-encoded String.
     */
    val text: String
    /**
     * The response as a UTF-8-encoded JSON object.
     */
    val jsonObject: JSONObject
    /**
     * The response as a UTF-8-encode JSON array.
     */
    val jsonArray: JSONArray

}
