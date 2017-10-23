package com.vpaliy.tmdb.service

import com.vpaliy.tmdb.Endpoints
import io.reactivex.Single
import com.vpaliy.tmdb.Constants.ID
import com.vpaliy.tmdb.Constants.SESSION_ID
import com.vpaliy.tmdb.model.*
import retrofit2.http.*

interface Movies {

    @GET(Endpoints.MOVIES_DETAILS)
    fun getDetails(@Path(ID) id: String): Single<MovieDetails>

    @GET(Endpoints.MOVIES_DETAILS)
    fun getDetails(@Path(ID) id: String,
                @QueryMap map: Map<String, String>):Single<MovieDetails>

    @GET(Endpoints.MOVIES_ACCOUNT_STATES)
    fun getAccountStates(@Path(ID) id: String,
                      @Query(SESSION_ID) sessionId: String): Single<AccountState>

    @GET(Endpoints.MOVIES_ALTERNATIVE_TITLES)
    fun getAlternativeTitles(@Path(ID) id: String): Single<AlternativeTitle>

    @GET(Endpoints.MOVIES_ALTERNATIVE_TITLES)
    fun getAlternativeTitles(@Path(ID) id: String,
                          @QueryMap options: Map<String, String>):Single<AlternativeTitle>

    @GET(Endpoints.MOVIES_CHANGES)
    fun getChanges(@Path(ID) id: String): Single<Changes>

    @GET(Endpoints.MOVIES_CHANGES)
    fun getChanges(@Path(ID) id: String,
                @QueryMap options: Map<String, String>):Single<Changes>

    @GET(Endpoints.MOVIE_CREDITS)
    fun getCredits(@Path(ID) id: String): Single<CreditModel>

    @GET(Endpoints.MOVIE_IMAGES)
    fun getImages(@Path(ID) id: String): Single<MediaImages>

    @GET(Endpoints.MOVIE_IMAGES)
    fun getImages(@Path(ID) id: String,
               @QueryMap options: Map<String, String>):Single<MediaImages>

    @GET(Endpoints.MOVIE_KEYWORDS)
    fun getKeywords(@Path(ID) id: String): Single<Keywords>

    @GET(Endpoints.MOVIE_RELEASE)
    fun getReleaseDates(@Path(ID) id: String): Single<TMDBReleases>

    @GET(Endpoints.MOVIE_VIDEOS)
    fun getVideos(@Path(ID) id: String): Single<VideoResult>

    @GET(Endpoints.MOVIE_TRANSLATIONS)
    fun getTranslations(@Path(ID) id: String): Single<TranslationResult>

    @GET(Endpoints.MOVIES_POPULAR)
    fun getPopular(): Single<Page<MovieModel>>

    @GET(Endpoints.MOVIES_POPULAR)
    fun getPopular(@QueryMap options: Map<String, String>): Single<Page<MovieModel>>

    @GET(Endpoints.MOVIE_RECOMMENDATIONS)
    fun getRecommendations(@Path(ID) id: String): Single<Page<MovieModel>>

    @GET(Endpoints.MOVIE_RECOMMENDATIONS)
    fun getRecommendations(@Path(ID) id: String,
                        @QueryMap options: Map<String, String>):Single<Page<MovieModel>>

    @GET(Endpoints.MOVIE_SIMILAR)
    fun getSimilar(@Path(ID) id: String): Single<Page<MovieModel>>

    @GET(Endpoints.MOVIE_SIMILAR)
    fun getSimilar(@Path(ID) id: String,
                @QueryMap options: Map<String, String>):Single<Page<MovieModel>>

    @GET(Endpoints.MOVIE_REVIEWS)
    fun getReviews(@Path(ID) id: String,
                @QueryMap options: Map<String, String>):Single<Page<ReviewModel>>

    @GET(Endpoints.MOVIE_REVIEWS)
    fun getReviews(@Path(ID) id: String): Single<Page<ReviewModel>>

    @GET(Endpoints.MOVIES_NOW_PLAYING)
    fun getNowPlaying(@Path(ID) id: String): Single<Page<MovieModel>>

    @GET(Endpoints.MOVIES_NOW_PLAYING)
    fun getNowPlaying(@Path(ID) id: String,
                   @QueryMap options: Map<String, String>):Single<Page<MovieModel>>

    @GET(Endpoints.MOVIES_TOP_RATED)
    fun getTopRated(@Path(ID) id: String): Single<Page<MovieModel>>

    @GET(Endpoints.MOVIES_TOP_RATED)
    fun getTopRated(@Path(ID) id: String,
                 @QueryMap options: Map<String, String>):Single<Page<MovieModel>>

    @GET(Endpoints.MOVIES_UPCOMING)
    fun getUpcoming(): Single<TMDBUpcomingResult>

    @GET(Endpoints.MOVIES_UPCOMING)
    fun getUpcoming(@QueryMap options: Map<String, String>): Single<TMDBUpcomingResult>
}