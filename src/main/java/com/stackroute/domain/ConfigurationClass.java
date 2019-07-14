package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
        return new Actors("Vijay","Male",29);
    }

    // This is to create movie bean
    @Bean
    public Movie movieBean()
    {
        Movie movie=new Movie(actorBean1());
        return movie;
    }
    @Bean
    public Movie movieBean1()
    {
        Movie movie=new Movie();
        movie.setActor(actorBean());
        return movie;
    }
}
