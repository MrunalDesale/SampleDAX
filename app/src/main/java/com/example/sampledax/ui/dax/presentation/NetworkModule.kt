package com.example.sampledax.ui.dax.presentation

import android.content.Context
import com.example.sampledax.ui.dax.data.mapper.DataMapper
import com.example.sampledax.ui.dax.data.service.NetworkService
import com.example.sampledax.ui.dax.data.service.RestApi
import com.example.sampledax.ui.dax.data.service.RestApiImp
import com.example.sampledax.ui.dax.domain.interactor.IndexUC
import com.example.sampledax.ui.dax.domain.repository.IndexRepository
import com.example.sampledax.ui.dax.presentation.utils.Constants.Companion.BASE_URL
import com.example.sampledax.ui.dax.data.repository.DataRepository
import io.reactivex.schedulers.Schedulers
import okhttp3.OkHttpClient
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

val networkModule = module {
    single {
        createRetrofit(
            createOkHttpClient()
        )
    }
    single { createNetworkApi(get()) }
    single { createRestAPI(get(), get()) }
    factory { createIndexUseCase(get()) }
    factory { createIndexRepository(get(), get()) }
}

fun createRetrofit(okHttpClient: OkHttpClient): Retrofit {
    return Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.createWithScheduler(Schedulers.io()))
        .baseUrl(BASE_URL)
        .client(okHttpClient)
        .build()
}

fun createOkHttpClient(): OkHttpClient {

    val httpClient = OkHttpClient.Builder()

    httpClient.addInterceptor { chain ->
        val original = chain.request()
        val request = original.newBuilder()
            .header("Api-Version", "v1")
            .header("Accept", "application/json")
            .build()

        chain.proceed(request)
    }
        .retryOnConnectionFailure(true)
        .callTimeout(
            2, TimeUnit.MINUTES
        )
        .connectTimeout(3000, TimeUnit.SECONDS)
        .writeTimeout(4000, TimeUnit.SECONDS)
        .readTimeout(3000, TimeUnit.SECONDS)

    return httpClient.build()
}

fun createNetworkApi(retrofit: Retrofit): NetworkService {
    return retrofit.create(NetworkService::class.java)
}

fun createRestAPI(mNetworkService: NetworkService, mContext: Context): RestApi {
    return RestApiImp(
        mNetworkService,
        mContext
    )
}

fun createIndexRepository(mRestApi: RestApi, mapper: DataMapper): IndexRepository {
    return DataRepository(mRestApi, mapper)
}

fun createIndexUseCase(
    mUserRepository: IndexRepository
): IndexUC {
    return IndexUC(mUserRepository)
}