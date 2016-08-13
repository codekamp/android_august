package in.codekamp.firstaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button blueButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        blueButton = (Button)findViewById(R.id.my_blue_button);

        blueButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Log.d("CodeKamp", "blue button clicked");
    }
}
