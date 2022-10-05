package com.javaunit3.springmvc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
//scans the project for spring components
@ComponentScan
public class MovieApp {
    public static void main(String[] args) {
    //get application context
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(MovieApp.class);
    //get the best movie service using default bean id
        BestMovieService bestMovieService = applicationContext.getBean("bestMovieService", BestMovieService.class);
        Movie bestMovie = bestMovieService.getBestMovie();
        System.out.println("Title: " +bestMovie.getTitle());
        System.out.println("Maturity Rating: " + bestMovie.getMaturityRating());
        System.out.println("Genre: " + bestMovie.getGenre());
        applicationContext.close();
    }
}

