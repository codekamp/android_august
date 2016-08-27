package in.codekamp.moviereview;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import in.codekamp.moviereview.Model.Movie;

/**
 * Created by cerebro on 25/08/16.
 */
public class MovieViewHolder extends RecyclerView.ViewHolder {

    private Movie movie;
    private Context context;
    private TextView titleTextView;
    private TextView directorTextView;

    public MovieViewHolder(View itemView, final Context context) {
        super(itemView);

        this.context = context;

        titleTextView = (TextView)itemView.findViewById(R.id.title_textview);
        directorTextView = (TextView)itemView.findViewById(R.id.director_textview);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("CodeKamp", "movie clicked: " + MovieViewHolder.this.movie.name);
                view.setBackgroundColor(Color.parseColor("#ff0000"));

                Intent intent = MovieDetailActivity.createNewIntent(MovieViewHolder.this.context, movie.id);
                context.startActivity(intent);
            }
        });

        directorTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("CodeKamp", "Director clicked: " + MovieViewHolder.this.movie.director);
            }
        });
    }

    public void bindMovie(Movie movie) {
        this.movie = movie;

        titleTextView.setText(movie.name);
        directorTextView.setText(movie.director);
    }
}
