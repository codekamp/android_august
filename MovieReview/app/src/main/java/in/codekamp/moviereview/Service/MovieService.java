package in.codekamp.moviereview.Service;

import java.util.ArrayList;
import java.util.List;

import in.codekamp.moviereview.Model.Movie;

/**
 * Created by cerebro on 25/08/16.
 */
public class MovieService {

    public List<Movie> getMovieList() {

        // code to fetch data from server
        // code to convert String to Java List of Movie


        List<Movie> movies = new ArrayList<>();

        movies.add(new Movie(1, "Sholay", "Ramesh Sippy", "Hindi"));
        movies.add(new Movie(2, "Inception", "Christopher Nolen", "English"));

        for(int i = 3; i<=100; i++) {
            movies.add(new Movie(i, "movie " + i, "director " + i, "Hindi"));
        }

        return movies;

    }



}
