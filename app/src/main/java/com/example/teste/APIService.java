package com.example.teste;

import com.example.teste.models.Pokemon;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface APIService {
    @FormUrlEncoded
    @POST("Pokemon")
    Call<Pokemon> createUser(@Field("id") int id,
                             @Field("name") String nomePokemon,
                             @Field("url") String url);
}
