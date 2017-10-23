package com.vpaliy.tmdb.model

data class ContentRatings(var results:Array<RatingModel>, var id:Int)

data class RatingModel(var iso_3166_1:String, var rating:String)