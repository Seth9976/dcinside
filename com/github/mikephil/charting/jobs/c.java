package com.github.mikephil.charting.jobs;

import android.animation.Animator.AnimatorListener;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.components.k;
import com.github.mikephil.charting.utils.h.a;
import com.github.mikephil.charting.utils.h;
import com.github.mikephil.charting.utils.i;
import com.github.mikephil.charting.utils.l;

@SuppressLint({"NewApi"})
public class c extends b implements Animator.AnimatorListener {
    protected float m;
    protected float n;
    protected float o;
    protected float p;
    protected k q;
    protected float r;
    protected Matrix s;
    private static h t;

    static {
        c.t = h.a(8, new c(null, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L));
    }

    @SuppressLint({"NewApi"})
    public c(l l0, View view0, i i0, k k0, float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8, long v) {
        super(l0, f1, f2, i0, view0, f3, f4, v);
        this.s = new Matrix();
        this.o = f5;
        this.p = f6;
        this.m = f7;
        this.n = f8;
        this.i.addListener(this);
        this.q = k0;
        this.r = f;
    }

    @Override  // com.github.mikephil.charting.utils.h$a
    protected a a() {
        return new c(null, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    @Override  // com.github.mikephil.charting.jobs.b
    public void g() {
    }

    public static c j(l l0, View view0, i i0, k k0, float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8, long v) {
        c c0 = (c)c.t.b();
        c0.d = l0;
        c0.e = f1;
        c0.f = f2;
        c0.g = i0;
        c0.h = view0;
        c0.k = f3;
        c0.l = f4;
        c0.q = k0;
        c0.r = f;
        c0.h();
        c0.i.setDuration(v);
        return c0;
    }

    @Override  // com.github.mikephil.charting.jobs.b, android.animation.Animator$AnimatorListener
    public void onAnimationCancel(Animator animator0) {
    }

    @Override  // com.github.mikephil.charting.jobs.b, android.animation.Animator$AnimatorListener
    public void onAnimationEnd(Animator animator0) {
        ((BarLineChartBase)this.h).p();
        this.h.postInvalidate();
    }

    @Override  // com.github.mikephil.charting.jobs.b, android.animation.Animator$AnimatorListener
    public void onAnimationRepeat(Animator animator0) {
    }

    @Override  // com.github.mikephil.charting.jobs.b, android.animation.Animator$AnimatorListener
    public void onAnimationStart(Animator animator0) {
    }

    @Override  // com.github.mikephil.charting.jobs.b
    public void onAnimationUpdate(ValueAnimator valueAnimator0) {
        Matrix matrix0 = this.s;
        this.d.g0(this.k + (this.e - this.k) * this.j, this.l + (this.f - this.l) * this.j, matrix0);
        this.d.S(matrix0, this.h, false);
        float f = this.q.I;
        float f1 = this.d.x();
        float[] arr_f = this.c;
        float f2 = this.j;
        arr_f[0] = this.m + (this.o - this.r / this.d.w() / 2.0f - this.m) * f2;
        arr_f[1] = this.n + (this.p + f / f1 / 2.0f - this.n) * f2;
        this.g.o(arr_f);
        this.d.i0(this.c, matrix0);
        this.d.S(matrix0, this.h, true);
    }
}

