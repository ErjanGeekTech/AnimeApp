package com.example.animeapp.ui.activity

import androidx.lifecycle.ViewModel
import com.example.animeapp.data.repositories.CharacterRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val repository: CharacterRepository): ViewModel() {

    fun fetchCharacters() = repository.fetchCharacters()
}