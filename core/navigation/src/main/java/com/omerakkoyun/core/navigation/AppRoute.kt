package com.omerakkoyun.core.navigation

/**
 * Created by Omer AKKOYUN on 28.03.2026.
 */


sealed interface Route {
    val nav: String

    // graphs
    data object StartupGraph : Route {
        override val nav = "startup_graph"
    }

    data object AuthGraph : Route {
        override val nav = "auth_graph"
    }

    data object MainGraph : Route {
        override val nav = "main_graph"
    }

    data object HomeGraph : Route {
        override val nav = "home_graph"
    }

    data object SettingsGraph : Route {
        override val nav = "settings_graph"
    }

    data object ProfileGraph : Route {
        override val nav = "profile_graph"
    }

    // screens
    data object Startup : Route {
        override val nav = "startup"
    }

    data object Login : Route {
        override val nav = "login"
    }

    data object Home : Route {
        override val nav = "home"
    }


    data object Profile : Route {
        override val nav = "profile"
    }

    data object Settings : Route {
        override val nav = "settings"
    }
}

