package com.github.mikephil.charting.listener;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.animation.AnimationUtils;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.charts.HorizontalBarChart;
import com.github.mikephil.charting.highlight.d;
import com.github.mikephil.charting.utils.g;
import com.github.mikephil.charting.utils.k;
import com.github.mikephil.charting.utils.l;
import t1.e;

public class a extends b {
    private Matrix m;
    private Matrix n;
    private g o;
    private g p;
    private float q;
    private float r;
    private float s;
    private e t;
    private VelocityTracker u;
    private long v;
    private g w;
    private g x;
    private float y;
    private float z;

    public a(BarLineChartBase barLineChartBase0, Matrix matrix0, float f) {
        super(barLineChartBase0);
        this.m = new Matrix();
        this.n = new Matrix();
        this.o = g.c(0.0f, 0.0f);
        this.p = g.c(0.0f, 0.0f);
        this.q = 1.0f;
        this.r = 1.0f;
        this.s = 1.0f;
        this.v = 0L;
        this.w = g.c(0.0f, 0.0f);
        this.x = g.c(0.0f, 0.0f);
        this.m = matrix0;
        this.y = k.e(f);
        this.z = k.e(3.5f);
    }

    public void h() {
        float f = 0.0f;
        if(this.x.c == 0.0f && this.x.d == 0.0f) {
            return;
        }
        long v = AnimationUtils.currentAnimationTimeMillis();
        this.x.c *= ((BarLineChartBase)this.e).getDragDecelerationFrictionCoef();
        this.x.d *= ((BarLineChartBase)this.e).getDragDecelerationFrictionCoef();
        float f1 = ((float)(v - this.v)) / 1000.0f;
        float f2 = this.w.c + this.x.c * f1;
        this.w.c = f2;
        float f3 = this.w.d + this.x.d * f1;
        this.w.d = f3;
        MotionEvent motionEvent0 = MotionEvent.obtain(v, v, 2, f2, f3, 0);
        float f4 = ((BarLineChartBase)this.e).t0() ? this.w.c - this.o.c : 0.0f;
        if(((BarLineChartBase)this.e).u0()) {
            f = this.w.d - this.o.d;
        }
        this.o(motionEvent0, f4, f);
        motionEvent0.recycle();
        this.m = ((BarLineChartBase)this.e).getViewPortHandler().S(this.m, this.e, false);
        this.v = v;
        if(((double)Math.abs(this.x.c)) < 0.01 && ((double)Math.abs(this.x.d)) < 0.01) {
            ((BarLineChartBase)this.e).p();
            ((BarLineChartBase)this.e).postInvalidate();
            this.u();
            return;
        }
        k.K(this.e);
    }

    public Matrix i() {
        return this.m;
    }

    public g j(float f, float f1) {
        l l0 = ((BarLineChartBase)this.e).getViewPortHandler();
        float f2 = l0.P();
        return this.m() ? g.c(f - f2, -(f1 - l0.R())) : g.c(f - f2, -(((float)((BarLineChartBase)this.e).getMeasuredHeight()) - f1 - l0.O()));
    }

    private static float k(MotionEvent motionEvent0) {
        return Math.abs(motionEvent0.getX(0) - motionEvent0.getX(1));
    }

    private static float l(MotionEvent motionEvent0) {
        return Math.abs(motionEvent0.getY(0) - motionEvent0.getY(1));
    }

    // 去混淆评级： 低(30)
    private boolean m() {
        return this.t == null && ((BarLineChartBase)this.e).o0() || this.t != null && ((BarLineChartBase)this.e).e(this.t.E0());
    }

    private static void n(g g0, MotionEvent motionEvent0) {
        float f = motionEvent0.getX(0);
        float f1 = motionEvent0.getX(1);
        float f2 = motionEvent0.getY(0);
        float f3 = motionEvent0.getY(1);
        g0.c = (f + f1) / 2.0f;
        g0.d = (f2 + f3) / 2.0f;
    }

    private void o(MotionEvent motionEvent0, float f, float f1) {
        this.a = com.github.mikephil.charting.listener.b.a.b;
        this.m.set(this.n);
        c c0 = ((BarLineChartBase)this.e).getOnChartGestureListener();
        if(this.m()) {
            if(this.e instanceof HorizontalBarChart) {
                f = -f;
            }
            else {
                f1 = -f1;
            }
        }
        this.m.postTranslate(f, f1);
        if(c0 != null) {
            c0.e(motionEvent0, f, f1);
        }
    }

    @Override  // android.view.GestureDetector$SimpleOnGestureListener
    public boolean onDoubleTap(MotionEvent motionEvent0) {
        this.a = com.github.mikephil.charting.listener.b.a.h;
        c c0 = ((BarLineChartBase)this.e).getOnChartGestureListener();
        if(c0 != null) {
            c0.h(motionEvent0);
        }
        if(((BarLineChartBase)this.e).r0() && ((com.github.mikephil.charting.data.c)((BarLineChartBase)this.e).getData()).r() > 0) {
            g g0 = this.j(motionEvent0.getX(), motionEvent0.getY());
            Chart chart0 = this.e;
            float f = 1.0f;
            float f1 = ((BarLineChartBase)chart0).A0() ? 1.4f : 1.0f;
            if(((BarLineChartBase)this.e).B0()) {
                f = 1.4f;
            }
            ((BarLineChartBase)chart0).Q0(f1, f, g0.c, g0.d);
            if(((BarLineChartBase)this.e).N()) {
                Log.i("BarlineChartTouch", "Double-Tap, Zooming In, x: " + g0.c + ", y: " + g0.d);
            }
            g.h(g0);
        }
        return super.onDoubleTap(motionEvent0);
    }

    @Override  // android.view.GestureDetector$SimpleOnGestureListener
    public boolean onFling(MotionEvent motionEvent0, MotionEvent motionEvent1, float f, float f1) {
        this.a = com.github.mikephil.charting.listener.b.a.j;
        c c0 = ((BarLineChartBase)this.e).getOnChartGestureListener();
        if(c0 != null) {
            c0.b(motionEvent0, motionEvent1, f, f1);
        }
        return super.onFling(motionEvent0, motionEvent1, f, f1);
    }

    @Override  // android.view.GestureDetector$SimpleOnGestureListener
    public void onLongPress(MotionEvent motionEvent0) {
        this.a = com.github.mikephil.charting.listener.b.a.i;
        c c0 = ((BarLineChartBase)this.e).getOnChartGestureListener();
        if(c0 != null) {
            c0.d(motionEvent0);
        }
    }

    @Override  // android.view.GestureDetector$SimpleOnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent0) {
        this.a = com.github.mikephil.charting.listener.b.a.g;
        c c0 = ((BarLineChartBase)this.e).getOnChartGestureListener();
        if(c0 != null) {
            c0.c(motionEvent0);
        }
        if(!((BarLineChartBase)this.e).M()) {
            return false;
        }
        this.e(((BarLineChartBase)this.e).x(motionEvent0.getX(), motionEvent0.getY()), motionEvent0);
        return super.onSingleTapUp(motionEvent0);
    }

    @Override  // android.view.View$OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view0, MotionEvent motionEvent0) {
        if(this.u == null) {
            this.u = VelocityTracker.obtain();
        }
        this.u.addMovement(motionEvent0);
        int v = 3;
        if(motionEvent0.getActionMasked() == 3) {
            VelocityTracker velocityTracker0 = this.u;
            if(velocityTracker0 != null) {
                velocityTracker0.recycle();
                this.u = null;
            }
        }
        if(this.b == 0) {
            this.d.onTouchEvent(motionEvent0);
        }
        if(!((BarLineChartBase)this.e).s0() && !((BarLineChartBase)this.e).A0() && !((BarLineChartBase)this.e).B0()) {
            return true;
        }
        int v1 = motionEvent0.getAction();
        if((v1 & 0xFF) == 0) {
            this.g(motionEvent0);
            this.u();
            this.r(motionEvent0);
        }
        else {
            switch(v1 & 0xFF) {
                case 1: {
                    VelocityTracker velocityTracker1 = this.u;
                    int v2 = motionEvent0.getPointerId(0);
                    velocityTracker1.computeCurrentVelocity(1000, 8000.0f);
                    float f = velocityTracker1.getYVelocity(v2);
                    float f1 = velocityTracker1.getXVelocity(v2);
                    if((Math.abs(f1) > 50.0f || Math.abs(f) > 50.0f) && this.b == 1 && ((BarLineChartBase)this.e).I()) {
                        this.u();
                        this.v = AnimationUtils.currentAnimationTimeMillis();
                        g g0 = this.w;
                        g0.c = motionEvent0.getX();
                        g g1 = this.w;
                        g1.d = motionEvent0.getY();
                        this.x.c = f1;
                        this.x.d = f;
                        k.K(this.e);
                    }
                    if(this.b == 2 || this.b == 3 || this.b == 4 || this.b == 5) {
                        ((BarLineChartBase)this.e).p();
                        ((BarLineChartBase)this.e).postInvalidate();
                    }
                    this.b = 0;
                    ((BarLineChartBase)this.e).w();
                    VelocityTracker velocityTracker2 = this.u;
                    if(velocityTracker2 != null) {
                        velocityTracker2.recycle();
                        this.u = null;
                    }
                    this.b(motionEvent0);
                    break;
                }
                case 2: {
                    int v3 = this.b;
                    if(v3 == 1) {
                        ((BarLineChartBase)this.e).t();
                        float f2 = 0.0f;
                        float f3 = ((BarLineChartBase)this.e).t0() ? motionEvent0.getX() - this.o.c : 0.0f;
                        if(((BarLineChartBase)this.e).u0()) {
                            f2 = motionEvent0.getY() - this.o.d;
                        }
                        this.o(motionEvent0, f3, f2);
                    }
                    else if(v3 == 2 || v3 == 3 || v3 == 4) {
                        ((BarLineChartBase)this.e).t();
                        if(((BarLineChartBase)this.e).A0() || ((BarLineChartBase)this.e).B0()) {
                            this.q(motionEvent0);
                        }
                    }
                    else if(v3 == 0 && Math.abs(b.a(motionEvent0.getX(), this.o.c, motionEvent0.getY(), this.o.d)) > this.y && ((BarLineChartBase)this.e).s0()) {
                        if(!((BarLineChartBase)this.e).w0() || !((BarLineChartBase)this.e).n0()) {
                            float f4 = Math.abs(motionEvent0.getX() - this.o.c);
                            float f5 = Math.abs(motionEvent0.getY() - this.o.d);
                            if((((BarLineChartBase)this.e).t0() || f5 >= f4) && (((BarLineChartBase)this.e).u0() || f5 <= f4)) {
                                this.a = com.github.mikephil.charting.listener.b.a.b;
                                this.b = 1;
                            }
                        }
                        else if(((BarLineChartBase)this.e).x0()) {
                            this.a = com.github.mikephil.charting.listener.b.a.b;
                            if(((BarLineChartBase)this.e).x0()) {
                                this.p(motionEvent0);
                            }
                        }
                    }
                    break;
                }
                case 3: {
                    this.b = 0;
                    this.b(motionEvent0);
                    break;
                }
                case 5: {
                    if(motionEvent0.getPointerCount() >= 2) {
                        ((BarLineChartBase)this.e).t();
                        this.r(motionEvent0);
                        this.q = a.k(motionEvent0);
                        this.r = a.l(motionEvent0);
                        float f6 = a.t(motionEvent0);
                        this.s = f6;
                        if(f6 > 10.0f) {
                            if(((BarLineChartBase)this.e).z0()) {
                                this.b = 4;
                            }
                            else {
                                if(((BarLineChartBase)this.e).A0() == ((BarLineChartBase)this.e).B0()) {
                                    if(this.q > this.r) {
                                        v = 2;
                                    }
                                }
                                else if(((BarLineChartBase)this.e).A0()) {
                                    v = 2;
                                }
                                this.b = v;
                            }
                        }
                        a.n(this.p, motionEvent0);
                    }
                    break;
                }
                default: {
                    if((v1 & 0xFF) == 6) {
                        k.M(motionEvent0, this.u);
                        this.b = 5;
                    }
                }
            }
        }
        this.m = ((BarLineChartBase)this.e).getViewPortHandler().S(this.m, this.e, true);
        return true;
    }

    private void p(MotionEvent motionEvent0) {
        d d0 = ((BarLineChartBase)this.e).x(motionEvent0.getX(), motionEvent0.getY());
        if(d0 != null && !d0.a(this.c)) {
            this.c = d0;
            ((BarLineChartBase)this.e).F(d0, true);
        }
    }

    private void q(MotionEvent motionEvent0) {
        boolean z1;
        if(motionEvent0.getPointerCount() >= 2) {
            c c0 = ((BarLineChartBase)this.e).getOnChartGestureListener();
            float f = a.t(motionEvent0);
            if(f > this.z) {
                g g0 = this.j(this.p.c, this.p.d);
                l l0 = ((BarLineChartBase)this.e).getViewPortHandler();
                int v = this.b;
                boolean z = false;
                float f1 = 1.0f;
                if(v == 4) {
                    this.a = com.github.mikephil.charting.listener.b.a.e;
                    float f2 = f / this.s;
                    if(f2 < 1.0f) {
                        z = true;
                        z1 = l0.c();
                    }
                    else {
                        z1 = l0.a();
                    }
                    boolean z2 = z ? l0.d() : l0.b();
                    float f3 = ((BarLineChartBase)this.e).A0() ? f2 : 1.0f;
                    if(((BarLineChartBase)this.e).B0()) {
                        f1 = f2;
                    }
                    if(z2 || z1) {
                        this.m.set(this.n);
                        this.m.postScale(f3, f1, g0.c, g0.d);
                        if(c0 != null) {
                            c0.g(motionEvent0, f3, f1);
                        }
                    }
                }
                else if(v == 2 && ((BarLineChartBase)this.e).A0()) {
                    this.a = com.github.mikephil.charting.listener.b.a.c;
                    float f4 = a.k(motionEvent0) / this.q;
                    if((f4 < 1.0f ? l0.c() : l0.a())) {
                        this.m.set(this.n);
                        this.m.postScale(f4, 1.0f, g0.c, g0.d);
                        if(c0 != null) {
                            c0.g(motionEvent0, f4, 1.0f);
                        }
                    }
                }
                else if(this.b == 3 && ((BarLineChartBase)this.e).B0()) {
                    this.a = com.github.mikephil.charting.listener.b.a.d;
                    float f5 = a.l(motionEvent0) / this.r;
                    if((f5 < 1.0f ? l0.d() : l0.b())) {
                        this.m.set(this.n);
                        this.m.postScale(1.0f, f5, g0.c, g0.d);
                        if(c0 != null) {
                            c0.g(motionEvent0, 1.0f, f5);
                        }
                    }
                }
                g.h(g0);
            }
        }
    }

    private void r(MotionEvent motionEvent0) {
        this.n.set(this.m);
        g g0 = this.o;
        g0.c = motionEvent0.getX();
        g g1 = this.o;
        g1.d = motionEvent0.getY();
        this.t = ((BarLineChartBase)this.e).h0(motionEvent0.getX(), motionEvent0.getY());
    }

    public void s(float f) {
        this.y = k.e(f);
    }

    private static float t(MotionEvent motionEvent0) {
        float f = motionEvent0.getX(0);
        float f1 = motionEvent0.getX(1);
        float f2 = motionEvent0.getY(0);
        float f3 = motionEvent0.getY(1);
        return (float)Math.sqrt((f - f1) * (f - f1) + (f2 - f3) * (f2 - f3));
    }

    public void u() {
        this.x.c = 0.0f;
        this.x.d = 0.0f;
    }
}

