package com.vpaliy.tmdb.query

open class QueryBuilder {

  private val options = HashMap<String, String>()

  fun query(query: String, value: String) = apply { options.put(query, value) }

  fun limit(value: Int) = apply { options.put("limit", value.toString()) }

  fun page(page: Int) = apply { options.put("page", page.toString()) }

  fun build(): Map<String, String> = options
}