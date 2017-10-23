package com.vpaliy.tmdb.model

data class Changes(var changes:Array<Result>)

data class Result(var items: Array<ChangeModel>,
                  var key:String?)

data class ChangeModel(var id:String,
                       var action:String,
                       var time:String,
                       var iso_639_1:String?,
                       var value:String?,
                       var original_value:String?)