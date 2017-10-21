package com.vpaliy.tmdb.service

import com.vpaliy.tmdb.Endpoints
import io.reactivex.Single
import com.vpaliy.tmdb.Constants.ID
import com.vpaliy.tmdb.Constants.SESSION_ID
import com.vpaliy.tmdb.model.*
import retrofit2.http.*

interface Movies {

    @GET(Endpoints.MOVIES_DETAILS)
    fun details(@Path(ID) id: String): Single<TMDBMovieDetails>

    @GET(Endpoints.MOVIES_DETAILS)
    fun details(@Path(ID) id: String,
                @QueryMap map: Map<String, String>):Single<TMDBMovieDetails>

    @GET(Endpoints.MOVIES_ACCOUNT_STATES)
    fun accountStates(@Path(ID) id: String,
                      @Query(SESSION_ID) sessionId: String): Single<TMDBAccountState>

    @GET(Endpoints.MOVIES_ALTERNATIVE_TITLES)
    fun alternativeTitles(@Path(ID) id: String): Single<TMDBAlternativeTitle>

    @GET(Endpoints.MOVIES_ALTERNATIVE_TITLES)
    fun alternativeTitles(@Path(ID) id: String,
                          @QueryMap options: Map<String, String>):Single<TMDBAlternativeTitle>

    @GET(Endpoints.MOVIES_CHANGES)
    fun changes(@Path(ID) id: String): Single<TMDBChanges>

    @GET(Endpoints.MOVIES_CHANGES)
    fun changes(@Path(ID) id: String,
                @QueryMap options: Map<String, String>):Single<TMDBChanges>

    @GET(Endpoints.MOVIE_CREDITS)
    fun credits(@Path(ID) id: String): Single<TMDBCredit>

    @GET(Endpoints.MOVIE_IMAGES)
    fun images(@Path(ID) id: String): Single<TMDBMediaImages>

    @GET(Endpoints.MOVIE_IMAGES)
    fun images(@Path(ID) id: String,
               @QueryMap options: Map<String, String>):Single<TMDBMediaImages>

    @GET(Endpoints.MOVIE_KEYWORDS)
    fun keywords(@Path(ID) id: String): Single<TMDBKeywords>

    @GET(Endpoints.MOVIE_RELEASE)
    fun releaseDates(@Path(ID) id: String): Single<TMDBReleases>

    @GET(Endpoints.MOVIE_VIDEOS)
    fun videos(@Path(ID) id: String): Single<VideoResult>

    @GET(Endpoints.MOVIE_TRANSLATIONS)
    fun translations(@Path(ID) id: String): Single<TranslationResult>

    @GET(Endpoints.MOVIES_POPULAR)
    fun popular(): Single<TMDBResultPage<TMDBMovie>>

    @GET(Endpoints.MOVIES_POPULAR)
    fun popular(@QueryMap options: Map<String, String>): Single<TMDBResultPage<TMDBMovie>>

    @GET(Endpoints.MOVIE_RECOMMENDATIONS)
    fun recommendations(@Path(ID) id: String): Single<TMDBResultPage<TMDBMovie>>

    @GET(Endpoints.MOVIE_RECOMMENDATIONS)
    fun recommendations(@Path(ID) id: String,
                        @QueryMap options: Map<String, String>):Single<TMDBResultPage<TMDBMovie>>

    @GET(Endpoints.MOVIE_SIMILAR)
    fun similar(@Path(ID) id: String): Single<TMDBResultPage<TMDBMovie>>

    @GET(Endpoints.MOVIE_SIMILAR)
    fun similar(@Path(ID) id: String,
                @QueryMap options: Map<String, String>):Single<TMDBResultPage<TMDBMovie>>

    @GET(Endpoints.MOVIE_REVIEWS)
    fun reviews(@Path(ID) id: String,
                @QueryMap options: Map<String, String>):Single<TMDBResultPage<TMDBReview>>

    @GET(Endpoints.MOVIE_REVIEWS)
    fun reviews(@Path(ID) id: String): Single<TMDBResultPage<TMDBReview>>

    @GET(Endpoints.MOVIES_NOW_PLAYING)
    fun nowPlaying(@Path(ID) id: String): Single<TMDBResultPage<TMDBMovie>>

    @GET(Endpoints.MOVIES_NOW_PLAYING)
    fun nowPlaying(@Path(ID) id: String,
                   @QueryMap options: Map<String, String>):Single<TMDBResultPage<TMDBMovie>>

    @GET(Endpoints.MOVIES_TOP_RATED)
    fun topRated(@Path(ID) id: String): Single<TMDBResultPage<TMDBMovie>>

    @GET(Endpoints.MOVIES_TOP_RATED)
    fun topRated(@Path(ID) id: String,
                 @QueryMap options: Map<String, String>):Single<TMDBResultPage<TMDBMovie>>

    @GET(Endpoints.MOVIES_UPCOMING)
    fun upcoming(): Single<TMDBUpcomingResult>

    @GET(Endpoints.MOVIES_UPCOMING)
    fun upcoming(@QueryMap options: Map<String, String>): Single<TMDBUpcomingResult>
}