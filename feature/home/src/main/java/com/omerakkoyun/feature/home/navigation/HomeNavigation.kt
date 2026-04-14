package com.omerakkoyun.feature.home.navigation

/**
 * Created by Omer AKKOYUN on 28.03.2026.
 */
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.omerakkoyun.core.navigation.HomeGraph
import com.omerakkoyun.core.navigation.Navigator
import com.omerakkoyun.core.navigation.RouteHomeScreen
import com.omerakkoyun.feature.home.presentation.HomePresenter

fun NavGraphBuilder.homeTabGraph(navigator: Navigator) {
    navigation<HomeGraph>(
        startDestination = RouteHomeScreen
    ) {
        composable<RouteHomeScreen> {
            HomePresenter(navigator)
        }
    }
}