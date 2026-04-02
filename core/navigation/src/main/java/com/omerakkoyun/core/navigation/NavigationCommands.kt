package com.omerakkoyun.core.navigation

import android.os.Parcelable

/**
 * Created by Omer AKKOYUN on 29.03.2026.
 */
sealed class NavigationCommands {
    data class NavigateTo(val route: Route) : NavigationCommands()
    data class NavigateByRouteName(val routeString: String) : NavigationCommands()
    data class NavigateToWithArgs(val routeString: String) : NavigationCommands()
    data class NavigateToTab(val route: Route) : NavigationCommands()
    data class PopUpTo(val route: Route, val inclusive: Boolean) : NavigationCommands()
    data object NavigateUp : NavigationCommands()
    data class NavigateAndClearBackStack(val route: Route) : NavigationCommands()

    data class NavigateWithParcelable(
        val routeString: String,
        val key: String,
        val value: Parcelable
    ) : NavigationCommands()
}