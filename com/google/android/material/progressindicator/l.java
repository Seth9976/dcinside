package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback;

final class l extends i {
    class b extends Property {
        b(Class class0, String s) {
            super(class0, s);
        }

        public Float a(l l0) {
            return l0.p();
        }

        public void b(l l0, Float float0) {
            l0.h(((float)float0));
        }

        @Override  // android.util.Property
        public Object get(Object object0) {
            return this.a(((l)object0));
        }

        @Override  // android.util.Property
        public void set(Object object0, Object object1) {
            this.b(((l)object0), ((Float)object1));
        }
    }

    private ObjectAnimator c;
    private FastOutSlowInInterpolator d;
    private final c e;
    private int f;
    private boolean g;
    private float h;
    private static final int i = 667;
    private static final int j = 333;
    private static final Property k;

    static {
        l.k = new b(Float.class, "animationFraction");
    }

    public l(@NonNull LinearProgressIndicatorSpec linearProgressIndicatorSpec0) {
        super(3);
        this.f = 1;
        this.e = linearProgressIndicatorSpec0;
        this.d = new FastOutSlowInInterpolator();
    }

    @Override  // com.google.android.material.progressindicator.i
    public void a() {
        ObjectAnimator objectAnimator0 = this.c;
        if(objectAnimator0 != null) {
            objectAnimator0.cancel();
        }
    }

    @Override  // com.google.android.material.progressindicator.i
    public void c() {
        this.g();
    }

    @Override  // com.google.android.material.progressindicator.i
    public void d(@Nullable AnimationCallback animatable2Compat$AnimationCallback0) {
    }

    @Override  // com.google.android.material.progressindicator.i
    public void f() {
    }

    @Override  // com.google.android.material.progressindicator.i
    @VisibleForTesting
    void g() {
        this.g = true;
        this.f = 1;
        for(Object object0: this.b) {
            ((a)object0).c = this.e.c[0];
            ((a)object0).d = this.e.g / 2;
        }
    }

    @Override  // com.google.android.material.progressindicator.i
    @VisibleForTesting
    void h(float f) {
        this.h = f;
        this.s(((int)(f * 333.0f)));
        this.r();
        this.a.invalidateSelf();
    }

    @Override  // com.google.android.material.progressindicator.i
    public void i() {
        this.q();
        this.g();
        this.c.start();
    }

    @Override  // com.google.android.material.progressindicator.i
    public void j() {
    }

    private float p() {
        return this.h;
    }

    private void q() {
        class com.google.android.material.progressindicator.l.a extends AnimatorListenerAdapter {
            final l a;

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationRepeat(Animator animator0) {
                super.onAnimationRepeat(animator0);
                l.this.f = (l.this.f + 1) % l.this.e.c.length;
                l.this.g = true;
            }
        }

        if(this.c == null) {
            ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(this, l.k, new float[]{0.0f, 1.0f});
            this.c = objectAnimator0;
            objectAnimator0.setDuration(333L);
            this.c.setInterpolator(null);
            this.c.setRepeatCount(-1);
            this.c.addListener(new com.google.android.material.progressindicator.l.a(this));
        }
    }

    private void r() {
        if(this.g && ((a)this.b.get(1)).b < 1.0f) {
            a h$a0 = (a)this.b.get(2);
            h$a0.c = ((a)this.b.get(1)).c;
            a h$a1 = (a)this.b.get(1);
            h$a1.c = ((a)this.b.get(0)).c;
            a h$a2 = (a)this.b.get(0);
            h$a2.c = this.e.c[this.f];
            this.g = false;
        }
    }

    private void s(int v) {
        ((a)this.b.get(0)).a = 0.0f;
        a h$a0 = (a)this.b.get(0);
        a h$a1 = (a)this.b.get(1);
        float f = this.d.getInterpolation(((float)v) / 667.0f);
        h$a1.a = f;
        h$a0.b = f;
        a h$a2 = (a)this.b.get(1);
        a h$a3 = (a)this.b.get(2);
        float f1 = this.d.getInterpolation(((float)v) / 667.0f + 0.49925f);
        h$a3.a = f1;
        h$a2.b = f1;
        ((a)this.b.get(2)).b = 1.0f;
    }
}

