package com.vpaliy.tmdb.service

import com.vpaliy.tmdb.Endpoints
import com.vpaliy.tmdb.model.TMDBGenres
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path
import com.vpaliy.tmdb.Constants.ID
import com.vpaliy.tmdb.model.TMDBMovie
import com.vpaliy.tmdb.model.TMDBResultPage

interface GenreService{
    @GET(Endpoints.MOVIES_GENRE)
    fun getMovieGenres():Single<TMDBGenres>

    @GET(Endpoints.TV_GENRES)
    fun getTVGenres():Single<TMDBGenres>

    @GET(Endpoints.MOVIES_BY_GENRE)
    fun getMovies(@Path(ID) id:String):Single<TMDBResultPage<TMDBMovie>>
}