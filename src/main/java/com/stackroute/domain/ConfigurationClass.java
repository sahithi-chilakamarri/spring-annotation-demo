package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationClass {
    //This is to create to actor bean
    @Bean
    public Actors actorBean()
    {
        return new Actors();
    }
    // This is to create movie bean
    @Bean
    public Movie movieBean()
    {
        Movie movie=new Movie();
        movie.setActor(actorBean());
        return movie;
    }

}
