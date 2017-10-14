package com.vpaliy.mediumsdk

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.vpaliy.tmdb.TMDB
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val data=emptyList<String>()

        TMDB(Config.CLIENT_ID).moviesService
                .changes("271110"){
                    query("language","english")
                    query("query","second")
                    query("page",1.toString())
                }
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    if(it.changes.isNotEmpty()) {
                        val change = it.changes[0]
                        Log.d("MainActivity", change.key)
                        Log.d("MainActivity", change.items.size.toString())
                    }else Log.d("MainActivity", "empty")
                },{it.printStackTrace()})

    }
}
