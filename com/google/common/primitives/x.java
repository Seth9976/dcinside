package com.google.common.primitives;

import J1.b;
import com.google.common.base.H;
import java.io.Serializable;
import java.math.BigInteger;
import o3.a;

@b(serializable = true)
@f
public final class x extends Number implements Serializable, Comparable {
    private final long a;
    private static final long b = 0x7FFFFFFFFFFFFFFFL;
    public static final x c;
    public static final x d;
    public static final x e;

    static {
        x.c = new x(0L);
        x.d = new x(1L);
        x.e = new x(-1L);
    }

    private x(long v) {
        this.a = v;
    }

    public BigInteger a() {
        BigInteger bigInteger0 = BigInteger.valueOf(this.a & 0x7FFFFFFFFFFFFFFFL);
        return this.a >= 0L ? bigInteger0 : bigInteger0.setBit(0x3F);
    }

    public int b(x x0) {
        H.E(x0);
        return y.a(this.a, x0.a);
    }

    public x c(x x0) {
        long v = ((x)H.E(x0)).a;
        return x.d(y.c(this.a, v));
    }

    @Override
    public int compareTo(Object object0) {
        return this.b(((x)object0));
    }

    public static x d(long v) {
        return new x(v);
    }

    @Override
    public double doubleValue() {
        return this.a < 0L ? ((double)(this.a & 1L | this.a >>> 1)) * 2.0 : ((double)this.a);
    }

    public x e(x x0) {
        long v = ((x)H.E(x0)).a;
        return x.d(this.a - v);
    }

    @Override
    public boolean equals(@a Object object0) {
        return object0 instanceof x && this.a == ((x)object0).a;
    }

    public x f(x x0) {
        long v = ((x)H.E(x0)).a;
        return x.d(y.k(this.a, v));
    }

    @Override
    public float floatValue() {
        return this.a < 0L ? ((float)(this.a & 1L | this.a >>> 1)) * 2.0f : ((float)this.a);
    }

    public x g(x x0) {
        long v = ((x)H.E(x0)).a;
        return x.d(this.a + v);
    }

    public x h(x x0) {
        long v = ((x)H.E(x0)).a;
        return x.d(this.a * v);
    }

    @Override
    public int hashCode() {
        return (int)(this.a ^ this.a >>> 0x20);
    }

    public String i(int v) {
        return y.q(this.a, v);
    }

    @Override
    public int intValue() {
        return (int)this.a;
    }

    @O1.a
    public static x j(long v) {
        H.p(v >= 0L, "value (%s) is outside the range for an unsigned long value", v);
        return x.d(v);
    }

    @O1.a
    public static x k(String s) {
        return x.l(s, 10);
    }

    @O1.a
    public static x l(String s, int v) {
        return x.d(y.j(s, v));
    }

    @Override
    public long longValue() {
        return this.a;
    }

    @O1.a
    public static x m(BigInteger bigInteger0) {
        H.E(bigInteger0);
        H.u(bigInteger0.signum() >= 0 && bigInteger0.bitLength() <= 0x40, "value (%s) is outside the range for an unsigned long value", bigInteger0);
        return x.d(bigInteger0.longValue());
    }

    @Override
    public String toString() {
        return y.p(this.a);
    }
}

