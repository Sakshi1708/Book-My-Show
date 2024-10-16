package com.example.bookMyShow.model;

import lombok.Data;


@Data
public class User {
    String userId;
    String userName;
    String location;
    String phoneNumber;
    String emailId;

    public User(String userId, String userName, String location){
        this.userId = userId;
        this.userName = userName;
        this.location = location;
    }
}
