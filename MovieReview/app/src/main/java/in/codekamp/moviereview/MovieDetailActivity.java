package in.codekamp.moviereview;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import in.codekamp.moviereview.Model.Movie;

public class MovieDetailActivity extends AppCompatActivity {

    private static final String EXTRA_MOVIE_ID = "movie_id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);

        Intent intent = getIntent();
        int movieId = intent.getIntExtra(EXTRA_MOVIE_ID, -1);

        Log.d("CodeKamp", "Movie id passed is " + movieId);
    }

    public static Intent createNewIntent(Context context, int movieId) {
        Intent intent = new Intent(context, MovieDetailActivity.class);
        intent.putExtra(EXTRA_MOVIE_ID, movieId);

        return intent;
    }
}
