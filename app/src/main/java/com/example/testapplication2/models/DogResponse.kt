package com.example.testapplication2.models

data class DogResponse(
    val message: List<Breeds> = listOf(Breeds(), Breeds(), Breeds())
)

data class Breeds(
    val breedList: List<String> = listOf("breed1", "breed2", "breed3")
)

