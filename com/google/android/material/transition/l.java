package com.google.android.material.transition;

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
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.core.util.Preconditions;
import androidx.core.view.ViewCompat;
import androidx.transition.ArcMotion;
import androidx.transition.PathMotion;
import androidx.transition.Transition;
import androidx.transition.TransitionValues;
import com.google.android.material.R.attr;
import com.google.android.material.R.id;
import com.google.android.material.internal.M;
import com.google.android.material.shape.k;
import com.google.android.material.shape.p;
import com.google.android.material.shape.t;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

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
        private final com.google.android.material.transition.a B;
        private final com.google.android.material.transition.f C;
        private final boolean D;
        private final Paint E;
        private final Path F;
        private com.google.android.material.transition.c G;
        private com.google.android.material.transition.h H;
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

        private h(PathMotion pathMotion0, View view0, RectF rectF0, p p0, float f, View view1, RectF rectF1, p p1, float f1, @ColorInt int v, @ColorInt int v1, @ColorInt int v2, int v3, boolean z, boolean z1, com.google.android.material.transition.a a0, com.google.android.material.transition.f f2, f l$f0, boolean z2) {
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
            PathMeasure pathMeasure0 = new PathMeasure(pathMotion0.a(pointF0.x, pointF0.y, pointF1.x, pointF1.y), false);
            this.o = pathMeasure0;
            this.p = pathMeasure0.getLength();
            arr_f[0] = rectF0.centerX();
            arr_f[1] = rectF0.top;
            paint3.setStyle(Paint.Style.FILL);
            paint3.setShader(v.d(v3));
            paint4.setStyle(Paint.Style.STROKE);
            paint4.setStrokeWidth(10.0f);
            this.p(0.0f);
        }

        h(PathMotion pathMotion0, View view0, RectF rectF0, p p0, float f, View view1, RectF rectF1, p p1, float f1, int v, int v1, int v2, int v3, boolean z, boolean z1, com.google.android.material.transition.a a0, com.google.android.material.transition.f f2, f l$f0, boolean z2, a l$a0) {
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
            v.y(canvas0, this.getBounds(), this.y.left, this.y.top, this.H.b, this.G.b, new b(this));
        }

        private void l(Canvas canvas0) {
            class com.google.android.material.transition.l.h.a implements D1.a.a {
                final h a;

                @Override  // D1.a$a
                public void a(Canvas canvas0) {
                    h.this.a.draw(canvas0);
                }
            }

            this.n(canvas0, this.j);
            v.y(canvas0, this.getBounds(), this.w.left, this.w.top, this.H.a, this.G.a, new com.google.android.material.transition.l.h.a(this));
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
            com.google.android.material.transition.h h0 = this.C.a(f, f5, f6, f7, f8, f9, f10);
            this.H = h0;
            this.w.set(f1 - h0.c / 2.0f, f2, h0.c / 2.0f + f1, h0.d + f2);
            this.y.set(f1 - this.H.e / 2.0f, f2, f1 + this.H.e / 2.0f, this.H.f + f2);
            this.x.set(this.w);
            this.z.set(this.y);
            float f11 = (float)(((Float)Preconditions.l(this.A.c.a)));
            float f12 = (float)(((Float)Preconditions.l(this.A.c.b)));
            boolean z = this.C.b(this.H);
            this.C.c((z ? this.x : this.z), (z ? v.n(0.0f, 1.0f, f11, f12, f) : 1.0f - v.n(0.0f, 1.0f, f11, f12, f)), this.H);
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

    public static final int A9 = 0;
    public static final int B9 = 1;
    public static final int C9 = 2;
    private static final String D9 = "l";
    private static final String E9 = "materialContainerTransition:bounds";
    private static final String F9 = "materialContainerTransition:shapeAppearance";
    private static final String[] G9 = null;
    private static final f H9 = null;
    private static final f I9 = null;
    private static final f J9 = null;
    private static final f K9 = null;
    private static final float L9 = -1.0f;
    private boolean U8;
    private boolean V8;
    private boolean W8;
    private boolean X8;
    @IdRes
    private int Y8;
    @IdRes
    private int Z8;
    @IdRes
    private int a9;
    @ColorInt
    private int b9;
    @ColorInt
    private int c9;
    @ColorInt
    private int d9;
    @ColorInt
    private int e9;
    private int f9;
    private int g9;
    private int h9;
    @Nullable
    private View i9;
    @Nullable
    private View j9;
    @Nullable
    private p k9;
    @Nullable
    private p l9;
    @Nullable
    private e m9;
    @Nullable
    private e n9;
    @Nullable
    private e o9;
    @Nullable
    private e p9;
    private boolean q9;
    private float r9;
    private float s9;
    public static final int t9 = 0;
    public static final int u9 = 1;
    public static final int v9 = 2;
    public static final int w9 = 0;
    public static final int x9 = 1;
    public static final int y9 = 2;
    public static final int z9 = 3;

    static {
        l.G9 = new String[]{"materialContainerTransition:bounds", "materialContainerTransition:shapeAppearance"};
        l.H9 = new f(new e(0.0f, 0.25f), new e(0.0f, 1.0f), new e(0.0f, 1.0f), new e(0.0f, 0.75f), null);
        l.I9 = new f(new e(0.6f, 0.9f), new e(0.0f, 1.0f), new e(0.0f, 0.9f), new e(0.3f, 0.9f), null);
        l.J9 = new f(new e(0.1f, 0.4f), new e(0.1f, 1.0f), new e(0.1f, 1.0f), new e(0.1f, 0.9f), null);
        l.K9 = new f(new e(0.6f, 0.9f), new e(0.0f, 0.9f), new e(0.0f, 0.9f), new e(0.2f, 0.9f), null);
    }

    public l() {
        boolean z = false;
        this.U8 = false;
        this.V8 = false;
        this.W8 = false;
        this.X8 = false;
        this.Y8 = 0x1020002;
        this.Z8 = -1;
        this.a9 = -1;
        this.b9 = 0;
        this.c9 = 0;
        this.d9 = 0;
        this.e9 = 0x52000000;
        this.f9 = 0;
        this.g9 = 0;
        this.h9 = 0;
        if(Build.VERSION.SDK_INT >= 28) {
            z = true;
        }
        this.q9 = z;
        this.r9 = -1.0f;
        this.s9 = -1.0f;
    }

    public l(@NonNull Context context0, boolean z) {
        boolean z1 = false;
        this.U8 = false;
        this.V8 = false;
        this.W8 = false;
        this.X8 = false;
        this.Y8 = 0x1020002;
        this.Z8 = -1;
        this.a9 = -1;
        this.b9 = 0;
        this.c9 = 0;
        this.d9 = 0;
        this.e9 = 0x52000000;
        this.f9 = 0;
        this.g9 = 0;
        this.h9 = 0;
        if(Build.VERSION.SDK_INT >= 28) {
            z1 = true;
        }
        this.q9 = z1;
        this.r9 = -1.0f;
        this.s9 = -1.0f;
        this.t1(context0, z);
        this.X8 = true;
    }

    public void A1(float f) {
        this.s9 = f;
    }

    public void B1(@Nullable p p0) {
        this.l9 = p0;
    }

    public void C1(@Nullable View view0) {
        this.j9 = view0;
    }

    public void D1(@IdRes int v) {
        this.a9 = v;
    }

    public void E1(int v) {
        this.g9 = v;
    }

    public void F1(@Nullable e l$e0) {
        this.m9 = l$e0;
    }

    @Override  // androidx.transition.Transition
    public void G0(@Nullable PathMotion pathMotion0) {
        super.G0(pathMotion0);
        this.W8 = true;
    }

    public void G1(int v) {
        this.h9 = v;
    }

    public void H1(boolean z) {
        this.V8 = z;
    }

    public void I1(@Nullable e l$e0) {
        this.o9 = l$e0;
    }

    public void J1(@Nullable e l$e0) {
        this.n9 = l$e0;
    }

    public void K1(@ColorInt int v) {
        this.e9 = v;
    }

    public void L1(@Nullable e l$e0) {
        this.p9 = l$e0;
    }

    private f M0(boolean z) {
        PathMotion pathMotion0 = this.P();
        return pathMotion0 instanceof ArcMotion || pathMotion0 instanceof com.google.android.material.transition.k ? this.m1(z, l.J9, l.K9) : this.m1(z, l.H9, l.I9);
    }

    public void M1(@ColorInt int v) {
        this.c9 = v;
    }

    private static RectF N0(View view0, @Nullable View view1, float f, float f1) {
        if(view1 != null) {
            RectF rectF0 = v.h(view1);
            rectF0.offset(f, f1);
            return rectF0;
        }
        return new RectF(0.0f, 0.0f, ((float)view0.getWidth()), ((float)view0.getHeight()));
    }

    private static p O0(@NonNull View view0, @NonNull RectF rectF0, @Nullable p p0) {
        return v.c(l.e1(view0, p0), rectF0);
    }

    public void O1(float f) {
        this.r9 = f;
    }

    private static void P0(@NonNull TransitionValues transitionValues0, @Nullable View view0, @IdRes int v, @Nullable p p0) {
        if(v != -1) {
            transitionValues0.b = v.g(transitionValues0.b, v);
        }
        else if(view0 != null) {
            transitionValues0.b = view0;
        }
        else if(transitionValues0.b.getTag(id.mtrl_motion_snapshot_view) instanceof View) {
            View view1 = (View)transitionValues0.b.getTag(0x7F0B08AF);  // id:mtrl_motion_snapshot_view
            transitionValues0.b.setTag(0x7F0B08AF, null);  // id:mtrl_motion_snapshot_view
            transitionValues0.b = view1;
        }
        View view2 = transitionValues0.b;
        if(ViewCompat.a1(view2) || view2.getWidth() != 0 || view2.getHeight() != 0) {
            RectF rectF0 = view2.getParent() == null ? v.i(view2) : v.h(view2);
            transitionValues0.a.put("materialContainerTransition:bounds", rectF0);
            p p1 = l.O0(view2, rectF0, p0);
            transitionValues0.a.put("materialContainerTransition:shapeAppearance", p1);
        }
    }

    public void P1(@Nullable p p0) {
        this.k9 = p0;
    }

    @ColorInt
    public int Q0() {
        return this.b9;
    }

    public void Q1(@Nullable View view0) {
        this.i9 = view0;
    }

    @IdRes
    public int R0() {
        return this.Y8;
    }

    public void R1(@IdRes int v) {
        this.Z8 = v;
    }

    private static float S0(float f, View view0) {
        return f == -1.0f ? ViewCompat.V(view0) : f;
    }

    public void S1(int v) {
        this.f9 = v;
    }

    @ColorInt
    public int T0() {
        return this.d9;
    }

    public float U0() {
        return this.s9;
    }

    @Nullable
    public p V0() {
        return this.l9;
    }

    @Nullable
    public View W0() {
        return this.j9;
    }

    @IdRes
    public int X0() {
        return this.a9;
    }

    public int Y0() {
        return this.g9;
    }

    @Override  // androidx.transition.Transition
    @Nullable
    public String[] Z() {
        return l.G9;
    }

    @Nullable
    public e Z0() {
        return this.m9;
    }

    public int a1() {
        return this.h9;
    }

    @Nullable
    public e b1() {
        return this.o9;
    }

    @Nullable
    public e c1() {
        return this.n9;
    }

    @ColorInt
    public int d1() {
        return this.e9;
    }

    private static p e1(@NonNull View view0, @Nullable p p0) {
        if(p0 != null) {
            return p0;
        }
        if(view0.getTag(id.mtrl_motion_snapshot_view) instanceof p) {
            return (p)view0.getTag(0x7F0B08AF);  // id:mtrl_motion_snapshot_view
        }
        Context context0 = view0.getContext();
        int v = l.o1(context0);
        if(v != -1) {
            return p.b(context0, v, 0).m();
        }
        return view0 instanceof t ? ((t)view0).getShapeAppearanceModel() : p.a().m();
    }

    @Nullable
    public e f1() {
        return this.p9;
    }

    @ColorInt
    public int g1() {
        return this.c9;
    }

    public float h1() {
        return this.r9;
    }

    @Nullable
    public p i1() {
        return this.k9;
    }

    @Nullable
    public View j1() {
        return this.i9;
    }

    @IdRes
    public int k1() {
        return this.Z8;
    }

    @Override  // androidx.transition.Transition
    public void m(@NonNull TransitionValues transitionValues0) {
        l.P0(transitionValues0, this.j9, this.a9, this.l9);
    }

    private f m1(boolean z, f l$f0, f l$f1) {
        if(!z) {
            l$f0 = l$f1;
        }
        return new f(((e)v.e(this.m9, l$f0.a)), ((e)v.e(this.n9, l$f0.b)), ((e)v.e(this.o9, l$f0.c)), ((e)v.e(this.p9, l$f0.d)), null);
    }

    public int n1() {
        return this.f9;
    }

    @StyleRes
    private static int o1(Context context0) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(new int[]{attr.transitionShapeAppearance});
        int v = typedArray0.getResourceId(0, -1);
        typedArray0.recycle();
        return v;
    }

    @Override  // androidx.transition.Transition
    public void p(@NonNull TransitionValues transitionValues0) {
        l.P0(transitionValues0, this.i9, this.Z8, this.k9);
    }

    public boolean p1() {
        return this.U8;
    }

    public boolean q1() {
        return this.q9;
    }

    private boolean r1(@NonNull RectF rectF0, @NonNull RectF rectF1) {
        int v = this.f9;
        switch(v) {
            case 0: {
                return v.b(rectF1) > v.b(rectF0);
            }
            case 1: {
                return true;
            }
            default: {
                if(v != 2) {
                    throw new IllegalArgumentException("Invalid transition direction: " + this.f9);
                }
                return false;
            }
        }
    }

    public boolean s1() {
        return this.V8;
    }

    @Override  // androidx.transition.Transition
    @Nullable
    public Animator t(@NonNull ViewGroup viewGroup0, @Nullable TransitionValues transitionValues0, @Nullable TransitionValues transitionValues1) {
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


        class com.google.android.material.transition.l.b extends com.google.android.material.transition.t {
            final View a;
            final h b;
            final View c;
            final View d;
            final l e;

            com.google.android.material.transition.l.b(View view0, h l$h0, View view1, View view2) {
                this.a = view0;
                this.b = l$h0;
                this.c = view1;
                this.d = view2;
                super();
            }

            @Override  // com.google.android.material.transition.t
            public void k(@NonNull Transition transition0) {
                M.o(this.a).b(this.b);
                this.c.setAlpha(0.0f);
                this.d.setAlpha(0.0f);
            }

            @Override  // com.google.android.material.transition.t
            public void p(@NonNull Transition transition0) {
                l.this.s0(this);
                if(l.this.V8) {
                    return;
                }
                this.c.setAlpha(1.0f);
                this.d.setAlpha(1.0f);
                M.o(this.a).a(this.b);
            }
        }

        View view4;
        View view3;
        if(transitionValues0 != null && transitionValues1 != null) {
            Object object0 = transitionValues0.a.get("materialContainerTransition:bounds");
            Object object1 = transitionValues0.a.get("materialContainerTransition:shapeAppearance");
            if(((RectF)object0) != null && ((p)object1) != null) {
                Object object2 = transitionValues1.a.get("materialContainerTransition:bounds");
                Object object3 = transitionValues1.a.get("materialContainerTransition:shapeAppearance");
                if(((RectF)object2) != null && ((p)object3) != null) {
                    View view0 = transitionValues0.b;
                    View view1 = transitionValues1.b;
                    View view2 = view1.getParent() == null ? view0 : view1;
                    if(this.Y8 == view2.getId()) {
                        view3 = (View)view2.getParent();
                        view4 = view2;
                    }
                    else {
                        view3 = v.f(view2, this.Y8);
                        view4 = null;
                    }
                    RectF rectF0 = v.h(view3);
                    float f = -rectF0.left;
                    float f1 = -rectF0.top;
                    RectF rectF1 = l.N0(view3, view4, f, f1);
                    ((RectF)object0).offset(f, f1);
                    ((RectF)object2).offset(f, f1);
                    boolean z = this.r1(((RectF)object0), ((RectF)object2));
                    if(!this.X8) {
                        this.t1(view2.getContext(), z);
                    }
                    h l$h0 = new h(this.P(), view0, ((RectF)object0), ((p)object1), l.S0(this.r9, view0), view1, ((RectF)object2), ((p)object3), l.S0(this.s9, view1), this.b9, this.c9, this.d9, this.e9, z, this.q9, com.google.android.material.transition.b.a(this.g9, z), com.google.android.material.transition.g.a(this.h9, z, ((RectF)object0), ((RectF)object2)), this.M0(z), this.U8, null);
                    l$h0.setBounds(Math.round(rectF1.left), Math.round(rectF1.top), Math.round(rectF1.right), Math.round(rectF1.bottom));
                    Animator animator0 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                    ((ValueAnimator)animator0).addUpdateListener(new a(this, l$h0));
                    this.c(new com.google.android.material.transition.l.b(this, view3, l$h0, view0, view1));
                    return animator0;
                }
                Log.w("l", "Skipping due to null end bounds. Ensure end view is laid out and measured.");
                return null;
            }
            Log.w("l", "Skipping due to null start bounds. Ensure start view is laid out and measured.");
        }
        return null;
    }

    private void t1(Context context0, boolean z) {
        v.t(this, context0, attr.motionEasingEmphasizedInterpolator, com.google.android.material.animation.b.b);
        v.s(this, context0, (z ? attr.motionDurationLong2 : attr.motionDurationMedium4));
        if(!this.W8) {
            v.u(this, context0, attr.motionPath);
        }
    }

    public void u1(@ColorInt int v) {
        this.b9 = v;
        this.c9 = v;
        this.d9 = v;
    }

    public void v1(@ColorInt int v) {
        this.b9 = v;
    }

    public void w1(boolean z) {
        this.U8 = z;
    }

    public void x1(@IdRes int v) {
        this.Y8 = v;
    }

    public void y1(boolean z) {
        this.q9 = z;
    }

    public void z1(@ColorInt int v) {
        this.d9 = v;
    }
}

