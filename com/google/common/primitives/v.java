package com.google.common.primitives;

import J1.b;
import J1.c;
import J1.d;
import com.google.common.base.H;
import java.math.BigInteger;
import o3.a;

@b(emulated = true)
@f
public final class v extends Number implements Comparable {
    private final int a;
    public static final v b;
    public static final v c;
    public static final v d;

    static {
        v.b = v.d(0);
        v.c = v.d(1);
        v.d = v.d(-1);
    }

    private v(int v) {
        this.a = v;
    }

    public BigInteger a() {
        return BigInteger.valueOf(this.longValue());
    }

    public int b(v v0) {
        H.E(v0);
        return w.b(this.a, v0.a);
    }

    public v c(v v0) {
        int v1 = ((v)H.E(v0)).a;
        return v.d(w.d(this.a, v1));
    }

    @Override
    public int compareTo(Object object0) {
        return this.b(((v)object0));
    }

    public static v d(int v) {
        return new v(v);
    }

    @Override
    public double doubleValue() {
        return (double)this.longValue();
    }

    public v e(v v0) {
        int v1 = ((v)H.E(v0)).a;
        return v.d(this.a - v1);
    }

    @Override
    public boolean equals(@a Object object0) {
        return object0 instanceof v && this.a == ((v)object0).a;
    }

    public v f(v v0) {
        int v1 = ((v)H.E(v0)).a;
        return v.d(w.l(this.a, v1));
    }

    @Override
    public float floatValue() {
        return (float)this.longValue();
    }

    public v g(v v0) {
        int v1 = ((v)H.E(v0)).a;
        return v.d(this.a + v1);
    }

    @c
    @d
    public v h(v v0) {
        int v1 = ((v)H.E(v0)).a;
        return v.d(this.a * v1);
    }

    @Override
    public int hashCode() {
        return this.a;
    }

    public String i(int v) {
        return w.t(this.a, v);
    }

    @Override
    public int intValue() {
        return this.a;
    }

    public static v j(long v) {
        H.p((0xFFFFFFFFL & v) == v, "value (%s) is outside the range for an unsigned integer value", v);
        return v.d(((int)v));
    }

    public static v k(String s) {
        return v.l(s, 10);
    }

    public static v l(String s, int v) {
        return v.d(w.k(s, v));
    }

    @Override
    public long longValue() {
        return ((long)this.a) & 0xFFFFFFFFL;
    }

    public static v m(BigInteger bigInteger0) {
        H.E(bigInteger0);
        H.u(bigInteger0.signum() >= 0 && bigInteger0.bitLength() <= 0x20, "value (%s) is outside the range for an unsigned integer value", bigInteger0);
        return v.d(bigInteger0.intValue());
    }

    @Override
    public String toString() {
        return this.i(10);
    }
}

