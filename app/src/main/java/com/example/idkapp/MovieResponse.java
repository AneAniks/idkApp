package com.example.idkapp;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class MovieResponse {
    @SerializedName("results")
    private List<MovieModel> results;

    public void setResults(List<MovieModel> results) {
        this.results = results;
    }

    public List<MovieModel> getResults() {
        return results;
    }
}
