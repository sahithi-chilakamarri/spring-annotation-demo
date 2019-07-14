package com.stackroute;

import com.stackroute.domain.ConfigurationClass;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class Main {

    public static void main(String[] args) {
        //Dependency Injection using ApplicationContext
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
        Movie movie = context.getBean("movieBean", Movie.class);
        movie.display();

        //Dependency Injection using Bean Factory
        BeanFactory beanFactory=new AnnotationConfigApplicationContext(ConfigurationClass.class);
        Movie movie1=beanFactory.getBean("movieBean",Movie.class);
        movie1.display();

        //Dependency Injection using BeanDefinitionRegistry and BeanDefinitionReader
        DefaultListableBeanFactory defaultListableBeanFactory=new DefaultListableBeanFactory();
        BeanDefinitionRegistry beanDefinitionRegistry = new GenericApplicationContext(defaultListableBeanFactory );
        BeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanDefinitionRegistry);

        
        

    }
}
