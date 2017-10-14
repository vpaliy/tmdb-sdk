package com.vpaliy.tmdb.model

data class Credit(var id:Int,
                  var cast:Array<Credit>,
                  var crew:Array<Crew>)