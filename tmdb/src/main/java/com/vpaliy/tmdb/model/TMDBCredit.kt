package com.vpaliy.tmdb.model

data class TMDBCredit(var id:Int,
                      var cast:Array<TMDBCast>,
                      var crew:Array<TMDBCrew>)