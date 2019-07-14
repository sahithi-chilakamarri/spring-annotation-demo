package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

@Scope("Prototype")
public class Movie  {
    private Actors actor;

    public Movie(Actors actor) {
        this.actor = actor;
    }
    public void display()
    {

        actor.display();
    }

}
