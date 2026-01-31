package com.streamapi;
import java.util.*;

class Movie {
    String name;
    int releaseYear;
    int rating;

    Movie(String name, int releaseYear, int rating) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.rating = rating;
    }

    public String toString() {
        return name + " | " + releaseYear + " | " + rating;
    }
}

public class TopTrendingMovies {

    public static void main(String[] args) {

        List<Movie> movieList = Arrays.asList(
                new Movie("Mei hu tera", 2004, 4),
                new Movie("Ek tha tiger", 1998, 3),
                new Movie("ActionHero", 2011, 5),
                new Movie("MotorCycles", 2015, 4)
        );

        movieList.stream()
                .sorted(
                        Comparator.comparingInt((Movie m) -> m.rating)
                                .reversed()
                                .thenComparing(
                                        m -> m.releaseYear,
                                        Comparator.reverseOrder()
                                )
                )
                .limit(5)
                .forEach(System.out::println);
    }
}
