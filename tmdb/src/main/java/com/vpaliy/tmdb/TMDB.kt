package com.vpaliy.tmdb

import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class TMDB(apiKey:String){

    val service:TMDBService

    init {
        val interceptor= Interceptor{
            val httpUrl=it.request()
                    .url().newBuilder()
                    .addQueryParameter("api_key",apiKey)
                    .build()
            it.proceed(it.request()
                    .newBuilder()
                    .url(httpUrl)
                    .build())
        }
        val okHttpClient=OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .build()
        service= Retrofit.Builder()
                .baseUrl("http://api.themoviedb.org/3/")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build().create(TMDBService::class.java)
    }
}