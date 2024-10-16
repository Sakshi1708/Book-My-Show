package com.example.bookMyShow.model;

import lombok.Data;
import lombok.Getter;

import java.time.LocalDate;
import java.util.List;

@Data
public class Movie {
    String movieId;
    String movieName;
    List<String> actors;
    LocalDate releaseDate;
    int duration;
    Genre genre;

    public Movie(String movieId, String movieName){
        this.movieId= movieId;
        this.movieName = movieName;
    }
}
