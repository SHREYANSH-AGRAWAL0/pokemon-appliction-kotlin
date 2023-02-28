package com.project1.pokedex

import android.content.Context
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.project1.pokedex.dataClass.AllPokemon

class PokemonRVAdapter(private val context:Context,val viewModel:PokeViewModel, val arrayList: ArrayList<AllPokemon>): RecyclerView.Adapter<PokemonRVAdapter.PokemonViewHolder> {


    class PokemonViewHolder(ItemView: View):RecyclerView.ViewHolder(ItemView){
        val name: TextView = ItemView.findViewById<TextView>(R.id.text)
    }
}

