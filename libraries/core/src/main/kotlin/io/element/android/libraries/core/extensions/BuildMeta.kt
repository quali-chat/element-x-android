/*
 * Copyright 2024 New Vector Ltd.
 *
 * SPDX-License-Identifier: AGPL-3.0-only OR LicenseRef-Element-Commercial
 * Please see LICENSE files in the repository root for full details.
 */

package io.element.android.libraries.core.extensions

import io.element.android.libraries.core.meta.BuildMeta
import io.element.android.libraries.core.meta.BuildType

fun BuildMeta.isElement(): Boolean {
    return when (buildType) {
        BuildType.RELEASE -> applicationId == "io.element.android.x"
        BuildType.NIGHTLY -> applicationId == "io.element.android.x.nightly"
        BuildType.DEBUG -> applicationId == "io.element.android.x.debug"
        BuildType.QUALI,
        BuildType.QUALIDEBUG -> false
    }
}

fun BuildMeta.isQuali(): Boolean {
    return when (buildType) {
        BuildType.RELEASE,
        BuildType.NIGHTLY,
        BuildType.DEBUG -> false
        BuildType.QUALI -> applicationId == "chat.quali.android"
        BuildType.QUALIDEBUG -> applicationId == "chat.quali.android.debug"
    }
}
