package com.stackroute.domain;
;

public class Actors {
    private String name;
    private String gender;
    private int age;
//Parameterized constructors
    public Actors(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void setName(String name) {

        this.name = name;
    }
    public void setGender(String gender) {

        this.gender = gender;
    }
    public void setAge(int age)
    {

        this.age = age;
    }
    //To display the content
    public void display()
    {

        System.out.println("Name : "+name+" Gender : "+gender+" Age : "+age);
    }
}
