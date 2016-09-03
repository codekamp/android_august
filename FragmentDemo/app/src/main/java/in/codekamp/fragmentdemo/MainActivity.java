package in.codekamp.fragmentdemo;



import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.FrameLayout;


public class MainActivity extends AppCompatActivity implements LoginFragment.LoginFragmentListner {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState == null) {

            LoginFragment fragment = LoginFragment.newInstance("UP");


            FragmentManager manager = this.getSupportFragmentManager();

            FragmentTransaction transaction1 = manager.beginTransaction();
            transaction1.add(R.id.fragment_container, fragment, "login_fragment");
            transaction1.commit();
        }
    }


    public void userLoggedIn(int userId) {
        Log.d("CodeKamp", "Activity notified about login of " + userId);

        ListFetcher fetcher = new ListFetcher();

        fetcher.execute("Ghaziabad", "Meerut");

        DogFetcher fetcher1 = new DogFetcher();
        fetcher1.execute(10, 20, 15);

//        for (int i = 0; i< 100; i++) {
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            Log.d("CodeKamp", "b " + i);
//        }
    }
}
