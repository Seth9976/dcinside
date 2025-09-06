package com.github.mikephil.charting.jobs;

import android.animation.Animator.AnimatorListener;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import com.github.mikephil.charting.utils.i;
import com.github.mikephil.charting.utils.l;

@SuppressLint({"NewApi"})
public abstract class b extends e implements Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener {
    protected ObjectAnimator i;
    protected float j;
    protected float k;
    protected float l;

    public b(l l0, float f, float f1, i i0, View view0, float f2, float f3, long v) {
        super(l0, f, f1, i0, view0);
        this.k = f2;
        this.l = f3;
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(this, "phase", new float[]{0.0f, 1.0f});
        this.i = objectAnimator0;
        objectAnimator0.setDuration(v);
        this.i.addUpdateListener(this);
        this.i.addListener(this);
    }

    public float d() {
        return this.j;
    }

    public float e() {
        return this.k;
    }

    public float f() {
        return this.l;
    }

    public abstract void g();

    protected void h() {
        this.i.removeAllListeners();
        this.i.removeAllUpdateListeners();
        this.i.reverse();
        this.i.addUpdateListener(this);
        this.i.addListener(this);
    }

    public void i(float f) {
        this.j = f;
    }

    @Override  // android.animation.Animator$AnimatorListener
    public void onAnimationCancel(Animator animator0) {
        try {
            this.g();
        }
        catch(IllegalArgumentException unused_ex) {
        }
    }

    @Override  // android.animation.Animator$AnimatorListener
    public void onAnimationEnd(Animator animator0) {
        try {
            this.g();
        }
        catch(IllegalArgumentException unused_ex) {
        }
    }

    @Override  // android.animation.Animator$AnimatorListener
    public void onAnimationRepeat(Animator animator0) {
    }

    @Override  // android.animation.Animator$AnimatorListener
    public void onAnimationStart(Animator animator0) {
    }

    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator0) {
    }

    @Override
    @SuppressLint({"NewApi"})
    public void run() {
        this.i.start();
    }
}

