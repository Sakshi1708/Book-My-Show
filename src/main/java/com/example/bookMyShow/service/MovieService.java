package com.example.bookMyShow.service;

import com.example.bookMyShow.model.Genre;
import com.example.bookMyShow.model.Movie;
import com.example.bookMyShow.repo.MovieRepo;

public class MovieService {
    MovieRepo movieRepo;

    public MovieService(MovieRepo movieRepo){
        this.movieRepo = movieRepo;
    }

    public void createMovie(String movieId, String movieName){
        Movie movie = new Movie(movieId,movieName);
        movieRepo.addMovie(movie);
    }
    public Movie getByMovieId(String movieId){
        return movieRepo.getByMovieId(movieId);
    }
}
//searchmovie