package com.example.bookMyShow.controller;

import com.example.bookMyShow.model.Movie;
import com.example.bookMyShow.model.Seat;
import com.example.bookMyShow.service.ShowService;

import java.util.List;

public class ShowController {

    ShowService showService;
    //TODO: Doing it some different way by getting the id here only from repo
    public void createShow(String ShowId, String showNumber, List<Seat> seatList, Movie movie, String screenId){

        showService.createShow(ShowId,showNumber,seatList,movie,screenId);
    }
}
