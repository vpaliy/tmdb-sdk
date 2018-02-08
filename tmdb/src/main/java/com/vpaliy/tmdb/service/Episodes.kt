package com.vpaliy.tmdb.service

import com.vpaliy.tmdb.Endpoints
import retrofit2.http.GET
import retrofit2.http.Path
import com.vpaliy.tmdb.Constants.ID
import com.vpaliy.tmdb.Constants.NUM
import com.vpaliy.tmdb.model.EpisodeModel
import io.reactivex.Single
import retrofit2.http.QueryMap

interface Episodes {
  @GET(Endpoints.EPISODE_DETAILS)
  fun getDetails(@Path(ID) id: String,
                 @Path(NUM) seasonNumber: Int,
                 @Path(NUM) episodeNumber: Int): Single<EpisodeModel>

  @GET(Endpoints.EPISODE_DETAILS)
  fun getDetails(@Path(ID) id: String,
                 @Path(NUM) seasonNumber: Int,
                 @Path(NUM) episodeNumber: Int,
                 @QueryMap options: Map<String, String>): Single<EpisodeModel>
}