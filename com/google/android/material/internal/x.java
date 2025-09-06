package com.google.android.material.internal;

import android.animation.Animator.AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;

@RestrictTo({Scope.b})
public final class x {
    class a extends AnimatorListenerAdapter {
        final x a;

        @Override  // android.animation.AnimatorListenerAdapter
        public void onAnimationEnd(Animator animator0) {
            x x0 = x.this;
            if(x0.c == animator0) {
                x0.c = null;
            }
        }
    }

    static class b {
        final int[] a;
        final ValueAnimator b;

        b(int[] arr_v, ValueAnimator valueAnimator0) {
            this.a = arr_v;
            this.b = valueAnimator0;
        }
    }

    private final ArrayList a;
    @Nullable
    private b b;
    @Nullable
    ValueAnimator c;
    private final Animator.AnimatorListener d;

    public x() {
        this.a = new ArrayList();
        this.b = null;
        this.c = null;
        this.d = new a(this);
    }

    public void a(int[] arr_v, ValueAnimator valueAnimator0) {
        b x$b0 = new b(arr_v, valueAnimator0);
        valueAnimator0.addListener(this.d);
        this.a.add(x$b0);
    }

    private void b() {
        ValueAnimator valueAnimator0 = this.c;
        if(valueAnimator0 != null) {
            valueAnimator0.cancel();
            this.c = null;
        }
    }

    public void c() {
        ValueAnimator valueAnimator0 = this.c;
        if(valueAnimator0 != null) {
            valueAnimator0.end();
            this.c = null;
        }
    }

    public void d(int[] arr_v) {
        b x$b0;
        int v = this.a.size();
        for(int v1 = 0; true; ++v1) {
            x$b0 = null;
            if(v1 >= v) {
                break;
            }
            b x$b1 = (b)this.a.get(v1);
            if(StateSet.stateSetMatches(x$b1.a, arr_v)) {
                x$b0 = x$b1;
                break;
            }
        }
        b x$b2 = this.b;
        if(x$b0 == x$b2) {
            return;
        }
        if(x$b2 != null) {
            this.b();
        }
        this.b = x$b0;
        if(x$b0 != null) {
            this.e(x$b0);
        }
    }

    private void e(@NonNull b x$b0) {
        this.c = x$b0.b;
        x$b0.b.start();
    }
}

