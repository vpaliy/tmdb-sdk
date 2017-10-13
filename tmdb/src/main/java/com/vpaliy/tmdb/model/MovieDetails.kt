package com.vpaliy.tmdb.model

class MovieDetails:Movie(){
    var budget:Int?=null
    var genres:Array<Genre>?=null
    var homepage:String?=null
    var imbd_id:String?=null
    var production_companies:Array<ProductionCompany>?=null
    var production_countries:Array<ProductionCountry>?=null
    var revenue:Int?=null
    var runtime:Int?=null
    var spoken_languages:Array<SpokenLanguage>?=null
    var status:String?=null
    var tagline:String?=null
}