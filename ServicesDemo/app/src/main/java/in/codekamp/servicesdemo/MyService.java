package in.codekamp.servicesdemo;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cerebro on 20/09/16.
 */
abstract public class MyService extends Service implements Runnable {

    private Thread intentHandlingThread = null;
    private List<Intent> intentsToBeHandled = new ArrayList<>();

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.d("CodeKamp", "onBind called");
        return this.new MyServiceBinder();
    }

    @Override
    public void onCreate() {
        super.onCreate();

        Log.d("CodeKamp", "onCreate called");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("CodeKamp", "onStartCommand called");



        if(intentHandlingThread == null) {
            intentHandlingThread = new Thread(this);
            intentHandlingThread.start();
        }


        intentsToBeHandled.add(intent);

        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        Log.d("CodeKamp", "onDestroy called");
    }

    public void pause() {

    }

    public void play() {

    }

    @Override
    public void run() {

        while (intentsToBeHandled.size() > 0) {
            Intent currentIntent = intentsToBeHandled.remove(0);

            handleIntent(currentIntent);

        }

        stopSelf();
    }

    public abstract void handleIntent(Intent intent);


    public class MyServiceBinder extends Binder {
        public MyService getService() {
            return MyService.this;
        }
    }
}
