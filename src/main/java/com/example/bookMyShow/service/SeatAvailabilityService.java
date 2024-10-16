package com.example.bookMyShow.service;

import com.example.bookMyShow.model.Seat;
import com.example.bookMyShow.model.SeatType;
import com.example.bookMyShow.model.Show;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SeatAvailabilityService {

    public Boolean isSeatAvailable(String seatId, Show show){
        List<Seat> allSeats = show.getSeats(); //todo: we areusing it at n no of times should i use it
        Optional<Seat> seatToFind = allSeats.stream().filter(seat -> seat.getSeatId().equals(seatId)).findFirst();
        if(seatToFind.isEmpty()){return false;}
        Seat seat = seatToFind.get();
        return seat.getIsAvailable();

    }
    public List<Seat> getAvailableSeats(Show show){
        List<Seat> allSeats = show.getSeats();
        return allSeats.stream().filter(seat -> seat.getIsAvailable().equals(true)).collect(Collectors.toList());
    }
}
