package com.example.teste;

import com.example.teste.models.Pokemon;


import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService {

    static String urlPokedex = "https://pokeapi.co/api/v2/pokemon/";

    @GET("{id or name}")
    Call<Lista_pokedex> listaPokemon();
    //Call<List<Pokemon>> listaPokemon();
    //@Path("name") String nome, @Path("id") int id,
    //                                  @Path("url") String url
}
