package com.example.bookMyShow.controller;

import com.example.bookMyShow.dto.UserDto;
import com.example.bookMyShow.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user") //TODO: No need
public class UserController {
    UserService userService;

    @GetMapping("/add")
    public void addUser(UserDto userDto){
        //accept user and pass it
        userService.addUser(userDto.getUserId(), userDto.getUserName(), userDto.getLocation());
    }

    //remove User by admin
}
//add validate if want
