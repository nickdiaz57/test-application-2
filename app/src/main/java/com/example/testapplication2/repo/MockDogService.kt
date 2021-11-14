package com.example.testapplication2.repo

import com.example.testapplication2.models.DogResponse

object MockDogService {
    suspend fun getAllDogs() = DogResponse()
}