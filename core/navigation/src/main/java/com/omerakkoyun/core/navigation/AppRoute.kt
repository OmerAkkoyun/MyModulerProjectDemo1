package com.omerakkoyun.core.navigation

import com.omerakkoyun.core.navigation.Route.Screen.LanguageScreen.ARG_CODE

/**
 * Created by Omer AKKOYUN on 28.03.2026.
 */


sealed interface Route {
    val nav: String

    sealed interface Graph : Route {
        data object RootGraph : Graph {
            override val nav: String = "root_graph"
        }

        data object StartupGraph : Graph {
            override val nav: String = "startup_graph"
        }

        data object MainGraph : Graph {
            override val nav: String = "main_graph"
        }

        data object HomeGraph : Graph {
            override val nav: String = "home_graph"
        }

        data object SettingsGraph : Graph {
            override val nav: String = "settings_graph"
        }

        data object ProfileGraph : Graph {
            override val nav: String = "profile_graph"
        }
    }

    sealed interface Screen : Route {
        data object StartupScreen : Screen {
            override val nav: String = "startup"
        }

        // Home Screens
        data object HomeScreen : Screen {
            override val nav: String = "home"
        }

        // Settings Screens
        data object SettingsScreen : Screen {
            override val nav: String = "settings"
        }

        data object AccountScreen : Screen {
            override val nav: String = "account"
        }

        data object Notifications : Screen {
            override val nav: String = "notifications"
        }

        data object LanguageScreen : Screen {
            const val ARG_CODE = "code"
            override val nav: String = "language/{$ARG_CODE}"

            fun buildNav(code: String): String = "language/${code}"
        }

        // Profile Screens
        data object ProfileScreen : Screen {
            override val nav: String = "profile"
        }
    }
}