package com.example.teste;
import com.example.teste.models.Pokemon;
import java.util.List;
import retrofit2.Call;

public class Retrofit {
    static String urlPokedex = "https://pokeapi.co/api/v2/pokemon/?offset=20&limit=20";
    private static retrofit2.Retrofit retrofit = new retrofit2.Retrofit.Builder()
            .baseUrl(urlPokedex)
            .build();

    GitHubService service = retrofit.create(GitHubService.class);
    Call<List<Pokemon>> repos = service.listRepos(“Gino Osahon”);
}
