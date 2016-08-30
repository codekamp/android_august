package in.codekamp.actvityforresultdemo;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_CITY_SELECTION = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void chooseCity(View view) {
        Intent intent = SecondActivity.createNewIntent(this);

        startActivityForResult(intent, REQUEST_CITY_SELECTION);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == REQUEST_CITY_SELECTION) {
            if (resultCode == Activity.RESULT_OK) {
                String city = data.getStringExtra("city");
                Log.d("CodeKamp", "Selected city is: " + city);
            } else if (resultCode == Activity.RESULT_CANCELED) {
                //city not selected.
                Log.d("CodeKamp", "City selection cancelled");
            }
        } else if (requestCode == 11) {

        }

    }
}
