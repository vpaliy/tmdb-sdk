package com.vpaliy.tmdb.model

class TVDetails : TVShowModel() {
  var genres: Array<GenreModel> = emptyArray()
  var created_by: Array<TMDBCreator> = emptyArray()
  var production_companies: Array<ProductionCompany> = emptyArray()
  var networks: Array<NetworkModel> = emptyArray()
  var seasons: Array<SeasonModel> = emptyArray()
  var languages: Array<String> = emptyArray()
  var homepage = ""
  var in_production = false
  var last_air_date = ""
  var number_of_episodes = 0
  var number_of_seasons = 0
  var status = ""
  var type = ""
}

data class TMDBCreator(var id: Int,
                       var name: String,
                       var gender: Int?,
                       var profile_path: String)