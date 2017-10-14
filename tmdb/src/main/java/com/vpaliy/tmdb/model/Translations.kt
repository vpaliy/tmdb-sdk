package com.vpaliy.tmdb.model

data class TranslationResult(var id:String,
                             var translations:Array<Translation>)

data class Translation(var iso_639_1:String,
                       var iso_3166_1:String,
                       var name:String,
                       var english_name:String)