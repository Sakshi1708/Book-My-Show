package com.example.bookMyShow.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class SeatLock {
    Show show;
    Seat seat;
    int timeOut;
    LocalDate seatLockDate;
    User lockedBy;
}
