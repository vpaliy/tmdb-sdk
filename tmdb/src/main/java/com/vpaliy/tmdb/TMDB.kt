package com.vpaliy.tmdb

class TMDB(apiKey:String){
    val service by lazy {
        ServiceCreator.build(apiKey){}.build()
                .createService(ServiceCreator::class.java)
    }
}