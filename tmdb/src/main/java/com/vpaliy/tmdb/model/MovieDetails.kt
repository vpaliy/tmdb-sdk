package com.vpaliy.tmdb.model

class MovieDetails : MovieModel() {
  var budget: Int? = null
  var genres: Array<GenreModel>? = null
  var homepage: String? = null
  var imbd_id: String? = null
  var production_companies: Array<ProductionCompany>? = null
  var production_countries: Array<ProductionCountry>? = null
  var revenue: Int? = null
  var runtime: Int? = null
  var spoken_languages: Array<SpokenLanguage>? = null
  var status: String? = null
  var tagline: String? = null
}