package com.stackroute;

import com.stackroute.domain.ConfigurationClass;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        //Creating object for application context class using annotation class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
        //Creating object using getbean method
        Movie movie=context.getBean("movieBean",Movie.class);
        movie.display();
        context.close();
    }
}
