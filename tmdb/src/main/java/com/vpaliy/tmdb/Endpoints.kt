package com.vpaliy.tmdb

import com.vpaliy.tmdb.Constants.ID
import com.vpaliy.tmdb.Constants.NUM

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
    const val MOVIES_NOW_PLAYING="movie/now_playing"
    const val MOVIES_TOP_RATED="movie/top_rated"
    const val MOVIES_UPCOMING="movie/upcoming"

    /* Discover */
    const val DISCOVER_MOVIES="discover/movie"
    const val DISCOVER_TV="discover/tv"

    /* Search */
    const val SEARCH_MOVIE="search/movie"
    const val SEARCH_TV="search/tv"
    const val SEARCH_PEOPLE="search/person"
    const val SEARCH_COMPANY="search/company"
    const val SEARCH_COLLECTION="search/collection"
    const val SEARCH_KEYWORD="search/keyword"
    const val SEARCH_MULTI="search/multi"

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

    /* TV SeasonModel */
    const val SEASON_DETAILS="tv/{$ID}/season/{$NUM}"
    const val SEASON_CHANGES="tv/season/{$NUM}/changes"
    const val SEASON_STATES="tv/{$ID}/season/{$NUM}/account_states"
    const val SEASON_CREDITS="tv/{$ID}/season/{$NUM}/credits"
    const val SEASON_IDS="tv/{$ID}/season/{$NUM}/external_ids"
    const val SEASON_IMAGES="tv/{$ID}/season/{$NUM}/images"
    const val SEASON_VIDEOS="tv/{$ID}/season/{$NUM}/videos"

    /* TV Episodes */
    const val EPISODE_DETAILS="tv/{$ID}/season/{$NUM}/episode/{$NUM}"
    const val EPISODE_CHANGES="tv/episode/{$ID}/changes"
    const val EPISODE_STATES="tv/{$ID}/season/{$NUM}/episode/{$NUM}/account_states"
    const val EPISODE_CREDITS="tv/{$ID}/season/{$NUM}/episode/{$NUM}/credits"
    const val EPISODE_IDS="tv/{$ID}/season/{$NUM}/episode/{$NUM}/external_ids"
    const val EPISODE_IMAGES="tv/{$ID}/season/{$NUM}/episode/{$NUM}/images"
    const val EPISODE_VIDEOS="tv/{$ID}/season/{$NUM}/episode/{$NUM}/videos"

    /* Genres  */
    const val MOVIES_GENRE="genre/movie/list"
    const val TV_GENRES="genre/tv/list"
    const val MOVIES_BY_GENRE="genre/{$ID}/movies"
}