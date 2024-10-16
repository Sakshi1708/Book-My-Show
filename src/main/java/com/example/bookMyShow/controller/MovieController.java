package com.example.bookMyShow.controller;

import com.example.bookMyShow.dto.MovieDto;
import com.example.bookMyShow.service.MovieService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie")
public class MovieController {
    MovieService movieService;

    public void createMovie(MovieDto movieDto){
        movieService.createMovie(movieDto.getMovieId(),movieDto.getMovieName());
    }
}
