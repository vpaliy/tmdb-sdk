package com.vpaliy.tmdb.model

data class Credit(var id:Int,
                  var cast:Array<Cast>,
                  var crew:Array<Crew>)