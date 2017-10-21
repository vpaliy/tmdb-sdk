package com.vpaliy.tmdb.service

import com.vpaliy.tmdb.model.TMDBMovie
import com.vpaliy.tmdb.model.TMDBResultPage
import com.vpaliy.tmdb.model.TMDBTvShow
import com.vpaliy.tmdb.query.QueryBuilder
import io.reactivex.Single

class DiscoverService(service:Discover):Discover by service{
    inline fun searchMovies(options: QueryBuilder.()->QueryBuilder)
        :Single<TMDBResultPage<TMDBMovie>>
        =searchMovies(options(QueryBuilder()).build())

    inline fun searchTv(options:QueryBuilder.()->QueryBuilder)
        :Single<TMDBResultPage<TMDBTvShow>>
        =searchTv(options(QueryBuilder()).build())
}
