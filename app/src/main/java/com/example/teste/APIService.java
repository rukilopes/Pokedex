package com.example.teste;
import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService {

    String urlPokedex = "https://pokeapi.co/api/v2/";

    @GET("pokemon/")
    Call<Lista_pokedex> listaPokemon();
}
