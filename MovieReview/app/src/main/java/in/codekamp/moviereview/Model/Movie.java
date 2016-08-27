package in.codekamp.moviereview.Model;

/**
 * Created by cerebro on 25/08/16.
 */
public class Movie {

    public int id;
    public String name;
    public String director;
    public String language;

    public Movie(int id, String name, String director, String language) {
        this.id = id;
        this.name = name;
        this.director = director;
        this.language = language;
    }
}
