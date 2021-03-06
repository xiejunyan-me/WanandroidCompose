package com.jeckonly.wanandroidcompose.data.remote

import com.jeckonly.wanandroidcompose.data.remote.dto.common.RemoteDto
import com.jeckonly.wanandroidcompose.data.remote.dto.login.SigninDto
import com.jeckonly.wanandroidcompose.data.remote.dto.login.SignupDto
import retrofit2.http.POST
import retrofit2.http.Query

interface WACApi {


    @POST(SIGN_IN_URL)
    suspend fun signIn(
        @Query("username") username: String,
        @Query("password") password: String
    ): RemoteDto<SigninDto>


    @POST(SIGN_UP_URL)
    suspend fun signUp(
        @Query("username") username: String,
        @Query("password") password: String,
        @Query("repassword") repassword: String
    ): RemoteDto<SignupDto>


    companion object {
        const val BASE_URL = "https://www.wanandroid.com"

        const val SIGN_IN_URL = "$BASE_URL/user/login"

        const val SIGN_UP_URL = "$BASE_URL/user/register"
    }
}