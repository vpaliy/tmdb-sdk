package com.vpaliy.tmdb

import com.vpaliy.tmdb.adapter.DiscoverServiceAdapter
import com.vpaliy.tmdb.adapter.MovieServiceAdapter
import com.vpaliy.tmdb.adapter.SearchServiceAdapter
import com.vpaliy.tmdb.adapter.TVServiceAdapter
import com.vpaliy.tmdb.service.*
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class TMDB private constructor(private val retrofit: Retrofit) {

  val moviesService by lazy {
    MovieServiceAdapter(createService(Movies::class.java))
  }

  val discoverService by lazy {
    DiscoverServiceAdapter(createService(Discover::class.java))
  }

  val tvService by lazy {
    TVServiceAdapter(createService(TvShows::class.java))
  }

  val genreService by lazy {
    createService(GenreService::class.java)
  }

  val searchService by lazy {
    SearchServiceAdapter(createService(Search::class.java))
  }

  private fun <T> createService(`class`: Class<T>): T = retrofit.create(`class`)

  companion object {
    fun create(apiKey: String, build: Builder.() -> Unit)
        = Builder(apiKey).apply(build).build()
  }

  class Builder(val apiKey: String) {
    private val interceptors = mutableListOf<Interceptor>()
    private var httpClient: OkHttpClient? = null

    fun addInterceptor(interceptor: Interceptor) = apply {
      interceptors.add(interceptor)
    }

    fun setOkHttpClient(httpClient: OkHttpClient) = apply {
      this.httpClient = httpClient
    }

    fun build(): TMDB {
      if (httpClient == null) {
        httpClient = OkHttpClient.Builder().build()
      }
      httpClient?.let {
        val builder = it.newBuilder()
        interceptors.add(Interceptor {
          val httpUrlBuilder = it.request()
              .url().newBuilder()
              .addQueryParameter("api_key", apiKey)
          it.proceed(it.request()
              .newBuilder()
              .url(httpUrlBuilder.build())
              .build())
        })
        interceptors.forEach {
          builder.addInterceptor(it)
        }
        httpClient = builder.build()
      }
      return TMDB(Retrofit.Builder()
          .baseUrl("http://api.themoviedb.org/3/")
          .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
          .addConverterFactory(GsonConverterFactory.create())
          .client(httpClient)
          .build())
    }
  }
}