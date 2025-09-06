package com.google.common.math;

import J1.c;
import J1.d;
import com.google.common.base.B;
import com.google.common.base.H;
import com.google.common.base.z;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import o3.a;

@c
@d
@e
public final class j implements Serializable {
    private final n a;
    private final n b;
    private final double c;
    private static final int d = 88;
    private static final long e;

    j(n n0, n n1, double f) {
        this.a = n0;
        this.b = n1;
        this.c = f;
    }

    public long a() {
        return this.a.a();
    }

    private static double b(double f) {
        if(f >= 1.0) {
            return 1.0;
        }
        return f <= -1.0 ? -1.0 : f;
    }

    private static double c(double f) {
        return f > 0.0 ? f : 4.900000E-324;
    }

    public static j d(byte[] arr_b) {
        H.E(arr_b);
        H.m(arr_b.length == 88, "Expected PairedStats.BYTES = %s, got %s", 88, arr_b.length);
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(arr_b).order(ByteOrder.LITTLE_ENDIAN);
        return new j(n.r(byteBuffer0), n.r(byteBuffer0), byteBuffer0.getDouble());
    }

    public g e() {
        boolean z = false;
        H.g0(this.a() > 1L);
        if(Double.isNaN(this.c)) {
            return g.a();
        }
        double f = this.a.x();
        if(f > 0.0) {
            return this.b.x() > 0.0 ? g.f(this.a.d(), this.b.d()).b(this.c / f) : g.b(this.b.d());
        }
        if(this.b.x() > 0.0) {
            z = true;
        }
        H.g0(z);
        return g.i(this.a.d());
    }

    @Override
    public boolean equals(@a Object object0) {
        if(object0 == null) {
            return false;
        }
        Class class0 = object0.getClass();
        return j.class == class0 ? this.a.equals(((j)object0).a) && this.b.equals(((j)object0).b) && Double.doubleToLongBits(this.c) == Double.doubleToLongBits(((j)object0).c) : false;
    }

    public double f() {
        boolean z = false;
        H.g0(this.a() > 1L);
        if(Double.isNaN(this.c)) {
            return NaN;
        }
        double f = this.k().x();
        double f1 = this.l().x();
        H.g0(f > 0.0);
        if(f1 > 0.0) {
            z = true;
        }
        H.g0(z);
        return j.b(this.c / Math.sqrt(j.c(f * f1)));
    }

    public double g() {
        H.g0(this.a() != 0L);
        double f = (double)this.a();
        return this.c / f;
    }

    public double h() {
        H.g0(this.a() > 1L);
        long v = this.a();
        return this.c / ((double)(v - 1L));
    }

    @Override
    public int hashCode() {
        return B.b(new Object[]{this.a, this.b, this.c});
    }

    double i() {
        return this.c;
    }

    public byte[] j() {
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(88).order(ByteOrder.LITTLE_ENDIAN);
        this.a.z(byteBuffer0);
        this.b.z(byteBuffer0);
        byteBuffer0.putDouble(this.c);
        return byteBuffer0.array();
    }

    public n k() {
        return this.a;
    }

    public n l() {
        return this.b;
    }

    @Override
    public String toString() {
        return this.a() <= 0L ? z.c(this).f("xStats", this.a).f("yStats", this.b).toString() : z.c(this).f("xStats", this.a).f("yStats", this.b).b("populationCovariance", this.g()).toString();
    }
}

