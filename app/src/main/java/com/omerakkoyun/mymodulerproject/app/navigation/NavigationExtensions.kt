package com.omerakkoyun.mymodulerproject.app.navigation

import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import com.omerakkoyun.core.navigation.NavigationCommands
import com.omerakkoyun.core.navigation.Route
import com.omerakkoyun.core.navigation.RouteHomeScreen
import com.omerakkoyun.core.navigation.RouteProfileScreen
import com.omerakkoyun.core.navigation.RouteSettingsScreen

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

        is NavigationCommands.NavigateAndReplaceStack -> {
            // Tüm back stack'i temizle
            popBackStack(0, true)

            // Her bir route'u sırayla ekle
            command.routes.forEach { route ->
                navigate(route) {
                    launchSingleTop = true
                }
            }
            // ornekler:  Profile -> Settings -> Home (back stack bu sırayla olur)
            //navigator.navigateAndReplaceStack(ProfileGraph, SettingsGraph, HomeGraph)
        }

    }
}


fun Route.toRouteString(): String {
    return requireNotNull(this::class.qualifiedName) {
        "Route must have a qualifiedName"
    }
}