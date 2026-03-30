package com.omerakkoyun.feature.startup.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.omerakkoyun.core.navigation.Route
import com.omerakkoyun.feature.startup.presentation.StartupScreen

/**
 * Created by Omer AKKOYUN on 28.03.2026.
 */
fun NavGraphBuilder.startupGraph() {
    navigation(
        startDestination = Route.Startup.nav,
        route = Route.StartupGraph.nav
    ){
        composable(Route.Startup.nav) {
            StartupScreen()
        }
    }
}