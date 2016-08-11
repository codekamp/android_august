package in.codekamp.myandroidapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("CodeKamp", "On Create Called");


        if(savedInstanceState == null) {
            Log.d("CodeKamp", "Bundle is null");
        } else {
            Log.d("CodeKamp", "Bundle is not null");
            String stringFromBundle = savedInstanceState.getString("my_random_key");
            Log.d("CodeKamp", "String from bundle is: " + stringFromBundle);
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        Log.d("CodeKamp", "onSaveInstanceState called");

        outState.putString("my_random_key", "my random value");
    }
}
