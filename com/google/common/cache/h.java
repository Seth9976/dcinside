package com.google.common.cache;

import J1.b;
import com.google.common.base.B;
import com.google.common.base.H;
import com.google.common.base.z;
import o3.a;

@b
@i
public final class h {
    private final long a;
    private final long b;
    private final long c;
    private final long d;
    private final long e;
    private final long f;

    public h(long v, long v1, long v2, long v3, long v4, long v5) {
        boolean z = false;
        H.d(v >= 0L);
        H.d(v1 >= 0L);
        H.d(v2 >= 0L);
        H.d(v3 >= 0L);
        H.d(v4 >= 0L);
        if(v5 >= 0L) {
            z = true;
        }
        H.d(z);
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = v4;
        this.f = v5;
    }

    public double a() {
        long v = com.google.common.math.h.x(this.c, this.d);
        return v == 0L ? 0.0 : ((double)this.e) / ((double)v);
    }

    public long b() {
        return this.f;
    }

    public long c() {
        return this.a;
    }

    public double d() {
        long v = this.m();
        return v == 0L ? 1.0 : ((double)this.a) / ((double)v);
    }

    public long e() {
        return com.google.common.math.h.x(this.c, this.d);
    }

    @Override
    public boolean equals(@a Object object0) {
        return object0 instanceof h && this.a == ((h)object0).a && this.b == ((h)object0).b && this.c == ((h)object0).c && this.d == ((h)object0).d && this.e == ((h)object0).e && this.f == ((h)object0).f;
    }

    public long f() {
        return this.d;
    }

    public double g() {
        long v = com.google.common.math.h.x(this.c, this.d);
        return v == 0L ? 0.0 : ((double)this.d) / ((double)v);
    }

    public long h() {
        return this.c;
    }

    @Override
    public int hashCode() {
        return B.b(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f});
    }

    public h i(h h0) {
        return new h(Math.max(0L, com.google.common.math.h.A(this.a, h0.a)), Math.max(0L, com.google.common.math.h.A(this.b, h0.b)), Math.max(0L, com.google.common.math.h.A(this.c, h0.c)), Math.max(0L, com.google.common.math.h.A(this.d, h0.d)), Math.max(0L, com.google.common.math.h.A(this.e, h0.e)), Math.max(0L, com.google.common.math.h.A(this.f, h0.f)));
    }

    public long j() {
        return this.b;
    }

    public double k() {
        long v = this.m();
        return v == 0L ? 0.0 : ((double)this.b) / ((double)v);
    }

    public h l(h h0) {
        return new h(com.google.common.math.h.x(this.a, h0.a), com.google.common.math.h.x(this.b, h0.b), com.google.common.math.h.x(this.c, h0.c), com.google.common.math.h.x(this.d, h0.d), com.google.common.math.h.x(this.e, h0.e), com.google.common.math.h.x(this.f, h0.f));
    }

    public long m() {
        return com.google.common.math.h.x(this.a, this.b);
    }

    public long n() {
        return this.e;
    }

    @Override
    public String toString() {
        return z.c(this).e("hitCount", this.a).e("missCount", this.b).e("loadSuccessCount", this.c).e("loadExceptionCount", this.d).e("totalLoadTime", this.e).e("evictionCount", this.f).toString();
    }
}

