package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Region.Op;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.transition.ArcMotion;
import android.transition.PathMotion;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.core.util.Preconditions;
import androidx.core.view.ViewCompat;
import com.google.android.material.R.attr;
import com.google.android.material.R.id;
import com.google.android.material.internal.M;
import com.google.android.material.shape.k;
import com.google.android.material.shape.p;
import com.google.android.material.shape.t;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@RequiresApi(21)
public final class l extends Transition {
    @RestrictTo({Scope.b})
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    @RestrictTo({Scope.b})
    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    public static class e {
        @FloatRange(from = 0.0, to = 1.0)
        private final float a;
        @FloatRange(from = 0.0, to = 1.0)
        private final float b;

        public e(@FloatRange(from = 0.0, to = 1.0) float f, @FloatRange(from = 0.0, to = 1.0) float f1) {
            this.a = f;
            this.b = f1;
        }

        @FloatRange(from = 0.0, to = 1.0)
        public float c() {
            return this.b;
        }

        @FloatRange(from = 0.0, to = 1.0)
        public float d() {
            return this.a;
        }
    }

    static class f {
        @NonNull
        private final e a;
        @NonNull
        private final e b;
        @NonNull
        private final e c;
        @NonNull
        private final e d;

        private f(@NonNull e l$e0, @NonNull e l$e1, @NonNull e l$e2, @NonNull e l$e3) {
            this.a = l$e0;
            this.b = l$e1;
            this.c = l$e2;
            this.d = l$e3;
        }

        f(e l$e0, e l$e1, e l$e2, e l$e3, a l$a0) {
            this(l$e0, l$e1, l$e2, l$e3);
        }
    }

    @RestrictTo({Scope.b})
    @Retention(RetentionPolicy.SOURCE)
    public @interface g {
    }

    static final class h extends Drawable {
        private final f A;
        private final com.google.android.material.transition.platform.a B;
        private final com.google.android.material.transition.platform.f C;
        private final boolean D;
        private final Paint E;
        private final Path F;
        private com.google.android.material.transition.platform.c G;
        private com.google.android.material.transition.platform.h H;
        private RectF I;
        private float J;
        private float K;
        private float L;
        private static final int M = 0x2D000000;
        private static final int N = 0xFF888888;
        private static final float O = 0.3f;
        private static final float P = 1.5f;
        private final View a;
        private final RectF b;
        private final p c;
        private final float d;
        private final View e;
        private final RectF f;
        private final p g;
        private final float h;
        private final Paint i;
        private final Paint j;
        private final Paint k;
        private final Paint l;
        private final Paint m;
        private final j n;
        private final PathMeasure o;
        private final float p;
        private final float[] q;
        private final boolean r;
        private final float s;
        private final float t;
        private final boolean u;
        private final k v;
        private final RectF w;
        private final RectF x;
        private final RectF y;
        private final RectF z;

        private h(PathMotion pathMotion0, View view0, RectF rectF0, p p0, float f, View view1, RectF rectF1, p p1, float f1, @ColorInt int v, @ColorInt int v1, @ColorInt int v2, int v3, boolean z, boolean z1, com.google.android.material.transition.platform.a a0, com.google.android.material.transition.platform.f f2, f l$f0, boolean z2) {
            Paint paint0 = new Paint();
            this.i = paint0;
            Paint paint1 = new Paint();
            this.j = paint1;
            Paint paint2 = new Paint();
            this.k = paint2;
            this.l = new Paint();
            Paint paint3 = new Paint();
            this.m = paint3;
            this.n = new j();
            float[] arr_f = new float[2];
            this.q = arr_f;
            k k0 = new k();
            this.v = k0;
            Paint paint4 = new Paint();
            this.E = paint4;
            this.F = new Path();
            this.a = view0;
            this.b = rectF0;
            this.c = p0;
            this.d = f;
            this.e = view1;
            this.f = rectF1;
            this.g = p1;
            this.h = f1;
            this.r = z;
            this.u = z1;
            this.B = a0;
            this.C = f2;
            this.A = l$f0;
            this.D = z2;
            WindowManager windowManager0 = (WindowManager)view0.getContext().getSystemService("window");
            DisplayMetrics displayMetrics0 = new DisplayMetrics();
            windowManager0.getDefaultDisplay().getMetrics(displayMetrics0);
            this.s = (float)displayMetrics0.widthPixels;
            this.t = (float)displayMetrics0.heightPixels;
            paint0.setColor(v);
            paint1.setColor(v1);
            paint2.setColor(v2);
            k0.p0(ColorStateList.valueOf(0));
            k0.y0(2);
            k0.v0(false);
            k0.w0(0xFF888888);
            RectF rectF2 = new RectF(rectF0);
            this.w = rectF2;
            this.x = new RectF(rectF2);
            RectF rectF3 = new RectF(rectF2);
            this.y = rectF3;
            this.z = new RectF(rectF3);
            PointF pointF0 = h.m(rectF0);
            PointF pointF1 = h.m(rectF1);
            PathMeasure pathMeasure0 = new PathMeasure(pathMotion0.getPath(pointF0.x, pointF0.y, pointF1.x, pointF1.y), false);
            this.o = pathMeasure0;
            this.p = pathMeasure0.getLength();
            arr_f[0] = rectF0.centerX();
            arr_f[1] = rectF0.top;
            paint3.setStyle(Paint.Style.FILL);
            paint3.setShader(w.d(v3));
            paint4.setStyle(Paint.Style.STROKE);
            paint4.setStrokeWidth(10.0f);
            this.p(0.0f);
        }

        h(PathMotion pathMotion0, View view0, RectF rectF0, p p0, float f, View view1, RectF rectF1, p p1, float f1, int v, int v1, int v2, int v3, boolean z, boolean z1, com.google.android.material.transition.platform.a a0, com.google.android.material.transition.platform.f f2, f l$f0, boolean z2, a l$a0) {
            this(pathMotion0, view0, rectF0, p0, f, view1, rectF1, p1, f1, v, v1, v2, v3, z, z1, a0, f2, l$f0, z2);
        }

        private static float d(RectF rectF0, float f) {
            return (rectF0.centerX() / (f / 2.0f) - 1.0f) * 0.3f;
        }

        @Override  // android.graphics.drawable.Drawable
        public void draw(@NonNull Canvas canvas0) {
            if(this.m.getAlpha() > 0) {
                canvas0.drawRect(this.getBounds(), this.m);
            }
            int v = this.D ? canvas0.save() : -1;
            if(this.u && this.J > 0.0f) {
                this.h(canvas0);
            }
            this.n.a(canvas0);
            this.n(canvas0, this.i);
            if(this.G.c) {
                this.l(canvas0);
                this.k(canvas0);
            }
            else {
                this.k(canvas0);
                this.l(canvas0);
            }
            if(this.D) {
                canvas0.restoreToCount(v);
                this.f(canvas0, this.w, this.F, 0xFFFF00FF);
                this.g(canvas0, this.x, 0xFFFFFF00);
                this.g(canvas0, this.w, 0xFF00FF00);
                this.g(canvas0, this.z, 0xFF00FFFF);
                this.g(canvas0, this.y, 0xFF0000FF);
            }
        }

        private static float e(RectF rectF0, float f) {
            return rectF0.centerY() / f * 1.5f;
        }

        private void f(Canvas canvas0, RectF rectF0, Path path0, @ColorInt int v) {
            PointF pointF0 = h.m(rectF0);
            if(this.L == 0.0f) {
                path0.reset();
                path0.moveTo(pointF0.x, pointF0.y);
                return;
            }
            path0.lineTo(pointF0.x, pointF0.y);
            this.E.setColor(v);
            canvas0.drawPath(path0, this.E);
        }

        private void g(Canvas canvas0, RectF rectF0, @ColorInt int v) {
            this.E.setColor(v);
            canvas0.drawRect(rectF0, this.E);
        }

        @Override  // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        private void h(Canvas canvas0) {
            canvas0.save();
            canvas0.clipPath(this.n.d(), Region.Op.DIFFERENCE);
            if(Build.VERSION.SDK_INT > 28) {
                this.j(canvas0);
            }
            else {
                this.i(canvas0);
            }
            canvas0.restore();
        }

        private void i(Canvas canvas0) {
            this.v.setBounds(((int)this.I.left), ((int)this.I.top), ((int)this.I.right), ((int)this.I.bottom));
            this.v.o0(this.J);
            this.v.C0(((int)this.K));
            p p0 = this.n.c();
            this.v.setShapeAppearanceModel(p0);
            this.v.draw(canvas0);
        }

        private void j(Canvas canvas0) {
            p p0 = this.n.c();
            if(p0.u(this.I)) {
                float f = p0.r().a(this.I);
                canvas0.drawRoundRect(this.I, f, f, this.l);
                return;
            }
            canvas0.drawPath(this.n.d(), this.l);
        }

        private void k(Canvas canvas0) {
            class b implements D1.a.a {
                final h a;

                @Override  // D1.a$a
                public void a(Canvas canvas0) {
                    h.this.e.draw(canvas0);
                }
            }

            this.n(canvas0, this.k);
            w.y(canvas0, this.getBounds(), this.y.left, this.y.top, this.H.b, this.G.b, new b(this));
        }

        private void l(Canvas canvas0) {
            class com.google.android.material.transition.platform.l.h.a implements D1.a.a {
                final h a;

                @Override  // D1.a$a
                public void a(Canvas canvas0) {
                    h.this.a.draw(canvas0);
                }
            }

            this.n(canvas0, this.j);
            w.y(canvas0, this.getBounds(), this.w.left, this.w.top, this.H.a, this.G.a, new com.google.android.material.transition.platform.l.h.a(this));
        }

        private static PointF m(RectF rectF0) {
            return new PointF(rectF0.centerX(), rectF0.top);
        }

        private void n(Canvas canvas0, Paint paint0) {
            if(paint0.getColor() != 0 && paint0.getAlpha() > 0) {
                canvas0.drawRect(this.getBounds(), paint0);
            }
        }

        private void o(float f) {
            if(this.L != f) {
                this.p(f);
            }
        }

        private void p(float f) {
            float f4;
            float f3;
            this.L = f;
            this.m.setAlpha(((int)(this.r ? 0.0f + f * 255.0f : 255.0f + f * -255.0f)));
            this.o.getPosTan(this.p * f, this.q, null);
            float[] arr_f = this.q;
            float f1 = arr_f[0];
            float f2 = arr_f[1];
            int v = Float.compare(f, 1.0f);
            if(v > 0 || f < 0.0f) {
                if(v > 0) {
                    f3 = (f - 1.0f) / 0.01f;
                    f4 = 0.99f;
                }
                else {
                    f4 = 0.01f;
                    f3 = f / 0.01f * -1.0f;
                }
                this.o.getPosTan(this.p * f4, arr_f, null);
                f1 += (f1 - this.q[0]) * f3;
                f2 += (f2 - this.q[1]) * f3;
            }
            float f5 = (float)(((Float)Preconditions.l(this.A.b.a)));
            float f6 = (float)(((Float)Preconditions.l(this.A.b.b)));
            float f7 = this.b.width();
            float f8 = this.b.height();
            float f9 = this.f.width();
            float f10 = this.f.height();
            com.google.android.material.transition.platform.h h0 = this.C.a(f, f5, f6, f7, f8, f9, f10);
            this.H = h0;
            this.w.set(f1 - h0.c / 2.0f, f2, h0.c / 2.0f + f1, h0.d + f2);
            this.y.set(f1 - this.H.e / 2.0f, f2, f1 + this.H.e / 2.0f, this.H.f + f2);
            this.x.set(this.w);
            this.z.set(this.y);
            float f11 = (float)(((Float)Preconditions.l(this.A.c.a)));
            float f12 = (float)(((Float)Preconditions.l(this.A.c.b)));
            boolean z = this.C.b(this.H);
            this.C.c((z ? this.x : this.z), (z ? w.n(0.0f, 1.0f, f11, f12, f) : 1.0f - w.n(0.0f, 1.0f, f11, f12, f)), this.H);
            this.I = new RectF(Math.min(this.x.left, this.z.left), Math.min(this.x.top, this.z.top), Math.max(this.x.right, this.z.right), Math.max(this.x.bottom, this.z.bottom));
            this.n.b(f, this.c, this.g, this.w, this.x, this.z, this.A.d);
            this.J = this.d + f * (this.h - this.d);
            float f13 = h.d(this.I, this.s);
            float f14 = (float)(((int)(h.e(this.I, this.t) * this.J)));
            this.K = f14;
            this.l.setShadowLayer(this.J, ((float)(((int)(f13 * this.J)))), f14, 0x2D000000);
            float f15 = (float)(((Float)Preconditions.l(this.A.a.a)));
            float f16 = (float)(((Float)Preconditions.l(this.A.a.b)));
            this.G = this.B.a(f, f15, f16, 0.35f);
            if(this.j.getColor() != 0) {
                this.j.setAlpha(this.G.a);
            }
            if(this.k.getColor() != 0) {
                this.k.setAlpha(this.G.b);
            }
            this.invalidateSelf();
        }

        @Override  // android.graphics.drawable.Drawable
        public void setAlpha(int v) {
            throw new UnsupportedOperationException("Setting alpha on is not supported");
        }

        @Override  // android.graphics.drawable.Drawable
        public void setColorFilter(@Nullable ColorFilter colorFilter0) {
            throw new UnsupportedOperationException("Setting a color filter is not supported");
        }
    }

    public static final int A = 1;
    public static final int B = 2;
    public static final int C = 0;
    public static final int D = 1;
    public static final int E = 2;
    public static final int F = 3;
    public static final int G = 0;
    public static final int H = 1;
    public static final int I = 2;
    private static final String J = "l";
    private static final String K = "materialContainerTransition:bounds";
    private static final String L = "materialContainerTransition:shapeAppearance";
    private static final String[] M = null;
    private static final f N = null;
    private static final f O = null;
    private static final f P = null;
    private static final f Q = null;
    private static final float X = -1.0f;
    private boolean a;
    private boolean b;
    private boolean c;
    private boolean d;
    @IdRes
    private int e;
    @IdRes
    private int f;
    @IdRes
    private int g;
    @ColorInt
    private int h;
    @ColorInt
    private int i;
    @ColorInt
    private int j;
    @ColorInt
    private int k;
    private int l;
    private int m;
    private int n;
    @Nullable
    private View o;
    @Nullable
    private View p;
    @Nullable
    private p q;
    @Nullable
    private p r;
    @Nullable
    private e s;
    @Nullable
    private e t;
    @Nullable
    private e u;
    @Nullable
    private e v;
    private boolean w;
    private float x;
    private float y;
    public static final int z;

    static {
        l.M = new String[]{"materialContainerTransition:bounds", "materialContainerTransition:shapeAppearance"};
        l.N = new f(new e(0.0f, 0.25f), new e(0.0f, 1.0f), new e(0.0f, 1.0f), new e(0.0f, 0.75f), null);
        l.O = new f(new e(0.6f, 0.9f), new e(0.0f, 1.0f), new e(0.0f, 0.9f), new e(0.3f, 0.9f), null);
        l.P = new f(new e(0.1f, 0.4f), new e(0.1f, 1.0f), new e(0.1f, 1.0f), new e(0.1f, 0.9f), null);
        l.Q = new f(new e(0.6f, 0.9f), new e(0.0f, 0.9f), new e(0.0f, 0.9f), new e(0.2f, 0.9f), null);
    }

    public l() {
        boolean z = false;
        this.a = false;
        this.b = false;
        this.c = false;
        this.d = false;
        this.e = 0x1020002;
        this.f = -1;
        this.g = -1;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.k = 0x52000000;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        if(Build.VERSION.SDK_INT >= 28) {
            z = true;
        }
        this.w = z;
        this.x = -1.0f;
        this.y = -1.0f;
    }

    public l(@NonNull Context context0, boolean z) {
        boolean z1 = false;
        this.a = false;
        this.b = false;
        this.c = false;
        this.d = false;
        this.e = 0x1020002;
        this.f = -1;
        this.g = -1;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.k = 0x52000000;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        if(Build.VERSION.SDK_INT >= 28) {
            z1 = true;
        }
        this.w = z1;
        this.x = -1.0f;
        this.y = -1.0f;
        this.I(context0, z);
        this.d = true;
    }

    @IdRes
    public int A() {
        return this.f;
    }

    private f B(boolean z, f l$f0, f l$f1) {
        if(!z) {
            l$f0 = l$f1;
        }
        return new f(((e)w.e(this.s, l$f0.a)), ((e)w.e(this.t, l$f0.b)), ((e)w.e(this.u, l$f0.c)), ((e)w.e(this.v, l$f0.d)), null);
    }

    public int C() {
        return this.l;
    }

    @StyleRes
    private static int D(Context context0) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(new int[]{attr.transitionShapeAppearance});
        int v = typedArray0.getResourceId(0, -1);
        typedArray0.recycle();
        return v;
    }

    public boolean E() {
        return this.a;
    }

    public boolean F() {
        return this.w;
    }

    private boolean G(@NonNull RectF rectF0, @NonNull RectF rectF1) {
        int v = this.l;
        switch(v) {
            case 0: {
                return w.b(rectF1) > w.b(rectF0);
            }
            case 1: {
                return true;
            }
            default: {
                if(v != 2) {
                    throw new IllegalArgumentException("Invalid transition direction: " + this.l);
                }
                return false;
            }
        }
    }

    public boolean H() {
        return this.b;
    }

    private void I(Context context0, boolean z) {
        w.t(this, context0, attr.motionEasingEmphasizedInterpolator, com.google.android.material.animation.b.b);
        w.s(this, context0, (z ? attr.motionDurationLong2 : attr.motionDurationMedium4));
        if(!this.c) {
            w.u(this, context0, attr.motionPath);
        }
    }

    public void J(@ColorInt int v) {
        this.h = v;
        this.i = v;
        this.j = v;
    }

    public void K(@ColorInt int v) {
        this.h = v;
    }

    public void L(boolean z) {
        this.a = z;
    }

    public void M(@IdRes int v) {
        this.e = v;
    }

    public void N(boolean z) {
        this.w = z;
    }

    public void O(@ColorInt int v) {
        this.j = v;
    }

    public void P(float f) {
        this.y = f;
    }

    public void Q(@Nullable p p0) {
        this.r = p0;
    }

    public void R(@Nullable View view0) {
        this.p = view0;
    }

    public void S(@IdRes int v) {
        this.g = v;
    }

    public void T(int v) {
        this.m = v;
    }

    public void U(@Nullable e l$e0) {
        this.s = l$e0;
    }

    public void V(int v) {
        this.n = v;
    }

    public void W(boolean z) {
        this.b = z;
    }

    public void X(@Nullable e l$e0) {
        this.u = l$e0;
    }

    public void Y(@Nullable e l$e0) {
        this.t = l$e0;
    }

    public void Z(@ColorInt int v) {
        this.k = v;
    }

    public void a0(@Nullable e l$e0) {
        this.v = l$e0;
    }

    private f b(boolean z) {
        PathMotion pathMotion0 = this.getPathMotion();
        return pathMotion0 instanceof ArcMotion || pathMotion0 instanceof com.google.android.material.transition.platform.k ? this.B(z, l.P, l.Q) : this.B(z, l.N, l.O);
    }

    public void b0(@ColorInt int v) {
        this.i = v;
    }

    private static RectF c(View view0, @Nullable View view1, float f, float f1) {
        if(view1 != null) {
            RectF rectF0 = w.h(view1);
            rectF0.offset(f, f1);
            return rectF0;
        }
        return new RectF(0.0f, 0.0f, ((float)view0.getWidth()), ((float)view0.getHeight()));
    }

    public void c0(float f) {
        this.x = f;
    }

    @Override  // android.transition.Transition
    public void captureEndValues(@NonNull TransitionValues transitionValues0) {
        l.e(transitionValues0, this.p, this.g, this.r);
    }

    @Override  // android.transition.Transition
    public void captureStartValues(@NonNull TransitionValues transitionValues0) {
        l.e(transitionValues0, this.o, this.f, this.q);
    }

    @Override  // android.transition.Transition
    @Nullable
    public Animator createAnimator(@NonNull ViewGroup viewGroup0, @Nullable TransitionValues transitionValues0, @Nullable TransitionValues transitionValues1) {
        class a implements ValueAnimator.AnimatorUpdateListener {
            final h a;
            final l b;

            a(h l$h0) {
                this.a = l$h0;
                super();
            }

            @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator0) {
                float f = valueAnimator0.getAnimatedFraction();
                this.a.o(f);
            }
        }


        class com.google.android.material.transition.platform.l.b extends u {
            final View a;
            final h b;
            final View c;
            final View d;
            final l e;

            com.google.android.material.transition.platform.l.b(View view0, h l$h0, View view1, View view2) {
                this.a = view0;
                this.b = l$h0;
                this.c = view1;
                this.d = view2;
                super();
            }

            @Override  // com.google.android.material.transition.platform.u
            public void onTransitionEnd(@NonNull Transition transition0) {
                l.this.removeListener(this);
                if(l.this.b) {
                    return;
                }
                this.c.setAlpha(1.0f);
                this.d.setAlpha(1.0f);
                M.o(this.a).a(this.b);
            }

            @Override  // com.google.android.material.transition.platform.u
            public void onTransitionStart(@NonNull Transition transition0) {
                M.o(this.a).b(this.b);
                this.c.setAlpha(0.0f);
                this.d.setAlpha(0.0f);
            }
        }

        View view4;
        View view3;
        if(transitionValues0 != null && transitionValues1 != null) {
            Object object0 = transitionValues0.values.get("materialContainerTransition:bounds");
            Object object1 = transitionValues0.values.get("materialContainerTransition:shapeAppearance");
            if(((RectF)object0) != null && ((p)object1) != null) {
                Object object2 = transitionValues1.values.get("materialContainerTransition:bounds");
                Object object3 = transitionValues1.values.get("materialContainerTransition:shapeAppearance");
                if(((RectF)object2) != null && ((p)object3) != null) {
                    View view0 = transitionValues0.view;
                    View view1 = transitionValues1.view;
                    View view2 = view1.getParent() == null ? view0 : view1;
                    if(this.e == view2.getId()) {
                        view3 = (View)view2.getParent();
                        view4 = view2;
                    }
                    else {
                        view3 = w.f(view2, this.e);
                        view4 = null;
                    }
                    RectF rectF0 = w.h(view3);
                    float f = -rectF0.left;
                    float f1 = -rectF0.top;
                    RectF rectF1 = l.c(view3, view4, f, f1);
                    ((RectF)object0).offset(f, f1);
                    ((RectF)object2).offset(f, f1);
                    boolean z = this.G(((RectF)object0), ((RectF)object2));
                    if(!this.d) {
                        this.I(view2.getContext(), z);
                    }
                    h l$h0 = new h(this.getPathMotion(), view0, ((RectF)object0), ((p)object1), l.h(this.x, view0), view1, ((RectF)object2), ((p)object3), l.h(this.y, view1), this.h, this.i, this.j, this.k, z, this.w, com.google.android.material.transition.platform.b.a(this.m, z), com.google.android.material.transition.platform.g.a(this.n, z, ((RectF)object0), ((RectF)object2)), this.b(z), this.a, null);
                    l$h0.setBounds(Math.round(rectF1.left), Math.round(rectF1.top), Math.round(rectF1.right), Math.round(rectF1.bottom));
                    Animator animator0 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                    ((ValueAnimator)animator0).addUpdateListener(new a(this, l$h0));
                    this.addListener(new com.google.android.material.transition.platform.l.b(this, view3, l$h0, view0, view1));
                    return animator0;
                }
                Log.w("l", "Skipping due to null end bounds. Ensure end view is laid out and measured.");
                return null;
            }
            Log.w("l", "Skipping due to null start bounds. Ensure start view is laid out and measured.");
        }
        return null;
    }

    private static p d(@NonNull View view0, @NonNull RectF rectF0, @Nullable p p0) {
        return w.c(l.u(view0, p0), rectF0);
    }

    public void d0(@Nullable p p0) {
        this.q = p0;
    }

    private static void e(@NonNull TransitionValues transitionValues0, @Nullable View view0, @IdRes int v, @Nullable p p0) {
        if(v != -1) {
            transitionValues0.view = w.g(transitionValues0.view, v);
        }
        else if(view0 != null) {
            transitionValues0.view = view0;
        }
        else if(transitionValues0.view.getTag(id.mtrl_motion_snapshot_view) instanceof View) {
            View view1 = (View)transitionValues0.view.getTag(0x7F0B08AF);  // id:mtrl_motion_snapshot_view
            transitionValues0.view.setTag(0x7F0B08AF, null);  // id:mtrl_motion_snapshot_view
            transitionValues0.view = view1;
        }
        View view2 = transitionValues0.view;
        if(ViewCompat.a1(view2) || view2.getWidth() != 0 || view2.getHeight() != 0) {
            RectF rectF0 = view2.getParent() == null ? w.i(view2) : w.h(view2);
            transitionValues0.values.put("materialContainerTransition:bounds", rectF0);
            transitionValues0.values.put("materialContainerTransition:shapeAppearance", l.d(view2, rectF0, p0));
        }
    }

    public void e0(@Nullable View view0) {
        this.o = view0;
    }

    @ColorInt
    public int f() {
        return this.h;
    }

    public void f0(@IdRes int v) {
        this.f = v;
    }

    @IdRes
    public int g() {
        return this.e;
    }

    public void g0(int v) {
        this.l = v;
    }

    @Override  // android.transition.Transition
    @Nullable
    public String[] getTransitionProperties() {
        return l.M;
    }

    private static float h(float f, View view0) {
        return f == -1.0f ? ViewCompat.V(view0) : f;
    }

    @ColorInt
    public int j() {
        return this.j;
    }

    public float k() {
        return this.y;
    }

    @Nullable
    public p l() {
        return this.r;
    }

    @Nullable
    public View m() {
        return this.p;
    }

    @IdRes
    public int n() {
        return this.g;
    }

    public int o() {
        return this.m;
    }

    @Nullable
    public e p() {
        return this.s;
    }

    public int q() {
        return this.n;
    }

    @Nullable
    public e r() {
        return this.u;
    }

    @Nullable
    public e s() {
        return this.t;
    }

    @Override  // android.transition.Transition
    public void setPathMotion(@Nullable PathMotion pathMotion0) {
        super.setPathMotion(pathMotion0);
        this.c = true;
    }

    @ColorInt
    public int t() {
        return this.k;
    }

    private static p u(@NonNull View view0, @Nullable p p0) {
        if(p0 != null) {
            return p0;
        }
        if(view0.getTag(id.mtrl_motion_snapshot_view) instanceof p) {
            return (p)view0.getTag(0x7F0B08AF);  // id:mtrl_motion_snapshot_view
        }
        Context context0 = view0.getContext();
        int v = l.D(context0);
        if(v != -1) {
            return p.b(context0, v, 0).m();
        }
        return view0 instanceof t ? ((t)view0).getShapeAppearanceModel() : p.a().m();
    }

    @Nullable
    public e v() {
        return this.v;
    }

    @ColorInt
    public int w() {
        return this.i;
    }

    public float x() {
        return this.x;
    }

    @Nullable
    public p y() {
        return this.q;
    }

    @Nullable
    public View z() {
        return this.o;
    }
}

