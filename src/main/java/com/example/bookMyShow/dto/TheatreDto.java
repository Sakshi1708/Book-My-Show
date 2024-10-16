package com.example.bookMyShow.dto;

import com.example.bookMyShow.model.Auditorium;
import com.example.bookMyShow.model.Show;
import lombok.Data;

import java.util.List;

@Data
public class TheatreDto {
    String theatreId;
    String theatreName;
    List<Auditorium> listOfAuditoriums;
    List<Show> listOfShows;
    String location;
}
