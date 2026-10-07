package com.example.multiwiki.model.data

data class CharacterResponse(
    val results: List<Characteres>
)

data class Characteres(
    val id: String,
    val name: String,
    val status: String,
    val species: String,
    val gender: String,
    val location: Location
)
data class Location(
    val name: String
    //val url:
)
