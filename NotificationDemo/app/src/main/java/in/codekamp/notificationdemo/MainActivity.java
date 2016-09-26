package in.codekamp.notificationdemo;

import android.app.AlarmManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v4.content.SharedPreferencesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void download(View view) {

        Intent intent1 = new Intent(this, SecondActivity.class);
        PendingIntent pendingIntent1 = PendingIntent.getActivity(this, 11, intent1, PendingIntent.FLAG_ONE_SHOT);

        Intent intent2 = new Intent(this, ThirdActivity.class);
        PendingIntent pendingIntent2 = PendingIntent.getActivity(this, 11, intent2, PendingIntent.FLAG_ONE_SHOT);

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);

        builder.setContentIntent(pendingIntent1);
        builder.setContentTitle("Downloading the video");
        builder.setSmallIcon(R.mipmap.ic_launcher);
        builder.setAutoCancel(true);
//        builder.setOngoing(true);
        builder.addAction(R.mipmap.ic_launcher, "Join Us", pendingIntent2);
        builder.addAction(R.mipmap.ic_launcher, "View", pendingIntent1);

        NotificationCompat.BigTextStyle bigTextStyle = new NotificationCompat.BigTextStyle();
        bigTextStyle.setSummaryText("Hello world! This is some random text This is some random text");
        builder.setStyle(bigTextStyle);

        NotificationManager manager =
                (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

//        for (int i = 0; i <= 10; i++) {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            builder.setContentText(i*10 + "% completed");
//            builder.setProgress(100, i*10, false);
//            manager.notify(10, builder.build());
//        }

        builder.setContentText("Downloadin completed successfully!");
//        builder.setProgress(0,0,false);
//        builder.setOngoing(false);
        manager.notify(10, builder.build());
    }

    public void setAlarm(View view) {
        Intent intent1 = new Intent(this, SecondActivity.class);
        PendingIntent pendingIntent1 = PendingIntent.getActivity(this, 11, intent1, PendingIntent.FLAG_ONE_SHOT);

        AlarmManager manager = (AlarmManager) getSystemService(ALARM_SERVICE);

        manager.setRepeating(AlarmManager.ELAPSED_REALTIME, 5000, 1000, pendingIntent1);
    }

    public void incrementCount(View view) {
         SharedPreferences preferences = getPreferences(Context.MODE_PRIVATE);

        int currentCount = preferences.getInt("alarm_count", 0);

        Log.d("CodeKamp", "Current Count is " + currentCount);

        SharedPreferences.Editor editor = preferences.edit();
        editor.putInt("alarm_count", ++currentCount);
        editor.commit();
    }

    public void printValue(int a) {
        Log.d("CodeKamp", "value is " + a);
    }

    public void trackLocation(View view) {
        // https://developer.android.com/guide/topics/location/strategies.html
    }


}
