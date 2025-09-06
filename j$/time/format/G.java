package j$.time.format;

import j..time.temporal.a;
import j..time.temporal.q;
import j..time.temporal.t;
import j..util.Objects;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

final class g extends j {
    private final boolean g;

    g(a a0, int v, int v1, boolean z) {
        this(a0, v, v1, z, 0);
        Objects.requireNonNull(a0, "field");
        if(!a0.l().g()) {
            throw new IllegalArgumentException("Field must have a fixed set of values: " + a0);
        }
        if(v < 0 || v > 9) {
            throw new IllegalArgumentException("Minimum width must be from 0 to 9 inclusive but was " + v);
        }
        if(v1 < 1 || v1 > 9) {
            throw new IllegalArgumentException("Maximum width must be from 1 to 9 inclusive but was " + v1);
        }
        if(v1 < v) {
            throw new IllegalArgumentException("Maximum width must exceed or equal the minimum width but " + v1 + " < " + v);
        }
    }

    g(q q0, int v, int v1, boolean z, int v2) {
        super(q0, v, v1, F.NOT_NEGATIVE, v2);
        this.g = z;
    }

    // 去混淆评级： 低(20)
    @Override  // j$.time.format.j
    final boolean c(w w0) {
        return w0.l() && this.b == this.c && !this.g;
    }

    @Override  // j$.time.format.j
    final j e() {
        return this.e == -1 ? this : new g(this.a, this.b, this.c, this.g, -1);
    }

    @Override  // j$.time.format.j
    final j f(int v) {
        return new g(this.a, this.b, this.c, this.g, this.e + v);
    }

    @Override  // j$.time.format.j
    public final boolean l(y y0, StringBuilder stringBuilder0) {
        q q0 = this.a;
        Long long0 = y0.e(q0);
        if(long0 == null) {
            return false;
        }
        C c0 = y0.b();
        long v1 = (long)long0;
        t t0 = q0.l();
        t0.b(v1, q0);
        BigDecimal bigDecimal0 = BigDecimal.valueOf(t0.e());
        BigDecimal bigDecimal1 = BigDecimal.valueOf(t0.d()).subtract(bigDecimal0).add(BigDecimal.ONE);
        BigDecimal bigDecimal2 = BigDecimal.valueOf(v1).subtract(bigDecimal0);
        RoundingMode roundingMode0 = RoundingMode.FLOOR;
        BigDecimal bigDecimal3 = bigDecimal2.divide(bigDecimal1, 9, roundingMode0);
        BigDecimal bigDecimal4 = BigDecimal.ZERO;
        if(bigDecimal3.compareTo(bigDecimal4) != 0) {
            bigDecimal4 = bigDecimal3.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal3.stripTrailingZeros();
        }
        int v2 = bigDecimal4.scale();
        boolean z = this.g;
        int v3 = this.b;
        if(v2 != 0) {
            String s = bigDecimal4.setScale(Math.min(Math.max(bigDecimal4.scale(), v3), this.c), roundingMode0).toPlainString().substring(2);
            c0.getClass();
            if(z) {
                stringBuilder0.append('.');
            }
            stringBuilder0.append(s);
        }
        else if(v3 > 0) {
            if(z) {
                c0.getClass();
                stringBuilder0.append('.');
            }
            for(int v = 0; v < v3; ++v) {
                c0.getClass();
                stringBuilder0.append('0');
            }
            return true;
        }
        return true;
    }

    @Override  // j$.time.format.j
    public final int n(w w0, CharSequence charSequence0, int v) {
        int v1 = w0.l() || this.c(w0) ? this.b : 0;
        int v2 = w0.l() || this.c(w0) ? this.c : 9;
        int v3 = charSequence0.length();
        if(v == v3) {
            return v1 <= 0 ? v : ~v;
        }
        if(this.g) {
            int v4 = charSequence0.charAt(v);
            w0.g().getClass();
            if(v4 != 46) {
                return v1 <= 0 ? v : ~v;
            }
            ++v;
        }
        int v5 = v1 + v;
        if(v5 > v3) {
            return ~v;
        }
        int v6 = Math.min(v2 + v, v3);
        int v7 = v;
        int v8 = 0;
        while(v7 < v6) {
            int v9 = w0.g().a(charSequence0.charAt(v7));
            if(v9 < 0) {
                if(v7 + 1 >= v5) {
                    break;
                }
                return ~v;
            }
            v8 = v8 * 10 + v9;
            ++v7;
        }
        BigDecimal bigDecimal0 = new BigDecimal(v8).movePointLeft(v7 - v);
        t t0 = this.a.l();
        BigDecimal bigDecimal1 = BigDecimal.valueOf(t0.e());
        long v10 = bigDecimal0.multiply(BigDecimal.valueOf(t0.d()).subtract(bigDecimal1).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(bigDecimal1).longValueExact();
        return w0.o(this.a, v10, v, v7);
    }

    // 去混淆评级： 低(20)
    @Override  // j$.time.format.j
    public final String toString() {
        return this.g ? "Fraction(" + this.a + "," + this.b + "," + this.c + ",DecimalPoint" + ")" : "Fraction(" + this.a + "," + this.b + "," + this.c + "" + ")";
    }
}

