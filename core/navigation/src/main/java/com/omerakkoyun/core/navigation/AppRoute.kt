package com.omerakkoyun.core.navigation

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

        data object HomeScreen : Screen {
            override val nav: String = "home"
        }

        data object SettingsScreen : Screen {
            override val nav: String = "settings"
        }

        data object AccountScreen : Screen {
            override val nav: String = "account"
        }

        data object Notifications : Screen {
            override val nav: String = "notifications"
        }

        data object ProfileScreen : Screen {
            override val nav: String = "profile"
        }

        data object LanguageScreen : Screen {
            override val nav: String = "language"
        }
    }

    sealed interface TopLevel : Route {
        data object HomeTab : TopLevel {
            override val nav: String = Graph.HomeGraph.nav
        }

        data object SettingsTab : TopLevel {
            override val nav: String = Graph.SettingsGraph.nav
        }

        data object ProfileTab : TopLevel {
            override val nav: String = Graph.ProfileGraph.nav
        }
    }
}