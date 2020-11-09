/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package khttp

import org.testcontainers.containers.GenericContainer
import org.testcontainers.utility.DockerImageName

val httpBin: GenericContainer<*> = GenericContainer<Nothing>(DockerImageName.parse("kennethreitz/httpbin"))
        .withExposedPorts(80)

open class KHttpTestBase {
    val host: String

    init {
        httpBin.start()
        host = "http://${httpBin.containerIpAddress}:${httpBin.getMappedPort(80)}"
    }

}