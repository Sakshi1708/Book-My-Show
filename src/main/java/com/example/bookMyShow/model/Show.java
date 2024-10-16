package com.example.bookMyShow.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalTime;

@Data
@AllArgsConstructor
public class Show {
    String showId;
    String auditoriumId;
    LocalTime showStartTime;
    LocalTime showEndTime;
    Movie movie;
    String theatreId;
}
//Do we need the count of seattypes
