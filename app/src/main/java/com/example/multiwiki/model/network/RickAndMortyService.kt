package com.example.multiwiki.model.network

import com.example.multiwiki.model.data.Endpoints
import com.example.multiwiki.model.repositories.RickAndMortyInterface
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

private val retrofit = Retrofit.Builder()
    .addConverterFactory(GsonConverterFactory.create())
    .baseUrl(Endpoints.BASE_URL)
    .build()

object RickAndMortyService {
    val retrofitService : RickAndMortyInterface by lazy {
        retrofit.create(RickAndMortyInterface::class.java)
    }
}