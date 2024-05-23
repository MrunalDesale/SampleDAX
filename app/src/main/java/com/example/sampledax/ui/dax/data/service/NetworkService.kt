package com.example.sampledax.ui.dax.data.service

import com.example.sampledax.ui.dax.data.response.IndexResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers

/*
* Interface to call network api.
* */
interface NetworkService {
    @Headers(
        "Accept: application/json",
    )
    @GET("20735/snapshot")
    fun getIndex(): Call<IndexResponse>
}