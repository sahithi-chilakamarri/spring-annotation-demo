package com.stackroute;

import com.stackroute.domain.ConfigurationClass;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        //Dependency Injection using ApplicationContext
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
        Movie movie = context.getBean("movieBean", Movie.class);
        movie.display();
        Movie movie1 = context.getBean("movieBean1", Movie.class);
        movie1.display();
        Movie movie2 = context.getBean("movieBean2", Movie.class);
        movie2.display();
        Movie movie3 = context.getBean("movieBean3", Movie.class);
        movie3.display();
        Movie movie4 = context.getBean("movieBean4", Movie.class);
        movie4.display();
        //Comparing two beans
        System.out.println(movie==movie1);
        System.out.println(movie3==movie4);





    }
}
