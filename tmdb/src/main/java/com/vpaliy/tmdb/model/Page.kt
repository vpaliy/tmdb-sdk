package com.vpaliy.tmdb.model

open class Page<T>(var page:Int,
                   var total_pages:Int,
                   var total_results:Int,
                   var results:Array<T>)

class TMDBUpcomingResult(var dates: UpcomingDate,
                         page:Int,
                         total_pages: Int,
                         total_results: Int,
                         results: Array<MovieModel>)
    : Page<MovieModel>(page,total_pages,total_results,results)

data class UpcomingDate(var maximum:String, var minimum:String)

data class Response(val status_code:Int, val status_message:String)