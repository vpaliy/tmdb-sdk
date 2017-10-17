package com.vpaliy.tmdb.service

import com.vpaliy.tmdb.model.Movie
import com.vpaliy.tmdb.model.ResultPage
import com.vpaliy.tmdb.model.TvShow
import com.vpaliy.tmdb.query.QueryBuilder
import io.reactivex.Single

class DiscoverService(service:Discover):Discover by service{
    inline fun discoverMovies(options: QueryBuilder.()->QueryBuilder)
        :Single<ResultPage<Movie>>
        =discoverMovies(options(QueryBuilder()).build())

    inline fun discoverTv(options:QueryBuilder.()->QueryBuilder)
        :Single<ResultPage<TvShow>>
        =discoverTv(options(QueryBuilder()).build())
}
