package in.codekamp.fragmentdemo;

import android.os.AsyncTask;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cerebro on 03/09/16.
 */
public class ListFetcher extends AsyncTask<String, Integer, List<String>> {
    @Override
    protected List<String> doInBackground(String... strings) {

        Log.d("CodeKamp", "Async task exectued with " + strings[0]);

        for (int i = 0; i< 100; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Log.d("CodeKamp", "a " + i);

            this.publishProgress(10, 20, 50);
        }

        List<String> restaurantList = new ArrayList();
        restaurantList.add("Desi Vibes");
        restaurantList.add("Lord of Drinks");
        restaurantList.add("Parikrama");


        return restaurantList;
    }

    @Override
    protected void onPostExecute(List<String> restaurants) {
        super.onPostExecute(restaurants);

        Log.d("CodeKamp", restaurants.get(1));
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);


    }
}
