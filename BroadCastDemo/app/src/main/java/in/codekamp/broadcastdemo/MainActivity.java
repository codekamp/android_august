package in.codekamp.broadcastdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import in.codekamp.broadcastdemo.Events.LoginStatusChangedEvent;

public class MainActivity extends AppCompatActivity {

    private Button sendMessageButton;
    private WifiBroadCastReceiver mReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mReceiver = new WifiBroadCastReceiver();
        IntentFilter filter = new IntentFilter();
        filter.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED);

        registerReceiver(mReceiver, filter);

        unregisterReceiver(mReceiver);

        EventBus.getDefault().register(this);

        EventBus bus = new EventBus();
        EventBus.getDefault().post(new LoginStatusChangedEvent(true, new User("ramesh", "ramesh@gmail.com")));

    }

    public class WifiBroadCastReceiver extends BroadcastReceiver {

        @Override
        public void onReceive(Context context, Intent intent) {
            MainActivity.this.sendMessageButton.setEnabled(false);
        }
    }

    @Subscribe
    public void abcd(LoginStatusChangedEvent event) {
        event.getUser();
        event.isLoggedIn();
    }


}
