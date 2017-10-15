package com.vpaliy.tmdb.service

import com.vpaliy.tmdb.QueryBuilder
import com.vpaliy.tmdb.model.*
import io.reactivex.Single

class TvShowService(service:TvShows):TvShows by service{
    fun details(id:String, options:QueryBuilder.()->QueryBuilder)
        :Single<TvShowDetails>
        =details(id,options(QueryBuilder()).build())

    fun accountStates(id:String,options:QueryBuilder.()->QueryBuilder)
        :Single<AccountState>
        =accountStates(id,options(QueryBuilder()).build())

    fun changes(id:String,options:QueryBuilder.()->QueryBuilder)
            :Single<Changes>
            =changes(id,options(QueryBuilder()).build())

    fun similar(id:String, options: QueryBuilder.() -> QueryBuilder)
            :Single<ResultPage<TvShow>>
            =similar(id,options(QueryBuilder()).build())

    fun recommendations(id:String, options: QueryBuilder.() -> QueryBuilder)
            :Single<ResultPage<TvShow>>
            =recommendations(id,options(QueryBuilder()).build())

    fun airingToday(options:QueryBuilder.()-> QueryBuilder)
            :Single<ResultPage<TvShow>>
            =airingToday(options(QueryBuilder()).build())

    fun tvOnAir(options:QueryBuilder.()-> QueryBuilder)
            :Single<ResultPage<TvShow>>
            =tvOnAir(options(QueryBuilder()).build())
}