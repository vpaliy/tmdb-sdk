package com.vpaliy.tmdb.service

import com.vpaliy.tmdb.query.QueryBuilder
import com.vpaliy.tmdb.model.*
import io.reactivex.Single

class TvShowService(service:TvShows):TvShows by service{
    inline fun details(id:String, options: QueryBuilder.()-> QueryBuilder)
        :Single<TMDBTVDetails>
        =details(id,options(QueryBuilder()).build())

    inline fun accountStates(id:String,options: QueryBuilder.()-> QueryBuilder)
        :Single<TMDBAccountState>
        =accountStates(id,options(QueryBuilder()).build())

    inline fun changes(id:String,options: QueryBuilder.()-> QueryBuilder)
            :Single<TMDBChanges>
            =changes(id,options(QueryBuilder()).build())

    inline fun similar(id:String, options: QueryBuilder.() -> QueryBuilder)
            :Single<TMDBResultPage<TMDBTvShow>>
            =similar(id,options(QueryBuilder()).build())

    inline fun recommendations(id:String, options: QueryBuilder.() -> QueryBuilder)
            :Single<TMDBResultPage<TMDBTvShow>>
            =recommendations(id,options(QueryBuilder()).build())

    inline fun airingToday(options: QueryBuilder.()-> QueryBuilder)
            :Single<TMDBResultPage<TMDBTvShow>>
            =airingToday(options(QueryBuilder()).build())

    inline fun tvOnAir(options: QueryBuilder.()-> QueryBuilder)
            :Single<TMDBResultPage<TMDBTvShow>>
            =tvOnAir(options(QueryBuilder()).build())
}