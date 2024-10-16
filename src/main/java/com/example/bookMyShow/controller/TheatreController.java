package com.example.bookMyShow.controller;

import com.example.bookMyShow.dto.TheatreDto;
import com.example.bookMyShow.model.Auditorium;
import com.example.bookMyShow.model.Theatre;
import com.example.bookMyShow.service.TheatreService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/theatre")
public class TheatreController {
    TheatreService theatreService;
    public void createTheatre(TheatreDto theatreDto){
        theatreService.createTheatre(theatreDto.getTheatreId(),theatreDto.getTheatreName(),theatreDto.getLocation(), theatreDto.getListOfAuditoriums()); //TODO: I AM NOT ADDING SHOW IN THEATRES
    }

    public Theatre getTheatreById(String theatreId){
        return theatreService.getTheatreById(theatreId);
    }
    public void createScreensInTheatre(List<Auditorium> screensList, String theatreId){ //TODO: should i addition of single screen function
        theatreService.createScreensInTheatre(screensList, theatreId);
    }

    public List<Theatre> getAllTheatre(){
        return theatreService.getAllTheatre();
    }
    //getAllTheatreInCity()
}
