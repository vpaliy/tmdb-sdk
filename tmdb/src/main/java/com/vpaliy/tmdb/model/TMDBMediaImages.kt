package com.vpaliy.tmdb.model

data class TMDBMediaImages(var id:Int,
                           var backdrops:Array<TMDBImage>?,
                           var posters:Array<TMDBImage>?)