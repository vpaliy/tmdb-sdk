package com.vpaliy.tmdb

import com.vpaliy.tmdb.model.ResultPage
import io.reactivex.Single
import retrofit2.http.GET

interface TMDBService{

    @GET("movie/popular")
    fun popularMovies():Single<ResultPage>
}