package br.com.dudinha.javinha.projetos.Movie;

public class Title {
    private String name;
    private int Release_year;
    private boolean included_in_the_plan;
    private double sum_of_ratings;
    private int total_reviews;
    private int duration_minutes;


    public boolean isIncluded_in_the_plan() {
        return included_in_the_plan;
    }

    public int getRelease_year() {
        return Release_year;
    }

    public String getName() {
        return name;
    }

    public int getDuration_minutes() {
        return duration_minutes;
    }

    public int getTotal_reviews(){
        return total_reviews;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRelease_year(int release_year) {
        Release_year = release_year;
    }

    public void setIncluded_in_the_plan(boolean included_in_the_plan) {
        this.included_in_the_plan = included_in_the_plan;
    }

    public void setDuration_minutes(int duration_minutes) {
        this.duration_minutes = duration_minutes;
    }

    public void displaysTechnical_Sheet(){
        System.out.println("Film name: "  +  name);
        System.out.println("Film duration: "+ duration_minutes);
        System.out.println("Release year: " + Release_year);
    }

    public void assessment(double note){
        sum_of_ratings += note;
        total_reviews ++;

    }

    public double average_rating(){
        return sum_of_ratings / total_reviews;
    }
}
