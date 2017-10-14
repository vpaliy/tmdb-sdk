package com.vpaliy.tmdb.service

import com.vpaliy.tmdb.QueryBuilder
import com.vpaliy.tmdb.model.*
import io.reactivex.Single

class MovieService(service: Movies): Movies by service{
    inline fun details(id:String,options: QueryBuilder.()-> QueryBuilder)
            :Single<MovieDetails>
            =details(id,options(QueryBuilder()).build())

    inline fun alternativeTitles(id:String, options: QueryBuilder.()-> QueryBuilder)
            :Single<AlternativeTitle>
            =alternativeTitles(id, options(QueryBuilder()).build())

    inline fun changes(id:String, options: QueryBuilder.()-> QueryBuilder)
            :Single<Changes>
            =changes(id,options(QueryBuilder()).build())

    inline fun images(id:String, options: QueryBuilder.()-> QueryBuilder)
            :Single<MovieImages>
            =images(id,options(QueryBuilder()).build())

    inline fun popular(options: QueryBuilder.()-> QueryBuilder)
            :Single<ResultPage<Movie>>
            =popular(options(QueryBuilder()).build())

    inline fun recommendations(id:String, options: QueryBuilder.() -> QueryBuilder)
            :Single<ResultPage<Movie>>
            =recommendations(id,options(QueryBuilder()).build())

    inline fun similar(id:String,options: QueryBuilder.() -> QueryBuilder)
            :Single<ResultPage<Movie>>
            =similar(id,options(QueryBuilder()).build())

    inline fun reviews(id:String,options: QueryBuilder.() -> QueryBuilder)
            :Single<ResultPage<Review>>
            =reviews(id,options(QueryBuilder()).build())

    inline fun nowPlaying(id:String,options: QueryBuilder.() -> QueryBuilder)
            :Single<ResultPage<Movie>>
            =nowPlaying(id,options(QueryBuilder()).build())

    inline fun topRated(id:String,options: QueryBuilder.() -> QueryBuilder)
            :Single<ResultPage<Movie>>
            =topRated(id,options(QueryBuilder()).build())

    inline fun upcoming(options: QueryBuilder.()-> QueryBuilder)
            :Single<UpcomingResult>
            =upcoming(options(QueryBuilder()).build())
}