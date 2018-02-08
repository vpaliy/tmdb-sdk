package com.vpaliy.tmdb.adapter

import com.vpaliy.tmdb.query.QueryBuilder
import com.vpaliy.tmdb.model.*
import com.vpaliy.tmdb.service.Movies
import io.reactivex.Single

class MovieServiceAdapter(service: Movies) : Movies by service {
  inline fun getDetails(id: String, options: QueryBuilder.() -> QueryBuilder)
      : Single<MovieDetails>
      = getDetails(id, options(QueryBuilder()).build())

  inline fun getAlternativeTitles(id: String, options: QueryBuilder.() -> QueryBuilder)
      : Single<AlternativeTitle>
      = getAlternativeTitles(id, options(QueryBuilder()).build())

  inline fun getChanges(id: String, options: QueryBuilder.() -> QueryBuilder)
      : Single<Changes>
      = getChanges(id, options(QueryBuilder()).build())

  inline fun getImages(id: String, options: QueryBuilder.() -> QueryBuilder)
      : Single<MediaImages>
      = getImages(id, options(QueryBuilder()).build())

  inline fun getPopular(options: QueryBuilder.() -> QueryBuilder)
      : Single<Page<MovieModel>>
      = getPopular(options(QueryBuilder()).build())

  inline fun getRecommendations(id: String, options: QueryBuilder.() -> QueryBuilder)
      : Single<Page<MovieModel>>
      = getRecommendations(id, options(QueryBuilder()).build())

  inline fun getSimilar(id: String, options: QueryBuilder.() -> QueryBuilder)
      : Single<Page<MovieModel>>
      = getSimilar(id, options(QueryBuilder()).build())

  inline fun getReviews(id: String, options: QueryBuilder.() -> QueryBuilder)
      : Single<Page<ReviewModel>>
      = getReviews(id, options(QueryBuilder()).build())

  inline fun getNowPlaying(options: QueryBuilder.() -> QueryBuilder)
      : Single<Page<MovieModel>>
      = getNowPlaying(options(QueryBuilder()).build())

  inline fun getTopRated(options: QueryBuilder.() -> QueryBuilder)
      : Single<Page<MovieModel>>
      = getTopRated(options(QueryBuilder()).build())

  inline fun getUpcoming(options: QueryBuilder.() -> QueryBuilder)
      : Single<TMDBUpcomingResult>
      = getUpcoming(options(QueryBuilder()).build())
}