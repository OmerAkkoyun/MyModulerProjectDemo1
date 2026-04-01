package com.omerakkoyun.feature.home.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch


/**
 * Created by Omer AKKOYUN on 30.03.2026.
 */
class HomeViewModel : ViewModel() {

    private val _effects = MutableSharedFlow<HomeUiEffect>()
    val effects = _effects.asSharedFlow()

    fun onXClick() {
        viewModelScope.launch {
            _effects.emit(HomeUiEffect.NavigateToX)
        }
    }

    fun onYClick() {
        viewModelScope.launch {
            _effects.emit(HomeUiEffect.NavigateToY)
        }
    }
}

sealed interface HomeUiEffect {
    data object NavigateToX : HomeUiEffect
    data object NavigateToY : HomeUiEffect
}