package com.example.demo;

public class User {
    private int UserId;
    private String name;
    private int age;
    private String EmailId;
    private  String mobNumber;

    public User(){

    }
    public User(int age, String name, int id, String emailId, String mobNumber) {
        this.UserId = id;
        this.name = name;
        this.age = age;

        this.EmailId = emailId;
        this.mobNumber = mobNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int id) {
        this.UserId = id;
    }

    public String getEmailId() {
        return EmailId;
    }

    public void setEmailId(String emailId) {
        EmailId = emailId;
    }

    public String getMobNumber() {
        return mobNumber;
    }

    public void setMobNumber(String mobNumber) {
        this.mobNumber = mobNumber;
    }
}
