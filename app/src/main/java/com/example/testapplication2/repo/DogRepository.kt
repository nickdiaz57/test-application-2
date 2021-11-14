package com.example.testapplication2.repo

import android.util.Log
import com.example.testapplication2.models.DogResponse
import com.example.testapplication2.utils.Resource
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class DogRepository @Inject constructor(private val dogService: DogService) {

    // Mocking as if im calling retrofit
    fun getAllDogs() = flow {
        emit(Resource.Loading)
        Log.e("Repo", "get all dogs called")
        val resource = try {
            Log.e("Repo", "try block")
            val response = dogService.getAllDogs().body()
            Resource.Success(response)
        } catch (ex: Exception) {
            Log.e("Repo", "error")
            Resource.Error(ex.toString())
        }
        emit(resource)

//            Log.e("Repo", "try block")
//        try {
//            val response = dogService.getAllDogs()
//            if (response.isSuccessful && response.body() != null) {
//                emit(Resource.Success(response.body()!!))
//            } else {
//                emit(Resource.Error("Empty result"))
//            }
//        } catch (ex: Exception) {
//            emit(Resource.Error(ex.toString()))
//        }


//        emit(dogService.getAllDogs().body())
    }

}