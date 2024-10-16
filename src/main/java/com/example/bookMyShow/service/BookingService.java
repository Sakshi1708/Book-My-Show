package com.example.bookMyShow.service;

import com.example.bookMyShow.model.*;
import com.example.bookMyShow.repo.BookingRepo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookingService {
    BookingRepo bookingRepo;
    Map<Show, Map<Seat, SeatLock>> seatLockList= new HashMap<>();

    public void createBooking(String bookingId, Show show, List<Seat> seatsBooked, Boolean isBookingConfirmed) throws Exception { //todo: how to calculate amount
        if(isAnySeatsAlreadyBooked(seatsBooked, show)){
            throw new Exception("ALREADY BOOKED SEAT");
        }
        lockSeat(seatsBooked, show, user);

        Booking booking = new Booking(bookingId, show, seatsBooked);
        bookingRepo.addBooking(booking);
    }
    public Boolean isAnySeatsAlreadyBooked(List<Seat> seatBookedList, Show show){
        for(Seat seat: seatBookedList){
            if(seat.getIsAvailable().equals(false)){
                return true;
            }
        }
        return false;
        //Other Way: to get all Booked Seats and then check if any element of seatBookedList is present
    }

    public void getSeatLocked(List<Seat> seatsBooked, Show show, User user) throws Exception {
        for(Seat seat: seatsBooked){
            if(isSeatLocked(seat)){
                throw new Exception("Seat is Locked Temporary");
            }
        }
        for(Seat seat: seatsBooked){
           lockSeat(seat,show, user);
        }

    }

    public void lockSeat(Seat seat, Show show, User user, int timeOut){
        if(!seatLockList.containsKey(show)){
            seatLockList.put(show, new HashMap<>());
        }
        SeatLock lock = new SeatLock(seat, show, timeOut, user);
        seatLockList.get(show).put(seat,lock);
    }

    public void unLockSeats(Show show, List<Seat> seats, User user){
        if(!seatLockList.containsKey(show)){return;}
        if(seatLockList.get(show).get(seat).getLockedBy().equals(user)){

        }
        return seatLockList.get(show).remove(seat);
    }
    //getLockedSeats

}
