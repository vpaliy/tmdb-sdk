package com.vpaliy.tmdb.model

data class EpisodeModel(var air_date: String,
                        var episode_number: Int,
                        var season_number: Int,
                        var crew: Array<CrewModel>,
                        var guest_stars: Array<CastModel>,
                        var still_path: String?,
                        var production_code: String?,
                        var vote_average: Double,
                        var vote_count: Int,
                        var name: String,
                        var overview: String,
                        var id: Int)