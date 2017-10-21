package com.vpaliy.tmdb.service

import com.vpaliy.tmdb.query.QueryBuilder
import com.vpaliy.tmdb.model.*
import io.reactivex.Single

class MovieService(service: Movies): Movies by service{
    inline fun details(id:String,options: QueryBuilder.()-> QueryBuilder)
            :Single<TMDBMovieDetails>
            =details(id,options(QueryBuilder()).build())

    inline fun alternativeTitles(id:String, options: QueryBuilder.()-> QueryBuilder)
            :Single<TMDBAlternativeTitle>
            =alternativeTitles(id, options(QueryBuilder()).build())

    inline fun changes(id:String, options: QueryBuilder.()-> QueryBuilder)
            :Single<TMDBChanges>
            =changes(id,options(QueryBuilder()).build())

    inline fun images(id:String, options: QueryBuilder.()-> QueryBuilder)
            :Single<TMDBMediaImages>
            =images(id,options(QueryBuilder()).build())

    inline fun popular(options: QueryBuilder.()-> QueryBuilder)
            :Single<TMDBResultPage<TMDBMovie>>
            =popular(options(QueryBuilder()).build())

    inline fun recommendations(id:String, options: QueryBuilder.() -> QueryBuilder)
            :Single<TMDBResultPage<TMDBMovie>>
            =recommendations(id,options(QueryBuilder()).build())

    inline fun similar(id:String,options: QueryBuilder.() -> QueryBuilder)
            :Single<TMDBResultPage<TMDBMovie>>
            =similar(id,options(QueryBuilder()).build())

    inline fun reviews(id:String,options: QueryBuilder.() -> QueryBuilder)
            :Single<TMDBResultPage<TMDBReview>>
            =reviews(id,options(QueryBuilder()).build())

    inline fun nowPlaying(id:String,options: QueryBuilder.() -> QueryBuilder)
            :Single<TMDBResultPage<TMDBMovie>>
            =nowPlaying(id,options(QueryBuilder()).build())

    inline fun topRated(id:String,options: QueryBuilder.() -> QueryBuilder)
            :Single<TMDBResultPage<TMDBMovie>>
            =topRated(id,options(QueryBuilder()).build())

    inline fun upcoming(options: QueryBuilder.()-> QueryBuilder)
            :Single<TMDBUpcomingResult>
            =upcoming(options(QueryBuilder()).build())
}