package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback;

final class e extends i {
    class c extends Property {
        c(Class class0, String s) {
            super(class0, s);
        }

        public Float a(e e0) {
            return e0.q();
        }

        public void b(e e0, Float float0) {
            e0.h(((float)float0));
        }

        @Override  // android.util.Property
        public Object get(Object object0) {
            return this.a(((e)object0));
        }

        @Override  // android.util.Property
        public void set(Object object0, Object object1) {
            this.b(((e)object0), ((Float)object1));
        }
    }

    class d extends Property {
        d(Class class0, String s) {
            super(class0, s);
        }

        public Float a(e e0) {
            return e0.r();
        }

        public void b(e e0, Float float0) {
            e0.u(((float)float0));
        }

        @Override  // android.util.Property
        public Object get(Object object0) {
            return this.a(((e)object0));
        }

        @Override  // android.util.Property
        public void set(Object object0, Object object1) {
            this.b(((e)object0), ((Float)object1));
        }
    }

    private ObjectAnimator c;
    private ObjectAnimator d;
    private final FastOutSlowInInterpolator e;
    private final com.google.android.material.progressindicator.c f;
    private int g;
    private float h;
    private float i;
    AnimationCallback j;
    private static final int k = 4;
    private static final int l = 5400;
    private static final int m = 667;
    private static final int n = 667;
    private static final int o = 333;
    private static final int p = 333;
    private static final int[] q = null;
    private static final int[] r = null;
    private static final int[] s = null;
    private static final int t = -20;
    private static final int u = 0xFA;
    private static final int v = 0x5F0;
    private static final Property w;
    private static final Property x;

    static {
        e.q = new int[]{0, 1350, 2700, 4050};
        e.r = new int[]{667, 2017, 0xD27, 4717};
        e.s = new int[]{1000, 2350, 3700, 5050};
        e.w = new c(Float.class, "animationFraction");
        e.x = new d(Float.class, "completeEndFraction");
    }

    public e(@NonNull CircularProgressIndicatorSpec circularProgressIndicatorSpec0) {
        super(1);
        this.g = 0;
        this.j = null;
        this.f = circularProgressIndicatorSpec0;
        this.e = new FastOutSlowInInterpolator();
    }

    @Override  // com.google.android.material.progressindicator.i
    void a() {
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
    public void d(@NonNull AnimationCallback animatable2Compat$AnimationCallback0) {
        this.j = animatable2Compat$AnimationCallback0;
    }

    @Override  // com.google.android.material.progressindicator.i
    void f() {
        if(this.d != null && !this.d.isRunning()) {
            if(this.a.isVisible()) {
                this.d.start();
                return;
            }
            this.a();
        }
    }

    @Override  // com.google.android.material.progressindicator.i
    @VisibleForTesting
    void g() {
        this.g = 0;
        a h$a0 = (a)this.b.get(0);
        h$a0.c = this.f.c[0];
        this.i = 0.0f;
    }

    @Override  // com.google.android.material.progressindicator.i
    @VisibleForTesting
    void h(float f) {
        this.h = f;
        this.v(((int)(f * 5400.0f)));
        this.t(((int)(f * 5400.0f)));
        this.a.invalidateSelf();
    }

    @Override  // com.google.android.material.progressindicator.i
    void i() {
        this.s();
        this.g();
        this.c.start();
    }

    @Override  // com.google.android.material.progressindicator.i
    public void j() {
        this.j = null;
    }

    private float q() {
        return this.h;
    }

    private float r() {
        return this.i;
    }

    private void s() {
        class com.google.android.material.progressindicator.e.a extends AnimatorListenerAdapter {
            final e a;

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationRepeat(Animator animator0) {
                super.onAnimationRepeat(animator0);
                e.this.g = (e.this.g + 4) % e.this.f.c.length;
            }
        }


        class b extends AnimatorListenerAdapter {
            final e a;

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                super.onAnimationEnd(animator0);
                e.this.a();
                e e0 = e.this;
                AnimationCallback animatable2Compat$AnimationCallback0 = e0.j;
                if(animatable2Compat$AnimationCallback0 != null) {
                    animatable2Compat$AnimationCallback0.b(e0.a);
                }
            }
        }

        if(this.c == null) {
            ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(this, e.w, new float[]{0.0f, 1.0f});
            this.c = objectAnimator0;
            objectAnimator0.setDuration(5400L);
            this.c.setInterpolator(null);
            this.c.setRepeatCount(-1);
            this.c.addListener(new com.google.android.material.progressindicator.e.a(this));
        }
        if(this.d == null) {
            ObjectAnimator objectAnimator1 = ObjectAnimator.ofFloat(this, e.x, new float[]{0.0f, 1.0f});
            this.d = objectAnimator1;
            objectAnimator1.setDuration(333L);
            this.d.setInterpolator(this.e);
            this.d.addListener(new b(this));
        }
    }

    private void t(int v) {
        for(int v1 = 0; v1 < 4; ++v1) {
            float f = this.b(v, e.s[v1], 333);
            if(f >= 0.0f && f <= 1.0f) {
                int[] arr_v = this.f.c;
                int v2 = (v1 + this.g) % arr_v.length;
                int v3 = arr_v[v2];
                int v4 = arr_v[(v2 + 1) % arr_v.length];
                ((a)this.b.get(0)).c = (int)com.google.android.material.animation.d.b().a(this.e.getInterpolation(f), v3, v4);
                return;
            }
        }
    }

    private void u(float f) {
        this.i = f;
    }

    private void v(int v) {
        a h$a0 = (a)this.b.get(0);
        h$a0.a = this.h * 1520.0f - 20.0f;
        h$a0.b = this.h * 1520.0f;
        for(int v1 = 0; v1 < 4; ++v1) {
            h$a0.b += this.e.getInterpolation(this.b(v, e.q[v1], 667)) * 250.0f;
            h$a0.a += this.e.getInterpolation(this.b(v, e.r[v1], 667)) * 250.0f;
        }
        h$a0.a = (h$a0.a + (h$a0.b - h$a0.a) * this.i) / 360.0f;
        h$a0.b /= 360.0f;
    }
}

