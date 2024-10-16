package com.example.bookMyShow.repo;

import com.example.bookMyShow.model.Booking;
import com.example.bookMyShow.model.Movie;

import java.awt.print.Book;
import java.util.HashMap;
import java.util.Map;

public class BookingRepo {
    Map<String, Booking> bookingList = new HashMap<>();

    public void addBooking(Booking booking){
        bookingList.put(booking.getBookingId(), booking);
    }

    public Booking getByBookingId(String movieId){
        return bookingList.get(movieId);
    }
}
