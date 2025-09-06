package com.github.mikephil.charting.animation;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import androidx.annotation.RequiresApi;

public class a {
    private ValueAnimator.AnimatorUpdateListener a;
    protected float b;
    protected float c;

    public a() {
        this.b = 1.0f;
        this.c = 1.0f;
    }

    @RequiresApi(11)
    public a(ValueAnimator.AnimatorUpdateListener valueAnimator$AnimatorUpdateListener0) {
        this.b = 1.0f;
        this.c = 1.0f;
        this.a = valueAnimator$AnimatorUpdateListener0;
    }

    @RequiresApi(11)
    public void a(int v) {
        this.b(v, b.b);
    }

    @RequiresApi(11)
    public void b(int v, C b$C0) {
        ObjectAnimator objectAnimator0 = this.l(v, b$C0);
        objectAnimator0.addUpdateListener(this.a);
        objectAnimator0.start();
    }

    @RequiresApi(11)
    public void c(int v, int v1) {
        this.e(v, v1, b.b, b.b);
    }

    @RequiresApi(11)
    public void d(int v, int v1, C b$C0) {
        ObjectAnimator objectAnimator0 = this.l(v, b$C0);
        ObjectAnimator objectAnimator1 = this.m(v1, b$C0);
        if(v > v1) {
            objectAnimator0.addUpdateListener(this.a);
        }
        else {
            objectAnimator1.addUpdateListener(this.a);
        }
        objectAnimator0.start();
        objectAnimator1.start();
    }

    @RequiresApi(11)
    public void e(int v, int v1, C b$C0, C b$C1) {
        ObjectAnimator objectAnimator0 = this.l(v, b$C0);
        ObjectAnimator objectAnimator1 = this.m(v1, b$C1);
        if(v > v1) {
            objectAnimator0.addUpdateListener(this.a);
        }
        else {
            objectAnimator1.addUpdateListener(this.a);
        }
        objectAnimator0.start();
        objectAnimator1.start();
    }

    @RequiresApi(11)
    public void f(int v) {
        this.g(v, b.b);
    }

    @RequiresApi(11)
    public void g(int v, C b$C0) {
        ObjectAnimator objectAnimator0 = this.m(v, b$C0);
        objectAnimator0.addUpdateListener(this.a);
        objectAnimator0.start();
    }

    public float h() {
        return this.c;
    }

    public float i() {
        return this.b;
    }

    public void j(float f) {
        if(f > 1.0f) {
            f = 1.0f;
        }
        else if(f < 0.0f) {
            f = 0.0f;
        }
        this.c = f;
    }

    public void k(float f) {
        if(f > 1.0f) {
            f = 1.0f;
        }
        else if(f < 0.0f) {
            f = 0.0f;
        }
        this.b = f;
    }

    @RequiresApi(11)
    private ObjectAnimator l(int v, C b$C0) {
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(this, "phaseX", new float[]{0.0f, 1.0f});
        objectAnimator0.setInterpolator(b$C0);
        objectAnimator0.setDuration(((long)v));
        return objectAnimator0;
    }

    @RequiresApi(11)
    private ObjectAnimator m(int v, C b$C0) {
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(this, "phaseY", new float[]{0.0f, 1.0f});
        objectAnimator0.setInterpolator(b$C0);
        objectAnimator0.setDuration(((long)v));
        return objectAnimator0;
    }
}

