package androidx.viewpager2.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;

final class FakeDrag {
    private final ViewPager2 a;
    private final ScrollEventAdapter b;
    private final RecyclerView c;
    private VelocityTracker d;
    private int e;
    private float f;
    private int g;
    private long h;

    FakeDrag(ViewPager2 viewPager20, ScrollEventAdapter scrollEventAdapter0, RecyclerView recyclerView0) {
        this.a = viewPager20;
        this.b = scrollEventAdapter0;
        this.c = recyclerView0;
    }

    private void a(long v, int v1, float f, float f1) {
        MotionEvent motionEvent0 = MotionEvent.obtain(this.h, v, v1, f, f1, 0);
        this.d.addMovement(motionEvent0);
        motionEvent0.recycle();
    }

    @UiThread
    boolean b() {
        if(this.b.g()) {
            return false;
        }
        this.g = 0;
        this.f = 0.0f;
        this.h = SystemClock.uptimeMillis();
        this.c();
        this.b.k();
        if(!this.b.i()) {
            this.c.stopScroll();
        }
        this.a(this.h, 0, 0.0f, 0.0f);
        return true;
    }

    private void c() {
        VelocityTracker velocityTracker0 = this.d;
        if(velocityTracker0 == null) {
            this.d = VelocityTracker.obtain();
            this.e = ViewConfiguration.get(this.a.getContext()).getScaledMaximumFlingVelocity();
            return;
        }
        velocityTracker0.clear();
    }

    @UiThread
    boolean d() {
        if(!this.b.h()) {
            return false;
        }
        this.b.m();
        VelocityTracker velocityTracker0 = this.d;
        velocityTracker0.computeCurrentVelocity(1000, ((float)this.e));
        int v = (int)velocityTracker0.getXVelocity();
        int v1 = (int)velocityTracker0.getYVelocity();
        if(!this.c.fling(v, v1)) {
            this.a.v();
        }
        return true;
    }

    @UiThread
    boolean e(float f) {
        int v = 0;
        if(!this.b.h()) {
            return false;
        }
        float f1 = this.f - f;
        this.f = f1;
        int v1 = Math.round(f1 - ((float)this.g));
        this.g += v1;
        long v2 = SystemClock.uptimeMillis();
        boolean z = this.a.getOrientation() == 0;
        if(!z) {
            v = v1;
        }
        float f2 = z ? this.f : 0.0f;
        float f3 = z ? 0.0f : this.f;
        this.c.scrollBy((z ? v1 : 0), v);
        this.a(v2, 2, f2, f3);
        return true;
    }

    boolean f() {
        return this.b.h();
    }
}

