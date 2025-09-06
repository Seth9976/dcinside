package com.github.mikephil.charting.listener;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.highlight.d;

public abstract class b extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener {
    public static enum a {
        NONE,
        DRAG,
        X_ZOOM,
        Y_ZOOM,
        PINCH_ZOOM,
        ROTATE,
        SINGLE_TAP,
        DOUBLE_TAP,
        LONG_PRESS,
        FLING;

    }

    protected a a;
    protected int b;
    protected d c;
    protected GestureDetector d;
    protected Chart e;
    protected static final int f = 0;
    protected static final int g = 1;
    protected static final int h = 2;
    protected static final int i = 3;
    protected static final int j = 4;
    protected static final int k = 5;
    protected static final int l = 6;

    public b(Chart chart0) {
        this.a = a.a;
        this.b = 0;
        this.e = chart0;
        this.d = new GestureDetector(chart0.getContext(), this);
    }

    protected static float a(float f, float f1, float f2, float f3) {
        return (float)Math.sqrt((f - f1) * (f - f1) + (f2 - f3) * (f2 - f3));
    }

    public void b(MotionEvent motionEvent0) {
        c c0 = this.e.getOnChartGestureListener();
        if(c0 != null) {
            c0.f(motionEvent0, this.a);
        }
    }

    public a c() {
        return this.a;
    }

    public int d() {
        return this.b;
    }

    protected void e(d d0, MotionEvent motionEvent0) {
        if(d0 != null && !d0.a(this.c)) {
            this.e.F(d0, true);
            this.c = d0;
            return;
        }
        this.e.F(null, true);
        this.c = null;
    }

    public void f(d d0) {
        this.c = d0;
    }

    public void g(MotionEvent motionEvent0) {
        c c0 = this.e.getOnChartGestureListener();
        if(c0 != null) {
            c0.a(motionEvent0, this.a);
        }
    }
}

