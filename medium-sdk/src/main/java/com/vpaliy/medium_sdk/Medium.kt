package com.vpaliy.medium_sdk

import com.vpaliy.medium_sdk.auth.AccessToken
import okhttp3.*
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class Medium(clientId:String,
             clientSecret:String,
             token: AccessToken){

    val service:MediumService

    init {
        val interceptor=Interceptor {
            var request=it.request()
            request=request.newBuilder()
                    .url(request.url().newBuilder()
                            .addQueryParameter("client_id",clientId)
                            .addQueryParameter("client_secret",clientSecret)
                            .addQueryParameter("token",token.access_token).build())
                    .build()
            it.proceed(request)
        }
        val okHttpClient=OkHttpClient.Builder()
                .connectTimeout(15L,TimeUnit.SECONDS)
                .writeTimeout(60L,TimeUnit.SECONDS)
                .readTimeout(60L,TimeUnit.SECONDS)
                .addInterceptor(interceptor).build()

        service=Retrofit.Builder()
                .baseUrl(Endpoints.BASE_URL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build().create(MediumService::class.java)
    }
}