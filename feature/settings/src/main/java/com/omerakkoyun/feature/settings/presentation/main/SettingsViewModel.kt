package com.omerakkoyun.feature.settings.presentation.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch


/**
 * Created by Omer AKKOYUN on 30.03.2026.
 */
class SettingsViewModel : ViewModel() {

    private val _effects = MutableSharedFlow<SettingsEffect>()
    val effects = _effects.asSharedFlow()

    fun onAccountClick() {
        viewModelScope.launch {
            _effects.emit(SettingsEffect.NavigateToAccount)
        }
    }

    fun onNotificationsClick() {
        viewModelScope.launch {
            _effects.emit(SettingsEffect.NavigateToNotifications)
        }
    }
}

sealed interface SettingsEffect {
    data object NavigateToAccount : SettingsEffect
    data object NavigateToNotifications : SettingsEffect
    data object NavigateToTheme : SettingsEffect
    data object NavigateToKvkk : SettingsEffect
}