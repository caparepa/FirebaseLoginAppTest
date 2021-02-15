package com.caparepa.firebaseloginapptest.data.model


import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("userId")
    val userId: String? = null,
    @SerializedName("email")
    val email: String? = null
)