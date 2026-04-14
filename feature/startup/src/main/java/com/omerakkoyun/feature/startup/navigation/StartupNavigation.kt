package com.omerakkoyun.feature.startup.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.omerakkoyun.core.navigation.StartupGraph
import com.omerakkoyun.core.navigation.RouteStartupScreen
import com.omerakkoyun.feature.startup.presentation.StartupPresenter

/**
 * Created by Omer AKKOYUN on 28.03.2026.
 */
fun NavGraphBuilder.startupGraph() {
    navigation<StartupGraph>(
        startDestination = RouteStartupScreen
    ) {
        composable<RouteStartupScreen> {
            StartupPresenter()
        }
    }
}