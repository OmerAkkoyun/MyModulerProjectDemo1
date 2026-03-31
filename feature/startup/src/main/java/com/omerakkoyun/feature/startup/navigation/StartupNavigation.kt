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
        startDestination = Route.Screen.StartupScreen.nav,
        route = Route.Graph.StartupGraph.nav
    ){
        composable(Route.Screen.StartupScreen.nav) {
            StartupScreen()
        }
    }
}