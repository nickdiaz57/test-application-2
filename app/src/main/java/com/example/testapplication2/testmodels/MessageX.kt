package com.example.testapplication2.testmodels


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MessageX(
    @Json(name = "affenpinscher")
    val affenpinscher: List<Any>?,
    @Json(name = "african")
    val african: List<Any>?,
    @Json(name = "airedale")
    val airedale: List<Any>?,
    @Json(name = "akita")
    val akita: List<Any>?,
    @Json(name = "appenzeller")
    val appenzeller: List<Any>?,
    @Json(name = "australian")
    val australian: List<String>?
)