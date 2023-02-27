package com.project1.pokedex.api

import com.project1.pokedex.dataClass.AllPokemon
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface PokeApi {

    @GET("pokemon")
    suspend fun getAllPokemon(
        @Query("limit") limit: Int,
        @Query("offset") offset:Int
    ):Response<AllPokemon>

}