package com.example.bookMyShow.model;

import lombok.Data;

import java.util.List;

@Data
public class Booking {
    String bookingId;
    Show show;
    Double totalPayment;
    List<Seat> seatsBooked;
    Boolean isBookingConfirmed;
    String bookedBy;
}
