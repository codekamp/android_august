package in.codekamp.fragmentdemo;



import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.FrameLayout;

import java.util.List;


public class MainActivity extends AppCompatActivity implements LoginFragment.LoginFragmentListner, ListFetcher.ListFetcherListner {

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



        ListFetcher fetcher = new ListFetcher(this);

        fetcher.execute("87f83ca8aa474c398a3cc1ab26723991-us11");
    }

    @Override
    public void listFetched(List<MailChimpList> list) {
        //
    }
}
