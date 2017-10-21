package com.vpaliy.tmdb.model

data class TMDBAccountState(var id:Int,
                            var favorite:Boolean,
                            var rated:Boolean,
                            var watchlist:Boolean)