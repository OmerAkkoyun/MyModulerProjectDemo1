package com.omerakkoyun.feature.settings.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.omerakkoyun.core.navigation.Route
import com.omerakkoyun.feature.settings.presentation.SettingsScreen

/**
 * Created by Omer AKKOYUN on 28.03.2026.
 */
fun NavGraphBuilder.settingsTabGraph() {

        composable(Route.Settings.nav) {
            SettingsScreen()
        }

}