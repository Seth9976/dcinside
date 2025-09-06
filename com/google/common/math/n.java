package com.google.common.math;

import J1.c;
import J1.d;
import com.google.common.base.B;
import com.google.common.base.H;
import com.google.common.base.z;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import o3.a;

@c
@d
@e
public final class n implements Serializable {
    private final long a;
    private final double b;
    private final double c;
    private final double d;
    private final double e;
    static final int f = 40;
    private static final long g;

    n(long v, double f, double f1, double f2, double f3) {
        this.a = v;
        this.b = f;
        this.c = f1;
        this.d = f2;
        this.e = f3;
    }

    public long a() {
        return this.a;
    }

    public static n b(byte[] arr_b) {
        H.E(arr_b);
        H.m(arr_b.length == 40, "Expected Stats.BYTES = %s remaining , got %s", 40, arr_b.length);
        return n.r(ByteBuffer.wrap(arr_b).order(ByteOrder.LITTLE_ENDIAN));
    }

    public double c() {
        H.g0(this.a != 0L);
        return this.e;
    }

    public double d() {
        H.g0(this.a != 0L);
        return this.b;
    }

    public static double e(Iterable iterable0) {
        return n.f(iterable0.iterator());
    }

    @Override
    public boolean equals(@a Object object0) {
        if(object0 == null) {
            return false;
        }
        Class class0 = object0.getClass();
        return n.class == class0 ? this.a == ((n)object0).a && Double.doubleToLongBits(this.b) == Double.doubleToLongBits(((n)object0).b) && Double.doubleToLongBits(this.c) == Double.doubleToLongBits(((n)object0).c) && Double.doubleToLongBits(this.d) == Double.doubleToLongBits(((n)object0).d) && Double.doubleToLongBits(this.e) == Double.doubleToLongBits(((n)object0).e) : false;
    }

    public static double f(Iterator iterator0) {
        H.d(iterator0.hasNext());
        Object object0 = iterator0.next();
        double f = ((Number)object0).doubleValue();
        long v = 1L;
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            double f1 = ((Number)object1).doubleValue();
            ++v;
            if(com.google.common.primitives.d.n(f1) && com.google.common.primitives.d.n(f)) {
                f += (f1 - f) / ((double)v);
            }
            else {
                f = o.i(f, f1);
            }
        }
        return f;
    }

    public static double g(double[] arr_f) {
        H.d(arr_f.length > 0);
        double f = arr_f[0];
        for(int v = 1; v < arr_f.length; ++v) {
            double f1 = arr_f[v];
            f = !com.google.common.primitives.d.n(f1) || !com.google.common.primitives.d.n(f) ? o.i(f, f1) : f + (f1 - f) / ((double)(v + 1));
        }
        return f;
    }

    public static double h(int[] arr_v) {
        H.d(arr_v.length > 0);
        double f = (double)arr_v[0];
        for(int v = 1; v < arr_v.length; ++v) {
            double f1 = (double)arr_v[v];
            f = !com.google.common.primitives.d.n(f1) || !com.google.common.primitives.d.n(f) ? o.i(f, f1) : f + (f1 - f) / ((double)(v + 1));
        }
        return f;
    }

    @Override
    public int hashCode() {
        return B.b(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }

    public static double i(long[] arr_v) {
        H.d(arr_v.length > 0);
        double f = (double)arr_v[0];
        for(int v = 1; v < arr_v.length; ++v) {
            double f1 = (double)arr_v[v];
            f = !com.google.common.primitives.d.n(f1) || !com.google.common.primitives.d.n(f) ? o.i(f, f1) : f + (f1 - f) / ((double)(v + 1));
        }
        return f;
    }

    public double j() {
        H.g0(this.a != 0L);
        return this.d;
    }

    public static n k(Iterable iterable0) {
        o o0 = new o();
        o0.d(iterable0);
        return o0.s();
    }

    public static n l(Iterator iterator0) {
        o o0 = new o();
        o0.e(iterator0);
        return o0.s();
    }

    public static n m(double[] arr_f) {
        o o0 = new o();
        o0.f(arr_f);
        return o0.s();
    }

    public static n n(int[] arr_v) {
        o o0 = new o();
        o0.g(arr_v);
        return o0.s();
    }

    public static n o(long[] arr_v) {
        o o0 = new o();
        o0.h(arr_v);
        return o0.s();
    }

    public double p() {
        return Math.sqrt(this.q());
    }

    public double q() {
        H.g0(this.a > 0L);
        if(Double.isNaN(this.c)) {
            return NaN;
        }
        return this.a == 1L ? 0.0 : com.google.common.math.d.b(this.c) / ((double)this.a());
    }

    static n r(ByteBuffer byteBuffer0) {
        H.E(byteBuffer0);
        H.m(byteBuffer0.remaining() >= 40, "Expected at least Stats.BYTES = %s remaining , got %s", 40, byteBuffer0.remaining());
        return new n(byteBuffer0.getLong(), byteBuffer0.getDouble(), byteBuffer0.getDouble(), byteBuffer0.getDouble(), byteBuffer0.getDouble());
    }

    public double s() {
        return Math.sqrt(this.u());
    }

    @Override
    public String toString() {
        return this.a() <= 0L ? z.c(this).e("count", this.a).toString() : z.c(this).e("count", this.a).b("mean", this.b).b("populationStandardDeviation", this.p()).b("min", this.d).b("max", this.e).toString();
    }

    public double u() {
        H.g0(this.a > 1L);
        return Double.isNaN(this.c) ? NaN : com.google.common.math.d.b(this.c) / ((double)(this.a - 1L));
    }

    public double w() {
        return this.b * ((double)this.a);
    }

    double x() {
        return this.c;
    }

    public byte[] y() {
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(40).order(ByteOrder.LITTLE_ENDIAN);
        this.z(byteBuffer0);
        return byteBuffer0.array();
    }

    void z(ByteBuffer byteBuffer0) {
        H.E(byteBuffer0);
        H.m(byteBuffer0.remaining() >= 40, "Expected at least Stats.BYTES = %s remaining , got %s", 40, byteBuffer0.remaining());
        byteBuffer0.putLong(this.a).putDouble(this.b).putDouble(this.c).putDouble(this.d).putDouble(this.e);
    }
}

