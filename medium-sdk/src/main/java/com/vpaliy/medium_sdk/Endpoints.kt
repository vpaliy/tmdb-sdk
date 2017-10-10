package com.vpaliy.medium_sdk

object Endpoints{
    const val BASE_URL="https://api.medium.com/v1"
    const val ID="id"
    const val ME="me"
    const val PUBLICATIONS="publications"
    const val USERS="users"
    const val USER="users/{$ID}"
    const val USER_PUBLICATIONS="users/{$ID}/publications"
    const val PUBLICATION_CONTRIBUTORS="publications/{$ID}/contributors"
    const val USER_POST="users/{$ID}/posts"
}