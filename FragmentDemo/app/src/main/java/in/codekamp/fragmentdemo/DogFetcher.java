package in.codekamp.fragmentdemo;

import android.content.Intent;
import android.os.AsyncTask;
import android.util.Log;

/**
 * Created by cerebro on 03/09/16.
 */
public class DogFetcher extends AsyncTask<Integer, Void, Dog[]> {
    @Override
    protected Dog[] doInBackground(Integer... userIds) {
        Log.d("CodeKamp", "second user id" + userIds[1]);
        return new Dog[0];
    }

    @Override
    protected void onPostExecute(Dog[] dogs) {
        super.onPostExecute(dogs);
    }
}
