package com.stackroute;

import com.stackroute.domain.ConfigurationClass;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        //Dependency Injection using ApplicationContext
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
        Movie movie=context.getBean("movieBean",Movie.class);
        movie.display();
    }
}
