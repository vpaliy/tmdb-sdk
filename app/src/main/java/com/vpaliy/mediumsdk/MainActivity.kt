package com.vpaliy.mediumsdk

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.vpaliy.tmdb.auth.TMDBAuth
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val service=TMDBAuth(Config.CLIENT_ID).service
        service.createSession("82ef66c7cf25ec145533a5a82067f7e841e16986")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    Log.d("MainActivity",it.session_id)
                    Log.d("MainActivity",it.success.toString())
                },{it.printStackTrace()})
    }
}
