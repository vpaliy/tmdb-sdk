package com.vpaliy.tmdb.service

import com.vpaliy.tmdb.Endpoints
import io.reactivex.Single
import com.vpaliy.tmdb.Constants.ID
import com.vpaliy.tmdb.Constants.SESSION_ID
import com.vpaliy.tmdb.model.*
import retrofit2.http.*

interface Movies {

    @GET(Endpoints.MOVIES_DETAILS)
    fun details(@Path(ID) id:String):Single<MovieDetails>

    @GET(Endpoints.MOVIES_DETAILS)
    fun details(@Path(ID) id:String,
                @QueryMap map:Map<String,String>):Single<MovieDetails>

    @GET(Endpoints.MOVIES_ACCOUNT_STATES)
    fun accountStates(@Path(ID) id:String,
                      @Query(SESSION_ID) sessionId:String):Single<AccountState>

    @GET(Endpoints.MOVIES_ALTERNATIVE_TITLES)
    fun alternativeTitles(@Path(ID) id:String):Single<AlternativeTitle>

    @GET(Endpoints.MOVIES_ALTERNATIVE_TITLES)
    fun alternativeTitles(@Path(ID) id:String,
                          @QueryMap options:Map<String,String>):Single<AlternativeTitle>

    @GET(Endpoints.MOVIES_CHANGES)
    fun changes(@Path(ID) id:String):Single<Changes>

    @GET(Endpoints.MOVIES_CHANGES)
    fun changes(@Path(ID) id:String,
                @QueryMap options:Map<String,String>):Single<Changes>

    @GET(Endpoints.MOVIE_CREDITS)
    fun credits(@Path(ID) id:String):Single<Credit>

    @GET(Endpoints.MOVIE_IMAGES)
    fun images(@Path(ID) id:String):Single<MovieImages>

    @GET(Endpoints.MOVIE_IMAGES)
    fun images(@Path(ID) id:String,
               @QueryMap options:Map<String,String>):Single<MovieImages>

    @GET(Endpoints.MOVIE_KEYWORDS)
    fun keywords(@Path(ID) id:String):Single<Keywords>

    @GET(Endpoints.MOVIE_RELEASE)
    fun releaseDates(@Path(ID) id:String):Single<Releases>

    @GET(Endpoints.MOVIE_VIDEOS)
    fun videos(@Path(ID) id:String):Single<VideoResult>

    @GET(Endpoints.MOVIE_TRANSLATIONS)
    fun translations(@Path(ID) id:String):Single<TranslationResult>
}