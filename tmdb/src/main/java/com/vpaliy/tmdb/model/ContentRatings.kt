package com.vpaliy.tmdb.model

data class ContentRatings(var results:Array<Rating>, var id:Int)

data class Rating(var iso_3166_1:String, var rating:String)