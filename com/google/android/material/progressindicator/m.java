package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.core.math.MathUtils;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback;
import androidx.vectordrawable.graphics.drawable.AnimationUtilsCompat;
import com.google.android.material.R.anim;

final class m extends i {
    class c extends Property {
        c(Class class0, String s) {
            super(class0, s);
        }

        public Float a(m m0) {
            return m0.p();
        }

        public void b(m m0, Float float0) {
            m0.h(((float)float0));
        }

        @Override  // android.util.Property
        public Object get(Object object0) {
            return this.a(((m)object0));
        }

        @Override  // android.util.Property
        public void set(Object object0, Object object1) {
            this.b(((m)object0), ((Float)object1));
        }
    }

    private ObjectAnimator c;
    private ObjectAnimator d;
    private final Interpolator[] e;
    private final com.google.android.material.progressindicator.c f;
    private int g;
    private boolean h;
    private float i;
    AnimationCallback j;
    private static final int k = 1800;
    private static final int[] l;
    private static final int[] m;
    private static final Property n;

    static {
        m.l = new int[]{533, 567, 850, 750};
        m.m = new int[]{0x4F3, 1000, 333, 0};
        m.n = new c(Float.class, "animationFraction");
    }

    public m(@NonNull Context context0, @NonNull LinearProgressIndicatorSpec linearProgressIndicatorSpec0) {
        super(2);
        this.g = 0;
        this.j = null;
        this.f = linearProgressIndicatorSpec0;
        this.e = new Interpolator[]{AnimationUtilsCompat.b(context0, anim.linear_indeterminate_line1_head_interpolator), AnimationUtilsCompat.b(context0, anim.linear_indeterminate_line1_tail_interpolator), AnimationUtilsCompat.b(context0, anim.linear_indeterminate_line2_head_interpolator), AnimationUtilsCompat.b(context0, anim.linear_indeterminate_line2_tail_interpolator)};
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
    public void d(@NonNull AnimationCallback animatable2Compat$AnimationCallback0) {
        this.j = animatable2Compat$AnimationCallback0;
    }

    @Override  // com.google.android.material.progressindicator.i
    public void f() {
        if(this.d != null && !this.d.isRunning()) {
            this.a();
            if(this.a.isVisible()) {
                this.d.setFloatValues(new float[]{this.i, 1.0f});
                this.d.setDuration(((long)((1.0f - this.i) * 1800.0f)));
                this.d.start();
            }
        }
    }

    @Override  // com.google.android.material.progressindicator.i
    @VisibleForTesting
    void g() {
        this.g = 0;
        for(Object object0: this.b) {
            ((a)object0).c = this.f.c[0];
        }
    }

    @Override  // com.google.android.material.progressindicator.i
    @VisibleForTesting
    void h(float f) {
        this.i = f;
        this.s(((int)(f * 1800.0f)));
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
        this.j = null;
    }

    private float p() {
        return this.i;
    }

    private void q() {
        class com.google.android.material.progressindicator.m.a extends AnimatorListenerAdapter {
            final m a;

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationRepeat(Animator animator0) {
                super.onAnimationRepeat(animator0);
                m.this.g = (m.this.g + 1) % m.this.f.c.length;
                m.this.h = true;
            }
        }


        class b extends AnimatorListenerAdapter {
            final m a;

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                super.onAnimationEnd(animator0);
                m.this.a();
                m m0 = m.this;
                AnimationCallback animatable2Compat$AnimationCallback0 = m0.j;
                if(animatable2Compat$AnimationCallback0 != null) {
                    animatable2Compat$AnimationCallback0.b(m0.a);
                }
            }
        }

        if(this.c == null) {
            ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(this, m.n, new float[]{0.0f, 1.0f});
            this.c = objectAnimator0;
            objectAnimator0.setDuration(1800L);
            this.c.setInterpolator(null);
            this.c.setRepeatCount(-1);
            this.c.addListener(new com.google.android.material.progressindicator.m.a(this));
        }
        if(this.d == null) {
            ObjectAnimator objectAnimator1 = ObjectAnimator.ofFloat(this, m.n, new float[]{1.0f});
            this.d = objectAnimator1;
            objectAnimator1.setDuration(1800L);
            this.d.setInterpolator(null);
            this.d.addListener(new b(this));
        }
    }

    private void r() {
        if(this.h) {
            for(Object object0: this.b) {
                ((a)object0).c = this.f.c[this.g];
            }
            this.h = false;
        }
    }

    private void s(int v) {
        for(int v1 = 0; v1 < this.b.size(); ++v1) {
            a h$a0 = (a)this.b.get(v1);
            h$a0.a = MathUtils.d(this.e[v1 * 2].getInterpolation(this.b(v, m.m[v1 * 2], m.l[v1 * 2])), 0.0f, 1.0f);
            int v2 = v1 * 2 + 1;
            h$a0.b = MathUtils.d(this.e[v2].getInterpolation(this.b(v, m.m[v2], m.l[v2])), 0.0f, 1.0f);
        }
    }
}

