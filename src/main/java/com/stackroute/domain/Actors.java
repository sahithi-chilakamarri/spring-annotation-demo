package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Value;

public class Actors {
    private String name;
    private String gender;
    private int age;

    @Value("Sahithi")
    public void setName(String name) {

        this.name = name;
    }
    @Value("Female")
    public void setGender(String gender) {

        this.gender = gender;
    }
    @Value("23")
    public void setAge(int age)
    {

        this.age = age;
    }
    public void display()
    {

        System.out.println("Name : "+name+" Gender : "+gender+" Age : "+age);
    }
}
