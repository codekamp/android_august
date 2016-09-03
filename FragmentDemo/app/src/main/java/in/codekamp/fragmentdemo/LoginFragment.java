package in.codekamp.fragmentdemo;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class LoginFragment extends Fragment {

    private static final String ARG_STATE = "state";
    public LoginFragmentListner listner;

    public LoginFragment() {}

    private String state;

    public static LoginFragment newInstance(String state) {
        LoginFragment fragment = new LoginFragment();

        Bundle args = new Bundle();
        args.putString(ARG_STATE, state);
        fragment.setArguments(args);

        return fragment;
    }

    private EditText usernameEditText;
    private EditText passwordEditText;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle arguments = getArguments();
        if (arguments != null) {
            state = arguments.getString(ARG_STATE);
        }
    }

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

                if(listner != null) {
                    listner.userLoggedIn(10);
                }
            }
        });


        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        if (context instanceof LoginFragmentListner) {
            listner = (LoginFragmentListner) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement LoginFragmentListner");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        listner = null;
    }

    public interface LoginFragmentListner {
        public void userLoggedIn(int userId);
    }
}
