package com.vpaliy.tmdb.service

import com.vpaliy.tmdb.model.MovieModel
import com.vpaliy.tmdb.model.Page
import com.vpaliy.tmdb.model.TVShowModel
import com.vpaliy.tmdb.query.QueryBuilder
import io.reactivex.Single

class DiscoverService(service:Discover):Discover by service{
    inline fun searchMovies(options: QueryBuilder.()->QueryBuilder)
        :Single<Page<MovieModel>>
        =searchMovies(options(QueryBuilder()).build())

    inline fun searchTv(options:QueryBuilder.()->QueryBuilder)
        :Single<Page<TVShowModel>>
        =searchTv(options(QueryBuilder()).build())
}
