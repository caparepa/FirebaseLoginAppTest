package com.caparepa.firebaseloginapptest.repository

import com.caparepa.firebaseloginapptest.data.model.User

interface UserRepository {

    suspend fun registerUser(email: String, password: String): User?
    suspend fun login(email: String, password: String): Boolean?
    suspend fun logout(): Boolean?

}