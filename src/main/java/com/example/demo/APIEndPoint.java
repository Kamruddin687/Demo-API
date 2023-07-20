package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class APIEndPoint {
    HashMap<Integer,User>userDb= new HashMap<>();
    @GetMapping("/getWeatherDetails")
    public String getWeatherInfo(){
        return "Today Hyderabad weather are heave rains and very windy";
    }
    @GetMapping("/calculateSum")
    public String calculateSum(@RequestParam("n1")Integer n1,@RequestParam("n2")Integer n2){
        int sum = n1+n2;
        return "the sum is "+sum;
    }
    @PostMapping("/signUpUser")
    public String signUpAUser(@RequestBody User user){
        int primaryKey = user.getUserId();
        userDb.put(primaryKey,user);
        return "User with the name  " + user.getName()+ " Has been added to the DB";
    }
    @PostMapping("/getUserById")
    public User findUserById(@RequestParam("userId")Integer userId){
        User user= userDb.get(userId);
        return user;
    }

}
