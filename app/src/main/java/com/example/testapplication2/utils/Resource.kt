package com.example.testapplication2.utils

sealed class Resource<out T> {
    object Loading: Resource<Nothing>()
    data class Success<T>(val data: T): Resource<T>()
    data class Error(val errorMsg: String): Resource<Nothing>()
}