package com.example.testapplication2.di

import com.example.testapplication2.repo.DogRepository
import com.example.testapplication2.repo.DogService
import com.example.testapplication2.repo.MockDogService
import com.example.testapplication2.utils.BASE_URL
import com.squareup.moshi.Moshi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    fun providesMoshi() : Moshi = Moshi.Builder().build()

    @Provides
    @Singleton
    fun providesRetrofit(moshi: Moshi) : Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(MoshiConverterFactory.create(moshi))
        .build()

    @Provides
    fun providesDogService(
        retrofit: Retrofit
    ) : DogService = retrofit.create(DogService::class.java)
}