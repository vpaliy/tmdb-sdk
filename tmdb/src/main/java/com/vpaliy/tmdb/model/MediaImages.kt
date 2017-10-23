package com.vpaliy.tmdb.model

data class MediaImages(var id:Int,
                       var backdrops:Array<ImageModel>?,
                       var posters:Array<ImageModel>?)