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
    const val MOVIES_CHANGES="movie/{$ID}/getChanges"
    const val MOVIE_CREDITS="movie/{$ID}/getCredits"
    const val MOVIE_IMAGES="movie/{$ID}/getImages"
    const val MOVIE_KEYWORDS="movie/{$ID}/getKeywords"
    const val MOVIE_RELEASE="movie/{$ID}/release_dates"
    const val MOVIE_VIDEOS="movie/{$ID}/getVideos"
    const val MOVIE_TRANSLATIONS="movie/{$ID}/getTranslations"
    const val MOVIE_RECOMMENDATIONS="movie/{$ID}/getRecommendations"
    const val MOVIE_SIMILAR="movie/{$ID}/getSimilar"
    const val MOVIES_POPULAR="movie/getPopular"
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
    const val TV_CHANGES="tv/{$ID}/getChanges"
    const val TV_RATINGS="tv/{$ID}/content_ratings"
    const val TV_CREDITS="tv/{$ID}/getCredits"
    const val TV_EXTERNAL_IDS="tv/{$ID}/external_ids"
    const val TV_IMAGES="tv/{$ID}/getImages"
    const val TV_KEYWORDS="tv/{$ID}/getKeywords"
    const val TV_RECOMMENDATIONS ="tv/{$ID}/getRecommendations"
    const val TV_SCREENED_THETRICALLY="tv/{$ID}/screened_theatrically"
    const val TV_SIMILAR="tv/{$ID}/getSimilar"
    const val TV_TRANSLATIONS="tv/{$ID}/getTranslations"
    const val TV_VIDEOS="tv/{$ID}/getVideos"
    const val TV_LATEST="tv/latest"
    const val TV_AIRING_TODAY="tv/airing_today"
    const val TV_ON_AIR="tv/on_the_air"
    const val TV_POPULAR="tv/getPopular"
    const val TV_TOP_RATED="tv/top_rated"

    /* TV SeasonModel */
    const val SEASON_DETAILS="tv/{$ID}/season/{$NUM}"
    const val SEASON_CHANGES="tv/season/{$NUM}/getChanges"
    const val SEASON_STATES="tv/{$ID}/season/{$NUM}/account_states"
    const val SEASON_CREDITS="tv/{$ID}/season/{$NUM}/getCredits"
    const val SEASON_IDS="tv/{$ID}/season/{$NUM}/external_ids"
    const val SEASON_IMAGES="tv/{$ID}/season/{$NUM}/getImages"
    const val SEASON_VIDEOS="tv/{$ID}/season/{$NUM}/getVideos"

    /* TV Episodes */
    const val EPISODE_DETAILS="tv/{$ID}/season/{$NUM}/episode/{$NUM}"
    const val EPISODE_CHANGES="tv/episode/{$ID}/getChanges"
    const val EPISODE_STATES="tv/{$ID}/season/{$NUM}/episode/{$NUM}/account_states"
    const val EPISODE_CREDITS="tv/{$ID}/season/{$NUM}/episode/{$NUM}/getCredits"
    const val EPISODE_IDS="tv/{$ID}/season/{$NUM}/episode/{$NUM}/external_ids"
    const val EPISODE_IMAGES="tv/{$ID}/season/{$NUM}/episode/{$NUM}/getImages"
    const val EPISODE_VIDEOS="tv/{$ID}/season/{$NUM}/episode/{$NUM}/getVideos"

    /* Genres */
    const val MOVIES_GENRE="genre/movie/list"
    const val TV_GENRES="genre/tv/list"
    const val MOVIES_BY_GENRE="genre/{$ID}/movies"
}