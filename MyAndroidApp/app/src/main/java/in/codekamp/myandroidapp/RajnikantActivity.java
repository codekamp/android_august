package in.codekamp.myandroidapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class RajnikantActivity extends AppCompatActivity {

    private static String EXTRA_MOVIE_ID = "movie_id";
    private static String EXTRA_LANGUAGE = "language";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rajnikant);

        Log.d("CodeKamp", "RajnikantActivity OnCreate called");

        Intent intent = getIntent();

        int movieId = intent.getIntExtra(EXTRA_MOVIE_ID, 0);

        String language = intent.getStringExtra(EXTRA_LANGUAGE);

        Log.d("CodeKamp", "Movie id: " + movieId);
        Log.d("CodeKamp", "language: " + language);



    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("CodeKamp", "RajnikantActivity OnStart called");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d("CodeKamp", "RajnikantActivity OnResume called");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d("CodeKamp", "RajnikantActivity OnPause called");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d("CodeKamp", "RajnikantActivity OnStop called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d("CodeKamp", "RajnikantActivity OnDestroy called");
    }

    public static Intent getNewIntent(Context context, int movieId, String language) {
        Intent showRajniIntent = new Intent(context, RajnikantActivity.class);

        showRajniIntent.putExtra(EXTRA_MOVIE_ID, movieId);
        showRajniIntent.putExtra(EXTRA_LANGUAGE, language);


        return showRajniIntent;
    }
}
