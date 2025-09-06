package com.github.mikephil.charting.listener;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import com.github.mikephil.charting.charts.PieRadarChartBase;
import com.github.mikephil.charting.utils.k;
import java.util.ArrayList;

public class g extends b {
    class a {
        public long a;
        public float b;
        final g c;

        public a(long v, float f) {
            this.a = v;
            this.b = f;
        }
    }

    private com.github.mikephil.charting.utils.g m;
    private float n;
    private ArrayList o;
    private long p;
    private float q;

    public g(PieRadarChartBase pieRadarChartBase0) {
        super(pieRadarChartBase0);
        this.m = com.github.mikephil.charting.utils.g.c(0.0f, 0.0f);
        this.n = 0.0f;
        this.o = new ArrayList();
        this.p = 0L;
        this.q = 0.0f;
    }

    private float h() {
        if(this.o.isEmpty()) {
            return 0.0f;
        }
        int v = 0;
        a g$a0 = (a)this.o.get(0);
        a g$a1 = (a)this.o.get(this.o.size() - 1);
        int v1 = this.o.size() - 1;
        a g$a2 = g$a0;
        while(v1 >= 0) {
            g$a2 = (a)this.o.get(v1);
            if(g$a2.b != g$a1.b) {
                break;
            }
            --v1;
        }
        float f = ((float)(g$a1.a - g$a0.a)) / 1000.0f == 0.0f ? 0.1f : ((float)(g$a1.a - g$a0.a)) / 1000.0f;
        float f1 = g$a1.b;
        float f2 = g$a2.b;
        if(f1 >= f2) {
            v = 1;
        }
        if(((double)Math.abs(f1 - f2)) > 270.0) {
            v ^= 1;
        }
        float f3 = g$a1.b;
        float f4 = g$a0.b;
        if(((double)(f3 - f4)) > 180.0) {
            g$a0.b = (float)(((double)f4) + 360.0);
        }
        else if(((double)(f4 - f3)) > 180.0) {
            g$a1.b = (float)(((double)f3) + 360.0);
        }
        float f5 = Math.abs((g$a1.b - g$a0.b) / f);
        return v == 0 ? -f5 : f5;
    }

    public void i() {
        if(this.q == 0.0f) {
            return;
        }
        long v = AnimationUtils.currentAnimationTimeMillis();
        this.q *= ((PieRadarChartBase)this.e).getDragDecelerationFrictionCoef();
        ((PieRadarChartBase)this.e).setRotationAngle(((PieRadarChartBase)this.e).getRotationAngle() + this.q * (((float)(v - this.p)) / 1000.0f));
        this.p = v;
        if(((double)Math.abs(this.q)) >= 0.001) {
            k.K(this.e);
            return;
        }
        this.m();
    }

    private void j() {
        this.o.clear();
    }

    private void k(float f, float f1) {
        long v = AnimationUtils.currentAnimationTimeMillis();
        this.o.add(new a(this, v, ((PieRadarChartBase)this.e).a0(f, f1)));
        for(int v1 = this.o.size(); v1 - 2 > 0 && v - ((a)this.o.get(0)).a > 1000L; --v1) {
            this.o.remove(0);
        }
    }

    public void l(float f, float f1) {
        this.n = ((PieRadarChartBase)this.e).a0(f, f1) - ((PieRadarChartBase)this.e).getRawRotationAngle();
    }

    public void m() {
        this.q = 0.0f;
    }

    public void n(float f, float f1) {
        ((PieRadarChartBase)this.e).setRotationAngle(((PieRadarChartBase)this.e).a0(f, f1) - this.n);
    }

    @Override  // android.view.GestureDetector$SimpleOnGestureListener
    public void onLongPress(MotionEvent motionEvent0) {
        this.a = com.github.mikephil.charting.listener.b.a.i;
        c c0 = ((PieRadarChartBase)this.e).getOnChartGestureListener();
        if(c0 != null) {
            c0.d(motionEvent0);
        }
    }

    @Override  // android.view.GestureDetector$SimpleOnGestureListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent0) {
        return true;
    }

    @Override  // android.view.GestureDetector$SimpleOnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent0) {
        this.a = com.github.mikephil.charting.listener.b.a.g;
        c c0 = ((PieRadarChartBase)this.e).getOnChartGestureListener();
        if(c0 != null) {
            c0.c(motionEvent0);
        }
        if(!((PieRadarChartBase)this.e).M()) {
            return false;
        }
        this.e(((PieRadarChartBase)this.e).x(motionEvent0.getX(), motionEvent0.getY()), motionEvent0);
        return true;
    }

    @Override  // android.view.View$OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view0, MotionEvent motionEvent0) {
        if(this.d.onTouchEvent(motionEvent0)) {
            return true;
        }
        if(((PieRadarChartBase)this.e).e0()) {
            float f = motionEvent0.getX();
            float f1 = motionEvent0.getY();
            int v = motionEvent0.getAction();
            switch(v) {
                case 0: {
                    this.g(motionEvent0);
                    this.m();
                    this.j();
                    if(((PieRadarChartBase)this.e).I()) {
                        this.k(f, f1);
                    }
                    this.l(f, f1);
                    this.m.c = f;
                    this.m.d = f1;
                    break;
                }
                case 1: {
                    if(((PieRadarChartBase)this.e).I()) {
                        this.m();
                        this.k(f, f1);
                        float f2 = this.h();
                        this.q = f2;
                        if(f2 != 0.0f) {
                            this.p = AnimationUtils.currentAnimationTimeMillis();
                            k.K(this.e);
                        }
                    }
                    ((PieRadarChartBase)this.e).w();
                    this.b = 0;
                    this.b(motionEvent0);
                    return true;
                label_20:
                    if(v == 2) {
                        if(((PieRadarChartBase)this.e).I()) {
                            this.k(f, f1);
                        }
                        if(this.b == 0 && b.a(f, this.m.c, f1, this.m.d) > k.e(8.0f)) {
                            this.a = com.github.mikephil.charting.listener.b.a.f;
                            this.b = 6;
                            ((PieRadarChartBase)this.e).t();
                        }
                        else if(this.b == 6) {
                            this.n(f, f1);
                            ((PieRadarChartBase)this.e).invalidate();
                        }
                        this.b(motionEvent0);
                        return true;
                    }
                    break;
                }
                default: {
                    goto label_20;
                }
            }
        }
        return true;
    }
}

