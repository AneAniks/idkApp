package com.example.idkapp;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface IMovieApi {
    @GET("movie/top_rated")
    Call<MovieResponse> getTopRatedMovies(@Query("api_key") String apiKey);
}
