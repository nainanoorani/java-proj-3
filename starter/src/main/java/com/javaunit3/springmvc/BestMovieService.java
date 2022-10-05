package com.javaunit3.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//Defines the class as a Spring component
@Component
public class BestMovieService {
//enables Spring automatic dependency field injection. It scans for types of movies (Batman, Titanic)
//    @Autowired

    private Movie movie;
    @Autowired
    public BestMovieService(@Qualifier("titanicMovie") Movie movie) {
        this.movie = movie;
    }
    public Movie getBestMovie(){
        return movie;
    }
    //Setter injection instead to achieve same output
//    @Autowired
//    public void setMovie(Movie movie) {
//        this.movie = movie;
//    }




}
