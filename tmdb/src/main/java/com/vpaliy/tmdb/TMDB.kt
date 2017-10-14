package com.vpaliy.tmdb

import com.vpaliy.tmdb.service.Discover
import com.vpaliy.tmdb.service.DiscoverService
import com.vpaliy.tmdb.service.MovieService
import com.vpaliy.tmdb.service.Movies

class TMDB(apiKey:String){
    val moviesService by lazy {
        MovieService(ServiceCreator.build(apiKey){}.build()
                .createService(Movies::class.java))
    }

    val discoverService by lazy {
        DiscoverService(ServiceCreator.build(apiKey){}.build()
                .createService(Discover::class.java))
    }
}