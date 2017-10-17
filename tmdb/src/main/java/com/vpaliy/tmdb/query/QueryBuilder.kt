package com.vpaliy.tmdb.query

open class QueryBuilder{

    private val options=HashMap<String,String>()

    fun query(query:String, value:String)=apply { options.put(query,value) }

    fun build():Map<String,String> =options
}