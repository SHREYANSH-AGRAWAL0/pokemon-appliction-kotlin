package com.project1.pokedex

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider


class PokemonViewModelProviderFactory (val pokeRepository: PokeRepository):ViewModelProvider.Factory{
    override fun <T:ViewModel?> create(modelClass:Class<T>):T{
        return PokeViewModel(pokeRepository) as T
    }
}