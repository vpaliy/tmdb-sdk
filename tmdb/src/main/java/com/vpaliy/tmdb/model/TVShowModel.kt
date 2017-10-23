package com.vpaliy.tmdb.model

open class TVShowModel{
    var backdrop_path:String?=null
    var poster_path:String?=null
    var first_air_date=""
    var episode_run_time:Array<Int> = emptyArray()
    var origin_country:Array<String> = emptyArray()
    var genres_ids:Array<Int> = emptyArray()
    var popularity=0.0
    var id=0
    var original_language=""
    var original_name=""
    var overview=""
    var vote_average=0
    var vote_count=0
    var name=""
}