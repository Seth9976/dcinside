package androidx.compose.ui.geometry;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.n;

@Immutable
public final class RoundRect {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final RoundRect a() {
            return RoundRect.l;
        }

        @n
        public static void b() {
        }
    }

    private final float a;
    private final float b;
    private final float c;
    private final float d;
    private final long e;
    private final long f;
    private final long g;
    private final long h;
    @m
    private RoundRect i;
    @l
    public static final Companion j;
    public static final int k;
    @l
    private static final RoundRect l;

    static {
        RoundRect.j = new Companion(null);
        RoundRect.l = RoundRectKt.e(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    private RoundRect(float f, float f1, float f2, float f3, long v, long v1, long v2, long v3) {
        this.a = f;
        this.b = f1;
        this.c = f2;
        this.d = f3;
        this.e = v;
        this.f = v1;
        this.g = v2;
        this.h = v3;
    }

    // 去混淆评级： 低(40)
    public RoundRect(float f, float f1, float f2, float f3, long v, long v1, long v2, long v3, int v4, w w0) {
        this(f, f1, f2, f3, ((v4 & 16) == 0 ? v : 0L), ((v4 & 0x20) == 0 ? v1 : 0L), ((v4 & 0x40) == 0 ? v2 : 0L), ((v4 & 0x80) == 0 ? v3 : 0L), null);
    }

    public RoundRect(float f, float f1, float f2, float f3, long v, long v1, long v2, long v3, w w0) {
        this(f, f1, f2, f3, v, v1, v2, v3);
    }

    public final float b() {
        return this.a;
    }

    public final float c() {
        return this.b;
    }

    public final float d() {
        return this.c;
    }

    public final float e() {
        return this.d;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof RoundRect)) {
            return false;
        }
        if(Float.compare(this.a, ((RoundRect)object0).a) != 0) {
            return false;
        }
        if(Float.compare(this.b, ((RoundRect)object0).b) != 0) {
            return false;
        }
        if(Float.compare(this.c, ((RoundRect)object0).c) != 0) {
            return false;
        }
        if(Float.compare(this.d, ((RoundRect)object0).d) != 0) {
            return false;
        }
        if(!CornerRadius.j(this.e, ((RoundRect)object0).e)) {
            return false;
        }
        if(!CornerRadius.j(this.f, ((RoundRect)object0).f)) {
            return false;
        }
        return CornerRadius.j(this.g, ((RoundRect)object0).g) ? CornerRadius.j(this.h, ((RoundRect)object0).h) : false;
    }

    public final long f() {
        return this.e;
    }

    public final long g() {
        return this.f;
    }

    public final long h() {
        return this.g;
    }

    @Override
    public int hashCode() {
        return ((((((Float.floatToIntBits(this.a) * 0x1F + Float.floatToIntBits(this.b)) * 0x1F + Float.floatToIntBits(this.c)) * 0x1F + Float.floatToIntBits(this.d)) * 0x1F + CornerRadius.p(this.e)) * 0x1F + CornerRadius.p(this.f)) * 0x1F + CornerRadius.p(this.g)) * 0x1F + CornerRadius.p(this.h);
    }

    public final long i() {
        return this.h;
    }

    public final boolean j(long v) {
        float f3;
        float f2;
        float f1;
        float f;
        if(Offset.p(v) >= this.a && Offset.p(v) < this.c && Offset.r(v) >= this.b && Offset.r(v) < this.d) {
            RoundRect roundRect0 = this.y();
            if(Offset.p(v) < this.a + CornerRadius.m(roundRect0.e) && Offset.r(v) < this.b + CornerRadius.o(roundRect0.e)) {
                f = Offset.p(v) - this.a - CornerRadius.m(roundRect0.e);
                f1 = Offset.r(v) - this.b - CornerRadius.o(roundRect0.e);
                f2 = CornerRadius.m(roundRect0.e);
                f3 = CornerRadius.o(roundRect0.e);
                return f / f2 * (f / f2) + f1 / f3 * (f1 / f3) <= 1.0f;
            }
            if(Offset.p(v) > this.c - CornerRadius.m(roundRect0.f) && Offset.r(v) < this.b + CornerRadius.o(roundRect0.f)) {
                f = Offset.p(v) - this.c + CornerRadius.m(roundRect0.f);
                f1 = Offset.r(v) - this.b - CornerRadius.o(roundRect0.f);
                f2 = CornerRadius.m(roundRect0.f);
                f3 = CornerRadius.o(roundRect0.f);
                return f / f2 * (f / f2) + f1 / f3 * (f1 / f3) <= 1.0f;
            }
            if(Offset.p(v) > this.c - CornerRadius.m(roundRect0.g) && Offset.r(v) > this.d - CornerRadius.o(roundRect0.g)) {
                f = Offset.p(v) - this.c + CornerRadius.m(roundRect0.g);
                f1 = Offset.r(v) - this.d + CornerRadius.o(roundRect0.g);
                f2 = CornerRadius.m(roundRect0.g);
                f3 = CornerRadius.o(roundRect0.g);
                return f / f2 * (f / f2) + f1 / f3 * (f1 / f3) <= 1.0f;
            }
            if(Offset.p(v) < this.a + CornerRadius.m(roundRect0.h) && Offset.r(v) > this.d - CornerRadius.o(roundRect0.h)) {
                f = Offset.p(v) - this.a - CornerRadius.m(roundRect0.h);
                f1 = Offset.r(v) - this.d + CornerRadius.o(roundRect0.h);
                f2 = CornerRadius.m(roundRect0.h);
                f3 = CornerRadius.o(roundRect0.h);
                return f / f2 * (f / f2) + f1 / f3 * (f1 / f3) <= 1.0f;
            }
            return true;
        }
        return false;
    }

    @l
    public final RoundRect k(float f, float f1, float f2, float f3, long v, long v1, long v2, long v3) {
        return new RoundRect(f, f1, f2, f3, v, v1, v2, v3, null);
    }

    public static RoundRect l(RoundRect roundRect0, float f, float f1, float f2, float f3, long v, long v1, long v2, long v3, int v4, Object object0) {
        float f4 = (v4 & 1) == 0 ? f : roundRect0.a;
        float f5 = (v4 & 2) == 0 ? f1 : roundRect0.b;
        float f6 = (v4 & 4) == 0 ? f2 : roundRect0.c;
        float f7 = (v4 & 8) == 0 ? f3 : roundRect0.d;
        long v5 = (v4 & 16) == 0 ? v : roundRect0.e;
        long v6 = (v4 & 0x20) == 0 ? v1 : roundRect0.f;
        long v7 = (v4 & 0x40) == 0 ? v2 : roundRect0.g;
        return (v4 & 0x80) == 0 ? roundRect0.k(f4, f5, f6, f7, v5, v6, v7, v3) : roundRect0.k(f4, f5, f6, f7, v5, v6, v7, roundRect0.h);
    }

    public final float m() {
        return this.d;
    }

    public final long n() {
        return this.h;
    }

    public final long o() {
        return this.g;
    }

    public final float p() {
        return this.d - this.b;
    }

    public final float q() {
        return this.a;
    }

    public final float r() {
        return this.c;
    }

    public final float s() {
        return this.b;
    }

    public final long t() {
        return this.e;
    }

    @Override
    @l
    public String toString() {
        long v = this.e;
        long v1 = this.f;
        long v2 = this.g;
        long v3 = this.h;
        String s = GeometryUtilsKt.a(this.a, 1) + ", " + GeometryUtilsKt.a(this.b, 1) + ", " + GeometryUtilsKt.a(this.c, 1) + ", " + GeometryUtilsKt.a(this.d, 1);
        if(CornerRadius.j(v, v1) && CornerRadius.j(v1, v2) && CornerRadius.j(v2, v3)) {
            return CornerRadius.m(v) == CornerRadius.o(v) ? "RoundRect(rect=" + s + ", radius=" + GeometryUtilsKt.a(CornerRadius.m(v), 1) + ')' : "RoundRect(rect=" + s + ", x=" + GeometryUtilsKt.a(CornerRadius.m(v), 1) + ", y=" + GeometryUtilsKt.a(CornerRadius.o(v), 1) + ')';
        }
        return "RoundRect(rect=" + s + ", topLeft=" + CornerRadius.t(v) + ", topRight=" + CornerRadius.t(v1) + ", bottomRight=" + CornerRadius.t(v2) + ", bottomLeft=" + CornerRadius.t(v3) + ')';
    }

    public final long u() {
        return this.f;
    }

    public final float v() {
        return this.c - this.a;
    }

    @l
    public static final RoundRect w() {
        return RoundRect.j.a();
    }

    private final float x(float f, float f1, float f2, float f3) {
        float f4 = f1 + f2;
        return f4 <= f3 || f4 == 0.0f ? f : Math.min(f, f3 / f4);
    }

    private final RoundRect y() {
        RoundRect roundRect0 = this.i;
        if(roundRect0 == null) {
            float f = this.x(this.x(this.x(this.x(1.0f, CornerRadius.o(this.h), CornerRadius.o(this.e), this.p()), CornerRadius.m(this.e), CornerRadius.m(this.f), this.v()), CornerRadius.o(this.f), CornerRadius.o(this.g), this.p()), CornerRadius.m(this.g), CornerRadius.m(this.h), this.v());
            roundRect0 = new RoundRect(this.a * f, this.b * f, this.c * f, this.d * f, CornerRadiusKt.a(CornerRadius.m(this.e) * f, CornerRadius.o(this.e) * f), CornerRadiusKt.a(CornerRadius.m(this.f) * f, CornerRadius.o(this.f) * f), CornerRadiusKt.a(CornerRadius.m(this.g) * f, CornerRadius.o(this.g) * f), CornerRadiusKt.a(CornerRadius.m(this.h) * f, CornerRadius.o(this.h) * f), null);
            this.i = roundRect0;
        }
        return roundRect0;
    }
}

