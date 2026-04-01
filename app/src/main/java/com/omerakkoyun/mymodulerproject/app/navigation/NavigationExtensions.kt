package com.omerakkoyun.mymodulerproject.app.navigation

import androidx.navigation.NavDestination
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import com.omerakkoyun.core.navigation.NavigationCommands
import com.omerakkoyun.core.navigation.Route

/**
 * Created by Omer AKKOYUN on 1.04.2026.
 */

// Define routes where the bottom bar should be visible
private val bottomBarVisibleRoutes = setOf(
    Route.Screen.HomeScreen.nav,
    Route.Screen.SettingsScreen.nav,
    Route.Screen.ProfileScreen.nav,
)

fun NavDestination?.shouldShowBottomBar(): Boolean {
    return this?.route in bottomBarVisibleRoutes
}

fun NavHostController.handle(command: NavigationCommands) {
    when (command) {
        is NavigationCommands.NavigateTo -> {
            navigate(command.route.nav)
        }

        is NavigationCommands.NavigateByRouteName -> {
            navigate(command.routeString)
        }

        is NavigationCommands.NavigateToWithArgs -> {
            navigate(command.routeString)
        }

        is NavigationCommands.NavigateToTab -> {
            navigate(command.route.nav) {
                popUpTo(graph.findStartDestination().id) {
                    saveState = true
                }
                restoreState = true
                launchSingleTop = true
            }
        }

        is NavigationCommands.NavigateAndClearBackStack -> {
            navigate(command.route.nav) {
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
                command.route.nav,
                command.inclusive
            )
        }
    }
}