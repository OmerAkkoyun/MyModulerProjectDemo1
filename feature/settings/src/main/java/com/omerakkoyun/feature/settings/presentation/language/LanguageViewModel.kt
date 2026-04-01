package com.omerakkoyun.feature.settings.presentation.language

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

/**
 * Created by Omer AKKOYUN on 1.04.2026.
 */
class LanguageViewModel(
    savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val code: String = requireNotNull(savedStateHandle["code"]) {
        "Code can't be null"
    }

    fun getLanguageCode(): String = code
}