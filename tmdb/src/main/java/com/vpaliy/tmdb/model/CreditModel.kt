package com.vpaliy.tmdb.model

data class CreditModel(var id: Int,
                       var cast: Array<CastModel>,
                       var crew: Array<CrewModel>)