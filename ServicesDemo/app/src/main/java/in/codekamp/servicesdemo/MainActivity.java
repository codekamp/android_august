package in.codekamp.servicesdemo;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements ServiceConnection {

    private MyService mService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void download(View view) {
        Intent intent = new Intent(this, MyService.class);

        bindService(intent, this, Context.BIND_AUTO_CREATE);
    }

    public void stopDownload(View view) {
        Intent intent = new Intent(this, MyService.class);

        stopService(intent);

        unbindService(this);
    }

    @Override
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if(componentName.getShortClassName() == "MyService") {
            mService = ((MyService.MyServiceBinder) iBinder).getService();
        } else {

        }
    }

    @Override
    public void onServiceDisconnected(ComponentName componentName) {

    }
}
