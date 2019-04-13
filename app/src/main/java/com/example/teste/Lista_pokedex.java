package com.example.teste;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.teste.models.Pokemon;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public class Lista_pokedex extends AppCompatActivity {

    Pokemon [] pokemons;
    static String urlPokedex = "https://pokeapi.co/api/v2/pokemon/?offset=20&limit=20";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_pok);
    }

    private static Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(urlPokedex)
                .build();
}
