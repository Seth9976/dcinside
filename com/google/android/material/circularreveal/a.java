package com.google.android.material.circularreveal;

import android.animation.Animator.AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewAnimationUtils;
import androidx.annotation.NonNull;

public final class a {
    @NonNull
    public static Animator a(@NonNull c c0, float f, float f1, float f2) {
        e[] arr_c$e = {new e(f, f1, f2)};
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofObject(c0, com.google.android.material.circularreveal.c.c.a, b.b, arr_c$e);
        e c$e0 = c0.getRevealInfo();
        if(c$e0 == null) {
            throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
        }
        Animator animator0 = ViewAnimationUtils.createCircularReveal(((View)c0), ((int)f), ((int)f1), c$e0.c, f2);
        Animator animator1 = new AnimatorSet();
        ((AnimatorSet)animator1).playTogether(new Animator[]{objectAnimator0, animator0});
        return animator1;
    }

    @NonNull
    public static Animator b(c c0, float f, float f1, float f2, float f3) {
        e[] arr_c$e = {new e(f, f1, f2), new e(f, f1, f3)};
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofObject(c0, com.google.android.material.circularreveal.c.c.a, b.b, arr_c$e);
        Animator animator0 = ViewAnimationUtils.createCircularReveal(((View)c0), ((int)f), ((int)f1), f2, f3);
        Animator animator1 = new AnimatorSet();
        ((AnimatorSet)animator1).playTogether(new Animator[]{objectAnimator0, animator0});
        return animator1;
    }

    @NonNull
    public static Animator.AnimatorListener c(@NonNull c c0) {
        class com.google.android.material.circularreveal.a.a extends AnimatorListenerAdapter {
            final c a;

            com.google.android.material.circularreveal.a.a(c c0) {
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                this.a.b();
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationStart(Animator animator0) {
                this.a.e();
            }
        }

        return new com.google.android.material.circularreveal.a.a(c0);
    }
}

