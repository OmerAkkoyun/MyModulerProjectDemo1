package com.omerakkoyun.feature.settings.presentation.language

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.omerakkoyun.core.navigation.Route

/**
 * Created by Omer AKKOYUN on 1.04.2026.
 */
class LanguageViewModel(
    savedStateHandle: SavedStateHandle
) : ViewModel() {



    fun getLanguageCode(): String = "code"
}