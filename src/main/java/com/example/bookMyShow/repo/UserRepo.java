package com.example.bookMyShow.repo;

import com.example.bookMyShow.model.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserRepo {
    Map<String, User> usersList = new HashMap<>();

    public void addUser(User user){
        usersList.put(user.getUserId(), user);
    }

    //getById
}
