package com.example.bookMyShow.service;

import com.example.bookMyShow.model.Movie;
import com.example.bookMyShow.model.Seat;
import com.example.bookMyShow.model.SeatType;
import com.example.bookMyShow.model.Show;
import com.example.bookMyShow.repo.ShowRepo;

import java.time.LocalTime;
import java.util.List;

public class ShowService {
    ShowRepo showRepo;
    public void createShow(String ShowId, String showNumber, List<Seat> seatList, Movie movie, LocalTime showTime, String screenId){
        Show show = new Show(ShowId,showNumber,screenId, seatList, showTime, movie);
        showRepo.addShow(show);
    }

    public void createSeatInShow(String seatId, SeatType seatType, Double seatPrice, Boolean isavailable, String showId){
        Seat seat = new Seat(seatId, seatType, seatPrice, isavailable);
        showRepo.addSeat(seat, showId);
    }
}
