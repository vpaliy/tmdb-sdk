package com.vpaliy.medium_sdk.model

data class PostModel(val id:String?,
                     val title:String?,
                     val authorId:String?,
                     val url:String?,
                     val canonicalUrl:String?,
                     val publishStatus:String?,
                     val publishedAt:String?,
                     val licenseUrl:String?,
                     val tags:Array<String>)