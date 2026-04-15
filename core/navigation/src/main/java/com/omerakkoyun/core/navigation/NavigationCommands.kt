package com.omerakkoyun.core.navigation


/**
 * Created by Omer AKKOYUN on 29.03.2026.
 */
sealed class NavigationCommands {
    data class NavigateTo(val route: Route) : NavigationCommands()
    data class NavigateAndReplaceStack(val routes: List<Route>) : NavigationCommands()
    data class NavigateToTab(val route: Route) : NavigationCommands()
    data class PopUpTo(val route: Route, val inclusive: Boolean) : NavigationCommands()
    data object NavigateUp : NavigationCommands()
    data class NavigateAndClearBackStack(val route: Route) : NavigationCommands()
}