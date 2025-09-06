package com.facebook.fresco.vito.options;

import android.graphics.ColorFilter;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import com.facebook.imagepipeline.common.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.n;

public final class d extends b {
    @s0({"SMAP\nImageOptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageOptions.kt\ncom/facebook/fresco/vito/options/ImageOptions$Builder\n*L\n1#1,475:1\n449#1,2:476\n449#1,2:478\n449#1,2:480\n449#1,2:482\n449#1,2:484\n449#1,2:486\n449#1,2:488\n449#1,2:490\n449#1,2:492\n449#1,2:494\n449#1,2:496\n449#1,2:498\n449#1,2:500\n449#1,2:502\n449#1,2:504\n449#1,2:506\n449#1,2:508\n449#1,2:510\n449#1,2:512\n449#1,2:514\n449#1,2:516\n449#1,2:518\n449#1,2:520\n449#1,2:522\n449#1,2:524\n449#1,2:526\n449#1,2:528\n449#1,2:530\n449#1,2:532\n*S KotlinDebug\n*F\n+ 1 ImageOptions.kt\ncom/facebook/fresco/vito/options/ImageOptions$Builder\n*L\n280#1:476,2\n289#1:478,2\n296#1:480,2\n302#1:482,2\n311#1:484,2\n318#1:486,2\n322#1:488,2\n327#1:490,2\n331#1:492,2\n337#1:494,2\n343#1:496,2\n347#1:498,2\n351#1:500,2\n357#1:502,2\n361#1:504,2\n364#1:506,2\n369#1:508,2\n374#1:510,2\n379#1:512,2\n383#1:514,2\n388#1:516,2\n393#1:518,2\n395#1:520,2\n404#1:522,2\n411#1:524,2\n413#1:526,2\n424#1:528,2\n433#1:530,2\n442#1:532,2\n*E\n"})
    public static final class a extends com.facebook.fresco.vito.options.b.a {
        @DrawableRes
        private int A;
        @m
        private com.facebook.drawee.drawable.t.d B;
        @m
        private PointF C;
        @m
        private Drawable D;
        private boolean E;
        @m
        private ColorFilter F;
        @DrawableRes
        private int G;
        @m
        private Drawable H;
        @m
        private Drawable I;
        private boolean J;
        private boolean K;
        private boolean L;
        private boolean M;
        private int N;
        @m
        private e O;
        @ColorInt
        @m
        private Integer q;
        @DrawableRes
        private int r;
        @m
        private Drawable s;
        @m
        private com.facebook.drawee.drawable.t.d t;
        @m
        private PointF u;
        private boolean v;
        @DrawableRes
        private int w;
        @m
        private Drawable x;
        @m
        private com.facebook.drawee.drawable.t.d y;
        @ColorInt
        @m
        private Integer z;

        public a() {
            this.L = true;
        }

        public a(@l d d0) {
            L.p(d0, "defaultOptions");
            super(d0);
            this.L = true;
            this.q = d0.O();
            this.r = d0.R();
            this.s = d0.P();
            this.t = d0.S();
            this.u = d0.Q();
            this.v = d0.N();
            this.w = d0.U();
            this.x = d0.T();
            this.y = d0.V();
            this.z = d0.F();
            this.A = d0.I();
            this.B = d0.J();
            this.C = d0.H();
            this.D = d0.G();
            this.E = d0.E();
            this.F = d0.B();
            this.G = d0.M();
            this.H = d0.L();
            this.J = d0.a0();
            this.K = d0.Y();
            this.L = d0.Z();
            this.N = d0.K();
            this.O = d0.D();
        }

        @m
        public final Drawable A0() {
            return this.H;
        }

        public final void A1(@m Drawable drawable0) {
            this.x = drawable0;
        }

        public final int B0() {
            return this.G;
        }

        public final void B1(int v) {
            this.w = v;
        }

        public final boolean C0() {
            return this.M;
        }

        public final void C1(@m com.facebook.drawee.drawable.t.d t$d0) {
            this.y = t$d0;
        }

        public final boolean D0() {
            return this.v;
        }

        public final void D1(boolean z) {
            this.J = z;
        }

        @m
        public final Integer E0() {
            return this.q;
        }

        @m
        public final Drawable F0() {
            return this.s;
        }

        @m
        public final PointF G0() {
            return this.u;
        }

        public final int H0() {
            return this.r;
        }

        @m
        public final com.facebook.drawee.drawable.t.d I0() {
            return this.t;
        }

        @m
        public final Drawable J0() {
            return this.x;
        }

        public final int K0() {
            return this.w;
        }

        @m
        public final com.facebook.drawee.drawable.t.d L0() {
            return this.y;
        }

        public final boolean M0() {
            return this.J;
        }

        private final a N0(Function1 function10) {
            function10.invoke(this);
            return this;
        }

        @l
        public final a O0(@m Drawable drawable0) {
            this.H = drawable0;
            this.G = 0;
            return this;
        }

        @l
        public final a P0(@DrawableRes int v) {
            this.G = v;
            this.H = null;
            return this;
        }

        @l
        public final a Q0(boolean z) {
            this.M = z;
            return this;
        }

        @l
        public final a R0(@m Drawable drawable0) {
            this.s = drawable0;
            this.q = null;
            this.r = 0;
            return this;
        }

        @l
        public final a S0(@m Drawable drawable0, @m com.facebook.drawee.drawable.t.d t$d0) {
            this.s = drawable0;
            this.t = t$d0;
            this.q = null;
            this.r = 0;
            return this;
        }

        @l
        public final a T0(boolean z) {
            this.v = z;
            return this;
        }

        @l
        public final a U0(@ColorInt int v) {
            this.q = v;
            this.r = 0;
            this.s = null;
            return this;
        }

        @l
        public final a V0(@m PointF pointF0) {
            this.u = pointF0;
            return this;
        }

        @l
        public final a W0(@DrawableRes int v) {
            this.r = v;
            this.q = null;
            this.s = null;
            return this;
        }

        @l
        public final a X0(@DrawableRes int v, @m com.facebook.drawee.drawable.t.d t$d0) {
            this.r = v;
            this.t = t$d0;
            this.q = null;
            this.s = null;
            return this;
        }

        @l
        public final a Y0(@m com.facebook.drawee.drawable.t.d t$d0) {
            this.t = t$d0;
            return this;
        }

        @l
        public final a Z0(@m Drawable drawable0) {
            this.x = drawable0;
            return this;
        }

        @Override  // com.facebook.fresco.vito.options.b$a
        public c a() {
            return this.e0();
        }

        @l
        public final a a1(@m Drawable drawable0, @m com.facebook.drawee.drawable.t.d t$d0) {
            this.x = drawable0;
            this.y = t$d0;
            return this;
        }

        @l
        public final a b0(boolean z) {
            this.K = z;
            return this;
        }

        @l
        public final a b1(@DrawableRes int v) {
            this.w = v;
            return this;
        }

        @l
        public final a c0(boolean z) {
            this.L = z;
            return this;
        }

        @l
        public final a c1(@DrawableRes int v, @m com.facebook.drawee.drawable.t.d t$d0) {
            this.w = v;
            this.y = t$d0;
            return this;
        }

        @l
        public final a d0(@m Drawable drawable0) {
            this.I = drawable0;
            return this;
        }

        @l
        public final a d1(@m com.facebook.drawee.drawable.t.d t$d0) {
            this.y = t$d0;
            return this;
        }

        @l
        public d e0() {
            return new d(this);
        }

        @l
        public final a e1(boolean z) {
            this.J = z;
            return this;
        }

        @l
        public final a f0(@m ColorFilter colorFilter0) {
            this.F = colorFilter0;
            return this;
        }

        public final void f1(@m ColorFilter colorFilter0) {
            this.F = colorFilter0;
        }

        @l
        public final a g0(@m e e0) {
            this.O = e0;
            return this;
        }

        public final void g1(boolean z) {
            this.K = z;
        }

        @l
        public final a h0(boolean z) {
            this.E = z;
            return this;
        }

        public final void h1(boolean z) {
            this.L = z;
        }

        @l
        public final a i0(@ColorInt int v) {
            this.z = v;
            this.A = 0;
            this.D = null;
            return this;
        }

        public final void i1(@m Drawable drawable0) {
            this.I = drawable0;
        }

        @l
        public final a j0(@m Drawable drawable0) {
            this.z = null;
            this.A = 0;
            this.D = drawable0;
            return this;
        }

        public final void j1(@m e e0) {
            this.O = e0;
        }

        @l
        public final a k0(@m PointF pointF0) {
            this.C = pointF0;
            return this;
        }

        public final void k1(boolean z) {
            this.E = z;
        }

        @l
        public final a l0(@DrawableRes int v) {
            this.z = null;
            this.A = v;
            this.D = null;
            return this;
        }

        public final void l1(@m Integer integer0) {
            this.z = integer0;
        }

        @l
        public final a m0(@m com.facebook.drawee.drawable.t.d t$d0) {
            this.B = t$d0;
            return this;
        }

        public final void m1(@m Drawable drawable0) {
            this.D = drawable0;
        }

        @l
        public final a n0(int v) {
            this.N = v;
            return this;
        }

        public final void n1(@m PointF pointF0) {
            this.C = pointF0;
        }

        @Override  // com.facebook.fresco.vito.options.b$a
        public b o() {
            return this.e0();
        }

        @m
        public final ColorFilter o0() {
            return this.F;
        }

        public final void o1(int v) {
            this.A = v;
        }

        public final boolean p0() {
            return this.K;
        }

        public final void p1(@m com.facebook.drawee.drawable.t.d t$d0) {
            this.B = t$d0;
        }

        public final boolean q0() {
            return this.L;
        }

        public final void q1(int v) {
            this.N = v;
        }

        @m
        public final Drawable r0() {
            return this.I;
        }

        public final void r1(@m Drawable drawable0) {
            this.H = drawable0;
        }

        @m
        public final e s0() {
            return this.O;
        }

        public final void s1(int v) {
            this.G = v;
        }

        public final boolean t0() {
            return this.E;
        }

        public final void t1(boolean z) {
            this.M = z;
        }

        @m
        public final Integer u0() {
            return this.z;
        }

        public final void u1(boolean z) {
            this.v = z;
        }

        @m
        public final Drawable v0() {
            return this.D;
        }

        public final void v1(@m Integer integer0) {
            this.q = integer0;
        }

        @m
        public final PointF w0() {
            return this.C;
        }

        public final void w1(@m Drawable drawable0) {
            this.s = drawable0;
        }

        public final int x0() {
            return this.A;
        }

        public final void x1(@m PointF pointF0) {
            this.u = pointF0;
        }

        @m
        public final com.facebook.drawee.drawable.t.d y0() {
            return this.B;
        }

        public final void y1(int v) {
            this.r = v;
        }

        public final int z0() {
            return this.N;
        }

        public final void z1(@m com.facebook.drawee.drawable.t.d t$d0) {
            this.t = t$d0;
        }
    }

    public static final class com.facebook.fresco.vito.options.d.b {
        private com.facebook.fresco.vito.options.d.b() {
        }

        public com.facebook.fresco.vito.options.d.b(w w0) {
        }

        @l
        @n
        public final a a() {
            return this.c(this.b());
        }

        @l
        @n
        public final d b() {
            return d.Q;
        }

        @l
        @n
        public final a c(@l d d0) {
            L.p(d0, "imageOptions");
            return new a(d0);
        }

        @n
        public final void d(@l d d0) {
            L.p(d0, "imageOptions");
            d.Q = d0;
        }
    }

    @DrawableRes
    private final int A;
    @m
    private final com.facebook.drawee.drawable.t.d B;
    @m
    private final PointF C;
    @m
    private final Drawable D;
    private final boolean E;
    @m
    private final ColorFilter F;
    @DrawableRes
    private final int G;
    @m
    private final Drawable H;
    @m
    private final Drawable I;
    private final boolean J;
    private final int K;
    private final boolean L;
    private final boolean M;
    private final boolean N;
    @m
    private final e O;
    @l
    public static final com.facebook.fresco.vito.options.d.b P;
    @l
    private static d Q;
    @ColorInt
    @m
    private final Integer q;
    @DrawableRes
    private final int r;
    @m
    private final Drawable s;
    @m
    private final com.facebook.drawee.drawable.t.d t;
    @m
    private final PointF u;
    private final boolean v;
    @DrawableRes
    private final int w;
    @m
    private final Drawable x;
    @m
    private final com.facebook.drawee.drawable.t.d y;
    @ColorInt
    @m
    private final Integer z;

    static {
        d.P = new com.facebook.fresco.vito.options.d.b(null);
        d.Q = ((a)new a().Y0(com.facebook.drawee.drawable.t.d.h).d1(com.facebook.drawee.drawable.t.d.h).m0(com.facebook.drawee.drawable.t.d.h).i(f.d)).e0();
    }

    public d(@l a d$a0) {
        L.p(d$a0, "builder");
        super(d$a0);
        this.q = d$a0.E0();
        this.r = d$a0.H0();
        this.s = d$a0.F0();
        this.t = d$a0.I0();
        this.u = d$a0.G0();
        this.v = d$a0.D0();
        this.w = d$a0.K0();
        this.x = d$a0.J0();
        this.y = d$a0.L0();
        this.z = d$a0.u0();
        this.A = d$a0.x0();
        this.B = d$a0.y0();
        this.C = d$a0.w0();
        this.D = d$a0.v0();
        this.E = d$a0.t0();
        this.F = d$a0.o0();
        this.G = d$a0.B0();
        this.H = d$a0.A0();
        this.I = d$a0.r0();
        this.J = d$a0.M0();
        this.K = d$a0.z0();
        this.L = d$a0.p0();
        this.M = d$a0.q0();
        this.N = d$a0.C0();
        this.O = d$a0.s0();
    }

    @l
    @n
    public static final a A(@l d d0) {
        return d.P.c(d0);
    }

    @m
    public final ColorFilter B() {
        return this.F;
    }

    @m
    public final Drawable C() {
        return this.I;
    }

    @m
    public final e D() {
        return this.O;
    }

    public final boolean E() {
        return this.E;
    }

    @ColorInt
    @m
    public final Integer F() {
        return this.z;
    }

    @m
    public final Drawable G() {
        return this.D;
    }

    @m
    public final PointF H() {
        return this.C;
    }

    @DrawableRes
    public final int I() {
        return this.A;
    }

    @m
    public final com.facebook.drawee.drawable.t.d J() {
        return this.B;
    }

    public final int K() {
        return this.K;
    }

    @m
    public final Drawable L() {
        return this.H;
    }

    @DrawableRes
    public final int M() {
        return this.G;
    }

    public final boolean N() {
        return this.v;
    }

    @ColorInt
    @m
    public final Integer O() {
        return this.q;
    }

    @m
    public final Drawable P() {
        return this.s;
    }

    @m
    public final PointF Q() {
        return this.u;
    }

    @DrawableRes
    public final int R() {
        return this.r;
    }

    @m
    public final com.facebook.drawee.drawable.t.d S() {
        return this.t;
    }

    @m
    public final Drawable T() {
        return this.x;
    }

    @DrawableRes
    public final int U() {
        return this.w;
    }

    @m
    public final com.facebook.drawee.drawable.t.d V() {
        return this.y;
    }

    public final boolean W() {
        return this.N;
    }

    @n
    public static final void X(@l d d0) {
        d.P.d(d0);
    }

    public final boolean Y() {
        return this.L;
    }

    public final boolean Z() {
        return this.M;
    }

    public final boolean a0() {
        return this.J;
    }

    @Override  // com.facebook.fresco.vito.options.b
    @l
    protected com.facebook.common.internal.l.a e() {
        com.facebook.common.internal.l.a l$a0 = super.e().f("placeholderColor", this.q).d("placeholderRes", this.r).f("placeholderDrawable", this.s).f("placeholderScaleType", this.t).f("placeholderFocusPoint", this.u).g("placeholderApplyRoundingOptions", this.v).d("progressRes", this.w).f("progressDrawable", this.x).f("progressScaleType", this.y).f("errorColor", this.z).d("errorRes", this.A).f("errorScaleType", this.B).f("errorFocusPoint", this.C).f("errorDrawable", this.D).g("errorApplyRoundingOptions", this.E).f("actualImageColorFilter", this.F).d("overlayRes", this.G).f("overlayDrawable", this.H).f("backgroundDrawable", this.I).g("resizeToViewport", this.J).g("autoPlay", this.L).g("autoStop", this.M).g("mPerfMediaRemountInstrumentationFix", this.N).d("fadeDurationMs", this.K).f("customDrawableFactory", this.O);
        L.o(l$a0, "add(...)");
        return l$a0;
    }

    // 去混淆评级： 低(27)
    @Override  // com.facebook.fresco.vito.options.b
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(L.g(d.class, class0)) {
                d d0 = (d)object0;
                if(this.N) {
                    return L.g(this.q, d0.q) && this.r == d0.r && com.facebook.common.internal.l.a(this.s, d0.s) && com.facebook.common.internal.l.a(this.t, d0.t) && com.facebook.common.internal.l.a(this.u, d0.u) && this.v == d0.v && L.g(this.z, d0.z) && this.A == d0.A && com.facebook.common.internal.l.a(this.B, d0.B) && com.facebook.common.internal.l.a(this.C, d0.C) && this.E == d0.E && this.G == d0.G && com.facebook.common.internal.l.a(this.H, d0.H) && com.facebook.common.internal.l.a(this.D, d0.D) && this.w == d0.w && com.facebook.common.internal.l.a(this.x, d0.x) && com.facebook.common.internal.l.a(this.y, d0.y) && com.facebook.common.internal.l.a(this.F, d0.F) && this.J == d0.J && this.K == d0.K && this.L == d0.L && this.M == d0.M && com.facebook.common.internal.l.a(this.O, d0.O) && com.facebook.common.internal.l.a(this.D, d0.D) && this.N == d0.N ? this.g(d0) : false;
                }
                return !L.g(this.q, d0.q) || this.r != d0.r || !com.facebook.common.internal.l.a(this.s, d0.s) || !com.facebook.common.internal.l.a(this.t, d0.t) || !com.facebook.common.internal.l.a(this.u, d0.u) || this.v != d0.v || !L.g(this.z, d0.z) || this.A != d0.A || !com.facebook.common.internal.l.a(this.B, d0.B) || !com.facebook.common.internal.l.a(this.C, d0.C) || this.E != d0.E || this.G != d0.G || !com.facebook.common.internal.l.a(this.H, d0.H) || !com.facebook.common.internal.l.a(this.D, d0.D) || this.w != d0.w || this.x != d0.x || this.y != d0.y || !com.facebook.common.internal.l.a(this.F, d0.F) || this.J != d0.J || this.K != d0.K || this.L != d0.L || this.M != d0.M || !com.facebook.common.internal.l.a(this.O, d0.O) || this.D != d0.D ? false : this.g(d0);
            }
        }
        return false;
    }

    @Override  // com.facebook.fresco.vito.options.b
    public int hashCode() {
        int v = 0;
        int v1 = ((((((((((((((((((((((((super.hashCode() * 0x1F + (this.q == null ? 0 : ((int)this.q))) * 0x1F + this.r) * 0x1F + (this.s == null ? 0 : this.s.hashCode())) * 0x1F + (this.t == null ? 0 : this.t.hashCode())) * 0x1F + (this.u == null ? 0 : this.u.hashCode())) * 0x1F + this.v) * 0x1F + (this.z == null ? 0 : ((int)this.z))) * 0x1F + this.A) * 0x1F + (this.B == null ? 0 : this.B.hashCode())) * 0x1F + (this.C == null ? 0 : this.C.hashCode())) * 0x1F + (this.D == null ? 0 : this.D.hashCode())) * 0x1F + this.E) * 0x1F + this.G) * 0x1F + (this.H == null ? 0 : this.H.hashCode())) * 0x1F + (this.I == null ? 0 : this.I.hashCode())) * 0x1F + (this.x == null ? 0 : this.x.hashCode())) * 0x1F + (this.y == null ? 0 : this.y.hashCode())) * 0x1F + (this.F == null ? 0 : this.F.hashCode())) * 0x1F + this.J) * 0x1F + this.K) * 0x1F + this.L) * 0x1F + this.M) * 0x1F + this.N) * 0x1F + this.w) * 0x1F;
        e e0 = this.O;
        if(e0 != null) {
            v = e0.hashCode();
        }
        return v1 + v;
    }

    @Override  // com.facebook.fresco.vito.options.b
    @l
    public String toString() {
        return "ImageOptions{" + this.e() + "}";
    }

    @l
    @n
    public static final a w() {
        return d.P.a();
    }

    @l
    @n
    public static final d x() {
        return d.P.b();
    }

    public final boolean y(@l d d0) {
        L.p(d0, "other");
        if(this == d0) {
            return true;
        }
        if(this.N) {
            return this.G == d0.G && com.facebook.common.internal.l.a(this.H, d0.H) && com.facebook.common.internal.l.a(this.I, d0.I) && com.facebook.common.internal.l.a(this.F, d0.F) && this.J == d0.J && this.L == d0.L && this.M == d0.M && com.facebook.common.internal.l.a(this.O, d0.O) && this.N == d0.N ? this.g(d0) : false;
        }
        return this.G != d0.G || !com.facebook.common.internal.l.a(this.H, d0.H) || !com.facebook.common.internal.l.a(this.I, d0.I) || !com.facebook.common.internal.l.a(this.F, d0.F) || this.J != d0.J || !com.facebook.common.internal.l.a(this.O, d0.O) ? false : this.g(d0);
    }

    @l
    public final a z() {
        return d.P.c(this);
    }
}

