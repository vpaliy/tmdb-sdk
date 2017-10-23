package com.vpaliy.tmdb.model

data class GenreModel(var id:Int, var name:String)

class Genres(val genres:Array<GenreModel>)