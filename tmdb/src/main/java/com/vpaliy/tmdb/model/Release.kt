package com.vpaliy.tmdb.model


enum class TMDBReleaseType(val type:Int){
    PREMIERE(1),THEATRICAL_LIMITED(2),
    THEATRICAL(3),DIGITAL(4),PHYSICAL(5),
    TV(6)
}

data class TMDBReleases(var id:Int,
                        var results:Array<TMDBReleaseResult>)

data class TMDBReleaseResult(var iso_3166_1:String,
                             var release_dates:Array<TMDBReleaseDate>)

data class TMDBReleaseDate(var certification:String,
                           var iso_639_1:String,
                           var note:String,
                           var release_date:String,
                           var type: TMDBReleaseType)