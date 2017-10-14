package com.vpaliy.tmdb.model

open class ResultPage<T>(var page:Int,
                         var total_pages:Int,
                         var total_results:Int,
                         var results:Array<T>)

class UpcomingResult (var dates:UpcomingDate,
                          page:Int,
                          total_pages: Int,
                          total_results: Int,
                          results: Array<Movie>)
    :ResultPage<Movie>(page,total_pages,total_results,results)

data class UpcomingDate(var maximum:String, var minimum:String)

data class Response(val status_code:Int,val status_message:String)