package com.vpaliy.tmdb.service

import com.vpaliy.tmdb.query.QueryBuilder
import com.vpaliy.tmdb.model.*
import io.reactivex.Single

class TvShowService(service:TvShows):TvShows by service{
    inline fun details(id:String, options: QueryBuilder.()-> QueryBuilder)
        :Single<TvShowDetails>
        =details(id,options(QueryBuilder()).build())

    inline fun accountStates(id:String,options: QueryBuilder.()-> QueryBuilder)
        :Single<AccountState>
        =accountStates(id,options(QueryBuilder()).build())

    inline fun changes(id:String,options: QueryBuilder.()-> QueryBuilder)
            :Single<Changes>
            =changes(id,options(QueryBuilder()).build())

    inline fun similar(id:String, options: QueryBuilder.() -> QueryBuilder)
            :Single<ResultPage<TvShow>>
            =similar(id,options(QueryBuilder()).build())

    inline fun recommendations(id:String, options: QueryBuilder.() -> QueryBuilder)
            :Single<ResultPage<TvShow>>
            =recommendations(id,options(QueryBuilder()).build())

    inline fun airingToday(options: QueryBuilder.()-> QueryBuilder)
            :Single<ResultPage<TvShow>>
            =airingToday(options(QueryBuilder()).build())

    inline fun tvOnAir(options: QueryBuilder.()-> QueryBuilder)
            :Single<ResultPage<TvShow>>
            =tvOnAir(options(QueryBuilder()).build())
}