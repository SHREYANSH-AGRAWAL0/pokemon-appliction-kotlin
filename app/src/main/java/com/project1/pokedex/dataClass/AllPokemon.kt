package com.project1.pokedex.dataClass

data class AllPokemon(
    val count: Int,
    val next: String,
    val previous: Any,
    val results: List<Result>
) {

}