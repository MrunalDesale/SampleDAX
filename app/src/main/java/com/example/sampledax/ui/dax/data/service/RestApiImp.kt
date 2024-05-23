package com.example.sampledax.ui.dax.data.service

import android.annotation.SuppressLint
import android.content.Context
import android.net.ConnectivityManager
import android.util.Log
import com.example.sampledax.ui.dax.data.NetworkUnavailableException
import com.example.sampledax.ui.dax.data.ExceptionFactory
import com.example.sampledax.ui.dax.data.response.ErrorResponse
import com.example.sampledax.ui.dax.data.response.IndexResponse
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import io.reactivex.Observable
import retrofit2.Response


class RestApiImp(
    private var mNetworkService: NetworkService,
    private var mContext: Context
) : RestApi {

    private val type = object : TypeToken<ErrorResponse>() {}.type
    val gson = Gson()

    @SuppressLint("MissingPermission")
    fun isThereInternetConnection(): Boolean {
        val cm =
            this.mContext.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager?
        return cm!!.activeNetworkInfo != null
    }

    override fun doIndexAPI(): Observable<Response<IndexResponse>> {
        return Observable.create { emitter ->

            if (!isThereInternetConnection()) {
                emitter.onError(NetworkUnavailableException())
                return@create
            }

            val sessionEntity: Response<IndexResponse> =
                mNetworkService.getIndex().execute()

            if (sessionEntity.isSuccessful) {
                if (sessionEntity.body() != null) {
                    emitter.onNext(sessionEntity)

                    emitter.onComplete()
                } else {
                    emitter.onError(UnknownError())
                }
            } else {
                val error = sessionEntity.errorBody()
                Log.e("Error", "" + error)
                val errorResponse: ErrorResponse? =
                    gson.fromJson(sessionEntity.errorBody()!!.charStream(), type)
                emitter.onError(
                    ExceptionFactory.create(
                        sessionEntity.code(),
                        errorResponse?.message
                    )
                )
            }
        }
    }
}