package com.omerakkoyun.core.di

import com.omerakkoyun.core.navigation.Navigator
import com.omerakkoyun.core.navigation.NavigatorImpl
import org.koin.dsl.module

import org.koin.dsl.single

/**
 * Created by Omer AKKOYUN on 29.03.2026.
 */

val coreNavigationModule = module {
    single<Navigator> { NavigatorImpl() }
}