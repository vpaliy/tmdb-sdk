package com.vpaliy.tmdb.model

data class TMDBEpisode(var air_date:String,
                       var episode_number:Int,
                       var season_number:Int,
                       var crew:Array<TMDBCrew>,
                       var guest_stars:Array<TMDBCast>,
                       var still_path:String?,
                       var production_code:String?,
                       var vote_average:Double,
                       var vote_count:Int,
                       var name:String,
                       var overview:String,
                       var id:Int)