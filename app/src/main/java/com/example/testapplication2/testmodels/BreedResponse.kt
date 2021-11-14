package com.example.testapplication2.testmodels


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BreedResponse(
    @Json(name = "message")
    val message: Message?
)