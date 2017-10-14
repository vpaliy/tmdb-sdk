package com.vpaliy.tmdb.model

data class TvShow(var poster_path:String,
                  var popularity:Double,
                  var id:Int,
                  var backdrop_path:String,
                  var vote_average:Double,
                  var overview:String,
                  var first_air_date:String,
                  var origin_country:String,
                  var genres_ids:Array<Int>,
                  var original_language:String,
                  var vote_count:Int,
                  var name:String,
                  var original_name:String)