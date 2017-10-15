package com.vpaliy.tmdb.model

data class Changes(var changes:Array<Result>)

data class Result(var items: Array<Change>,
                  var key:String?)

data class Change(var id:String,
                  var action:String,
                  var time:String,
                  var iso_639_1:String?,
                  var value:String?,
                  var original_value:String?)