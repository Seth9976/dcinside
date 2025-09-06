package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
public final class s implements x {
    private float a;
    private float b;
    private float c;
    private float d;
    private boolean e;
    private boolean f;

    public s() {
        this(true);
    }

    public s(boolean z) {
        this.a = 1.0f;
        this.b = 1.1f;
        this.c = 0.8f;
        this.d = 1.0f;
        this.f = true;
        this.e = z;
    }

    @Override  // com.google.android.material.transition.platform.x
    @Nullable
    public Animator a(@NonNull ViewGroup viewGroup0, @NonNull View view0) {
        if(!this.f) {
            return null;
        }
        return this.e ? s.c(view0, this.a, this.b) : s.c(view0, this.d, this.c);
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.material.transition.platform.x
    @Nullable
    public Animator b(@NonNull ViewGroup viewGroup0, @NonNull View view0) {
        return this.e ? s.c(view0, this.c, this.d) : s.c(view0, this.b, this.a);
    }

    private static Animator c(View view0, float f, float f1) {
        class a extends AnimatorListenerAdapter {
            final View a;
            final float b;
            final float c;

            a(View view0, float f, float f1) {
                this.b = f;
                this.c = f1;
                super();
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                this.a.setScaleX(this.b);
                this.a.setScaleY(this.c);
            }
        }

        float f2 = view0.getScaleX();
        float f3 = view0.getScaleY();
        Animator animator0 = ObjectAnimator.ofPropertyValuesHolder(view0, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{f2 * f, f2 * f1}), PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{f * f3, f1 * f3})});
        animator0.addListener(new a(view0, f2, f3));
        return animator0;
    }

    public float d() {
        return this.d;
    }

    public float e() {
        return this.c;
    }

    public float f() {
        return this.b;
    }

    public float g() {
        return this.a;
    }

    public boolean h() {
        return this.e;
    }

    public boolean i() {
        return this.f;
    }

    public void j(boolean z) {
        this.e = z;
    }

    public void k(float f) {
        this.d = f;
    }

    public void l(float f) {
        this.c = f;
    }

    public void m(float f) {
        this.b = f;
    }

    public void n(float f) {
        this.a = f;
    }

    public void o(boolean z) {
        this.f = z;
    }
}

