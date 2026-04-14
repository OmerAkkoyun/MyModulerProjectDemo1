package com.omerakkoyun.core.navigation

import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController

/**
 * Created by Omer AKKOYUN on 1.04.2026.
 */

private val bottomBarVisibleRoutes = setOf(
    RouteHomeScreen.toRouteString(),
    RouteSettingsScreen.toRouteString(),
    RouteProfileScreen.toRouteString(),
)

fun NavDestination?.shouldShowBottomBar(): Boolean {
    return this
        ?.hierarchy
        ?.any { it.route in bottomBarVisibleRoutes } == true

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


fun Route.toRouteString(): String {
    return requireNotNull(this::class.qualifiedName) {
        "Route must have a qualifiedName"
    }
}

fun NavDestination?.hasRoute(route: Route): Boolean {
    val routeString = route.toRouteString()
    return this?.hierarchy?.any { it.route == routeString } == true
}