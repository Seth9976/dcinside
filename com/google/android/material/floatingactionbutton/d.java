package com.google.android.material.floatingactionbutton;

import android.animation.Animator.AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.Matrix;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.ViewCompat;
import com.google.android.material.R.attr;
import com.google.android.material.R.integer;
import com.google.android.material.animation.b;
import com.google.android.material.internal.x;
import com.google.android.material.shape.p;
import com.google.android.material.shape.t;
import java.util.ArrayList;

class d {
    class g extends m {
        final d e;

        g() {
            super(null);
        }

        @Override  // com.google.android.material.floatingactionbutton.d$m
        protected float a() {
            return 0.0f;
        }
    }

    class h extends m {
        final d e;

        h() {
            super(null);
        }

        @Override  // com.google.android.material.floatingactionbutton.d$m
        protected float a() {
            return d.this.h + d.this.i;
        }
    }

    class i extends m {
        final d e;

        i() {
            super(null);
        }

        @Override  // com.google.android.material.floatingactionbutton.d$m
        protected float a() {
            return d.this.h + d.this.j;
        }
    }

    interface j {
        void a();

        void b();
    }

    interface k {
        void a();

        void b();
    }

    class l extends m {
        final d e;

        l() {
            super(null);
        }

        @Override  // com.google.android.material.floatingactionbutton.d$m
        protected float a() {
            return d.this.h;
        }
    }

    abstract class m extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        private boolean a;
        private float b;
        private float c;
        final d d;

        private m() {
        }

        m(a d$a0) {
        }

        protected abstract float a();

        @Override  // android.animation.AnimatorListenerAdapter
        public void onAnimationEnd(Animator animator0) {
            d.this.j0(((float)(((int)this.c))));
            this.a = false;
        }

        @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator0) {
            if(!this.a) {
                com.google.android.material.shape.k k0 = d.this.b;
                this.b = k0 == null ? 0.0f : k0.y();
                this.c = this.a();
                this.a = true;
            }
            float f = this.b;
            float f1 = this.c - f;
            float f2 = valueAnimator0.getAnimatedFraction();
            d.this.j0(((float)(((int)(f + f1 * f2)))));
        }
    }

    private final RectF A;
    private final Matrix B;
    @Nullable
    private ViewTreeObserver.OnPreDrawListener C;
    static final TimeInterpolator D = null;
    static final long E = 100L;
    static final long F = 100L;
    static final int G = 0;
    static final int H = 1;
    static final int I = 2;
    static final float J = 1.5f;
    private static final float K = 0.0f;
    private static final float L = 0.4f;
    private static final float M = 0.4f;
    private static final float N = 1.0f;
    private static final float O = 1.0f;
    private static final float P = 1.0f;
    private static final float Q;
    private static final float R;
    private static final int S;
    private static final int T;
    private static final int U;
    private static final int V;
    static final int[] W;
    static final int[] X;
    static final int[] Y;
    static final int[] Z;
    @Nullable
    p a;
    static final int[] a0;
    @Nullable
    com.google.android.material.shape.k b;
    static final int[] b0;
    @Nullable
    Drawable c;
    @Nullable
    c d;
    @Nullable
    Drawable e;
    boolean f;
    boolean g;
    float h;
    float i;
    float j;
    int k;
    @NonNull
    private final x l;
    @Nullable
    private Animator m;
    @Nullable
    private com.google.android.material.animation.i n;
    @Nullable
    private com.google.android.material.animation.i o;
    private float p;
    private float q;
    private int r;
    private int s;
    private ArrayList t;
    private ArrayList u;
    private ArrayList v;
    final FloatingActionButton w;
    final com.google.android.material.shadow.c x;
    private final Rect y;
    private final RectF z;

    static {
        d.D = b.c;
        d.S = attr.motionDurationLong2;
        d.T = attr.motionEasingEmphasizedInterpolator;
        d.U = attr.motionDurationMedium1;
        d.V = attr.motionEasingEmphasizedAccelerateInterpolator;
        d.W = new int[]{0x10100A7, 0x101009E};
        d.X = new int[]{0x1010367, 0x101009C, 0x101009E};
        d.Y = new int[]{0x101009C, 0x101009E};
        d.Z = new int[]{0x1010367, 0x101009E};
        d.a0 = new int[]{0x101009E};
        d.b0 = new int[0];
    }

    d(FloatingActionButton floatingActionButton0, com.google.android.material.shadow.c c0) {
        this.g = true;
        this.q = 1.0f;
        this.s = 0;
        this.y = new Rect();
        this.z = new RectF();
        this.A = new RectF();
        this.B = new Matrix();
        this.w = floatingActionButton0;
        this.x = c0;
        x x0 = new x();
        this.l = x0;
        ValueAnimator valueAnimator0 = this.k(new i(this));
        x0.a(d.W, valueAnimator0);
        ValueAnimator valueAnimator1 = this.k(new h(this));
        x0.a(d.X, valueAnimator1);
        ValueAnimator valueAnimator2 = this.k(new h(this));
        x0.a(d.Y, valueAnimator2);
        ValueAnimator valueAnimator3 = this.k(new h(this));
        x0.a(d.Z, valueAnimator3);
        ValueAnimator valueAnimator4 = this.k(new l(this));
        x0.a(d.a0, valueAnimator4);
        ValueAnimator valueAnimator5 = this.k(new g(this));
        x0.a(d.b0, valueAnimator5);
        this.p = floatingActionButton0.getRotation();
    }

    boolean A() {
        return this.w.getVisibility() == 0 ? this.s != 1 : this.s == 2;
    }

    void B() {
        this.l.c();
    }

    void C() {
        com.google.android.material.shape.k k0 = this.b;
        if(k0 != null) {
            com.google.android.material.shape.l.f(this.w, k0);
        }
        if(this.O()) {
            this.w.getViewTreeObserver().addOnPreDrawListener(this.r());
        }
    }

    void D() {
    }

    void E() {
        ViewTreeObserver viewTreeObserver0 = this.w.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener viewTreeObserver$OnPreDrawListener0 = this.C;
        if(viewTreeObserver$OnPreDrawListener0 != null) {
            viewTreeObserver0.removeOnPreDrawListener(viewTreeObserver$OnPreDrawListener0);
            this.C = null;
        }
    }

    void F(int[] arr_v) {
        this.l.d(arr_v);
    }

    void G(float f, float f1, float f2) {
        this.B();
        this.i0();
        this.j0(f);
    }

    void H(@NonNull Rect rect0) {
        Preconditions.m(this.e, "Didn\'t initialize content background");
        if(this.c0()) {
            InsetDrawable insetDrawable0 = new InsetDrawable(this.e, rect0.left, rect0.top, rect0.right, rect0.bottom);
            this.x.a(insetDrawable0);
            return;
        }
        this.x.a(this.e);
    }

    void I() {
        float f = this.w.getRotation();
        if(this.p != f) {
            this.p = f;
            this.g0();
        }
    }

    void J() {
        ArrayList arrayList0 = this.v;
        if(arrayList0 != null) {
            for(Object object0: arrayList0) {
                ((j)object0).a();
            }
        }
    }

    void K() {
        ArrayList arrayList0 = this.v;
        if(arrayList0 != null) {
            for(Object object0: arrayList0) {
                ((j)object0).b();
            }
        }
    }

    public void L(@NonNull Animator.AnimatorListener animator$AnimatorListener0) {
        ArrayList arrayList0 = this.u;
        if(arrayList0 == null) {
            return;
        }
        arrayList0.remove(animator$AnimatorListener0);
    }

    void M(@NonNull Animator.AnimatorListener animator$AnimatorListener0) {
        ArrayList arrayList0 = this.t;
        if(arrayList0 == null) {
            return;
        }
        arrayList0.remove(animator$AnimatorListener0);
    }

    void N(@NonNull j d$j0) {
        ArrayList arrayList0 = this.v;
        if(arrayList0 == null) {
            return;
        }
        arrayList0.remove(d$j0);
    }

    boolean O() {
        return true;
    }

    void P(@Nullable ColorStateList colorStateList0) {
        com.google.android.material.shape.k k0 = this.b;
        if(k0 != null) {
            k0.setTintList(colorStateList0);
        }
        c c0 = this.d;
        if(c0 != null) {
            c0.d(colorStateList0);
        }
    }

    void Q(@Nullable PorterDuff.Mode porterDuff$Mode0) {
        com.google.android.material.shape.k k0 = this.b;
        if(k0 != null) {
            k0.setTintMode(porterDuff$Mode0);
        }
    }

    final void R(float f) {
        if(this.h != f) {
            this.h = f;
            this.G(f, this.i, this.j);
        }
    }

    void S(boolean z) {
        this.f = z;
    }

    final void T(@Nullable com.google.android.material.animation.i i0) {
        this.o = i0;
    }

    final void U(float f) {
        if(this.i != f) {
            this.i = f;
            this.G(this.h, f, this.j);
        }
    }

    final void V(int v) {
        if(this.r != v) {
            this.r = v;
            this.h0();
        }
    }

    void W(int v) {
        this.k = v;
    }

    final void X(float f) {
        if(this.j != f) {
            this.j = f;
            this.G(this.h, this.i, f);
        }
    }

    void Y(@Nullable ColorStateList colorStateList0) {
        Drawable drawable0 = this.c;
        if(drawable0 != null) {
            DrawableCompat.o(drawable0, com.google.android.material.ripple.b.e(colorStateList0));
        }
    }

    void Z(boolean z) {
        this.g = z;
        this.i0();
    }

    final void a0(@NonNull p p0) {
        this.a = p0;
        com.google.android.material.shape.k k0 = this.b;
        if(k0 != null) {
            k0.setShapeAppearanceModel(p0);
        }
        Drawable drawable0 = this.c;
        if(drawable0 instanceof t) {
            ((t)drawable0).setShapeAppearanceModel(p0);
        }
        c c0 = this.d;
        if(c0 != null) {
            c0.g(p0);
        }
    }

    final void b0(@Nullable com.google.android.material.animation.i i0) {
        this.n = i0;
    }

    boolean c0() {
        return true;
    }

    // 去混淆评级： 低(20)
    private boolean d0() {
        return ViewCompat.a1(this.w) && !this.w.isInEditMode();
    }

    public void e(@NonNull Animator.AnimatorListener animator$AnimatorListener0) {
        if(this.u == null) {
            this.u = new ArrayList();
        }
        this.u.add(animator$AnimatorListener0);
    }

    final boolean e0() {
        return !this.f || this.w.getSizeDimension() >= this.k;
    }

    void f(@NonNull Animator.AnimatorListener animator$AnimatorListener0) {
        if(this.t == null) {
            this.t = new ArrayList();
        }
        this.t.add(animator$AnimatorListener0);
    }

    void f0(@Nullable k d$k0, boolean z) {
        class com.google.android.material.floatingactionbutton.d.b extends AnimatorListenerAdapter {
            final boolean a;
            final k b;
            final d c;

            com.google.android.material.floatingactionbutton.d.b(boolean z, k d$k0) {
                this.a = z;
                this.b = d$k0;
                super();
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                d.this.s = 0;
                d.this.m = null;
                k d$k0 = this.b;
                if(d$k0 != null) {
                    d$k0.a();
                }
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationStart(Animator animator0) {
                d.this.w.c(0, this.a);
                d.this.s = 2;
                d.this.m = animator0;
            }
        }

        if(this.A()) {
            return;
        }
        Animator animator0 = this.m;
        if(animator0 != null) {
            animator0.cancel();
        }
        boolean z1 = this.n == null;
        if(this.d0()) {
            if(this.w.getVisibility() != 0) {
                float f = 0.0f;
                this.w.setAlpha(0.0f);
                this.w.setScaleY((z1 ? 0.4f : 0.0f));
                this.w.setScaleX((z1 ? 0.4f : 0.0f));
                if(z1) {
                    f = 0.4f;
                }
                this.setImageMatrixScale(f);
            }
            com.google.android.material.animation.i i0 = this.n;
            AnimatorSet animatorSet0 = i0 == null ? this.j(1.0f, 1.0f, 1.0f, d.S, d.T) : this.i(i0, 1.0f, 1.0f, 1.0f);
            animatorSet0.addListener(new com.google.android.material.floatingactionbutton.d.b(this, z, d$k0));
            ArrayList arrayList0 = this.t;
            if(arrayList0 != null) {
                for(Object object0: arrayList0) {
                    animatorSet0.addListener(((Animator.AnimatorListener)object0));
                }
            }
            animatorSet0.start();
            return;
        }
        this.w.c(0, z);
        this.w.setAlpha(1.0f);
        this.w.setScaleY(1.0f);
        this.w.setScaleX(1.0f);
        this.setImageMatrixScale(1.0f);
        if(d$k0 != null) {
            d$k0.a();
        }
    }

    void g(@NonNull j d$j0) {
        if(this.v == null) {
            this.v = new ArrayList();
        }
        this.v.add(d$j0);
    }

    void g0() {
        com.google.android.material.shape.k k0 = this.b;
        if(k0 != null) {
            k0.x0(((int)this.p));
        }
    }

    private void h(float f, @NonNull Matrix matrix0) {
        matrix0.reset();
        Drawable drawable0 = this.w.getDrawable();
        if(drawable0 != null && this.r != 0) {
            float f1 = (float)drawable0.getIntrinsicWidth();
            float f2 = (float)drawable0.getIntrinsicHeight();
            this.z.set(0.0f, 0.0f, f1, f2);
            this.A.set(0.0f, 0.0f, ((float)this.r), ((float)this.r));
            matrix0.setRectToRect(this.z, this.A, Matrix.ScaleToFit.CENTER);
            matrix0.postScale(f, f, ((float)this.r) / 2.0f, ((float)this.r) / 2.0f);
        }
    }

    final void h0() {
        this.setImageMatrixScale(this.q);
    }

    @NonNull
    private AnimatorSet i(@NonNull com.google.android.material.animation.i i0, float f, float f1, float f2) {
        class com.google.android.material.floatingactionbutton.d.c extends com.google.android.material.animation.h {
            final d d;

            @Override  // com.google.android.material.animation.h
            public Matrix a(float f, @NonNull Matrix matrix0, @NonNull Matrix matrix1) {
                d.this.q = f;
                return super.a(f, matrix0, matrix1);
            }

            @Override  // com.google.android.material.animation.h
            public Object evaluate(float f, @NonNull Object object0, @NonNull Object object1) {
                return this.a(f, ((Matrix)object0), ((Matrix)object1));
            }
        }

        ArrayList arrayList0 = new ArrayList();
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(this.w, View.ALPHA, new float[]{f});
        i0.h("opacity").a(objectAnimator0);
        arrayList0.add(objectAnimator0);
        ObjectAnimator objectAnimator1 = ObjectAnimator.ofFloat(this.w, View.SCALE_X, new float[]{f1});
        i0.h("scale").a(objectAnimator1);
        this.k0(objectAnimator1);
        arrayList0.add(objectAnimator1);
        ObjectAnimator objectAnimator2 = ObjectAnimator.ofFloat(this.w, View.SCALE_Y, new float[]{f1});
        i0.h("scale").a(objectAnimator2);
        this.k0(objectAnimator2);
        arrayList0.add(objectAnimator2);
        this.h(f2, this.B);
        com.google.android.material.animation.g g0 = new com.google.android.material.animation.g();
        com.google.android.material.floatingactionbutton.d.c d$c0 = new com.google.android.material.floatingactionbutton.d.c(this);
        Matrix[] arr_matrix = {new Matrix(this.B)};
        ObjectAnimator objectAnimator3 = ObjectAnimator.ofObject(this.w, g0, d$c0, arr_matrix);
        i0.h("iconScale").a(objectAnimator3);
        arrayList0.add(objectAnimator3);
        AnimatorSet animatorSet0 = new AnimatorSet();
        com.google.android.material.animation.c.a(animatorSet0, arrayList0);
        return animatorSet0;
    }

    final void i0() {
        this.s(this.y);
        this.H(this.y);
        this.x.b(this.y.left, this.y.top, this.y.right, this.y.bottom);
    }

    private AnimatorSet j(float f, float f1, float f2, int v, int v1) {
        class com.google.android.material.floatingactionbutton.d.d implements ValueAnimator.AnimatorUpdateListener {
            final float a;
            final float b;
            final float c;
            final float d;
            final float e;
            final float f;
            final float g;
            final Matrix h;
            final d i;

            com.google.android.material.floatingactionbutton.d.d(float f, float f1, float f2, float f3, float f4, float f5, float f6, Matrix matrix0) {
                this.a = f;
                this.b = f1;
                this.c = f2;
                this.d = f3;
                this.e = f4;
                this.f = f5;
                this.g = f6;
                this.h = matrix0;
                super();
            }

            @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator0) {
                float f = (float)(((Float)valueAnimator0.getAnimatedValue()));
                d.this.w.setAlpha(b.b(this.a, this.b, 0.0f, 0.2f, f));
                d.this.w.setScaleX(this.c + f * (this.d - this.c));
                d.this.w.setScaleY(this.e + f * (this.d - this.e));
                d.this.q = this.f + f * (this.g - this.f);
                d.this.h(this.f + f * (this.g - this.f), this.h);
                d.this.w.setImageMatrix(this.h);
            }
        }

        AnimatorSet animatorSet0 = new AnimatorSet();
        ArrayList arrayList0 = new ArrayList();
        ValueAnimator valueAnimator0 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        valueAnimator0.addUpdateListener(new com.google.android.material.floatingactionbutton.d.d(this, this.w.getAlpha(), f, this.w.getScaleX(), f1, this.w.getScaleY(), this.q, f2, new Matrix(this.B)));
        arrayList0.add(valueAnimator0);
        com.google.android.material.animation.c.a(animatorSet0, arrayList0);
        animatorSet0.setDuration(((long)com.google.android.material.motion.j.f(this.w.getContext(), v, this.w.getContext().getResources().getInteger(integer.material_motion_duration_long_1))));
        animatorSet0.setInterpolator(com.google.android.material.motion.j.g(this.w.getContext(), v1, b.b));
        return animatorSet0;
    }

    void j0(float f) {
        com.google.android.material.shape.k k0 = this.b;
        if(k0 != null) {
            k0.o0(f);
        }
    }

    @NonNull
    private ValueAnimator k(@NonNull m d$m0) {
        ValueAnimator valueAnimator0 = new ValueAnimator();
        valueAnimator0.setInterpolator(d.D);
        valueAnimator0.setDuration(100L);
        valueAnimator0.addListener(d$m0);
        valueAnimator0.addUpdateListener(d$m0);
        valueAnimator0.setFloatValues(new float[]{0.0f, 1.0f});
        return valueAnimator0;
    }

    private void k0(ObjectAnimator objectAnimator0) {
        class e implements TypeEvaluator {
            FloatEvaluator a;
            final d b;

            e() {
                this.a = new FloatEvaluator();
            }

            public Float a(float f, Float float0, Float float1) {
                float f1 = (float)this.a.evaluate(f, float0, float1);
                if(f1 < 0.1f) {
                    f1 = 0.0f;
                }
                return f1;
            }

            @Override  // android.animation.TypeEvaluator
            public Object evaluate(float f, Object object0, Object object1) {
                return this.a(f, ((Float)object0), ((Float)object1));
            }
        }

        if(Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator0.setEvaluator(new e(this));
    }

    com.google.android.material.shape.k l() {
        return new com.google.android.material.shape.k(((p)Preconditions.l(this.a)));
    }

    @Nullable
    final Drawable m() {
        return this.e;
    }

    float n() {
        return this.h;
    }

    boolean o() {
        return this.f;
    }

    @Nullable
    final com.google.android.material.animation.i p() {
        return this.o;
    }

    float q() {
        return this.i;
    }

    @NonNull
    private ViewTreeObserver.OnPreDrawListener r() {
        class f implements ViewTreeObserver.OnPreDrawListener {
            final d a;

            @Override  // android.view.ViewTreeObserver$OnPreDrawListener
            public boolean onPreDraw() {
                d.this.I();
                return true;
            }
        }

        if(this.C == null) {
            this.C = new f(this);
        }
        return this.C;
    }

    void s(@NonNull Rect rect0) {
        int v = this.w();
        float f = this.g ? this.n() + this.j : 0.0f;
        int v1 = Math.max(v, ((int)Math.ceil(f)));
        int v2 = Math.max(v, ((int)Math.ceil(f * 1.5f)));
        rect0.set(v1, v2, v1, v2);
    }

    final void setImageMatrixScale(float f) {
        this.q = f;
        this.h(f, this.B);
        this.w.setImageMatrix(this.B);
    }

    float t() {
        return this.j;
    }

    @Nullable
    final p u() {
        return this.a;
    }

    @Nullable
    final com.google.android.material.animation.i v() {
        return this.n;
    }

    // 去混淆评级： 低(20)
    int w() {
        return this.f ? Math.max((this.k - this.w.getSizeDimension()) / 2, 0) : 0;
    }

    void x(@Nullable k d$k0, boolean z) {
        class a extends AnimatorListenerAdapter {
            private boolean a;
            final boolean b;
            final k c;
            final d d;

            a(boolean z, k d$k0) {
                this.b = z;
                this.c = d$k0;
                super();
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationCancel(Animator animator0) {
                this.a = true;
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                d.this.s = 0;
                d.this.m = null;
                if(!this.a) {
                    d.this.w.c((this.b ? 8 : 4), this.b);
                    k d$k0 = this.c;
                    if(d$k0 != null) {
                        d$k0.b();
                    }
                }
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationStart(Animator animator0) {
                d.this.w.c(0, this.b);
                d.this.s = 1;
                d.this.m = animator0;
                this.a = false;
            }
        }

        if(this.z()) {
            return;
        }
        Animator animator0 = this.m;
        if(animator0 != null) {
            animator0.cancel();
        }
        if(this.d0()) {
            com.google.android.material.animation.i i0 = this.o;
            AnimatorSet animatorSet0 = i0 == null ? this.j(0.0f, 0.4f, 0.4f, d.U, d.V) : this.i(i0, 0.0f, 0.0f, 0.0f);
            animatorSet0.addListener(new a(this, z, d$k0));
            ArrayList arrayList0 = this.u;
            if(arrayList0 != null) {
                for(Object object0: arrayList0) {
                    animatorSet0.addListener(((Animator.AnimatorListener)object0));
                }
            }
            animatorSet0.start();
            return;
        }
        this.w.c((z ? 8 : 4), z);
        if(d$k0 != null) {
            d$k0.b();
        }
    }

    void y(ColorStateList colorStateList0, @Nullable PorterDuff.Mode porterDuff$Mode0, ColorStateList colorStateList1, int v) {
        com.google.android.material.shape.k k0 = this.l();
        this.b = k0;
        k0.setTintList(colorStateList0);
        if(porterDuff$Mode0 != null) {
            this.b.setTintMode(porterDuff$Mode0);
        }
        this.b.w0(-12303292);
        this.b.a0(this.w.getContext());
        com.google.android.material.ripple.a a0 = new com.google.android.material.ripple.a(this.b.getShapeAppearanceModel());
        a0.setTintList(com.google.android.material.ripple.b.e(colorStateList1));
        this.c = a0;
        this.e = new LayerDrawable(new Drawable[]{((Drawable)Preconditions.l(this.b)), a0});
    }

    boolean z() {
        return this.w.getVisibility() == 0 ? this.s == 1 : this.s != 2;
    }
}

