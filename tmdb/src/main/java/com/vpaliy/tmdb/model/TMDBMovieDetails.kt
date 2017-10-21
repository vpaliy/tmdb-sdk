package com.vpaliy.tmdb.model

class TMDBMovieDetails : TMDBMovie(){
    var budget:Int?=null
    var genres:Array<TMDBGenre>?=null
    var homepage:String?=null
    var imbd_id:String?=null
    var production_companies:Array<TMDBProductionCompany>?=null
    var production_countries:Array<TMDBProductionCountry>?=null
    var revenue:Int?=null
    var runtime:Int?=null
    var spoken_languages:Array<TMDBSpokenLanguage>?=null
    var status:String?=null
    var tagline:String?=null
}