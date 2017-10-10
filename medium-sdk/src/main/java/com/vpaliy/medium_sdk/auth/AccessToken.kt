package com.vpaliy.medium_sdk.auth
/* Token */
data class AccessToken
constructor(val token_type:String, val access_token:String,
            val refresh_token:String, val scope:Array<String>,
            val expires_at:Long)