package com.project1.pokedex

import androidx.lifecycle.LiveData
import com.project1.pokedex.api.RetrofitInstance
import com.project1.pokedex.dataClass.AllPokemon

class PokeRepository {
    val offset = 0;
    final val page = 20

    val allPokemon: LiveData<AllPokemon> = RetrofitInstance.api.getAllPokemon(offset,page)

    suspend fun getAllPokemon(offset:Int,page:Int) = RetrofitInstance.api.getAllPokemon(offset,page)
}