package com.example.teste;

import android.util.Log;

import com.example.teste.models.Pokemon;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.converter.gson.GsonConverterFactory;

public class Retrofit2 {

    public void retrofitConverte() {

        final String TAG = "pokedex";

        retrofit2.Retrofit retrofit = new retrofit2.Retrofit.Builder()
                .baseUrl(APIService.urlPokedex)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        APIService service = retrofit.create(APIService.class);
        Call<Lista_pokedex> resposta = service.listaPokemon();

        resposta.enqueue(new Callback<Lista_pokedex>() {
            @Override
            public void onResponse(Call<Lista_pokedex> call, Response<Lista_pokedex> response) {
                if (!response.isSuccessful()) {
                    Log.i(TAG, "Error: " + response.code());
                } else {
                    Lista_pokedex pokemon = response.body();

                    for (Pokemon p : pokemon.pokemon){
                        Log.i(TAG,String.format("ID: %s  |  Nome: %s   |  Url: %s",(String)p.getId()
                                ,p.getNome(),p.getUrl()));
                    }
                }
            }

            @Override
            public void onFailure(Call<Lista_pokedex> call, Throwable t) {
                Log.e(TAG, "Error: " + t.getMessage());
            }
        });
    }
}
