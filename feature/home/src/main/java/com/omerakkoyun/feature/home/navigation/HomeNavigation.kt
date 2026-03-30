package com.omerakkoyun.feature.home.navigation

/**
 * Created by Omer AKKOYUN on 28.03.2026.
 */
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.omerakkoyun.core.navigation.Route
import com.omerakkoyun.feature.home.presentation.HomeScreen

fun NavGraphBuilder.homeTabGraph() {
    navigation(
        startDestination = Route.Home.nav,
        route = Route.HomeGraph.nav
    ){
        composable(Route.Home.nav) {
            HomeScreen()
        }
    }
}

