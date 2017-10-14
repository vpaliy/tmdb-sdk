package com.vpaliy.tmdb.service

import com.vpaliy.tmdb.QueryBuilder
import com.vpaliy.tmdb.model.AlternativeTitle
import com.vpaliy.tmdb.model.Changes
import com.vpaliy.tmdb.model.MovieDetails
import com.vpaliy.tmdb.model.MovieImages
import io.reactivex.Single

class MovieService(service: Movies): Movies by service{
    fun details(id:String,options: QueryBuilder.()-> QueryBuilder)
            :Single<MovieDetails>
            =details(id,QueryBuilder().options().build())

    fun alternativeTitles(id:String, options: QueryBuilder.()-> QueryBuilder)
            :Single<AlternativeTitle>
            =alternativeTitles(id, QueryBuilder().options().build())

    fun changes(id:String, options: QueryBuilder.()-> QueryBuilder)
            :Single<Changes>
            =changes(id,QueryBuilder().options().build())

    fun images(id:String, options: QueryBuilder.()-> QueryBuilder)
            :Single<MovieImages>
            =images(id,QueryBuilder().options().build())
}