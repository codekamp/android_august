package in.codekamp.splashandgesture;

import android.content.Context;
import android.support.v4.view.GestureDetectorCompat;
import android.util.Log;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;

/**
 * Created by cerebro on 03/10/16.
 */

public class CodeKampGestrueDetector implements GestureDetector.OnGestureListener {

    private onGestureListner listner;
    private GestureDetectorCompat gestureDetector;

    public CodeKampGestrueDetector(Context context, onGestureListner listner) {
        this.listner = listner;
        gestureDetector = new GestureDetectorCompat(context, this);
    }

    public boolean onTouchEvent(MotionEvent event) {
        return gestureDetector.onTouchEvent(event);
    }

    @Override
    public boolean onDown(MotionEvent e) {
        return true;
    }

    @Override
    public void onShowPress(MotionEvent e) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        return true;
    }

    @Override
    public void onLongPress(MotionEvent e) {

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        float deltaX = e2.getX() - e1.getX();
        float deltaY = e2.getY() - e1.getY();
        float deltaXAbs = Math.abs(deltaX);
        float deltaYAbs = Math.abs(deltaY);

        if((deltaXAbs > 100 && deltaYAbs > 100) || (deltaXAbs < 100 && deltaYAbs < 100)) {
            return true;
        }

        if(deltaX > 100) {
            listner.onRightSwipe();
        } else if (deltaX < -100) {
            listner.onLeftSwipe();
        } else if (deltaY > 100) {
            listner.onDownSwipe();
        } else if (deltaY < -100 ) {
            listner.onUpSwipe();
        }

        return true;
    }

    public interface onGestureListner {
        public void onRightSwipe();
        public void onLeftSwipe();
        public void onUpSwipe();
        public void onDownSwipe();
    }
}
