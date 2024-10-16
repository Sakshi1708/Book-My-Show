package com.example.bookMyShow.repo;

import com.example.bookMyShow.model.Seat;
import com.example.bookMyShow.model.Show;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShowRepo {
    Map<String, Show> showsList = new HashMap<>();
    Map<String, List<Seat>> seatInShowList = new HashMap<>();// todo: check

    public void addShow(Show show){
        showsList.put(show.getShowId(), show); //todo: should i add movie id instaed of show id
    }

    public Show getByShowId(String showId){
        return showsList.get(showId);
    }

    //todo:
    public void addSeat(Seat seat, String showId){
//        seatInShowList.put(show.getShowId(), show); //todo: should i add movie id instaed of show id
    }
}


