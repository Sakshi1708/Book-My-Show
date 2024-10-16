package com.example.bookMyShow.service;

import com.example.bookMyShow.model.Auditorium;
import com.example.bookMyShow.model.Theatre;
import com.example.bookMyShow.repo.TheatreRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TheatreService {

    TheatreRepo theatreRepo;

    public TheatreService(TheatreRepo theatreRepo){
        this.theatreRepo = theatreRepo;
    }

    public void createTheatre(String theatreId, String theatreName, String location, List<Auditorium> auditoriumList){
        Theatre theatre = new Theatre(theatreId,theatreName, location, auditoriumList);
        theatreRepo.addTheatre(theatre);
    }

    public Theatre getTheatreById(String theatreId){
        return theatreRepo.getByTheatreId(theatreId);
    }

    public void createScreensInTheatre(List<Auditorium> auditoriumList, String theatreId){
        theatreRepo.addScreens(auditoriumList, theatreId);
    }

    public List<Theatre> getAllTheatre(){
        return theatreRepo.getAllTheatre();
    }
}
