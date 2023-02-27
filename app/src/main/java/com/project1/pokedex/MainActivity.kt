package com.project1.pokedex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.project1.pokedex.api.PokeApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: PokeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val PokeApi = RetrofitHelper.getInstance().create(PokeApi::class.java)
        // launching a new coroutine
        GlobalScope.launch {
            val result = PokeApi.getAllPokemon(20,20)
                Log.d("Pokemon: ", result.body().toString())
            Log.d("Pokemon",result.body()!!.results.toString())
        }

        val PokeRepository = PokeRepository()
        val viewModelProviderFactory = PokemonViewModelProviderFactory(PokeRepository)
        viewModel  = ViewModelProvider(this,viewModelProviderFactory).get(PokeViewModel::class.java)




    }
}