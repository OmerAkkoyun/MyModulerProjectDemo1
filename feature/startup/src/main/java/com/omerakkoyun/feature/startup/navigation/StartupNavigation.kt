package com.omerakkoyun.feature.startup.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navDeepLink
import androidx.navigation.navigation
import androidx.navigation.toRoute
import com.omerakkoyun.core.navigation.MainGraph
import com.omerakkoyun.core.navigation.Navigator
import com.omerakkoyun.core.navigation.RouteNotificationsScreen
import com.omerakkoyun.core.navigation.StartupGraph
import com.omerakkoyun.core.navigation.RouteStartupScreen
import com.omerakkoyun.core.navigation.SettingsGraph
import com.omerakkoyun.feature.startup.data.Detail
import com.omerakkoyun.feature.startup.presentation.StartupPresenter
import kotlinx.coroutines.delay

/**
 * Created by Omer AKKOYUN on 28.03.2026.
 */
fun NavGraphBuilder.startupGraph(navigator: Navigator) {
    navigation<StartupGraph>(
        startDestination = RouteStartupScreen()
    ) {
        composable<RouteStartupScreen>(
            deepLinks = listOf(
                navDeepLink<RouteStartupScreen>(
                    basePath = "mymoduler://detail/{id}/{description}" // test için
                )
            )
        ) { backStackEntry ->
            val route = backStackEntry.toRoute<RouteStartupScreen>()
            val detail = Detail(
                id = route.id,
                description = route.description
            )
            StartupPresenter(
                action1 = {
                        navigator.navigateAndClearBackStack(MainGraph)
                },
                action2 = {
                    // Deep link'ten Notifications'a git, geri gelince MainGraph gözüksün
                    navigator.navigateAndReplaceStack(SettingsGraph, RouteNotificationsScreen)
                }, detail
            )
        }
    }
}