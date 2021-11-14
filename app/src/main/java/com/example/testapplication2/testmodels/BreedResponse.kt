package com.example.testapplication2.testmodels


import android.util.Log
import com.squareup.moshi.FromJson
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BreedResponse(
    @Json(name = "message")
    val message: Message?
)

//@JsonClass(generateAdapter = true)
//data class Message(
//    val dogs: List<Dog>
//)

//@JsonClass(generateAdapter = true)
//data class Dog(
//    val name: String?,
//    val types: List<String?>
//)

//class MessageAdapter {
//
////    @ToJson
////    fun toJson() {
////
////    }
//
//    @FromJson
//    fun fromJson(message: Message) : List<Dog> {
//        val list : List<Dog> = listOf()
//
//
//
////        Log.e("Custom Adapter", "$response")
//        return message
//    }
//
//}