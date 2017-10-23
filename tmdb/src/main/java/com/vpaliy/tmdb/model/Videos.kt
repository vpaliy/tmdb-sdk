package com.vpaliy.tmdb.model

data class VideoResult(var id:Int, var results:Array<VideoModel>)

class VideoModel {
    var id:String=""
    var iso_639_1:String=""
    var iso_3166_1:String=""
    var key:String=""
    var name:String=""
    var site:String=""
    var size:Int=0
    var type:String=""
}