package com.omerakkoyun.feature.settings.navigation

import androidx.navigation.NavGraphBuilder

import androidx.navigation.compose.composable
import androidx.navigation.navigation
import androidx.navigation.toRoute
import com.omerakkoyun.core.navigation.RouteAccountScreen
import com.omerakkoyun.core.navigation.Navigator
import com.omerakkoyun.core.navigation.SettingsGraph
import com.omerakkoyun.core.navigation.RouteSettingsScreen
import com.omerakkoyun.core.navigation.RouteLanguageScreen
import com.omerakkoyun.core.navigation.RouteNotificationsScreen
import com.omerakkoyun.feature.settings.presentation.main.SettingsPresenter
import com.omerakkoyun.feature.settings.presentation.account.AccountSettingsScreen
import com.omerakkoyun.feature.settings.presentation.language.LanguagePresenter
import com.omerakkoyun.feature.settings.presentation.notification.NotificationsScreen
import com.omerakkoyun.feature.settings.presentation.uimodel.LanguageUiModel


/**
 * Created by Omer AKKOYUN on 28.03.2026.
 */
fun NavGraphBuilder.settingsTabGraph(
    navigator: Navigator
) {
    navigation<SettingsGraph>(
        startDestination = RouteSettingsScreen
    ) {
        composable<RouteSettingsScreen> {
            SettingsPresenter(navigator)
        }

        composable<RouteAccountScreen> {
            AccountSettingsScreen(navigator)
        }

        composable<RouteNotificationsScreen> {
            NotificationsScreen()
        }

        composable< RouteLanguageScreen> {
            val args = it.toRoute<RouteLanguageScreen>()

            LanguagePresenter(
                uiModel = LanguageUiModel(code = args.code),
                navigator = navigator
            )
        }
    }
}