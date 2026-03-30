package com.omerakkoyun.core.navigation

/**
 * Created by Omer AKKOYUN on 29.03.2026.
 */
sealed class NavigationCommands {
    data class NavigateTo(val route: Route) : NavigationCommands()
    data class NavigateToRoute(val routeString: String) : NavigationCommands()
    data class NavigateToTab(val route: Route) : NavigationCommands()
    data class Replace(val route: Route) : NavigationCommands()
    data class PopUpTo(val route: Route, val inclusive: Boolean) : NavigationCommands()
    data object NavigateUp : NavigationCommands()
    data class ClearBackStackAndNavigate(val route: Route) : NavigationCommands()

}