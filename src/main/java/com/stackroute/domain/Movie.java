package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;

@Scope("Prototype")
public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {
    @Autowired
    @Qualifier("actorBean")
    private Actors actor;

    public Movie(Actors actor) {
        this.actor = actor;
    }

    public Movie() {

    }

    public void setActor(Actors actor) {

        this.actor = actor;
    }
    public void display()
    {

        actor.display();
    }
//Overriding the interface methods
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("It is BeanFactoryAware");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("It is BeanNameAware");

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("It is Application context aware");

    }
}
