package com.example.testapplication2.repo

import com.example.testapplication2.testmodels.BreedResponse
import retrofit2.Response
import retrofit2.http.GET

interface DogService {

    @GET("api/breeds/list/all")
    suspend fun getAllDogs(): Response<BreedResponse>
}