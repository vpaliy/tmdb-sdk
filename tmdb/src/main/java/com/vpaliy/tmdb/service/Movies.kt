package com.vpaliy.tmdb.service

import com.vpaliy.tmdb.Endpoints
import io.reactivex.Single
import com.vpaliy.tmdb.Constants.ID
import com.vpaliy.tmdb.Constants.SESSION_ID
import com.vpaliy.tmdb.model.*
import retrofit2.http.*

interface Movies {

    @GET(Endpoints.MOVIES_DETAILS)
    fun getDetails(@Path(ID) id: String): Single<TMDBMovieDetails>

    @GET(Endpoints.MOVIES_DETAILS)
    fun getDetails(@Path(ID) id: String,
                @QueryMap map: Map<String, String>):Single<TMDBMovieDetails>

    @GET(Endpoints.MOVIES_ACCOUNT_STATES)
    fun getAccountStates(@Path(ID) id: String,
                      @Query(SESSION_ID) sessionId: String): Single<TMDBAccountState>

    @GET(Endpoints.MOVIES_ALTERNATIVE_TITLES)
    fun getAlternativeTitles(@Path(ID) id: String): Single<TMDBAlternativeTitle>

    @GET(Endpoints.MOVIES_ALTERNATIVE_TITLES)
    fun getAlternativeTitles(@Path(ID) id: String,
                          @QueryMap options: Map<String, String>):Single<TMDBAlternativeTitle>

    @GET(Endpoints.MOVIES_CHANGES)
    fun getChanges(@Path(ID) id: String): Single<TMDBChanges>

    @GET(Endpoints.MOVIES_CHANGES)
    fun getChanges(@Path(ID) id: String,
                @QueryMap options: Map<String, String>):Single<TMDBChanges>

    @GET(Endpoints.MOVIE_CREDITS)
    fun getCredits(@Path(ID) id: String): Single<TMDBCredit>

    @GET(Endpoints.MOVIE_IMAGES)
    fun getImages(@Path(ID) id: String): Single<TMDBMediaImages>

    @GET(Endpoints.MOVIE_IMAGES)
    fun getImages(@Path(ID) id: String,
               @QueryMap options: Map<String, String>):Single<TMDBMediaImages>

    @GET(Endpoints.MOVIE_KEYWORDS)
    fun getKeywords(@Path(ID) id: String): Single<TMDBKeywords>

    @GET(Endpoints.MOVIE_RELEASE)
    fun getReleaseDates(@Path(ID) id: String): Single<TMDBReleases>

    @GET(Endpoints.MOVIE_VIDEOS)
    fun getVideos(@Path(ID) id: String): Single<VideoResult>

    @GET(Endpoints.MOVIE_TRANSLATIONS)
    fun getTranslations(@Path(ID) id: String): Single<TranslationResult>

    @GET(Endpoints.MOVIES_POPULAR)
    fun getPopular(): Single<TMDBResultPage<TMDBMovie>>

    @GET(Endpoints.MOVIES_POPULAR)
    fun getPopular(@QueryMap options: Map<String, String>): Single<TMDBResultPage<TMDBMovie>>

    @GET(Endpoints.MOVIE_RECOMMENDATIONS)
    fun getRecommendations(@Path(ID) id: String): Single<TMDBResultPage<TMDBMovie>>

    @GET(Endpoints.MOVIE_RECOMMENDATIONS)
    fun getRecommendations(@Path(ID) id: String,
                        @QueryMap options: Map<String, String>):Single<TMDBResultPage<TMDBMovie>>

    @GET(Endpoints.MOVIE_SIMILAR)
    fun getSimilar(@Path(ID) id: String): Single<TMDBResultPage<TMDBMovie>>

    @GET(Endpoints.MOVIE_SIMILAR)
    fun getSimilar(@Path(ID) id: String,
                @QueryMap options: Map<String, String>):Single<TMDBResultPage<TMDBMovie>>

    @GET(Endpoints.MOVIE_REVIEWS)
    fun getReviews(@Path(ID) id: String,
                @QueryMap options: Map<String, String>):Single<TMDBResultPage<TMDBReview>>

    @GET(Endpoints.MOVIE_REVIEWS)
    fun getReviews(@Path(ID) id: String): Single<TMDBResultPage<TMDBReview>>

    @GET(Endpoints.MOVIES_NOW_PLAYING)
    fun getNowPlaying(@Path(ID) id: String): Single<TMDBResultPage<TMDBMovie>>

    @GET(Endpoints.MOVIES_NOW_PLAYING)
    fun getNowPlaying(@Path(ID) id: String,
                   @QueryMap options: Map<String, String>):Single<TMDBResultPage<TMDBMovie>>

    @GET(Endpoints.MOVIES_TOP_RATED)
    fun getTopRated(@Path(ID) id: String): Single<TMDBResultPage<TMDBMovie>>

    @GET(Endpoints.MOVIES_TOP_RATED)
    fun getTopRated(@Path(ID) id: String,
                 @QueryMap options: Map<String, String>):Single<TMDBResultPage<TMDBMovie>>

    @GET(Endpoints.MOVIES_UPCOMING)
    fun getUpcoming(): Single<TMDBUpcomingResult>

    @GET(Endpoints.MOVIES_UPCOMING)
    fun getUpcoming(@QueryMap options: Map<String, String>): Single<TMDBUpcomingResult>
}