package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.animation.b;
import java.util.ArrayList;
import java.util.List;

abstract class g extends Drawable implements Animatable2Compat {
    class c extends Property {
        c(Class class0, String s) {
            super(class0, s);
        }

        public Float a(g g0) {
            return g0.k();
        }

        public void b(g g0, Float float0) {
            g0.q(((float)float0));
        }

        @Override  // android.util.Property
        public Object get(Object object0) {
            return this.a(((g)object0));
        }

        @Override  // android.util.Property
        public void set(Object object0, Object object1) {
            this.b(((g)object0), ((Float)object1));
        }
    }

    final Context a;
    final com.google.android.material.progressindicator.c b;
    a c;
    private ValueAnimator d;
    private ValueAnimator e;
    private boolean f;
    private boolean g;
    private float h;
    private List i;
    private AnimationCallback j;
    private boolean k;
    private float l;
    final Paint m;
    @IntRange(from = 0L, to = 0xFFL)
    private int n;
    private static final boolean o = false;
    private static final int p = 500;
    private static final Property q;

    static {
        g.q = new c(Float.class, "growFraction");
    }

    g(@NonNull Context context0, @NonNull com.google.android.material.progressindicator.c c0) {
        this.m = new Paint();
        this.a = context0;
        this.b = c0;
        this.c = new a();
        this.setAlpha(0xFF);
    }

    @Override  // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public boolean b(@NonNull AnimationCallback animatable2Compat$AnimationCallback0) {
        if(this.i != null && this.i.contains(animatable2Compat$AnimationCallback0)) {
            this.i.remove(animatable2Compat$AnimationCallback0);
            if(this.i.isEmpty()) {
                this.i = null;
            }
            return true;
        }
        return false;
    }

    @Override  // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void d(@NonNull AnimationCallback animatable2Compat$AnimationCallback0) {
        if(this.i == null) {
            this.i = new ArrayList();
        }
        if(!this.i.contains(animatable2Compat$AnimationCallback0)) {
            this.i.add(animatable2Compat$AnimationCallback0);
        }
    }

    @Override  // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void e() {
        this.i.clear();
        this.i = null;
    }

    private void g(@NonNull ValueAnimator[] arr_valueAnimator) {
        boolean z = this.k;
        this.k = true;
        for(int v = 0; v < arr_valueAnimator.length; ++v) {
            arr_valueAnimator[v].cancel();
        }
        this.k = z;
    }

    @Override  // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.n;
    }

    @Override  // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    private void h() {
        AnimationCallback animatable2Compat$AnimationCallback0 = this.j;
        if(animatable2Compat$AnimationCallback0 != null) {
            animatable2Compat$AnimationCallback0.b(this);
        }
        List list0 = this.i;
        if(list0 != null && !this.k) {
            for(Object object0: list0) {
                ((AnimationCallback)object0).b(this);
            }
        }
    }

    private void i() {
        AnimationCallback animatable2Compat$AnimationCallback0 = this.j;
        if(animatable2Compat$AnimationCallback0 != null) {
            animatable2Compat$AnimationCallback0.c(this);
        }
        List list0 = this.i;
        if(list0 != null && !this.k) {
            for(Object object0: list0) {
                ((AnimationCallback)object0).c(this);
            }
        }
    }

    // 去混淆评级： 低(20)
    @Override  // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.o() || this.n();
    }

    private void j(@NonNull ValueAnimator[] arr_valueAnimator) {
        boolean z = this.k;
        this.k = true;
        for(int v = 0; v < arr_valueAnimator.length; ++v) {
            arr_valueAnimator[v].end();
        }
        this.k = z;
    }

    float k() {
        if(!this.b.b() && !this.b.a()) {
            return 1.0f;
        }
        return this.g || this.f ? this.h : this.l;
    }

    @NonNull
    ValueAnimator l() {
        return this.e;
    }

    public boolean m() {
        return this.w(false, false, false);
    }

    // 去混淆评级： 低(30)
    public boolean n() {
        return this.e != null && this.e.isRunning() || this.g;
    }

    // 去混淆评级： 低(30)
    public boolean o() {
        return this.d != null && this.d.isRunning() || this.f;
    }

    private void p() {
        if(this.d == null) {
            ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(this, g.q, new float[]{0.0f, 1.0f});
            this.d = objectAnimator0;
            objectAnimator0.setDuration(500L);
            this.d.setInterpolator(b.b);
            this.v(this.d);
        }
        if(this.e == null) {
            ObjectAnimator objectAnimator1 = ObjectAnimator.ofFloat(this, g.q, new float[]{1.0f, 0.0f});
            this.e = objectAnimator1;
            objectAnimator1.setDuration(500L);
            this.e.setInterpolator(b.b);
            this.r(this.e);
        }
    }

    void q(@FloatRange(from = 0.0, to = 1.0) float f) {
        if(this.l != f) {
            this.l = f;
            this.invalidateSelf();
        }
    }

    private void r(@NonNull ValueAnimator valueAnimator0) {
        class com.google.android.material.progressindicator.g.b extends AnimatorListenerAdapter {
            final g a;

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                super.onAnimationEnd(animator0);
                g.this.super.setVisible(false, false);
                g.this.h();
            }
        }

        if(this.e != null && this.e.isRunning()) {
            throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
        }
        this.e = valueAnimator0;
        valueAnimator0.addListener(new com.google.android.material.progressindicator.g.b(this));
    }

    void s(@NonNull AnimationCallback animatable2Compat$AnimationCallback0) {
        this.j = animatable2Compat$AnimationCallback0;
    }

    @Override  // android.graphics.drawable.Drawable
    public void setAlpha(@IntRange(from = 0L, to = 0xFFL) int v) {
        this.n = v;
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter0) {
        this.m.setColorFilter(colorFilter0);
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z1) {
        return this.w(z, z1, true);
    }

    @Override  // android.graphics.drawable.Animatable
    public void start() {
        this.x(true, true, false);
    }

    @Override  // android.graphics.drawable.Animatable
    public void stop() {
        this.x(false, true, false);
    }

    @VisibleForTesting
    void t(boolean z, @FloatRange(from = 0.0, to = 1.0) float f) {
        this.g = z;
        this.h = f;
    }

    @VisibleForTesting
    void u(boolean z, @FloatRange(from = 0.0, to = 1.0) float f) {
        this.f = z;
        this.h = f;
    }

    private void v(@NonNull ValueAnimator valueAnimator0) {
        class com.google.android.material.progressindicator.g.a extends AnimatorListenerAdapter {
            final g a;

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationStart(Animator animator0) {
                super.onAnimationStart(animator0);
                g.this.i();
            }
        }

        if(this.d != null && this.d.isRunning()) {
            throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
        }
        this.d = valueAnimator0;
        valueAnimator0.addListener(new com.google.android.material.progressindicator.g.a(this));
    }

    public boolean w(boolean z, boolean z1, boolean z2) {
        return !z2 || this.c.a(this.a.getContentResolver()) <= 0.0f ? this.x(z, z1, false) : this.x(z, z1, true);
    }

    boolean x(boolean z, boolean z1, boolean z2) {
        this.p();
        if(!this.isVisible() && !z) {
            return false;
        }
        ValueAnimator valueAnimator0 = z ? this.d : this.e;
        ValueAnimator valueAnimator1 = z ? this.e : this.d;
        if(!z2) {
            if(valueAnimator1.isRunning()) {
                this.g(new ValueAnimator[]{valueAnimator1});
            }
            if(valueAnimator0.isRunning()) {
                valueAnimator0.end();
                return super.setVisible(z, false);
            }
            this.j(new ValueAnimator[]{valueAnimator0});
            return super.setVisible(z, false);
        }
        if(valueAnimator0.isRunning()) {
            return false;
        }
        boolean z3 = !z || super.setVisible(true, false);
        if(!(z ? this.b.b() : this.b.a())) {
            this.j(new ValueAnimator[]{valueAnimator0});
            return z3;
        }
        if(!z1 && valueAnimator0.isPaused()) {
            valueAnimator0.resume();
            return z3;
        }
        valueAnimator0.start();
        return z3;
    }
}

