package com.example.teste;
import android.util.Log;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Retrofit2 {

    private final Retrofit retrofit;

    public Retrofit2() {

        final String TAG = "pokedex";
        final String dados = "";

        retrofit = new retrofit2.Retrofit.Builder()
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

                    call = new Retrofit2().retrofit.create(APIService.class)
                            .listaPokemon();

                    System.out.println(call.request());
                }
            }

            @Override
            public void onFailure(Call<Lista_pokedex> call, Throwable t) {
                Log.e(TAG, "Error: " + t.getMessage());
            }
        });
    }
}
