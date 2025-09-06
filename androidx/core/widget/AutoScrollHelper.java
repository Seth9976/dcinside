package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.view.ViewCompat;

public abstract class AutoScrollHelper implements View.OnTouchListener {
    static class ClampedScroller {
        private int a;
        private int b;
        private float c;
        private float d;
        private long e;
        private long f;
        private int g;
        private int h;
        private long i;
        private float j;
        private int k;

        ClampedScroller() {
            this.e = 0x8000000000000000L;
            this.i = -1L;
            this.f = 0L;
            this.g = 0;
            this.h = 0;
        }

        public void a() {
            if(this.f == 0L) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long v = AnimationUtils.currentAnimationTimeMillis();
            float f = this.g(this.e(v));
            long v1 = v - this.f;
            this.f = v;
            float f1 = ((float)v1) * f;
            this.g = (int)(this.c * f1);
            this.h = (int)(f1 * this.d);
        }

        public int b() {
            return this.g;
        }

        public int c() {
            return this.h;
        }

        public int d() {
            return (int)(this.c / Math.abs(this.c));
        }

        private float e(long v) {
            long v1 = this.e;
            if(v < v1) {
                return 0.0f;
            }
            return this.i < 0L || v < this.i ? AutoScrollHelper.e(((float)(v - v1)) / ((float)this.a), 0.0f, 1.0f) * 0.5f : 1.0f - this.j + this.j * AutoScrollHelper.e(((float)(v - this.i)) / ((float)this.k), 0.0f, 1.0f);
        }

        public int f() {
            return (int)(this.d / Math.abs(this.d));
        }

        private float g(float f) {
            return -4.0f * f * f + f * 4.0f;
        }

        public boolean h() {
            return this.i > 0L && AnimationUtils.currentAnimationTimeMillis() > this.i + ((long)this.k);
        }

        public void i() {
            long v = AnimationUtils.currentAnimationTimeMillis();
            this.k = AutoScrollHelper.f(((int)(v - this.e)), 0, this.b);
            this.j = this.e(v);
            this.i = v;
        }

        public void j(int v) {
            this.b = v;
        }

        public void k(int v) {
            this.a = v;
        }

        public void l(float f, float f1) {
            this.c = f;
            this.d = f1;
        }

        public void m() {
            long v = AnimationUtils.currentAnimationTimeMillis();
            this.e = v;
            this.i = -1L;
            this.f = v;
            this.j = 0.5f;
            this.g = 0;
            this.h = 0;
        }
    }

    class ScrollAnimationRunnable implements Runnable {
        final AutoScrollHelper a;

        @Override
        public void run() {
            AutoScrollHelper autoScrollHelper0 = AutoScrollHelper.this;
            if(!autoScrollHelper0.o) {
                return;
            }
            if(autoScrollHelper0.m) {
                autoScrollHelper0.m = false;
                autoScrollHelper0.a.m();
            }
            ClampedScroller autoScrollHelper$ClampedScroller0 = AutoScrollHelper.this.a;
            if(!autoScrollHelper$ClampedScroller0.h() && AutoScrollHelper.this.x()) {
                AutoScrollHelper autoScrollHelper1 = AutoScrollHelper.this;
                if(autoScrollHelper1.n) {
                    autoScrollHelper1.n = false;
                    autoScrollHelper1.c();
                }
                autoScrollHelper$ClampedScroller0.a();
                AutoScrollHelper.this.l(autoScrollHelper$ClampedScroller0.b(), autoScrollHelper$ClampedScroller0.c());
                ViewCompat.x1(AutoScrollHelper.this.c, this);
                return;
            }
            AutoScrollHelper.this.o = false;
        }
    }

    private static final int A = 315;
    private static final int B = 0x627;
    private static final float C = 3.402823E+38f;
    private static final float D = 0.2f;
    private static final float E = 1.0f;
    private static final int F = 0;
    private static final int G = 500;
    private static final int H = 500;
    final ClampedScroller a;
    private final Interpolator b;
    final View c;
    private Runnable d;
    private float[] e;
    private float[] f;
    private int g;
    private int h;
    private float[] i;
    private float[] j;
    private float[] k;
    private boolean l;
    boolean m;
    boolean n;
    boolean o;
    private boolean p;
    private boolean q;
    public static final float r = 0.0f;
    public static final float s = 3.402823E+38f;
    public static final float t = 0.0f;
    public static final int u = 0;
    public static final int v = 1;
    public static final int w = 2;
    private static final int x = 0;
    private static final int y = 1;
    private static final int z = 1;

    static {
        AutoScrollHelper.F = 100;
    }

    public AutoScrollHelper(View view0) {
        this.a = new ClampedScroller();
        this.b = new AccelerateInterpolator();
        this.e = new float[]{0.0f, 0.0f};
        this.f = new float[]{3.402823E+38f, 3.402823E+38f};
        this.i = new float[]{0.0f, 0.0f};
        this.j = new float[]{0.0f, 0.0f};
        this.k = new float[]{3.402823E+38f, 3.402823E+38f};
        this.c = view0;
        DisplayMetrics displayMetrics0 = Resources.getSystem().getDisplayMetrics();
        int v = (int)(displayMetrics0.density * 315.0f + 0.5f);
        float f = (float)(((int)(1575.0f * displayMetrics0.density + 0.5f)));
        this.r(f, f);
        this.s(((float)v), ((float)v));
        this.n(1);
        this.q(3.402823E+38f, 3.402823E+38f);
        this.v(0.2f, 0.2f);
        this.w(1.0f, 1.0f);
        this.m(AutoScrollHelper.F);
        this.u(500);
        this.t(500);
    }

    public abstract boolean a(int arg1);

    public abstract boolean b(int arg1);

    void c() {
        long v = SystemClock.uptimeMillis();
        MotionEvent motionEvent0 = MotionEvent.obtain(v, v, 3, 0.0f, 0.0f, 0);
        this.c.onTouchEvent(motionEvent0);
        motionEvent0.recycle();
    }

    private float d(int v, float f, float f1, float f2) {
        float f3 = this.h(this.e[v], f1, this.f[v], f);
        int v1 = Float.compare(f3, 0.0f);
        if(v1 == 0) {
            return 0.0f;
        }
        float f4 = this.i[v];
        float f5 = this.j[v];
        float f6 = this.k[v];
        float f7 = f4 * f2;
        return v1 <= 0 ? -AutoScrollHelper.e(-f3 * f7, f5, f6) : AutoScrollHelper.e(f3 * f7, f5, f6);
    }

    static float e(float f, float f1, float f2) {
        if(f > f2) {
            return f2;
        }
        return f < f1 ? f1 : f;
    }

    static int f(int v, int v1, int v2) {
        if(v > v2) {
            return v2;
        }
        return v >= v1 ? v : v1;
    }

    private float g(float f, float f1) {
        if(f1 == 0.0f) {
            return 0.0f;
        }
        int v = this.g;
        if(v != 0 && v != 1) {
            return v != 2 || f >= 0.0f ? 0.0f : f / -f1;
        }
        if(f < f1) {
            if(f >= 0.0f) {
                return 1.0f - f / f1;
            }
            return !this.o || v != 1 ? 0.0f : 1.0f;
        }
        return 0.0f;
    }

    private float h(float f, float f1, float f2, float f3) {
        float f4 = AutoScrollHelper.e(f * f1, 0.0f, f2);
        float f5 = this.g(f1 - f3, f4) - this.g(f3, f4);
        if(f5 < 0.0f) {
            return AutoScrollHelper.e(-this.b.getInterpolation(-f5), -1.0f, 1.0f);
        }
        return f5 > 0.0f ? AutoScrollHelper.e(this.b.getInterpolation(f5), -1.0f, 1.0f) : 0.0f;
    }

    public boolean i() {
        return this.p;
    }

    public boolean j() {
        return this.q;
    }

    private void k() {
        if(this.m) {
            this.o = false;
            return;
        }
        this.a.i();
    }

    public abstract void l(int arg1, int arg2);

    public AutoScrollHelper m(int v) {
        this.h = v;
        return this;
    }

    public AutoScrollHelper n(int v) {
        this.g = v;
        return this;
    }

    public AutoScrollHelper o(boolean z) {
        if(this.p && !z) {
            this.k();
        }
        this.p = z;
        return this;
    }

    @Override  // android.view.View$OnTouchListener
    public boolean onTouch(View view0, MotionEvent motionEvent0) {
        if(!this.p) {
            return false;
        }
        switch(motionEvent0.getActionMasked()) {
            case 0: {
                this.n = true;
                this.l = false;
                break;
            }
            case 2: {
                break;
            }
            case 1: 
            case 3: {
                this.k();
                return this.q && this.o;
            }
            default: {
                return this.q && this.o;
            }
        }
        float f = this.d(0, motionEvent0.getX(), ((float)view0.getWidth()), ((float)this.c.getWidth()));
        float f1 = this.d(1, motionEvent0.getY(), ((float)view0.getHeight()), ((float)this.c.getHeight()));
        this.a.l(f, f1);
        if(!this.o && this.x()) {
            this.y();
        }
        return this.q && this.o;
    }

    public AutoScrollHelper p(boolean z) {
        this.q = z;
        return this;
    }

    public AutoScrollHelper q(float f, float f1) {
        float[] arr_f = this.f;
        arr_f[0] = f;
        arr_f[1] = f1;
        return this;
    }

    public AutoScrollHelper r(float f, float f1) {
        float[] arr_f = this.k;
        arr_f[0] = f / 1000.0f;
        arr_f[1] = f1 / 1000.0f;
        return this;
    }

    public AutoScrollHelper s(float f, float f1) {
        float[] arr_f = this.j;
        arr_f[0] = f / 1000.0f;
        arr_f[1] = f1 / 1000.0f;
        return this;
    }

    public AutoScrollHelper t(int v) {
        this.a.j(v);
        return this;
    }

    public AutoScrollHelper u(int v) {
        this.a.k(v);
        return this;
    }

    public AutoScrollHelper v(float f, float f1) {
        float[] arr_f = this.e;
        arr_f[0] = f;
        arr_f[1] = f1;
        return this;
    }

    public AutoScrollHelper w(float f, float f1) {
        float[] arr_f = this.i;
        arr_f[0] = f / 1000.0f;
        arr_f[1] = f1 / 1000.0f;
        return this;
    }

    boolean x() {
        int v = this.a.f();
        int v1 = this.a.d();
        return v != 0 && this.b(v) || v1 != 0 && this.a(v1);
    }

    private void y() {
        if(this.d == null) {
            this.d = new ScrollAnimationRunnable(this);
        }
        this.o = true;
        this.m = true;
        if(this.l) {
            this.d.run();
        }
        else {
            int v = this.h;
            if(v > 0) {
                ViewCompat.y1(this.c, this.d, ((long)v));
            }
            else {
                this.d.run();
            }
        }
        this.l = true;
    }
}

