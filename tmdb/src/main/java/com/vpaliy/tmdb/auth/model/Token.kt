package com.vpaliy.tmdb.auth.model

data class Token(val success:Boolean,
                 val expires_at:String,
                 val request_token:String)