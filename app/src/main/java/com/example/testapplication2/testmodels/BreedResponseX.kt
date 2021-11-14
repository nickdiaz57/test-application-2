package com.example.testapplication2.testmodels


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BreedResponseX(
    @Json(name = "message")
    val message: MessageX?
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