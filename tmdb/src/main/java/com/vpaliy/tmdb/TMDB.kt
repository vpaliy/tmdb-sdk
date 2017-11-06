package com.vpaliy.tmdb

import com.vpaliy.tmdb.service.*

class TMDB(apiKey:String){
    val moviesService by lazy {
        MovieService(ServiceCreator.build(apiKey){}.build()
                .createService(Movies::class.java))
    }

    val discoverService by lazy {
        DiscoverService(ServiceCreator.build(apiKey){}.build()
                .createService(Discover::class.java))
    }

    val tvService by lazy {
        TvShowService(ServiceCreator.build(apiKey){}.build()
                .createService(TvShows::class.java))
    }

    val genreService by lazy {
        ServiceCreator.build(apiKey){}.build()
                .createService(GenreService::class.java)
    }

    val searchService by lazy {
        SearchService(ServiceCreator.build(apiKey){}.build()
                .createService(Search::class.java))
    }
}