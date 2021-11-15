package com.example.testapplication2.repo

import com.example.testapplication2.utils.Resource
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class DogRepository @Inject constructor(
    private val dogService: DogService,
) {

    fun getAllDogs() = flow {
        emit(Resource.Loading)
        val resource = try {
            val response = dogService.getAllDogs()
            if (response.isSuccessful && response.body() != null) {
                Resource.Success(response.body()!!.message.getDogsWithBreeds())
            } else {
                Resource.Error("No dogs found.")
            }
        } catch (ex: Exception) {
            Resource.Error(ex.message ?: "Unexpected error occurred.")
        }
        emit(resource)
    }

}