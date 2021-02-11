package com.caparepa.firebaseloginapptest

import android.app.Application
import com.caparepa.firebaseloginapptest.di.CoreModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class FirebaseLoginTestApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin()
        CoreModule.init()
    }

    private fun initKoin() {
        startKoin {
            androidLogger()
            androidContext(this@FirebaseLoginTestApplication)
        }
    }

}