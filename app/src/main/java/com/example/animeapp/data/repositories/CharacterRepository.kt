package com.example.animeapp.data.repositories

import androidx.lifecycle.liveData
import com.example.animeapp.data.remote.apiservices.CharacterApiService
import javax.inject.Inject

class CharacterRepository @Inject constructor(private val service: CharacterApiService) {

    fun fetchCharacters() = liveData {
        emit(service.fetchCharacters())
    }
}