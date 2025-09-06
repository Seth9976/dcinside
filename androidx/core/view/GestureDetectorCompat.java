package androidx.core.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.GestureDetector;
import android.view.MotionEvent;

@Deprecated
public final class GestureDetectorCompat {
    private final GestureDetector a;

    public GestureDetectorCompat(Context context0, GestureDetector.OnGestureListener gestureDetector$OnGestureListener0) {
        this(context0, gestureDetector$OnGestureListener0, null);
    }

    public GestureDetectorCompat(Context context0, GestureDetector.OnGestureListener gestureDetector$OnGestureListener0, Handler handler0) {
        this.a = new GestureDetector(context0, gestureDetector$OnGestureListener0, handler0);
    }

    public boolean a() {
        return this.a.isLongpressEnabled();
    }

    public boolean b(MotionEvent motionEvent0) {
        return this.a.onTouchEvent(motionEvent0);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void c(boolean z) {
        this.a.setIsLongpressEnabled(z);
    }

    public void d(GestureDetector.OnDoubleTapListener gestureDetector$OnDoubleTapListener0) {
        this.a.setOnDoubleTapListener(gestureDetector$OnDoubleTapListener0);
    }
}

