package com.caparepa.firebaseloginapptest.ui.viewmodel

import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.core.KoinComponent

class UserViewModel : BaseViewModel(), KoinComponent {

    fun registerUser(username: String, email: String, password: String) {
        viewModelScope.launch(Dispatchers.IO) {
            registerUserAsync(username, email, password)
        }
    }

    fun login(email: String, password: String) {
        viewModelScope.launch(Dispatchers.IO) {
            loginAsync(email, password)
        }
    }

    suspend fun registerUserAsync(username: String, email: String, password: String) {
        val result = kotlin.runCatching {

        }
        with(result) {
            onSuccess {  }
            onFailure {  }
        }

    }

    suspend fun loginAsync(email: String, password: String) {
        val result = kotlin.runCatching {

        }
        with(result) {
            onSuccess {  }
            onFailure {  }
        }

    }

}