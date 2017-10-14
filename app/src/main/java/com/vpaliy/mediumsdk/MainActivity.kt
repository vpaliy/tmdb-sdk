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
                .popular {
                    query("page","5")
                    query("language","russian")
                }
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    it.results.forEach {
                        Log.d("MainActivity",it.title)
                    }
                    Log.d("MainActivity",it.page.toString())
                },{it.printStackTrace()})

    }
}
