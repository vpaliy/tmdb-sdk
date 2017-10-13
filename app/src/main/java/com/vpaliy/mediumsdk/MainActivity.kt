package com.vpaliy.mediumsdk

import android.content.Context
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
        TMDB("de3cafdd4958ef2352dfcd262ef1aef3").service
                .popularMovies()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    it?.let {
                        Log.d("MainActivity",it.results.size.toString())
                        it.results.forEach {
                            Log.d("MainActivity",it.backdrop_path)
                        }
                    }
                }, {it.printStackTrace()})
    }
}
