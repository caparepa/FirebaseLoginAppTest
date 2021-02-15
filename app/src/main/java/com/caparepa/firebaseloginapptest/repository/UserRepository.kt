package com.caparepa.firebaseloginapptest.repository

import com.caparepa.firebaseloginapptest.data.model.User

interface UserRepository {

    suspend fun registerUser(email: String, password: String, username: String): User?
    suspend fun updateUser(email: String, password: String, username: String): User?
    suspend fun login(email: String, password: String): Boolean?

}