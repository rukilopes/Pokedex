package com.example.teste.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Pokemon {

    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("name")
    @Expose
    private String nome;

    @SerializedName("url")
    @Expose
    private String url;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    public String caracteristicas(List<Pokemon> pok) {
        Pokemon pokAux = new Pokemon();

        return String.format("ID: %s\nNome: %s\nUrl: %s\n\n",pokAux.getId(),
                pokAux.getNome(), pokAux.getUrl());

    }
}
