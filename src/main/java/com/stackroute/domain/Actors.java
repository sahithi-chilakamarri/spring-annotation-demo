package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Value;

public class Actors {
    private String name;
    private String gender;
    private int age;
    //Setting the value
    @Value("Sahithi")
    public void setName(String name) {

        this.name = name;
    }
    //Setting the value
    @Value("Female")
    public void setGender(String gender) {

        this.gender = gender;
    }
    //Setting the value
    @Value("23")
    public void setAge(int age)
    {

        this.age = age;
    }
    //Display the values
    public void display()
    {

        System.out.println("Name : "+name+" Gender : "+gender+" Age : "+age);
    }
}
