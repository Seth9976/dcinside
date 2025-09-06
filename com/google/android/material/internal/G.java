package com.google.android.material.internal;

import O1.a;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@RestrictTo({Scope.b})
public class g {
    private final View a;
    private final View b;
    private final List c;
    private final List d;
    @Nullable
    private ValueAnimator.AnimatorUpdateListener e;
    private long f;
    private int g;
    private int h;

    public g(@NonNull View view0, @NonNull View view1) {
        this.a = view0;
        this.b = view1;
        this.c = new ArrayList();
        this.d = new ArrayList();
    }

    @a
    @NonNull
    public g c(@NonNull Collection collection0) {
        this.d.addAll(collection0);
        return this;
    }

    @a
    @NonNull
    public g d(@NonNull View[] arr_view) {
        Collections.addAll(this.d, arr_view);
        return this;
    }

    @a
    @NonNull
    public g e(@NonNull AnimatorListenerAdapter animatorListenerAdapter0) {
        this.c.add(animatorListenerAdapter0);
        return this;
    }

    private void f(Animator animator0, List list0) {
        for(Object object0: list0) {
            animator0.addListener(((AnimatorListenerAdapter)object0));
        }
    }

    private AnimatorSet g(boolean z) {
        AnimatorSet animatorSet0 = new AnimatorSet();
        animatorSet0.playTogether(new Animator[]{this.k(z), this.l(z), this.i(z)});
        return animatorSet0;
    }

    @NonNull
    public Animator h() {
        class b extends AnimatorListenerAdapter {
            final g a;

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                g.this.b.setVisibility(8);
            }
        }

        Animator animator0 = this.g(false);
        animator0.addListener(new b(this));
        this.f(animator0, this.c);
        return animator0;
    }

    private Animator i(boolean z) {
        Animator animator0 = ValueAnimator.ofFloat(new float[]{((float)(this.b.getLeft() - this.a.getLeft() + (this.a.getRight() - this.b.getRight()))), 0.0f});
        ((ValueAnimator)animator0).addUpdateListener(r.m(this.d));
        ((ValueAnimator)animator0).setDuration(this.f);
        ((ValueAnimator)animator0).setInterpolator(w.a(z, com.google.android.material.animation.b.b));
        return animator0;
    }

    @NonNull
    public Animator j() {
        class com.google.android.material.internal.g.a extends AnimatorListenerAdapter {
            final g a;

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationStart(Animator animator0) {
                g.this.b.setVisibility(0);
            }
        }

        Animator animator0 = this.g(true);
        animator0.addListener(new com.google.android.material.internal.g.a(this));
        this.f(animator0, this.c);
        return animator0;
    }

    private Animator k(boolean z) {
        Rect rect0 = M.e(this.a, this.g);
        Rect rect1 = M.e(this.b, this.h);
        Rect rect2 = new Rect(rect0);
        Animator animator0 = ValueAnimator.ofObject(new v(rect2), new Object[]{rect0, rect1});
        ((ValueAnimator)animator0).addUpdateListener((ValueAnimator valueAnimator0) -> M.A(this.b, rect2));
        ValueAnimator.AnimatorUpdateListener valueAnimator$AnimatorUpdateListener0 = this.e;
        if(valueAnimator$AnimatorUpdateListener0 != null) {
            ((ValueAnimator)animator0).addUpdateListener(valueAnimator$AnimatorUpdateListener0);
        }
        ((ValueAnimator)animator0).setDuration(this.f);
        ((ValueAnimator)animator0).setInterpolator(w.a(z, com.google.android.material.animation.b.b));
        return animator0;
    }

    private Animator l(boolean z) {
        List list0 = M.k(this.b);
        Animator animator0 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ((ValueAnimator)animator0).addUpdateListener(r.e(list0));
        ((ValueAnimator)animator0).setDuration(this.f);
        ((ValueAnimator)animator0).setInterpolator(w.a(z, com.google.android.material.animation.b.a));
        return animator0;
    }

    // 检测为 Lambda 实现
    private void m(Rect rect0, ValueAnimator valueAnimator0) [...]

    @a
    @NonNull
    public g n(@Nullable ValueAnimator.AnimatorUpdateListener valueAnimator$AnimatorUpdateListener0) {
        this.e = valueAnimator$AnimatorUpdateListener0;
        return this;
    }

    @a
    @NonNull
    public g o(int v) {
        this.g = v;
        return this;
    }

    @a
    @NonNull
    public g p(long v) {
        this.f = v;
        return this;
    }

    @a
    @NonNull
    public g q(int v) {
        this.h = v;
        return this;
    }
}

