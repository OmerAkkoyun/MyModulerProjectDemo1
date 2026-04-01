package com.omerakkoyun.mymodulerproject.app

import android.app.Application
import com.omerakkoyun.core.di.coreNavigationModule
import com.omerakkoyun.feature.home.di.featureHomeModule
import com.omerakkoyun.feature.settings.di.featureSettingsModule
import com.omerakkoyun.feature.startup.di.featureStartupModule

import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        
        startKoin {
            androidLogger()
            androidContext(this@App)
            modules(
                coreNavigationModule,
                featureStartupModule,
                featureSettingsModule,
                featureHomeModule

            )
        }
    }
}
