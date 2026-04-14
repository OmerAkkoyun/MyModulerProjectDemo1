package com.omerakkoyun.core.navigation

import kotlinx.serialization.Serializable

@Serializable
sealed interface Route {
    val routeName: String get() = this::class.simpleName ?: ""
}

@Serializable data object RootGraph:Route
@Serializable data object StartupGraph:Route
@Serializable data object MainGraph:Route
@Serializable data object HomeGraph:Route
@Serializable data object SettingsGraph:Route
@Serializable data object ProfileGraph:Route

@Serializable data object RouteStartupScreen:Route
@Serializable data object RouteHomeScreen:Route
@Serializable data object RouteSettingsScreen:Route
@Serializable data object RouteAccountScreen:Route
@Serializable data object RouteNotificationsScreen:Route
@Serializable data object RouteProfileScreen:Route

@Serializable
data class RouteLanguageScreen(val code: String):Route
