package com.vpaliy.tmdb.service

import com.vpaliy.tmdb.Endpoints
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path
import com.vpaliy.tmdb.Constants.ID
import com.vpaliy.tmdb.model.*
import retrofit2.http.QueryMap

interface TvShows {
    @GET(Endpoints.TV_DETAILS)
    fun getDetails(@Path(ID) id:String):Single<TMDBTVDetails>

    @GET(Endpoints.TV_DETAILS)
    fun getDetails(@Path(ID) id:String,
                   @QueryMap options:Map<String,String>):Single<TMDBTVDetails>

    @GET(Endpoints.TV_ACCOUNT_STATES)
    fun getAccountStates(@Path(ID) id:String):Single<TMDBAccountState>

    @GET(Endpoints.TV_ACCOUNT_STATES)
    fun getAccountStates(@Path(ID) id:String,
                         @QueryMap options:Map<String,String>):Single<TMDBAccountState>

    @GET(Endpoints.TV_ALTERNATIVE_TITLES)
    fun getAlternativeTitles(@Path(ID) id:String):Single<TMDBAlternativeTitle>

    @GET(Endpoints.TV_CHANGES)
    fun getChanges(@Path(ID) id:String):Single<TMDBChanges>

    @GET(Endpoints.TV_CHANGES)
    fun getChanges(@Path(ID) id:String,
                   @QueryMap options:Map<String,String>):Single<TMDBChanges>

    @GET(Endpoints.TV_RATINGS)
    fun getContentRatings(@Path(ID) id:String):Single<TMDBContentRatings>

    @GET(Endpoints.TV_CREDITS)
    fun getCredits(@Path(ID) id:String):Single<TMDBCredit>

    @GET(Endpoints.TV_EXTERNAL_IDS)
    fun getExternalIds(@Path(ID) id:String):Single<TMDBExternalIds>

    @GET(Endpoints.TV_IMAGES)
    fun getImages(@Path(ID) id:String):Single<TMDBMediaImages>

    @GET(Endpoints.TV_KEYWORDS)
    fun getKeywords(@Path(ID) id:String):Single<TMDBKeywords>

    @GET(Endpoints.TV_RECOMMENDATIONS)
    fun getRecommendations(@Path(ID) id:String):Single<TMDBResultPage<TMDBTvShow>>

    @GET(Endpoints.TV_RECOMMENDATIONS)
    fun getRecommendations(@Path(ID) id:String,
                           @QueryMap options:Map<String,String>):Single<TMDBResultPage<TMDBTvShow>>

    @GET(Endpoints.TV_SIMILAR)
    fun getSimilar(@Path(ID) id:String):Single<TMDBResultPage<TMDBTvShow>>

    @GET(Endpoints.TV_SIMILAR)
    fun getSimilar(@Path(ID) id:String,
                   @QueryMap options:Map<String,String>):Single<TMDBResultPage<TMDBTvShow>>

    @GET(Endpoints.TV_TRANSLATIONS)
    fun getTranslations(@Path(ID) id:String):Single<TranslationResult>

    @GET(Endpoints.TV_VIDEOS)
    fun getVideos(@Path(ID) id:String):Single<VideoResult>

    @GET(Endpoints.TV_AIRING_TODAY)
    fun getAiringToday():Single<TMDBResultPage<TMDBTvShow>>

    @GET(Endpoints.TV_AIRING_TODAY)
    fun getAiringToday(@QueryMap options:Map<String,String>):Single<TMDBResultPage<TMDBTvShow>>

    @GET(Endpoints.TV_ON_AIR)
    fun getTvOnAir():Single<TMDBResultPage<TMDBTvShow>>

    @GET(Endpoints.TV_ON_AIR)
    fun getTvOnAir(@QueryMap options:Map<String,String>):Single<TMDBResultPage<TMDBTvShow>>

    @GET(Endpoints.TV_POPULAR)
    fun getPopular():Single<TMDBResultPage<TMDBTvShow>>

    @GET(Endpoints.TV_POPULAR)
    fun getPopular(@QueryMap options:Map<String,String>):Single<TMDBResultPage<TMDBTvShow>>
}