package com.example.sampledax.ui.dax.data.service

import com.example.sampledax.ui.dax.data.response.IndexResponse
import io.reactivex.Observable
import retrofit2.Response

/*
* Interface to observe api response
* */
interface RestApi {
    fun doIndexAPI(
    ): Observable<Response<IndexResponse>>
}