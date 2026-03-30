package com.omerakkoyun.feature.startup.di

import com.omerakkoyun.feature.startup.presentation.StartupViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val featureStartupModule = module {
    viewModel { StartupViewModel(get()) }
}