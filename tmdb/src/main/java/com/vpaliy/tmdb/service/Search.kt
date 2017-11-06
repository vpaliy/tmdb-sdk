package com.vpaliy.tmdb.service

import com.vpaliy.tmdb.Endpoints
import com.vpaliy.tmdb.model.MovieModel
import com.vpaliy.tmdb.model.Page
import com.vpaliy.tmdb.model.TVShowModel
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.QueryMap

interface Search{
    @GET(Endpoints.SEARCH_MOVIE)
    fun searchMovies(@Query("query") query:String)
            :Single<Page<MovieModel>>

    @GET(Endpoints.SEARCH_MOVIE)
    fun searchMovies(@Query("query") query:String, @QueryMap map:Map<String,String>)
            :Single<Page<MovieModel>>

    @GET(Endpoints.SEARCH_TV)
    fun searchTV(@Query("query") query:String)
            :Single<Page<TVShowModel>>

    @GET(Endpoints.SEARCH_TV)
    fun searchTV(@Query("query") query:String,@QueryMap map:Map<String,String>)
            :Single<Page<TVShowModel>>

}