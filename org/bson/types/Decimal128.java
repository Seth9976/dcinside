package org.bson.types;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class Decimal128 extends Number implements Comparable {
    private final long a;
    private final long b;
    private static final long c = 0x3F6F5BF7C3C19B7FL;
    private static final long d = 0x7800000000000000L;
    private static final long e = 0x7C00000000000000L;
    private static final long f = 0x8000000000000000L;
    private static final int g = 0xFFFFE7E0;
    private static final int h = 0x17DF;
    private static final int i = 0x1820;
    private static final int j = 0x71;
    private static final BigInteger k;
    private static final BigInteger l;
    private static final BigInteger m;
    private static final Set n;
    private static final Set o;
    private static final Set p;
    private static final Set q;
    public static final Decimal128 r;
    public static final Decimal128 s;
    public static final Decimal128 t;
    public static final Decimal128 u;
    public static final Decimal128 v;
    public static final Decimal128 w;

    static {
        Decimal128.k = new BigInteger("10");
        Decimal128.l = new BigInteger("1");
        Decimal128.m = new BigInteger("0");
        Decimal128.n = new HashSet(Collections.singletonList("nan"));
        Decimal128.o = new HashSet(Collections.singletonList("-nan"));
        Decimal128.p = new HashSet(Arrays.asList(new String[]{"inf", "+inf", "infinity", "+infinity"}));
        Decimal128.q = new HashSet(Arrays.asList(new String[]{"-inf", "-infinity"}));
        Decimal128.r = Decimal128.fromIEEE754BIDEncoding(0x7800000000000000L, 0L);
        Decimal128.s = Decimal128.fromIEEE754BIDEncoding(0xF800000000000000L, 0L);
        Decimal128.t = Decimal128.fromIEEE754BIDEncoding(0xFC00000000000000L, 0L);
        Decimal128.u = Decimal128.fromIEEE754BIDEncoding(0x7C00000000000000L, 0L);
        Decimal128.v = Decimal128.fromIEEE754BIDEncoding(0x3040000000000000L, 0L);
        Decimal128.w = Decimal128.fromIEEE754BIDEncoding(0xB040000000000000L, 0L);
    }

    public Decimal128(long v) {
        this(new BigDecimal(v, MathContext.DECIMAL128));
    }

    private Decimal128(long v, long v1) {
        this.a = v;
        this.b = v1;
    }

    public Decimal128(BigDecimal bigDecimal0) {
        this(bigDecimal0, bigDecimal0.signum() == -1);
    }

    private Decimal128(BigDecimal bigDecimal0, boolean z) {
        BigDecimal bigDecimal1 = this.c(bigDecimal0);
        int v = bigDecimal1.scale();
        if(((long)(-v)) < 0xFFFFFFFFFFFFE7E0L || ((long)(-v)) > 0x17DFL) {
            throw new AssertionError("Exponent is out of range for Decimal128 encoding: " + ((long)(-v)));
        }
        if(bigDecimal1.unscaledValue().bitLength() > 0x71) {
            throw new AssertionError("Unscaled roundedValue is out of range for Decimal128 encoding:" + bigDecimal1.unscaledValue());
        }
        BigInteger bigInteger0 = bigDecimal1.unscaledValue().abs();
        int v1 = bigInteger0.bitLength();
        long v2 = 0L;
        long v4 = 0L;
        for(int v3 = 0; v3 < Math.min(0x40, v1); ++v3) {
            if(bigInteger0.testBit(v3)) {
                v4 |= 1L << v3;
            }
        }
        for(int v5 = 0x40; v5 < v1; ++v5) {
            if(bigInteger0.testBit(v5)) {
                v2 |= 1L << v5 - 0x40;
            }
        }
        this.a = bigDecimal1.signum() != -1 && !z ? ((long)(-v)) + 0x1820L << 49 | v2 : ((long)(-v)) + 0x1820L << 49 | v2 | 0x8000000000000000L;
        this.b = v4;
    }

    public BigDecimal a() {
        if(this.m()) {
            throw new ArithmeticException("NaN can not be converted to a BigDecimal");
        }
        if(this.l()) {
            throw new ArithmeticException("Infinity can not be converted to a BigDecimal");
        }
        BigDecimal bigDecimal0 = this.b();
        if(this.n() && bigDecimal0.signum() == 0) {
            throw new ArithmeticException("Negative zero can not be converted to a BigDecimal");
        }
        return bigDecimal0;
    }

    private BigDecimal b() {
        int v = this.g();
        if(this.u()) {
            return BigDecimal.valueOf(0L, -v);
        }
        return this.n() ? new BigDecimal(new BigInteger(-1, this.f()), -v) : new BigDecimal(new BigInteger(1, this.f()), -v);
    }

    private BigDecimal c(BigDecimal bigDecimal0) {
        if(-bigDecimal0.scale() > 0x17DF) {
            int v = bigDecimal0.scale();
            if(bigDecimal0.unscaledValue().equals(Decimal128.m)) {
                return new BigDecimal(bigDecimal0.unscaledValue(), 0xFFFFE821);
            }
            if(bigDecimal0.precision() + (-v - 0x17DF) > 34) {
                throw new NumberFormatException("Exponent is out of range for Decimal128 encoding of " + bigDecimal0);
            }
            BigInteger bigInteger0 = Decimal128.k.pow(-v - 0x17DF);
            return new BigDecimal(bigDecimal0.unscaledValue().multiply(bigInteger0), bigDecimal0.scale() + (-v - 0x17DF));
        }
        if(-bigDecimal0.scale() < 0xFFFFE7E0) {
            int v1 = bigDecimal0.scale();
            if(this.e(bigDecimal0, v1 - 0x1820) == 0) {
                return new BigDecimal(bigDecimal0.unscaledValue().divide(Decimal128.l), bigDecimal0.scale() - (v1 - 0x1820));
            }
            BigInteger bigInteger1 = Decimal128.k.pow(v1 - 0x1820);
            return new BigDecimal(bigDecimal0.unscaledValue().divide(bigInteger1), bigDecimal0.scale() - (v1 - 0x1820));
        }
        BigDecimal bigDecimal1 = bigDecimal0.round(MathContext.DECIMAL128);
        int v2 = bigDecimal0.precision() - bigDecimal1.precision();
        if(v2 > 0) {
            this.e(bigDecimal0, v2);
        }
        return bigDecimal1;
    }

    @Override
    public int compareTo(Object object0) {
        return this.d(((Decimal128)object0));
    }

    public int d(Decimal128 decimal1280) {
        if(this.m()) {
            return !decimal1280.m();
        }
        if(this.l()) {
            if(this.n()) {
                return !decimal1280.l() || !decimal1280.n() ? -1 : 0;
            }
            if(decimal1280.m()) {
                return -1;
            }
            return !decimal1280.l() || decimal1280.n() ? 1 : 0;
        }
        BigDecimal bigDecimal0 = this.b();
        BigDecimal bigDecimal1 = decimal1280.b();
        if(this.p(bigDecimal0) && decimal1280.p(bigDecimal1)) {
            if(this.j(bigDecimal0)) {
                return decimal1280.j(bigDecimal1) ? 0 : -1;
            }
            if(decimal1280.j(bigDecimal1)) {
                return 1;
            }
        }
        if(decimal1280.m()) {
            return -1;
        }
        if(decimal1280.l()) {
            return decimal1280.n() ? 1 : -1;
        }
        return bigDecimal0.compareTo(bigDecimal1);
    }

    @Override
    public double doubleValue() {
        if(this.m()) {
            return NaN;
        }
        if(this.l()) {
            return this.n() ? -Infinity : Infinity;
        }
        BigDecimal bigDecimal0 = this.b();
        return this.j(bigDecimal0) ? -0.0 : bigDecimal0.doubleValue();
    }

    private int e(BigDecimal bigDecimal0, int v) {
        String s = bigDecimal0.unscaledValue().abs().toString();
        int v1 = Math.max(0, s.length() - v);
        for(int v2 = v1; v2 < s.length(); ++v2) {
            if(s.charAt(v2) != 0x30) {
                throw new NumberFormatException("Conversion to Decimal128 would require inexact rounding of " + bigDecimal0);
            }
        }
        return v1;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return Decimal128.class == class0 && this.a == ((Decimal128)object0).a ? this.b == ((Decimal128)object0).b : false;
        }
        return false;
    }

    private byte[] f() {
        byte[] arr_b = new byte[15];
        long v = 0xFFL;
        long v1 = 0xFFL;
        for(int v2 = 14; v2 >= 7; --v2) {
            arr_b[v2] = (byte)(((int)((this.b & v1) >>> (14 - v2 << 3))));
            v1 <<= 8;
        }
        for(int v3 = 6; v3 >= 1; --v3) {
            arr_b[v3] = (byte)(((int)((this.a & v) >>> (6 - v3 << 3))));
            v <<= 8;
        }
        arr_b[0] = (byte)(((int)((this.a & 0x1000000000000L) >>> 0x30)));
        return arr_b;
    }

    @Override
    public float floatValue() {
        return (float)this.doubleValue();
    }

    public static Decimal128 fromIEEE754BIDEncoding(long v, long v1) {
        return new Decimal128(v, v1);
    }

    // 去混淆评级： 低(20)
    private int g() {
        return this.u() ? ((int)((this.a & 0x1FFFE00000000000L) >>> 0x2F)) - 0x1820 : ((int)((this.a & 0x7FFF800000000000L) >>> 49)) - 0x1820;
    }

    public long h() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return ((int)(this.b ^ this.b >>> 0x20)) * 0x1F + ((int)(this.a ^ this.a >>> 0x20));
    }

    public long i() {
        return this.b;
    }

    @Override
    public int intValue() {
        return (int)this.doubleValue();
    }

    private boolean j(BigDecimal bigDecimal0) {
        return this.n() && bigDecimal0.signum() == 0;
    }

    public boolean k() {
        return !this.l();
    }

    public boolean l() {
        return (this.a & 0x7800000000000000L) == 0x7800000000000000L;
    }

    @Override
    public long longValue() {
        return (long)this.doubleValue();
    }

    public boolean m() {
        return (this.a & 0x7C00000000000000L) == 0x7C00000000000000L;
    }

    public boolean n() {
        return (this.a & 0x8000000000000000L) == 0x8000000000000000L;
    }

    // 去混淆评级： 低(20)
    private boolean p(BigDecimal bigDecimal0) {
        return !this.m() && !this.l() && bigDecimal0.compareTo(BigDecimal.ZERO) == 0;
    }

    public static Decimal128 r(String s) {
        String s1 = s.toLowerCase();
        if(Decimal128.n.contains(s1)) {
            return Decimal128.u;
        }
        if(Decimal128.o.contains(s1)) {
            return Decimal128.t;
        }
        if(Decimal128.p.contains(s1)) {
            return Decimal128.r;
        }
        return Decimal128.q.contains(s1) ? Decimal128.s : new Decimal128(new BigDecimal(s), s.charAt(0) == 45);
    }

    private String s() {
        StringBuilder stringBuilder0 = new StringBuilder();
        BigDecimal bigDecimal0 = this.b();
        String s = bigDecimal0.unscaledValue().abs().toString();
        if(this.n()) {
            stringBuilder0.append('-');
        }
        int v = bigDecimal0.scale();
        int v1 = s.length() - 1 - v;
        if(-v <= 0 && v1 >= -6) {
            if(-v == 0) {
                stringBuilder0.append(s);
                return stringBuilder0.toString();
            }
            int v2 = v - s.length();
            if(v2 >= 0) {
                stringBuilder0.append('0');
                stringBuilder0.append('.');
                for(int v3 = 0; v3 < v2; ++v3) {
                    stringBuilder0.append('0');
                }
                stringBuilder0.append(s, 0, s.length());
                return stringBuilder0.toString();
            }
            stringBuilder0.append(s, 0, -v2);
            stringBuilder0.append('.');
            stringBuilder0.append(s, -v2, -v2 - -v);
            return stringBuilder0.toString();
        }
        stringBuilder0.append(s.charAt(0));
        if(s.length() > 1) {
            stringBuilder0.append('.');
            stringBuilder0.append(s, 1, s.length());
        }
        stringBuilder0.append('E');
        if(v1 > 0) {
            stringBuilder0.append('+');
        }
        stringBuilder0.append(v1);
        return stringBuilder0.toString();
    }

    @Override
    public String toString() {
        if(this.m()) {
            return "NaN";
        }
        if(this.l()) {
            return this.n() ? "-Infinity" : "Infinity";
        }
        return this.s();
    }

    private boolean u() {
        return (this.a & 0x6000000000000000L) == 0x6000000000000000L;
    }
}

