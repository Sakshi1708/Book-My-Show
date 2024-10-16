package com.example.bookMyShow.service;

import com.example.bookMyShow.dto.UserDto;
import com.example.bookMyShow.model.User;
import com.example.bookMyShow.repo.UserRepo;
import org.springframework.stereotype.Service;

@Service
public class UserService{

    UserRepo userRepo;

    public void addUser(String userId, String userName, String location){
        //HELP: as i donot want other info so i create a constructor with this much only
        User user = new User(userId,userName,location); //QUES: Should i use dto or model here
        userRepo.addUser(user);
    }
}
