package com.stackroute.domain;

import org.springframework.context.annotation.Scope;

@Scope("Prototype")
public class Movie  {
    private Actors actor;

    public void setActor(Actors actor) {

        this.actor = actor;
    }
    public void display()
    {

        actor.display();
    }

}
