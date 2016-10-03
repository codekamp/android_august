package in.codekamp.splashandgesture;

import android.support.v4.view.GestureDetectorCompat;
import android.support.v4.view.MotionEventCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity implements CodeKampGestrueDetector.onGestureListner, View.OnTouchListener {

    private View demoView;
    private CodeKampGestrueDetector mGestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        demoView = findViewById(R.id.demo_view);

        mGestureDetector = new CodeKampGestrueDetector(this, this);
        demoView.setOnTouchListener(this);

    }

    @Override
    public void onRightSwipe() {
        Log.d("CodeKamp", "Right swipe detected");
    }

    @Override
    public void onLeftSwipe() {
        Log.d("CodeKamp", "Left swipe detected");
    }

    @Override
    public void onUpSwipe() {
        Log.d("CodeKamp", "Up swipe detected");
    }

    @Override
    public void onDownSwipe() {
        Log.d("CodeKamp", "Down swipe detected");
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return mGestureDetector.onTouchEvent(event);
    }
}
