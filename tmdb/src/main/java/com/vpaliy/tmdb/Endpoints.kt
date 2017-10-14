package com.vpaliy.tmdb

import com.vpaliy.tmdb.Constants.ID

object Endpoints {

    const val AUTH_SESSION_NEW="authentication/session/new"
    const val AUTH_TOKEN_NEW="authentication/token/new"
    const val AUTH_TOKEN_LOGIN="authentication/token/validate_with_login"

    /* Movies */
    const val MOVIES_DETAILS="movie/{$ID}"
    const val MOVIES_ACCOUNT_STATES="movie/{$ID}/account_states"
    const val MOVIES_ALTERNATIVE_TITLES="movie/{$ID}/alternative_titles"
    const val MOVIES_CHANGES="movie/{$ID}/changes"
    const val MOVIE_CREDITS="movie/{$ID}/credits"
    const val MOVIE_IMAGES="movie/{$ID}/images"
    const val MOVIE_KEYWORDS="movie/{$ID}/keywords"
    const val MOVIE_RELEASE="movie/{$ID}/release_dates"
    const val MOVIE_VIDEOS="movie/{$ID}/videos"
    const val MOVIE_TRANSLATIONS="movie/{$ID}/translations"
    const val MOVIE_RECOMMENDATIONS="movie/{$ID}/recommendations"

}