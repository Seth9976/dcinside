package com.google.android.material.progressindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.math.MathUtils;
import androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationEndListener;
import androidx.dynamicanimation.animation.FloatPropertyCompat;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback;

public final class f extends g {
    class a extends FloatPropertyCompat {
        a(String s) {
        }

        @Override  // androidx.dynamicanimation.animation.FloatPropertyCompat
        public float b(Object object0) {
            return this.d(((f)object0));
        }

        @Override  // androidx.dynamicanimation.animation.FloatPropertyCompat
        public void c(Object object0, float f) {
            this.e(((f)object0), f);
        }

        public float d(f f0) {
            return f0.G() * 10000.0f;
        }

        public void e(f f0, float f1) {
            f0.J(f1 / 10000.0f);
        }
    }

    private h r;
    private final SpringForce s;
    private final SpringAnimation t;
    private final com.google.android.material.progressindicator.h.a u;
    private boolean v;
    private static final int w = 10000;
    private static final float x = 50.0f;
    static final float y = 0.01f;
    private static final FloatPropertyCompat z;

    static {
        f.z = new a("indicatorLevel");
    }

    f(@NonNull Context context0, @NonNull c c0, @NonNull h h0) {
        super(context0, c0);
        this.v = false;
        this.I(h0);
        this.u = new com.google.android.material.progressindicator.h.a();
        SpringForce springForce0 = new SpringForce();
        this.s = springForce0;
        springForce0.g(1.0f);
        springForce0.i(50.0f);
        SpringAnimation springAnimation0 = new SpringAnimation(this, f.z);
        this.t = springAnimation0;
        springAnimation0.D(springForce0);
        this.q(1.0f);
    }

    public void A(@NonNull OnAnimationEndListener dynamicAnimation$OnAnimationEndListener0) {
        this.t.b(dynamicAnimation$OnAnimationEndListener0);
    }

    @NonNull
    public static f B(@NonNull Context context0, @NonNull CircularProgressIndicatorSpec circularProgressIndicatorSpec0) {
        return f.C(context0, circularProgressIndicatorSpec0, new d(circularProgressIndicatorSpec0));
    }

    @NonNull
    static f C(@NonNull Context context0, @NonNull CircularProgressIndicatorSpec circularProgressIndicatorSpec0, @NonNull d d0) {
        return new f(context0, circularProgressIndicatorSpec0, d0);
    }

    @NonNull
    public static f D(@NonNull Context context0, @NonNull LinearProgressIndicatorSpec linearProgressIndicatorSpec0) {
        return f.E(context0, linearProgressIndicatorSpec0, new k(linearProgressIndicatorSpec0));
    }

    @NonNull
    static f E(@NonNull Context context0, @NonNull LinearProgressIndicatorSpec linearProgressIndicatorSpec0, @NonNull k k0) {
        return new f(context0, linearProgressIndicatorSpec0, k0);
    }

    @NonNull
    h F() {
        return this.r;
    }

    private float G() {
        return this.u.b;
    }

    public void H(@NonNull OnAnimationEndListener dynamicAnimation$OnAnimationEndListener0) {
        this.t.l(dynamicAnimation$OnAnimationEndListener0);
    }

    void I(@NonNull h h0) {
        this.r = h0;
    }

    private void J(float f) {
        this.u.b = f;
        this.invalidateSelf();
    }

    void K(float f) {
        this.setLevel(((int)(f * 10000.0f)));
    }

    @Override  // com.google.android.material.progressindicator.g
    public boolean b(@NonNull AnimationCallback animatable2Compat$AnimationCallback0) {
        return super.b(animatable2Compat$AnimationCallback0);
    }

    @Override  // com.google.android.material.progressindicator.g
    public void d(@NonNull AnimationCallback animatable2Compat$AnimationCallback0) {
        super.d(animatable2Compat$AnimationCallback0);
    }

    @Override  // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas0) {
        Rect rect0 = new Rect();
        if(!this.getBounds().isEmpty() && this.isVisible() && canvas0.getClipBounds(rect0)) {
            canvas0.save();
            this.r.g(canvas0, this.getBounds(), this.k(), this.o(), this.n());
            this.m.setStyle(Paint.Style.FILL);
            this.m.setAntiAlias(true);
            c c0 = this.b;
            this.u.c = c0.c[0];
            int v = c0.g;
            if(v > 0) {
                if(!(this.r instanceof k)) {
                    v = (int)(((float)v) * MathUtils.d(this.G(), 0.0f, 0.01f) / 0.01f);
                }
                h h0 = this.r;
                int v1 = this.b.d;
                int v2 = this.getAlpha();
                h0.d(canvas0, this.m, this.G(), 1.0f, v1, v2, v);
            }
            else {
                h h1 = this.r;
                int v3 = c0.d;
                int v4 = this.getAlpha();
                h1.d(canvas0, this.m, 0.0f, 1.0f, v3, v4, 0);
            }
            h h2 = this.r;
            int v5 = this.getAlpha();
            h2.c(canvas0, this.m, this.u, v5);
            h h3 = this.r;
            int v6 = this.b.c[0];
            int v7 = this.getAlpha();
            h3.b(canvas0, this.m, v6, v7);
            canvas0.restore();
        }
    }

    @Override  // com.google.android.material.progressindicator.g
    public void e() {
        super.e();
    }

    @Override  // com.google.android.material.progressindicator.g
    public int getAlpha() {
        return super.getAlpha();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.r.e();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.r.f();
    }

    @Override  // com.google.android.material.progressindicator.g
    public int getOpacity() {
        return super.getOpacity();
    }

    @Override  // com.google.android.material.progressindicator.g
    public boolean isRunning() {
        return super.isRunning();
    }

    @Override  // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.t.E();
        this.J(((float)this.getLevel()) / 10000.0f);
    }

    @Override  // com.google.android.material.progressindicator.g
    public boolean m() {
        return super.m();
    }

    @Override  // com.google.android.material.progressindicator.g
    public boolean n() {
        return super.n();
    }

    @Override  // com.google.android.material.progressindicator.g
    public boolean o() {
        return super.o();
    }

    @Override  // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int v) {
        if(this.v) {
            this.t.E();
            this.J(((float)v) / 10000.0f);
            return true;
        }
        this.t.t(this.G() * 10000.0f);
        this.t.z(((float)v));
        return true;
    }

    @Override  // com.google.android.material.progressindicator.g
    public void setAlpha(@IntRange(from = 0L, to = 0xFFL) int v) {
        super.setAlpha(v);
    }

    @Override  // com.google.android.material.progressindicator.g
    public void setColorFilter(@Nullable ColorFilter colorFilter0) {
        super.setColorFilter(colorFilter0);
    }

    @Override  // com.google.android.material.progressindicator.g
    public boolean setVisible(boolean z, boolean z1) {
        return super.setVisible(z, z1);
    }

    @Override  // com.google.android.material.progressindicator.g
    public void start() {
        super.start();
    }

    @Override  // com.google.android.material.progressindicator.g
    public void stop() {
        super.stop();
    }

    @Override  // com.google.android.material.progressindicator.g
    public boolean w(boolean z, boolean z1, boolean z2) {
        return super.w(z, z1, z2);
    }

    @Override  // com.google.android.material.progressindicator.g
    boolean x(boolean z, boolean z1, boolean z2) {
        boolean z3 = super.x(z, z1, z2);
        float f = this.c.a(this.a.getContentResolver());
        if(f == 0.0f) {
            this.v = true;
            return z3;
        }
        this.v = false;
        this.s.i(50.0f / f);
        return z3;
    }
}

