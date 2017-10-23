package com.vpaliy.tmdb.service

import com.vpaliy.tmdb.query.QueryBuilder
import com.vpaliy.tmdb.model.*
import io.reactivex.Single

class TvShowService(service:TvShows):TvShows by service{
    inline fun getDetails(id:String, options: QueryBuilder.()-> QueryBuilder)
        :Single<TMDBTVDetails>
        = getDetails(id,options(QueryBuilder()).build())

    inline fun getAccountStates(id:String,options: QueryBuilder.()-> QueryBuilder)
        :Single<AccountState>
        = getAccountStates(id,options(QueryBuilder()).build())

    inline fun getChanges(id:String,options: QueryBuilder.()-> QueryBuilder)
            :Single<Changes>
            = getChanges(id,options(QueryBuilder()).build())

    inline fun getSimilar(id:String, options: QueryBuilder.() -> QueryBuilder)
            :Single<Page<TVShowModel>>
            = getSimilar(id,options(QueryBuilder()).build())

    inline fun getRecommendations(id:String, options: QueryBuilder.() -> QueryBuilder)
            :Single<Page<TVShowModel>>
            = getRecommendations(id,options(QueryBuilder()).build())

    inline fun getAiringToday(options: QueryBuilder.()-> QueryBuilder)
            :Single<Page<TVShowModel>>
            = getAiringToday(options(QueryBuilder()).build())

    inline fun getTvOnAir(options: QueryBuilder.()-> QueryBuilder)
            :Single<Page<TVShowModel>>
            = getTvOnAir(options(QueryBuilder()).build())
}