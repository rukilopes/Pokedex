package com.example.teste;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.example.teste.models.Pokemon;
import java.util.List;


public class Lista_pokedex extends AppCompatActivity {

    public List<Pokemon> pokemon;
    //public List<Abylities> habilidades;
    //public List<Genders> generos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_pok);
    }


}
