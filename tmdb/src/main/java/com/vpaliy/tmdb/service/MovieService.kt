package com.vpaliy.tmdb.service

import com.vpaliy.tmdb.QueryBuilder
import com.vpaliy.tmdb.model.*
import io.reactivex.Single

class MovieService(service: Movies): Movies by service{
    fun details(id:String,options: QueryBuilder.()-> QueryBuilder)
            :Single<MovieDetails>
            =details(id,options(QueryBuilder()).build())

    fun alternativeTitles(id:String, options: QueryBuilder.()-> QueryBuilder)
            :Single<AlternativeTitle>
            =alternativeTitles(id, options(QueryBuilder()).build())

    fun changes(id:String, options: QueryBuilder.()-> QueryBuilder)
            :Single<Changes>
            =changes(id,options(QueryBuilder()).build())

    fun images(id:String, options: QueryBuilder.()-> QueryBuilder)
            :Single<MovieImages>
            =images(id,options(QueryBuilder()).build())

    fun popular(options: QueryBuilder.()-> QueryBuilder)
            :Single<ResultPage<Movie>>
            =popular(options(QueryBuilder()).build())

    fun recommendations(id:String, options: QueryBuilder.() -> QueryBuilder)
            :Single<ResultPage<Movie>>
            =recommendations(id,options(QueryBuilder()).build())

    fun similar(id:String,options: QueryBuilder.() -> QueryBuilder)
            :Single<ResultPage<Movie>>
            =similar(id,options(QueryBuilder()).build())

    fun reviews(id:String,options: QueryBuilder.() -> QueryBuilder)
            :Single<ResultPage<Review>>
            =reviews(id,options(QueryBuilder()).build())

    fun nowPlaying(id:String,options: QueryBuilder.() -> QueryBuilder)
            :Single<ResultPage<Movie>>
            =nowPlaying(id,options(QueryBuilder()).build())

    fun topRated(id:String,options: QueryBuilder.() -> QueryBuilder)
            :Single<ResultPage<Movie>>
            =topRated(id,options(QueryBuilder()).build())
}