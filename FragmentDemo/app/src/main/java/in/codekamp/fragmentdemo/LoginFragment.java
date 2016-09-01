package in.codekamp.fragmentdemo;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class LoginFragment extends Fragment {

    public LoginFragment() {}

    private String state;

    public LoginFragment(String state) {
        this.state = state;
    }

    private EditText usernameEditText;
    private EditText passwordEditText;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_login, container, false);

        usernameEditText = (EditText)view.findViewById(R.id.username_field);
        passwordEditText = (EditText)view.findViewById(R.id.password_field);
        TextView stateTextView = (TextView)view.findViewById(R.id.state);

        stateTextView.setText(state);

        Button button = (Button)view.findViewById(R.id.login);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                // userService.login(username, password);

                Log.d("CodeKamp", "Username: " + username);
                Log.d("CodeKamp", "Password: " + password);
            }
        });


        return view;
    }
}
