package in.codekamp.moviereview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import in.codekamp.moviereview.Model.Movie;

/**
 * Created by cerebro on 25/08/16.
 */
public class MovieListAdapter extends RecyclerView.Adapter<MovieViewHolder> {

    private List<Movie> movies;
    private Context context;

    public MovieListAdapter(Context context, List<Movie> movies) {
        this.movies = movies;
        this.context = context;
    }


    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(R.layout.movie_row, parent, false);

        return new MovieViewHolder(view, context);
    }

    public void onBindViewHolder(MovieViewHolder holder, int postion) {
        Movie movie = movies.get(postion);
        holder.bindMovie(movie);
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }
}
