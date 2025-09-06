package androidx.media3.exoplayer.video.spherical;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.View;
import androidx.annotation.BinderThread;

final class TouchTracker extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, Listener {
    public interface androidx.media3.exoplayer.video.spherical.TouchTracker.Listener {
        void b(PointF arg1);

        boolean onSingleTapUp(MotionEvent arg1);
    }

    private final PointF a;
    private final PointF b;
    private final androidx.media3.exoplayer.video.spherical.TouchTracker.Listener c;
    private final float d;
    private final GestureDetector e;
    private volatile float f;
    static final float g = 45.0f;

    public TouchTracker(Context context0, androidx.media3.exoplayer.video.spherical.TouchTracker.Listener touchTracker$Listener0, float f) {
        this.a = new PointF();
        this.b = new PointF();
        this.c = touchTracker$Listener0;
        this.d = f;
        this.e = new GestureDetector(context0, this);
        this.f = 3.141593f;
    }

    @Override  // androidx.media3.exoplayer.video.spherical.OrientationListener$Listener
    @BinderThread
    public void a(float[] arr_f, float f) {
        this.f = -f;
    }

    @Override  // android.view.GestureDetector$SimpleOnGestureListener
    public boolean onDown(MotionEvent motionEvent0) {
        float f = motionEvent0.getX();
        float f1 = motionEvent0.getY();
        this.a.set(f, f1);
        return true;
    }

    @Override  // android.view.GestureDetector$SimpleOnGestureListener
    public boolean onScroll(MotionEvent motionEvent0, MotionEvent motionEvent1, float f, float f1) {
        float f2 = (motionEvent1.getX() - this.a.x) / this.d;
        float f3 = (motionEvent1.getY() - this.a.y) / this.d;
        float f4 = motionEvent1.getX();
        float f5 = motionEvent1.getY();
        this.a.set(f4, f5);
        float f6 = (float)Math.cos(this.f);
        float f7 = (float)Math.sin(this.f);
        this.b.x -= f6 * f2 - f7 * f3;
        this.b.y = Math.max(-45.0f, Math.min(45.0f, this.b.y + (f7 * f2 + f6 * f3)));
        this.c.b(this.b);
        return true;
    }

    @Override  // android.view.GestureDetector$SimpleOnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent0) {
        return this.c.onSingleTapUp(motionEvent0);
    }

    @Override  // android.view.View$OnTouchListener
    public boolean onTouch(View view0, MotionEvent motionEvent0) {
        return this.e.onTouchEvent(motionEvent0);
    }
}

