package in.codekamp.myandroidapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = new Button(this);

        resultTextView = (TextView)findViewById(R.id.result_textview);

        Log.d("CodeKamp", "MainActivity OnCreate Called");




        if(savedInstanceState == null) {
            Log.d("CodeKamp", "Bundle is null");
        } else {
            Log.d("CodeKamp", "Bundle is not null");
            String stringFromBundle = savedInstanceState.getString("my_random_key");
            Log.d("CodeKamp", "String from bundle is: " + stringFromBundle);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("CodeKamp", "MainActivity OnStart called");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d("CodeKamp", "MainActivity OnResume called");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d("CodeKamp", "MainActivity OnPause called");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d("CodeKamp", "MainActivity OnStop called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d("CodeKamp", "MainActivity OnDestroy called");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        Log.d("CodeKamp", "MainActivity onSaveInstanceState called");

        outState.putString("my_random_key", "my random value");
    }

    public void showRajnikant(View view) {


        Intent showRajniIntent = RajnikantActivity.getNewIntent(this, 179, "hindi");
        
        startActivity(showRajniIntent);

    }
}
