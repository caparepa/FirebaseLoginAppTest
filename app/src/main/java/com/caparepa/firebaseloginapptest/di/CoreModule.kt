package com.caparepa.firebaseloginapptest.di

import com.caparepa.firebaseloginapptest.di.modules.*
import org.koin.core.context.loadKoinModules

object CoreModule {

    private val modules =
        listOf(networkModule, repositoryModule, localModule, databaseModule, viewModelModule, dataModule)

    fun init() = loadKoinModules(modules)

}