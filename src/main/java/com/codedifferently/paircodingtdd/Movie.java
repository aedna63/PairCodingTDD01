package com.codedifferently.paircodingtdd;

public class Movie {
    private String title;
    private Rating rating;

    public Movie(String title, Rating rating){
        this.title = title;
        this.rating = rating;
    }

    public String getTitle(){

        return title;
    }

    public void setTitle(String title){

    }

    public Rating getRating(){

        return null;
    }

    public void setRating(Rating rating){

    }
    public String toString(){
        return "Movie: " + title + " " + rating;
    }

}
