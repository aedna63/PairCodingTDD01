package com.codedifferently.paircodingtdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieTest {

    @Test
    public void constructorTest(){
        Movie movie = new Movie("Coming To America", Rating.R, 3.0, 134);
        String expected = "Movie: Coming To America, R, 3.0, 134";
        String actual = movie.toString();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getTitleTest(){
        Movie movie = new Movie("Coming To America", Rating.R, 3.0,122);
        String expected = "Coming To America";
        String actual = movie.getTitle();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setTitleTest(){
    Movie movie = new Movie("Bridesmaids", Rating.R, 3.5,145);
    String expected = "Bridesmaids";
    movie.setTitle("Bridesmaids");
    String actual = movie.getTitle();
    Assertions.assertEquals(actual, expected);
    }

    @Test
    public void getRatingTest(){
        Movie movie = new Movie("Coming To America", Rating.R, 3.0,133);
        Rating expected = Rating.R;
        Rating actual = movie.getRating();
        Assertions.assertEquals(expected, actual);
    }
    @Test
        public void setRatingTest(){
        Movie movie = new Movie("bridesmaids", Rating.R, 3.5,166);
        Rating expected = Rating.R;
        movie.setRating(Rating.R);
        Rating actual = movie.getRating();
        Assertions.assertEquals(actual, expected);
    }
    @Test
        public void getRankingTest01(){
        Movie movie = new Movie("Friday", Rating.R, 3.5,122);
        Double expected = 3.5;
        Double actual = movie.getRanking();
        Assertions.assertEquals(expected, actual);
    }
    @Test
        public void setRankingTest(){
        Movie movie = new Movie("Friday", Rating.R, 3.8,133);
        Double expected = 3.8;
        movie.setRanking(3.8);
        Double actual = movie.getRanking();
        Assertions.assertEquals(actual, expected);
    }
    @Test
        public void getLengthTest(){
        Movie movie = new Movie("love and Basketball", Rating.R, 8.5, 146);
        Integer expected = 146;
        Integer actual = movie.getLength();
        Assertions.assertEquals(actual, expected);

    }
    @Test
        public void setLengthTest(){
        Movie movie = new Movie("Avengers", Rating.R, 7.5, 155);
        Integer expected = 155;
        movie.setLength(155);
        Integer actual = movie.getLength();
        Assertions.assertEquals(actual, expected);

    }

}
