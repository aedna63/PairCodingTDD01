package com.codedifferently.paircodingtdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieTest {

    @Test
    public void constructorTest(){
        Movie movie = new Movie("Coming To America", Rating.R);
        String expected = "Movie: Coming To America R";
        String actual = movie.toString();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getTitleTest(){
        Movie movie = new Movie("Coming To America", Rating.R);
        String expected = "Coming To America";
        String actual = movie.getTitle();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setTitleTest(){
    Movie movie = new Movie("Bridesmaids", Rating.R);
    String expected = "Bridesmaids";
    movie.setTitle("Bridesmaids");
    String actual = movie.getTitle();
    Assertions.assertEquals(actual, expected);
    }

    @Test
    public void getRatingTest(){
        Movie movie = new Movie("Coming To America", Rating.R);
        Rating expected = Rating.R;
        Rating actual = movie.getRating();
        Assertions.assertEquals(expected, actual);
    }

}
