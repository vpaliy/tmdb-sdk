package com.vpaliy.tmdb.service

import com.vpaliy.tmdb.Endpoints
import com.vpaliy.tmdb.model.MovieModel
import com.vpaliy.tmdb.model.Page
import com.vpaliy.tmdb.model.TVShowModel
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface Discover {
  @GET(Endpoints.DISCOVER_MOVIES)
  fun discoverMovies(@QueryMap options: Map<String, String>): Single<Page<MovieModel>>

  @GET(Endpoints.DISCOVER_TV)
  fun discoverTV(@QueryMap options: Map<String, String>): Single<Page<TVShowModel>>
}