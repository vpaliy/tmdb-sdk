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
    const val MOVIE_SIMILAR="movie/{$ID}/similar"
    const val MOVIES_POPULAR="movie/popular"
    const val MOVIE_REVIEWS="movie/{$ID}/reviews"
    const val MOVIES_NOW_PLAYING="movie/{$ID}/now_playing"
    const val MOVIES_TOP_RATED="movie/{$ID}/top_rated"
    const val MOVIES_UPCOMING="movie/{$ID}/upcoming"

    /* Discover */
    const val DISCOVER_MOVIES="discover/movie"
    const val DISCOVER_TV="discover/tv"

    /* TV */
    const val TV_DETAILS="tv/{$ID}"
    const val TV_ACCOUNT_STATES="tv/{$ID}/account_states"
    const val TV_ALTERNATIVE_TITLES="tv/{$ID}/alternative_titles"
    const val TV_CHANGES="tv/{$ID}/changes"
    const val TV_RATINGS="tv/{$ID}/content_ratings"
    const val TV_CREDITS="tv/{$ID}/credits"
    const val TV_EXTERNAL_IDS="tv/{$ID}/external_ids"
    const val TV_IMAGES="tv/{$ID}/images"
    const val TV_KEYWORDS="tv/{$ID}/keywords"
    const val TV_RECOMMENDATIONS ="tv/{$ID}/recommendations"
    const val TV_SCREENED_THETRICALLY="tv/{$ID}/screened_theatrically"
    const val TV_SIMILAR="tv/{$ID}/similar"
    const val TV_TRANSLATIONS="tv/{$ID}/translations"
    const val TV_VIDEOS="tv/{$ID}/videos"
    const val TV_LATEST="tv/latest"
    const val TV_AIRING_TODAY="tv/airing_today"
    const val TV_ON_AIR="tv/on_the_air"
    const val TV_POPULAR="tv/popular"
    const val TV_TOP_RATED="tv/top_rated"


}