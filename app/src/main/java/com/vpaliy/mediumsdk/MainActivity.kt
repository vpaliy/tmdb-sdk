package com.vpaliy.mediumsdk

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.vpaliy.medium_sdk.auth.MediumAuth
import com.vpaliy.medium_sdk.auth.Scope

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        MediumAuth.build(context=this, clientId = "client_id",clientSecret = "client_secret"){
            state="state"
            scope=Scope.PUBLISH
            redirectUri=null
        }.connect()
    }
}
