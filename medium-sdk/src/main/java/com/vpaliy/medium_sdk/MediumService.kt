package com.vpaliy.medium_sdk

import com.vpaliy.medium_sdk.model.ContributorModel
import com.vpaliy.medium_sdk.model.PublicationModel
import com.vpaliy.medium_sdk.model.Result
import com.vpaliy.medium_sdk.model.UserModel
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path

interface MediumService {

    @GET(Endpoints.ME)
    fun me(): Single<Result<UserModel>>

    @GET(Endpoints.USERS)
    fun users():Single<Result<List<UserModel>>>

    @GET(Endpoints.USER)
    fun user(@Path(Endpoints.ID) userId:String):Single<Result<UserModel>>

    @GET(Endpoints.PUBLICATIONS)
    fun publications():Single<Result<List<PublicationModel>>>

    @GET(Endpoints.PUBLICATION_CONTRIBUTORS)
    fun publicationContributors(@Path(Endpoints.ID) publicationId:String):
            Single<Result<List<ContributorModel>>>

    @GET(Endpoints.USER_PUBLICATIONS)
    fun userPublications(@Path(Endpoints.ID) userId:String):
            Single<Result<List<PublicationModel>>>

}