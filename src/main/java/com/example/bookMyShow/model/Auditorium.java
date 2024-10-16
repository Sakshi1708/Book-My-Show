package com.example.bookMyShow.model;

import lombok.Data;

import java.util.List;

@Data
public class Auditorium {
    String screenId;
    String screenNumber;
    List<Seat> seats;
//    List<Show> listOfShows;
}
//Todo: QUES: Do we need to add Theatre here or not
