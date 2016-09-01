package in.codekamp.fragmentdemo;



import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState == null) {

            LoginFragment fragment = new LoginFragment();



            FragmentManager manager = this.getSupportFragmentManager();

            FragmentTransaction transaction1 = manager.beginTransaction();
            transaction1.add(R.id.fragment_container, fragment, "login_fragment");
            transaction1.commit();



        }
    }
}
