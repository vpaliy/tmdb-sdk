package com.vpaliy.tmdb.service

import com.vpaliy.tmdb.Endpoints
import com.vpaliy.tmdb.model.TMDBMovie
import com.vpaliy.tmdb.model.TMDBResultPage
import com.vpaliy.tmdb.model.TMDBTvShow
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface Discover{
    @GET(Endpoints.DISCOVER_MOVIES)
    fun discoverMovies(@QueryMap options:Map<String,String>):Single<TMDBResultPage<TMDBMovie>>

    @GET(Endpoints.DISCOVER_TV)
    fun discoverTv(@QueryMap options:Map<String,String>):Single<TMDBResultPage<TMDBTvShow>>
}