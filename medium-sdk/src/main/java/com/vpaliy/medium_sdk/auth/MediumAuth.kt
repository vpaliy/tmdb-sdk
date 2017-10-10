package com.vpaliy.medium_sdk.auth

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.support.v4.content.LocalBroadcastManager
import com.vpaliy.medium_sdk.Constants

class MediumAuth(val context:Context,
                 val clientId:String,
                 val clientSecret:String,
                 val state:String,
                 val redirectUri:String?,
                 val scope: Scope){

    private constructor(builder:Builder):
            this(builder.context,builder.clientId,builder.clientSecret,
                 builder.state,builder.redirectUri,builder.scope)

    class Builder(val context: Context,
                  val clientId: String,
                  val clientSecret: String) {
        var scope:Scope=Scope.ALL_EXCEPT_IMAGE
        var redirectUri:String?=null
        var state:String="state"
        fun build()=MediumAuth(this)
    }

    companion object {
        inline fun build(context: Context, clientId: String, clientSecret: String, block: Builder.() -> Unit)
                = Builder(context,clientId,clientSecret).apply(block).build()
    }

    fun connect(){
        val manager=LocalBroadcastManager.getInstance(context)
        manager.registerReceiver(object:BroadcastReceiver(){
            override fun onReceive(context: Context?, intent: Intent) {
                val successful=intent.getBooleanExtra(Constants.AUTH_STATUS,false)
                if(successful){

                }
                manager.unregisterReceiver(this)
            }
        },IntentFilter(Constants.AUTH_ACTION))
    }

    inline fun connect(crossinline success:(AccessToken?)->Unit){
        val manager=LocalBroadcastManager.getInstance(context)
        manager.registerReceiver(object:BroadcastReceiver(){
            override fun onReceive(context: Context?, intent: Intent) {
                val successful=intent.getBooleanExtra(Constants.AUTH_STATUS,false)
                if(successful){

                }
                manager.unregisterReceiver(this)
            }
        },IntentFilter(Constants.AUTH_ACTION))
    }
}