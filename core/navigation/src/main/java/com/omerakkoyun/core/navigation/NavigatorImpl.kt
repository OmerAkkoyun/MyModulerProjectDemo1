package com.omerakkoyun.core.navigation

import kotlinx.coroutines.channels.BufferOverflow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.asSharedFlow

/**
 * Created by Omer AKKOYUN on 29.03.2026.
 */
class NavigatorImpl : Navigator {
    private val _navigationCommands = MutableSharedFlow<NavigationCommands>(extraBufferCapacity = 1, onBufferOverflow = BufferOverflow.DROP_OLDEST)

    override val navigateCommands: SharedFlow<NavigationCommands> // for listen on ui layer and collect navigation commands
        get() = _navigationCommands.asSharedFlow()


    override fun navigateTo(route: Route) {
        _navigationCommands.tryEmit(NavigationCommands.NavigateTo(route))
    }

    override fun navigateByRouteName(routeString: String) {
        _navigationCommands.tryEmit(NavigationCommands.NavigateByRouteName(routeString))
    }

    override fun navigateToTab(route: Route.TopLevel) {
        _navigationCommands.tryEmit(NavigationCommands.NavigateToTab(route))
    }

    override fun navigateUp() {
        _navigationCommands.tryEmit(NavigationCommands.NavigateUp)
    }

    override fun popUpTo(route: Route, inclusive: Boolean) {
        _navigationCommands.tryEmit(NavigationCommands.PopUpTo(route, inclusive))
    }

    override fun navigateAndClearBackStack(route: Route) {
        _navigationCommands.tryEmit(NavigationCommands.NavigateAndClearBackStack(route))
    }
}