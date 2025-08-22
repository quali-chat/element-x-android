/*
 * Copyright 2024 New Vector Ltd.
 *
 * SPDX-License-Identifier: AGPL-3.0-only OR LicenseRef-Element-Commercial
 * Please see LICENSE files in the repository root for full details.
 */

package io.element.android.features.enterprise.impl

import com.squareup.anvil.annotations.ContributesBinding
import io.element.android.compound.tokens.generated.SemanticColors
import io.element.android.compound.tokens.generated.compoundColorsDark
import io.element.android.compound.tokens.generated.compoundColorsLight
import io.element.android.features.enterprise.api.BugReportUrl
import io.element.android.features.enterprise.api.EnterpriseService
import io.element.android.libraries.di.AppScope
import io.element.android.libraries.matrix.api.core.SessionId
import kotlinx.coroutines.flow.flowOf
import javax.inject.Inject
import androidx.compose.ui.graphics.Color

@ContributesBinding(AppScope::class, replaces = [DefaultEnterpriseService::class])
class QualiEnterpriseService @Inject constructor() : EnterpriseService {
    override val isEnterpriseBuild = false

    override suspend fun isEnterpriseUser(sessionId: SessionId) = false

    override fun defaultHomeserverList(): List<String> = emptyList()
    override suspend fun isAllowedToConnectToHomeserver(homeserverUrl: String) = true

    override fun semanticColorsLight(): SemanticColors {
        return compoundColorsLight.copy(
            textActionAccent = Color(0xFF9BAFF7),
            bgAccentRest = Color(0xFF9BAFF7),
            bgDecorative1 = Color(0xFF80D4DE),
            textDecorative1 = Color(0xFF1A1A1A),
            bgDecorative2 = Color(0xFFF8D288),
            textDecorative2 = Color(0xFF1A1A1A),
            bgDecorative3 = Color(0xFFAD93F8),
            textDecorative3 = Color(0xFF1A1A1A),
            bgDecorative4 = Color(0xFF80D4DE),
            textDecorative4 = Color(0xFF1A1A1A),
            bgDecorative5 = Color(0xFFF8D288),
            textDecorative5 = Color(0xFF1A1A1A),
            bgDecorative6 = Color(0xFFAD93F8),
            textDecorative6 = Color(0xFF1A1A1A),
            gradientActionStop1 = Color(0xFF9BAFF7),
            gradientActionStop2 = Color(0xFF9BAFF7),
            gradientActionStop3 = Color(0xFF9BAFF7),
            gradientActionStop4 = Color(0xFF9BAFF7)
        )
    }

    override fun semanticColorsDark(): SemanticColors {
        return compoundColorsDark.copy(
            textActionAccent = Color(0xFF9BAFF7),
            bgAccentRest = Color(0xFF9BAFF7),
            gradientActionStop1 = Color(0xFF9BAFF7),
            gradientActionStop2 = Color(0xFF9BAFF7),
            gradientActionStop3 = Color(0xFF9BAFF7),
            gradientActionStop4 = Color(0xFF9BAFF7),
            iconOnSolidPrimary = Color(0xFF000000),
            bgDecorative1 = Color(0xFF80D4DE),
            textDecorative1 = Color(0xFF1A1A1A),
            bgDecorative2 = Color(0xFFF8D288),
            textDecorative2 = Color(0xFF1A1A1A),
            bgDecorative3 = Color(0xFFAD93F8),
            textDecorative3 = Color(0xFF1A1A1A),
            bgDecorative4 = Color(0xFF80D4DE),
            textDecorative4 = Color(0xFF1A1A1A),
            bgDecorative5 = Color(0xFFF8D288),
            textDecorative5 = Color(0xFF1A1A1A),
            bgDecorative6 = Color(0xFFAD93F8),
            textDecorative6 = Color(0xFF1A1A1A),
        )
    }

    override fun firebasePushGateway(): String? = null
    override fun unifiedPushDefaultPushGateway(): String? = null

    override val bugReportUrlFlow = flowOf(BugReportUrl.UseDefault)
}
