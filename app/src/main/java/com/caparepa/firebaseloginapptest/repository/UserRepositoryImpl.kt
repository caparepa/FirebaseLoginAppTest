package com.caparepa.firebaseloginapptest.repository

import com.caparepa.firebaseloginapptest.data.model.User

class UserRepositoryImpl : UserRepository {
    override suspend fun registerUser(email: String, password: String, username: String): User? {
        TODO("Not yet implemented")
    }

    override suspend fun updateUser(email: String, password: String, username: String): User? {
        TODO("Not yet implemented")
    }

    override suspend fun login(email: String, password: String): Boolean? {
        TODO("Not yet implemented")
    }
}