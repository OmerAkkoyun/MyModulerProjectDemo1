package com.omerakkoyun.feature.settings.navigation

import androidx.navigation.NavGraphBuilder

import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.omerakkoyun.core.navigation.Navigator
import com.omerakkoyun.core.navigation.Route
import com.omerakkoyun.feature.settings.presentation.main.SettingsRoute
import com.omerakkoyun.feature.settings.presentation.account.AccountSettingsScreen
import com.omerakkoyun.feature.settings.presentation.language.LanguageScreen
import com.omerakkoyun.feature.settings.presentation.notification.NotificationsScreen

/**
 * Created by Omer AKKOYUN on 28.03.2026.
 */
fun NavGraphBuilder.settingsTabGraph(
    navigator: Navigator
) {
    navigation(
        route = Route.Graph.SettingsGraph.nav,
        startDestination = Route.Screen.SettingsScreen.nav
    ) {
        composable(Route.Screen.SettingsScreen.nav) {
            SettingsRoute(navigator)
        }

        composable(Route.Screen.AccountScreen.nav) {
            AccountSettingsScreen(navigator)
        }

        composable(Route.Screen.Notifications.nav) {
            NotificationsScreen()
        }

        composable(Route.Screen.LanguageScreen.nav) {
            LanguageScreen(navigator)
        }
//
//        composable(Route.Screen.KvkkScreen.nav) {
//            KvkkScreen()
//        }
    }
}