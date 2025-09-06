package androidx.compose.animation.core;

import y4.l;

public final class EasingFunctionsKt {
    @l
    private static final Easing A;
    @l
    private static final Easing B;
    @l
    private static final Easing C;
    @l
    private static final Easing D;
    @l
    private static final Easing E;
    @l
    private static final Easing F;
    @l
    private static final Easing G;
    @l
    private static final Easing H;
    @l
    private static final Easing a;
    @l
    private static final Easing b;
    @l
    private static final Easing c;
    @l
    private static final Easing d;
    @l
    private static final Easing e;
    @l
    private static final Easing f;
    @l
    private static final Easing g;
    @l
    private static final Easing h;
    @l
    private static final Easing i;
    @l
    private static final Easing j;
    @l
    private static final Easing k;
    @l
    private static final Easing l;
    @l
    private static final Easing m;
    @l
    private static final Easing n;
    @l
    private static final Easing o;
    @l
    private static final Easing p;
    @l
    private static final Easing q;
    @l
    private static final Easing r;
    @l
    private static final Easing s;
    @l
    private static final Easing t;
    @l
    private static final Easing u;
    @l
    private static final Easing v;
    @l
    private static final Easing w;
    @l
    private static final Easing x;
    @l
    private static final Easing y;
    @l
    private static final Easing z;

    static {
        EasingFunctionsKt.a = new CubicBezierEasing(0.25f, 0.1f, 0.25f, 1.0f);
        EasingFunctionsKt.b = new CubicBezierEasing(0.0f, 0.0f, 0.58f, 1.0f);
        EasingFunctionsKt.c = new CubicBezierEasing(0.42f, 0.0f, 1.0f, 1.0f);
        EasingFunctionsKt.d = new CubicBezierEasing(0.42f, 0.0f, 0.58f, 1.0f);
        EasingFunctionsKt.e = new CubicBezierEasing(0.12f, 0.0f, 0.39f, 0.0f);
        EasingFunctionsKt.f = new CubicBezierEasing(0.61f, 1.0f, 0.88f, 1.0f);
        EasingFunctionsKt.g = new CubicBezierEasing(0.37f, 0.0f, 0.63f, 1.0f);
        EasingFunctionsKt.h = new CubicBezierEasing(0.32f, 0.0f, 0.67f, 0.0f);
        EasingFunctionsKt.i = new CubicBezierEasing(0.33f, 1.0f, 0.68f, 1.0f);
        EasingFunctionsKt.j = new CubicBezierEasing(0.65f, 0.0f, 0.35f, 1.0f);
        EasingFunctionsKt.k = new CubicBezierEasing(0.64f, 0.0f, 0.78f, 0.0f);
        EasingFunctionsKt.l = new CubicBezierEasing(0.22f, 1.0f, 0.36f, 1.0f);
        EasingFunctionsKt.m = new CubicBezierEasing(0.83f, 0.0f, 0.17f, 1.0f);
        EasingFunctionsKt.n = new CubicBezierEasing(0.55f, 0.0f, 1.0f, 0.45f);
        EasingFunctionsKt.o = new CubicBezierEasing(0.0f, 0.55f, 0.45f, 1.0f);
        EasingFunctionsKt.p = new CubicBezierEasing(0.85f, 0.0f, 0.15f, 1.0f);
        EasingFunctionsKt.q = new CubicBezierEasing(0.11f, 0.0f, 0.5f, 0.0f);
        EasingFunctionsKt.r = new CubicBezierEasing(0.5f, 1.0f, 0.89f, 1.0f);
        EasingFunctionsKt.s = new CubicBezierEasing(0.45f, 0.0f, 0.55f, 1.0f);
        EasingFunctionsKt.t = new CubicBezierEasing(0.5f, 0.0f, 0.75f, 0.0f);
        EasingFunctionsKt.u = new CubicBezierEasing(0.25f, 1.0f, 0.5f, 1.0f);
        EasingFunctionsKt.v = new CubicBezierEasing(0.76f, 0.0f, 0.24f, 1.0f);
        EasingFunctionsKt.w = new CubicBezierEasing(0.7f, 0.0f, 0.84f, 0.0f);
        EasingFunctionsKt.x = new CubicBezierEasing(0.16f, 1.0f, 0.3f, 1.0f);
        EasingFunctionsKt.y = new CubicBezierEasing(0.87f, 0.0f, 0.13f, 1.0f);
        EasingFunctionsKt.z = new CubicBezierEasing(0.36f, 0.0f, 0.66f, -0.56f);
        EasingFunctionsKt.A = new CubicBezierEasing(0.34f, 1.56f, 0.64f, 1.0f);
        EasingFunctionsKt.B = new CubicBezierEasing(0.68f, -0.6f, 0.32f, 1.6f);
        EasingFunctionsKt.C = (float f) -> (f == 0.0f || f == 1.0f ? 0.0f : ((float)(((double)(-((float)Math.pow(2.0, f * 10.0f - 10.0f)))) * Math.sin(((double)(f * 10.0f - 10.75f)) * 2.094395))));
        EasingFunctionsKt.D = (float f) -> (f == 0.0f || f == 1.0f ? 0.0f : ((float)(((double)(((float)Math.pow(2.0, -10.0f * f)))) * Math.sin(((double)(f * 10.0f - 0.75f)) * 2.094395) + 1.0)));
        EasingFunctionsKt.E = EasingFunctionsKt.EaseInOutElastic.1.a;
        EasingFunctionsKt.F = EasingFunctionsKt.EaseOutBounce.1.a;
        EasingFunctionsKt.G = (float f) -> 1.0f - EasingFunctionsKt.z().a(1.0f - f);
        EasingFunctionsKt.H = (float f) -> (((double)f) < 0.5 ? (1.0f - EasingFunctionsKt.z().a(1.0f - f * 2.0f)) / 2.0f : (EasingFunctionsKt.z().a(f * 2.0f - 1.0f) + 1.0f) / 2.0f);
    }

    @l
    public static final Easing A() {
        return EasingFunctionsKt.o;
    }

    @l
    public static final Easing B() {
        return EasingFunctionsKt.i;
    }

    @l
    public static final Easing C() {
        return EasingFunctionsKt.D;
    }

    @l
    public static final Easing D() {
        return EasingFunctionsKt.x;
    }

    @l
    public static final Easing E() {
        return EasingFunctionsKt.r;
    }

    @l
    public static final Easing F() {
        return EasingFunctionsKt.u;
    }

    @l
    public static final Easing G() {
        return EasingFunctionsKt.l;
    }

    @l
    public static final Easing H() {
        return EasingFunctionsKt.f;
    }

    @l
    public static final Easing a() {
        return EasingFunctionsKt.a;
    }

    @l
    public static final Easing b() {
        return EasingFunctionsKt.c;
    }

    @l
    public static final Easing c() {
        return EasingFunctionsKt.z;
    }

    @l
    public static final Easing d() {
        return EasingFunctionsKt.G;
    }

    @l
    public static final Easing e() {
        return EasingFunctionsKt.n;
    }

    @l
    public static final Easing f() {
        return EasingFunctionsKt.h;
    }

    @l
    public static final Easing g() {
        return EasingFunctionsKt.C;
    }

    @l
    public static final Easing h() {
        return EasingFunctionsKt.w;
    }

    @l
    public static final Easing i() {
        return EasingFunctionsKt.d;
    }

    @l
    public static final Easing j() {
        return EasingFunctionsKt.B;
    }

    @l
    public static final Easing k() {
        return EasingFunctionsKt.H;
    }

    @l
    public static final Easing l() {
        return EasingFunctionsKt.p;
    }

    @l
    public static final Easing m() {
        return EasingFunctionsKt.j;
    }

    @l
    public static final Easing n() {
        return EasingFunctionsKt.E;
    }

    @l
    public static final Easing o() {
        return EasingFunctionsKt.y;
    }

    @l
    public static final Easing p() {
        return EasingFunctionsKt.s;
    }

    @l
    public static final Easing q() {
        return EasingFunctionsKt.v;
    }

    @l
    public static final Easing r() {
        return EasingFunctionsKt.m;
    }

    @l
    public static final Easing s() {
        return EasingFunctionsKt.g;
    }

    @l
    public static final Easing t() {
        return EasingFunctionsKt.q;
    }

    @l
    public static final Easing u() {
        return EasingFunctionsKt.t;
    }

    @l
    public static final Easing v() {
        return EasingFunctionsKt.k;
    }

    @l
    public static final Easing w() {
        return EasingFunctionsKt.e;
    }

    @l
    public static final Easing x() {
        return EasingFunctionsKt.b;
    }

    @l
    public static final Easing y() {
        return EasingFunctionsKt.A;
    }

    @l
    public static final Easing z() {
        return EasingFunctionsKt.F;
    }
}

