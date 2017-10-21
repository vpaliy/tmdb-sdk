package com.vpaliy.tmdb.model

data class TMDBChanges(var changes:Array<TMDBResult>)

data class TMDBResult(var items: Array<TMDBChange>,
                      var key:String?)

data class TMDBChange(var id:String,
                      var action:String,
                      var time:String,
                      var iso_639_1:String?,
                      var value:String?,
                      var original_value:String?)