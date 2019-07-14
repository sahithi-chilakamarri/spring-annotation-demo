package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ConfigurationClass {
    //This is to create to actor bean
    @Bean
    public Actors actorBean()
    {
        return new Actors("Shahid","Male",30);
    }
    @Bean
    public Actors actorBean1()
    {
        return new Actors("Vijay","Male",30);
    }

    @Bean
    public Actors actorBean2()
    {
        return new Actors("Sharukh","Male",50);
    }

    // This is to create movie bean
    @Bean
    public Movie movieBean()
    {
        Movie movie=new Movie(actorBean());
        return movie;
    }
    @Bean
    public Movie movieBean1()
    {
        Movie movie=new Movie(actorBean1());
        return movie;
    }
    @Bean
    public Movie movieBean2()
    {
        Movie movie=new Movie(actorBean2());
        return movie;
    }
    @Bean
    public Movie movieBean3()
    {
        Movie movie=new Movie(actorBean2());

        return movie;
    }
    @Bean
    public Movie movieBean4()
    {
        Movie movie=new Movie(actorBean2());
        return movie;
    }

}
