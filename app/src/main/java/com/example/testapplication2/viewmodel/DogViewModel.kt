package com.example.testapplication2.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.example.testapplication2.repo.DogRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject

@HiltViewModel
class DogViewModel @Inject constructor(
    private val dogRepository: DogRepository
): ViewModel() {

    val dogList = dogRepository.getAllDogs().asLiveData(Dispatchers.IO)

//    private val _cardList = MutableLiveData<List<Card>>()
//    val cardList: LiveData<List<Card>> get() = _cardList
//    viewModelScope.launch {
//        pokeRepo.getCards(queries).collect { cards ->
//            _cardList.postValue(cards)
//        }
//    }
}