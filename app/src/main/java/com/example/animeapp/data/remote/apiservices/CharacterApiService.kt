package com.example.animeapp.data.remote.apiservices

import com.example.animeapp.models.RickAndMortyCharacter
import com.example.animeapp.models.RickAndMortyResponse
import retrofit2.http.GET

interface CharacterApiService {

    @GET("character")
    suspend fun fetchCharacters(): RickAndMortyResponse<RickAndMortyCharacter>
}