package com.vpaliy.tmdb.model

data class TMDBContentRatings(var results:Array<TMDBRating>, var id:Int)

data class TMDBRating(var iso_3166_1:String, var rating:String)