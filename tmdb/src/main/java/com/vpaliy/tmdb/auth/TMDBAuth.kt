package com.vpaliy.tmdb.auth

import com.vpaliy.tmdb.ServiceCreator

class TMDBAuth(apiKey:String){
    val service by lazy {
        ServiceCreator.build(apiKey){}.build()
                .createService(AuthService::class.java)
    }
}
