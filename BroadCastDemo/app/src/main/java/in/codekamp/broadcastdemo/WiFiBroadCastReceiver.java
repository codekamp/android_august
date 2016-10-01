package in.codekamp.broadcastdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by cerebro on 29/09/16.
 */

public class WiFiBroadCastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("CodeKamp", "broadCast received");

        boolean state = intent.getBooleanExtra("state", true);
        Log.d("CodeKamp", "state " + state);
    }
}
