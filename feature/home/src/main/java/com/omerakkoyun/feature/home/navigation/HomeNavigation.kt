package com.omerakkoyun.feature.home.navigation

/**
 * Created by Omer AKKOYUN on 28.03.2026.
 */
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.omerakkoyun.core.navigation.Navigator
import com.omerakkoyun.core.navigation.Route
import com.omerakkoyun.feature.home.presentation.HomeRoute
import com.omerakkoyun.feature.home.presentation.HomeScreen

fun NavGraphBuilder.homeTabGraph(navigator: Navigator) {
    navigation(
        startDestination = Route.Screen.HomeScreen.nav,
        route = Route.Graph.HomeGraph.nav
    ){
        composable(Route.Screen.HomeScreen.nav) {
            HomeRoute(navigator)
        }
    }
}

