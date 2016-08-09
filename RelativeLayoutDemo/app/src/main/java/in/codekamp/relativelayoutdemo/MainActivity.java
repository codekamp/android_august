package in.codekamp.relativelayoutdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button loginButton;
    private EditText usernameEditText;
    private EditText passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton = (Button) findViewById(R.id.login_button);
        usernameEditText = (EditText)findViewById(R.id.username_edittext);
        passwordEditText = (EditText)findViewById(R.id.password_edittext);

        loginButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Log.d("CodeKamp", "button click detected");

        String username = usernameEditText.getText().toString();
        String password = passwordEditText.getText().toString();

        Log.d("CodeKamp", "Username is " + username);
        Log.d("CodeKamp", "Password is " + password);
    }
}
