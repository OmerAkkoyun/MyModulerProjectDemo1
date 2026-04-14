package com.omerakkoyun.core.navigation

import androidx.navigation.NavDestination
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController

/**
 * Created by Omer AKKOYUN on 1.04.2026.
 */

private val bottomBarVisibleRoutes = setOf(
    RouteHomeScreen.routeName,
    RouteSettingsScreen.routeName,
    RouteProfileScreen.routeName,
)

fun NavDestination?.shouldShowBottomBar(): Boolean {
    return this.getCurrentRouteString() in bottomBarVisibleRoutes
}


fun NavHostController.handle(command: NavigationCommands) {
    when (command) {

        is NavigationCommands.NavigateTo -> {
            navigate(command.route)
        }

        is NavigationCommands.NavigateToTab -> {
            navigate(command.route) {
                popUpTo(graph.findStartDestination().id) {
                    saveState = true
                }
                restoreState = true
                launchSingleTop = true
            }
        }

        is NavigationCommands.NavigateAndClearBackStack -> {
            navigate(command.route) {
                popUpTo(graph.id) {
                    inclusive = true
                }
                launchSingleTop = true
            }
        }

        is NavigationCommands.NavigateUp -> {
            navigateUp()
        }

        is NavigationCommands.PopUpTo -> {
            popBackStack(
                command.route,
                command.inclusive
            )
        }

        else -> {
        //TODO
        }
    }
}

fun NavDestination?.getCurrentRouteString(): String {
    return this?.route?.substringAfterLast(".").orEmpty()
}