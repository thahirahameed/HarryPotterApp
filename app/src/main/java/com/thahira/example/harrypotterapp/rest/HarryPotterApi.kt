package com.thahira.example.harrypotterapp.rest


import com.thahira.example.harrypotterapp.model.CharactersItem
import retrofit2.Response
import retrofit2.http.GET

interface HarryPotterApi {

    @GET(CHARACTERS)
    suspend fun getCharacters():Response<List<CharactersItem>>

    companion object {
        const val BASE_URL = "http://hp-api.herokuapp.com/"
        private const val CHARACTERS = "api/characters"
    }

}