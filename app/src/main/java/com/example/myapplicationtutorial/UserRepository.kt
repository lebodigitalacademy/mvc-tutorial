package com.example.myapplicationtutorial

import retrofit2.Response

class UserRepository {
    suspend fun loginUser(loginRequest:LoginRequest):
            Response<LoginRequest.LoginResponse>? {
        return UserApi.getApi()?.loginUser(loginRequest =
        loginRequest)
    }
}

