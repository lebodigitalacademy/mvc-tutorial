package com.example.myapplicationtutorial

import com.google.gson.annotations.SerializedName

class LoginRequest(password: String, email: String) {
    data class LoginRequest(
        @SerializedName("email")
        var email: String,
        @SerializedName("password")
        var password: String
    )
}