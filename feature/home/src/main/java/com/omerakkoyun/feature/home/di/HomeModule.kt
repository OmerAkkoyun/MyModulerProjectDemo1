package com.omerakkoyun.feature.home.di

import com.omerakkoyun.feature.home.presentation.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 * Created by Omer AKKOYUN on 1.04.2026.
 */
val featureHomeModule = module {
    viewModel { HomeViewModel() }
}