package com.example.bookMyShow.repo;

import com.example.bookMyShow.model.Movie;
import com.example.bookMyShow.model.User;

import java.util.HashMap;
import java.util.Map;

public class MovieRepo {
    Map<String, Movie> moviesList = new HashMap<>();

    public void addMovie(Movie movie){
        moviesList.put(movie.getMovieId(), movie);
    }

    public Movie getByMovieId(String movieId){
        return moviesList.get(movieId);
    }
}
