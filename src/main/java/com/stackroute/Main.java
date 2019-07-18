package com.stackroute;

import com.stackroute.domain.ConfigurationClass;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        //Created using application context
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
        //Bean creation using getbean method
        Movie movie=context.getBean("movieBean",Movie.class);
        movie.display();
        context.close();
    }
}
