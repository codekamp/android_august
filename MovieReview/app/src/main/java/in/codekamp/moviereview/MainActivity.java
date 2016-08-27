package in.codekamp.moviereview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import in.codekamp.moviereview.Model.Movie;
import in.codekamp.moviereview.Service.MovieService;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        MovieService service = new MovieService();
        List<Movie> movies = service.getMovieList();

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.movie_recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MovieListAdapter(this, movies));
    }
}
