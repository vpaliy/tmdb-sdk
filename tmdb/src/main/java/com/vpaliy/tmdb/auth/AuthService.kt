package com.vpaliy.tmdb.auth

import com.vpaliy.tmdb.Endpoints
import com.vpaliy.tmdb.auth.model.Session
import com.vpaliy.tmdb.auth.model.Token
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface AuthService {
  @GET(Endpoints.AUTH_TOKEN_NEW)
  fun createToken(): Single<Token>

  @GET(Endpoints.AUTH_SESSION_NEW)
  fun createSession(@Query("request_token") token: String): Single<Session>

  @GET(Endpoints.AUTH_TOKEN_LOGIN)
  fun createSessionWithLogin(@Query("username") username: String,
                             @Query("password") password: String,
                             @Query("request_token") token: String): Single<Session>
}