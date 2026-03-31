package com.omerakkoyun.feature.settings.navigation

import androidx.navigation.NavGraphBuilder

import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.omerakkoyun.core.navigation.Route
import com.omerakkoyun.feature.settings.presentation.main.SettingsRoute
import com.omerakkoyun.feature.settings.presentation.account.AccountSettingsScreen
import com.omerakkoyun.feature.settings.presentation.notification.NotificationsScreen

/**
 * Created by Omer AKKOYUN on 28.03.2026.
 */
fun NavGraphBuilder.settingsTabGraph(
    onNavigate: (Route.Screen) -> Unit
) {
    navigation(
        route = Route.Graph.SettingsGraph.nav,
        startDestination = Route.Screen.SettingsScreen.nav
    ) {
        composable(Route.Screen.SettingsScreen.nav) {
            SettingsRoute(
                onNavigate = { action ->
                    when (action) {
                        SettingsNavigationAction.Account ->
                            onNavigate(Route.Screen.AccountScreen)

                        SettingsNavigationAction.Notifications ->
                            onNavigate(Route.Screen.Notifications)

                        SettingsNavigationAction.Theme -> {
                            //onNavigate(Route.Screen.ThemeScreen)
                        }

                        SettingsNavigationAction.Kvkk -> {
                            //onNavigate(Route.Screen.KvkkScreen)
                        }
                    }
                }
            )
        }

        composable(Route.Screen.AccountScreen.nav) {
            AccountSettingsScreen()
        }

        composable(Route.Screen.Notifications.nav) {
            NotificationsScreen()
        }

//        composable(Route.Screen.ThemeScreen.nav) {
//            ThemeScreen()
//        }
//
//        composable(Route.Screen.KvkkScreen.nav) {
//            KvkkScreen()
//        }
    }
}