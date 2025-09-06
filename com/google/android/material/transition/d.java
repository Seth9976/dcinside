package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public final class d implements w {
    private float a;

    public d() {
        this.a = 1.0f;
    }

    @Override  // com.google.android.material.transition.w
    @Nullable
    public Animator a(@NonNull ViewGroup viewGroup0, @NonNull View view0) {
        if(view0.getAlpha() == 0.0f) {
            return d.c(view0, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f);
        }
        float f = view0.getAlpha();
        return d.c(view0, f, 0.0f, 0.0f, 1.0f, f);
    }

    @Override  // com.google.android.material.transition.w
    @Nullable
    public Animator b(@NonNull ViewGroup viewGroup0, @NonNull View view0) {
        if(view0.getAlpha() == 0.0f) {
            return d.c(view0, 0.0f, 1.0f, 0.0f, this.a, 1.0f);
        }
        float f = view0.getAlpha();
        return d.c(view0, 0.0f, f, 0.0f, this.a, f);
    }

    private static Animator c(View view0, float f, float f1, @FloatRange(from = 0.0, to = 1.0) float f2, @FloatRange(from = 0.0, to = 1.0) float f3, float f4) {
        class a implements ValueAnimator.AnimatorUpdateListener {
            final View a;
            final float b;
            final float c;
            final float d;
            final float e;

            a(View view0, float f, float f1, float f2, float f3) {
                this.b = f;
                this.c = f1;
                this.d = f2;
                this.e = f3;
                super();
            }

            @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator0) {
                float f = (float)(((Float)valueAnimator0.getAnimatedValue()));
                this.a.setAlpha(v.n(this.b, this.c, this.d, this.e, f));
            }
        }


        class b extends AnimatorListenerAdapter {
            final View a;
            final float b;

            b(View view0, float f) {
                this.b = f;
                super();
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                this.a.setAlpha(this.b);
            }
        }

        Animator animator0 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ((ValueAnimator)animator0).addUpdateListener(new a(view0, f, f1, f2, f3));
        animator0.addListener(new b(view0, f4));
        return animator0;
    }

    public float d() {
        return this.a;
    }

    public void e(float f) {
        this.a = f;
    }
}

