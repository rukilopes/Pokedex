package com.example.teste;

import com.example.teste.models.Pokemon;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface APIService {

    @FormUrlEncoded
    @GET("id/{id}/repos")
    Call<List<Pokemon>> listRepos(@Path("name") String nome, @Path("id") int id,
                                  @Path("url") String url);
}
