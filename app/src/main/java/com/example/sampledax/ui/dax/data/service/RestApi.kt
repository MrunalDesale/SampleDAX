package com.example.sampledax.ui.dax.data.service

import com.example.sampledax.ui.dax.data.response.IndexResponse
import io.reactivex.Observable
import retrofit2.Response


interface RestApi {
    fun doIndexAPI(
    ): Observable<Response<IndexResponse>>
}