package com.omerakkoyun.feature.settings.di


import com.omerakkoyun.feature.settings.presentation.main.SettingsViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 * Created by Omer AKKOYUN on 30.03.2026.
 */

val featureSettingsModule = module {
    viewModel { SettingsViewModel() }
}