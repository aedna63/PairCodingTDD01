package com.codedifferently.paircodingtdd;

public class Movie {
    private String title;
    private Rating rating;
    private Double ranking;

    public Movie(String title, Rating rating, Double ranking){
        this.title = title;
        this.rating = rating;
        this.ranking = ranking;
    }

    public String getTitle(){

        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public Rating getRating(){

        return rating;
    }

    public void setRating(Rating rating){
        this.rating = rating;

    }
    public Double getRanking(){
        return ranking;
    }

    public void setRanking(Double ranking){


    }
    public String toString(){
        return "Movie: " + title + " " + rating;
    }

}
