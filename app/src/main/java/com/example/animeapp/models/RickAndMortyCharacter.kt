package com.example.animeapp.models

import com.google.gson.annotations.SerializedName

data class RickAndMortyCharacter(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("image")
    val image: String
)