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
    fun details(@Path(ID) id:String):Single<TvShowDetails>

    @GET(Endpoints.TV_DETAILS)
    fun details(@Path(ID) id:String,
                @QueryMap options:Map<String,String>):Single<TvShowDetails>

    @GET(Endpoints.TV_ACCOUNT_STATES)
    fun accountStates(@Path(ID) id:String):Single<AccountState>

    @GET(Endpoints.TV_ACCOUNT_STATES)
    fun accountStates(@Path(ID) id:String,
                      @QueryMap options:Map<String,String>):Single<AccountState>

    @GET(Endpoints.TV_ALTERNATIVE_TITLES)
    fun alternativeTitles(@Path(ID) id:String):Single<AlternativeTitle>

    @GET(Endpoints.TV_CHANGES)
    fun changes(@Path(ID) id:String):Single<Changes>

    @GET(Endpoints.TV_CHANGES)
    fun changes(@Path(ID) id:String,
                @QueryMap options:Map<String,String>):Single<Changes>

    @GET(Endpoints.TV_RATINGS)
    fun contentRatings(@Path(ID) id:String):Single<ContentRatings>

    @GET(Endpoints.TV_CREDITS)
    fun credits(@Path(ID) id:String):Single<Credit>

    @GET(Endpoints.TV_EXTERNAL_IDS)
    fun externalIds(@Path(ID) id:String):Single<ExternalIds>

    @GET(Endpoints.TV_IMAGES)
    fun images(@Path(ID) id:String):Single<MediaImages>

    @GET(Endpoints.TV_KEYWORDS)
    fun keywords(@Path(ID) id:String):Single<Keywords>

    @GET(Endpoints.TV_RECOMMENDATIONS)
    fun recommendations(@Path(ID) id:String):Single<ResultPage<TvShow>>

    @GET(Endpoints.TV_RECOMMENDATIONS)
    fun recommendations(@Path(ID) id:String,
                        @QueryMap options:Map<String,String>):Single<ResultPage<TvShow>>

    @GET(Endpoints.TV_SIMILAR)
    fun similar(@Path(ID) id:String):Single<ResultPage<TvShow>>

    @GET(Endpoints.TV_SIMILAR)
    fun similar(@Path(ID) id:String,
                @QueryMap options:Map<String,String>):Single<ResultPage<TvShow>>

    @GET(Endpoints.TV_TRANSLATIONS)
    fun translations(@Path(ID) id:String):Single<TranslationResult>

    @GET(Endpoints.TV_VIDEOS)
    fun videos(@Path(ID) id:String):Single<VideoResult>

    @GET(Endpoints.TV_AIRING_TODAY)
    fun airingToday():Single<ResultPage<TvShow>>

    @GET(Endpoints.TV_AIRING_TODAY)
    fun airingToday(@QueryMap options:Map<String,String>):Single<ResultPage<TvShow>>

    @GET(Endpoints.TV_ON_AIR)
    fun tvOnAir():Single<ResultPage<TvShow>>

    @GET(Endpoints.TV_ON_AIR)
    fun tvOnAir(@QueryMap options:Map<String,String>):Single<ResultPage<TvShow>>

    @GET(Endpoints.TV_POPULAR)
    fun popular():Single<ResultPage<TvShow>>

    @GET(Endpoints.TV_POPULAR)
    fun popular(@QueryMap options:Map<String,String>):Single<ResultPage<TvShow>>
}