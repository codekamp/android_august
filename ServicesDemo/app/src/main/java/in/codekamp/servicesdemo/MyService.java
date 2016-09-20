package in.codekamp.servicesdemo;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by cerebro on 20/09/16.
 */
public class MyService extends Service {

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


    public class MyServiceBinder extends Binder {
        public MyService getService() {
            return MyService.this;
        }
    }
}
