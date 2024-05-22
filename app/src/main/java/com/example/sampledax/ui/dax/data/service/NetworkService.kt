package com.example.sampledax.ui.dax.data.service

import com.example.sampledax.ui.dax.data.response.IndexResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST

interface NetworkService {


    @Headers(
        "Api-Version: v1",
        "Accept: application/json",
        "Content-Type: application/json-patch+json"
    )
    @GET("20735/snapshot")
    fun getIndex(): Call<IndexResponse>

}