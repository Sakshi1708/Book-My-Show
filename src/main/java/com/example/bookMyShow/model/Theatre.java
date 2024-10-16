package com.example.bookMyShow.model;

import lombok.Data;

import java.util.List;

@Data
public class Theatre {
    String theatreId;
    String theatreName;
    List<Auditorium> listOfAuditoriums; //auditorium
//    List<Show> listOfShows;
    String location; //city

    public Theatre(String theatreId, String theatreName, String location, List<Auditorium> auditoriumList){
        this.theatreId = theatreId;
        this.theatreName = theatreName;
        this.location = location;
        this.listOfAuditoriums = auditoriumList;
    }
}

//we will add List<Movie> if we wamt to fetch movie by theatre