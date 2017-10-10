package com.vpaliy.medium_sdk.auth

enum class Scope(val scope:String) {
    BASIC("basicProfile"),//Grants basic access to a user’s profile (not including their email).
    PUBLISH("publishPost"), //Grants the ability to publish a post to the user’s profile.
    LIST("listPublications"), //Grants the ability to list publications related to the user.
    IMAGE("uploadImage"), // Grants the ability to upload an image for use within a Medium post.
    ALL("${BASIC.scope},${PUBLISH.scope},${LIST.scope},${IMAGE.scope}"), //Grants all
    ALL_EXCEPT_IMAGE("${BASIC.scope},${PUBLISH.scope},${LIST.scope}")   //Grants all except uploading an image
}