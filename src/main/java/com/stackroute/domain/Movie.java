package com.stackroute.domain;

public class Movie  {
    private Actors actor;
//Setter methid for actor
    public void setActor(Actors actor) {

        this.actor = actor;
    }
    public void display()
    {

        actor.display();
    }

}
