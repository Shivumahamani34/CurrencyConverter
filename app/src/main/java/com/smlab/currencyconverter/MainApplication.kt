package com.smlab.currencyconverter

import android.app.Application
import com.smlab.currencyconverter.api.networkModule
import com.smlab.currencyconverter.data.db.dbSetupModule
import com.smlab.currencyconverter.data.preferencesModule
import com.smlab.currencyconverter.data.repository.currencyDataRepoModule
import com.smlab.currencyconverter.data.repository.currencyListRepoModule
import com.smlab.currencyconverter.ui.model.mainViewModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(applicationContext)
            modules(
                listOf(
                    currencyListRepoModule,
                    networkModule,
                    mainViewModule,
                    dbSetupModule(),
                    currencyDataRepoModule,
                    preferencesModule
                )
            )
        }
    }
}