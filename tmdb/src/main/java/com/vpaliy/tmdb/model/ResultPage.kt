package com.vpaliy.tmdb.model

data class ResultPage(var page:Int,
                      var total_pages:Int,
                      var total_results:Int,
                      var results:Array<Movie>)
