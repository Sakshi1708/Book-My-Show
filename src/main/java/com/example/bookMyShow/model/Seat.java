package com.example.bookMyShow.model;

import lombok.Data;

@Data
public class Seat {
    String seatId;
    String seatNumber;
    SeatType seatType;
    Double seatPrice;
    Boolean isAvailable;

    public Seat(String seatId, SeatType seatType, Double seatPrice, Boolean isavailable){
        this.seatId = seatId;
        this.seatType = seatType;
        this.seatPrice = seatPrice;
        this.isAvailable = isavailable;
    }
}
