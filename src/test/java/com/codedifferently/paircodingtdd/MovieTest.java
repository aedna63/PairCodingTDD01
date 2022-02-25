package com.codedifferently.paircodingtdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieTest {

    @Test
    public void constructorTest(){
        Movie movie = new Movie("Coming To America");
        String expected = "Movie: Coming To America";
        String actual = movie.toString();
        Assertions.assertEquals(expected, actual);
    }

}
