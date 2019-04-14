package com.example.teste;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.teste.models.Pokemon;


public class Lista_pokedex extends AppCompatActivity {

    Pokemon [] pokemons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_pok);
    }


}
