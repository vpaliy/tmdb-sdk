package com.vpaliy.tmdb.service

import com.vpaliy.tmdb.query.QueryBuilder
import com.vpaliy.tmdb.model.*
import io.reactivex.Single

class MovieService(service: Movies): Movies by service{
    inline fun getDetails(id:String,options: QueryBuilder.()-> QueryBuilder)
            :Single<TMDBMovieDetails>
            =getDetails(id,options(QueryBuilder()).build())

    inline fun getAlternativeTitles(id:String, options: QueryBuilder.()-> QueryBuilder)
            :Single<TMDBAlternativeTitle>
            =getAlternativeTitles(id, options(QueryBuilder()).build())

    inline fun getChanges(id:String, options: QueryBuilder.()-> QueryBuilder)
            :Single<TMDBChanges>
            =getChanges(id,options(QueryBuilder()).build())

    inline fun getImages(id:String, options: QueryBuilder.()-> QueryBuilder)
            :Single<TMDBMediaImages>
            =getImages(id,options(QueryBuilder()).build())

    inline fun getPopular(options: QueryBuilder.()-> QueryBuilder)
            :Single<TMDBResultPage<TMDBMovie>>
            =getPopular(options(QueryBuilder()).build())

    inline fun getRecommendations(id:String, options: QueryBuilder.() -> QueryBuilder)
            :Single<TMDBResultPage<TMDBMovie>>
            =getRecommendations(id,options(QueryBuilder()).build())

    inline fun getSimilar(id:String,options: QueryBuilder.() -> QueryBuilder)
            :Single<TMDBResultPage<TMDBMovie>>
            =getSimilar(id,options(QueryBuilder()).build())

    inline fun getReviews(id:String,options: QueryBuilder.() -> QueryBuilder)
            :Single<TMDBResultPage<TMDBReview>>
            =getReviews(id,options(QueryBuilder()).build())

    inline fun getNowPlaying(id:String,options: QueryBuilder.() -> QueryBuilder)
            :Single<TMDBResultPage<TMDBMovie>>
            =getNowPlaying(id,options(QueryBuilder()).build())

    inline fun getTopRated(id:String,options: QueryBuilder.() -> QueryBuilder)
            :Single<TMDBResultPage<TMDBMovie>>
            =getTopRated(id,options(QueryBuilder()).build())

    inline fun getUpcoming(options: QueryBuilder.()-> QueryBuilder)
            :Single<TMDBUpcomingResult>
            =getUpcoming(options(QueryBuilder()).build())
}