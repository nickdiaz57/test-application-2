package com.example.testapplication2.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.example.testapplication2.repo.DogRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DogViewModel @Inject constructor(
    dogRepository: DogRepository
): ViewModel() {

    val dogList = dogRepository.getAllDogs().asLiveData()
}