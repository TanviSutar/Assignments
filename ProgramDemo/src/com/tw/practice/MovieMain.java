package com.tw.practice;

class Movie {
    private final String title;
    private final String studio;
    private final String ratings;

    Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.ratings = rating;
    }

    Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.ratings = "PG";
    }

    String getRatings() {
        return ratings;
    }

    public String toString(){
        return title;
    }

    static Movie[] getPg(Movie[] movies) {
        Movie[] moviesWithRatingPG = new Movie[movies.length];
        int sizePGMovies = 0;
        for (Movie movie : movies) {
            if (movie.getRatings().equals("PG")) {
                moviesWithRatingPG[sizePGMovies++] = movie;
            }
        }
        return moviesWithRatingPG;
    }
}

public class MovieMain {

    public static void main(String[] args) {

        Movie movie1 = new Movie("Casino Royale", "Eon Productions", "PG-13");
        Movie movie2 = new Movie("Eternals", "Marvel");
        Movie movie3 = new Movie("The Incredibles", "Pixar Animation Studio");
        Movie movie4 = new Movie("Mulan", "Disney Studios", "PG-10");

        Movie[] movieArray = {movie1, movie2, movie3, movie4};
        Movie[] pgMovies = Movie.getPg(movieArray);

        System.out.println("Movies with rating PG: ");
        for (Movie movie : pgMovies) {
            if (movie != null) {
                System.out.println(movie);
            }
        }
    }
}
