package com.vpaliy.tmdb.service

import com.vpaliy.tmdb.Endpoints
import com.vpaliy.tmdb.model.Genres
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path
import com.vpaliy.tmdb.Constants.ID
import com.vpaliy.tmdb.model.MovieModel
import com.vpaliy.tmdb.model.Page

interface GenreService {
  @GET(Endpoints.MOVIES_GENRE)
  fun getMovieGenres(): Single<Genres>

  @GET(Endpoints.TV_GENRES)
  fun getTVGenres(): Single<Genres>

  @GET(Endpoints.MOVIES_BY_GENRE)
  fun getMovies(@Path(ID) id: String): Single<Page<MovieModel>>
}