package com.vpaliy.tmdb.model

open class TMDBResultPage<T>(var page:Int,
                             var total_pages:Int,
                             var total_results:Int,
                             var results:Array<T>)

class TMDBUpcomingResult(var dates: TMDBUpcomingDate,
                         page:Int,
                         total_pages: Int,
                         total_results: Int,
                         results: Array<TMDBMovie>)
    : TMDBResultPage<TMDBMovie>(page,total_pages,total_results,results)

data class TMDBUpcomingDate(var maximum:String, var minimum:String)

data class TMDBResponse(val status_code:Int, val status_message:String)