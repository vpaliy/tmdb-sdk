package com.vpaliy.tmdb.model

data class ImageModel(val aspect_ratio: Float,
                      val file_path: String,
                      val height: Int,
                      val iso_639_1: String?,
                      val vote_average: Double,
                      val vote_count: Int,
                      val width: Int)