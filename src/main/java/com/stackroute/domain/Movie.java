package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;

@Scope("Prototype")
public class Movie  {
   @Autowired
   @Qualifier("actorBean")
    private Actors actor;

    public Movie(Actors actor) {
        this.actor = actor;
    }

    public Movie() {
    }

    public void display()
    {

        actor.display();
    }

    public void setActor(Actors actor) {
        this.actor = actor;
    }
}
