package com.example.multiwiki.model.repositories

import com.example.multiwiki.model.data.CharacterResponse
import com.example.multiwiki.model.data.Characteres
import com.example.multiwiki.model.data.Endpoints
import retrofit2.http.GET

interface RickAndMortyInterface {
    @GET(Endpoints.CHARACTER)
    suspend fun getCharacter() : CharacterResponse
}