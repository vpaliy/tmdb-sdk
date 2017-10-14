package com.vpaliy.tmdb.service

import com.vpaliy.tmdb.Endpoints
import com.vpaliy.tmdb.model.Movie
import com.vpaliy.tmdb.model.ResultPage
import com.vpaliy.tmdb.model.TvShow
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface Discover{
    @GET(Endpoints.DISCOVER_MOVIES)
    fun discoverMovies(@QueryMap options:Map<String,String>):Single<ResultPage<Movie>>

    @GET(Endpoints.DISCOVER_TV)
    fun discoverTv(@QueryMap options:Map<String,String>):Single<ResultPage<TvShow>>
}