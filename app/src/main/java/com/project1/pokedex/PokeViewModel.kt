package com.project1.pokedex

import com.project1.pokedex.Resource
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.project1.pokedex.dataClass.AllPokemon
import kotlinx.coroutines.launch
import retrofit2.Response

class PokeViewModel ( val pokeRepository: PokeRepository) : ViewModel() {

        val PokemonData: MutableLiveData<Resource<AllPokemon>> = MutableLiveData()
        var offset = 0

        init{
                getAllPokemons()
        }

        fun getAllPokemons() = viewModelScope.launch {
                PokemonData.postValue(Resource.Loading())
                val response = pokeRepository.getAllPokemon(offset,20)

                PokemonData.postValue(handleResponse(response))

        }

        fun handleResponse(response: Response<AllPokemon>) :Resource<AllPokemon> {
                if(response.isSuccessful){
                        response.body()?.let{
                                        resultPokemon->
                                return Resource.Success( resultPokemon )
                        }
                }            return Resource.Error(response.message())
        }

}