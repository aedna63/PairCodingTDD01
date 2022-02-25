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

}
