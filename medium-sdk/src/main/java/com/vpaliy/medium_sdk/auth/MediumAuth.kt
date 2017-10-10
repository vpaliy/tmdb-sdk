package com.vpaliy.medium_sdk.auth

class MediumAuth(val clientId:String,
                 val clientSecret:String,
                 val state:String,
                 val redirectUri:String?,
                 val scope: Scope){

    private constructor(builder:Builder):
            this(builder.clientId,builder.clientSecret,
                 builder.state,builder.redirectUri,builder.scope)

    class Builder(val clientId: String, val clientSecret: String) {
        var scope:Scope=Scope.ALL_EXCEPT_IMAGE
        var redirectUri:String?=null
        var state:String="state"
        fun build()=MediumAuth(this)
    }

    companion object {
        inline fun build(clientId: String, clientSecret: String, block: Builder.() -> Unit)
                = Builder(clientId,clientSecret).apply(block).build()
    }
}