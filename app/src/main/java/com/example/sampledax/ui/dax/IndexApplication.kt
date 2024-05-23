package com.example.sampledax.ui.dax

import android.app.Application
import com.example.sampledax.ui.dax.presentation.PostModule
import com.example.sampledax.ui.dax.presentation.networkModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class IndexApplication : Application() {
    companion object {
        private lateinit var instance: IndexApplication
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        startKoin {
            androidLogger()
            androidContext(this@IndexApplication)
            modules(
                listOf(
                    PostModule,
                    networkModule
                )
            )
        }
    }
}