package com.example.bookMyShow.repo;

import com.example.bookMyShow.model.Auditorium;
import com.example.bookMyShow.model.Theatre;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TheatreRepo {
    Map<String, Theatre> theatresList = new HashMap<>();
    List<Auditorium> listOfAuditoriums = new ArrayList<>();
    Map<String, Auditorium> screensFortheatreList = new HashMap<>();
    List<Theatre> listOfTheatre = new ArrayList<>();


    public void addTheatre(Theatre theatre){
        theatresList.put(theatre.getTheatreId(), theatre);
        listOfTheatre.add(theatre);
    }

    public Theatre getByTheatreId(String theatreId){
        return theatresList.get(theatreId);
    }

    public void addScreens(List<Auditorium> auditoriumList, String theatreId){
        listOfAuditoriums.addAll(auditoriumList);
        for(Auditorium auditorium : auditoriumList){
            screensFortheatreList.put(theatreId +"+" + auditorium.getScreenId(), auditorium);
        }
    }

    public List<Theatre> getAllTheatre(){
        return listOfTheatre;
    }
}
