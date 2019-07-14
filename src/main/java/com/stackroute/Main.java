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
        Movie movie1 = context.getBean("movieBean1", Movie.class);
        Movie movie2 = context.getBean("movieBean2", Movie.class);
        Movie movie3=context.getBean("movieBean3",Movie.class);
        Movie movie4=context.getBean("movieBean4",Movie.class);
        movie.display();
        movie1.display();
        movie2.display();
        movie3.display();
        movie4.display();
        System.out.println(movie==movie1);
        System.out.println(movie3==movie4);
    }
}
