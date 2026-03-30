package com.omerakkoyun.feature.main.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.omerakkoyun.core.navigation.Route
import com.omerakkoyun.feature.main.presentation.MainScreen

/**
 * Created by Omer AKKOYUN on 29.03.2026.
 */
fun NavGraphBuilder.mainGraph() {
    navigation(
        startDestination = Route.Home.nav,
        route = Route.MainGraph.nav
    ) {
        composable(Route.Home.nav) {
            MainScreen()
        }
    }
}