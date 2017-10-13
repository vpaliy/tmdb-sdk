package com.vpaliy.tmdb

import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory


open class ServiceCreator(map: MutableMap<String,String>){

    private constructor(builder:Builder):this(builder.parameters)

    protected val retrofit:Retrofit

    init{
        val interceptor= Interceptor {
            val httpUrlBuilder=it.request()
                    .url().newBuilder()
            map.forEach {(key, value)->
                httpUrlBuilder.addQueryParameter(key,value)
            }
            it.proceed(it.request()
                    .newBuilder()
                    .url(httpUrlBuilder.build())
                    .build())
        }
        val okHttpClient= OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .build()
        retrofit=Retrofit.Builder()
                .baseUrl("http://api.themoviedb.org/3/")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build()
    }

    fun <T> createService(`class`:Class<T>):T=retrofit.create(`class`)

    companion object {
        inline fun build(apiKey: String, block:Builder.()->Unit)=Builder(apiKey).apply(block)
    }

    class Builder(apiKey: String){
        val parameters=HashMap<String,String>().apply { put("api_key",apiKey) }

        fun addQueryParameter(key:String,value:String)=apply { parameters.put(key,value) }

        fun build()=ServiceCreator(this)

    }
}