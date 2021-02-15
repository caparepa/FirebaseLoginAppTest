package com.caparepa.firebaseloginapptest.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import org.koin.core.KoinComponent

open class BaseViewModel : ViewModel(), KoinComponent {

    val loadingState = MutableLiveData<Boolean>()
    val onSuccess = MutableLiveData<Any>()
    val onError = MutableLiveData<String>()

    fun showLoading() = loadingState.postValue(true)

    fun dismissLoading() = loadingState.postValue(false)

}