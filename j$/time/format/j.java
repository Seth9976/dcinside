package j$.time.format;

import j..time.b;
import j..time.temporal.q;
import java.math.BigInteger;

class j implements f {
    final q a;
    final int b;
    final int c;
    private final F d;
    final int e;
    static final long[] f;

    static {
        j.f = new long[]{0L, 10L, 100L, 1000L, 10000L, 100000L, 1000000L, 10000000L, 100000000L, 1000000000L, 10000000000L};
    }

    j(q q0, int v, int v1, F f0) {
        this.a = q0;
        this.b = v;
        this.c = v1;
        this.d = f0;
        this.e = 0;
    }

    protected j(q q0, int v, int v1, F f0, int v2) {
        this.a = q0;
        this.b = v;
        this.c = v1;
        this.d = f0;
        this.e = v2;
    }

    long b(y y0, long v) {
        return v;
    }

    boolean c(w w0) {
        return this.e == -1 || this.e > 0 && this.b == this.c && this.d == F.NOT_NEGATIVE;
    }

    int d(w w0, long v, int v1, int v2) {
        return w0.o(this.a, v, v1, v2);
    }

    j e() {
        return this.e == -1 ? this : new j(this.a, this.b, this.c, this.d, -1);
    }

    j f(int v) {
        return new j(this.a, this.b, this.c, this.d, this.e + v);
    }

    @Override  // j$.time.format.f
    public boolean l(y y0, StringBuilder stringBuilder0) {
        q q0 = this.a;
        Long long0 = y0.e(q0);
        if(long0 == null) {
            return false;
        }
        long v1 = this.b(y0, ((long)long0));
        C c0 = y0.b();
        String s = v1 == 0x8000000000000000L ? "9223372036854775808" : Long.toString(Math.abs(v1));
        int v2 = this.c;
        if(s.length() > v2) {
            throw new b("Field " + q0 + " cannot be printed as the value " + v1 + " exceeds the maximum print width of " + v2);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
        }
        c0.getClass();
        int v3 = this.b;
        F f0 = this.d;
        if(v1 >= 0L) {
            switch(f0) {
                case 1: {
                    if(v3 < 19 && v1 >= j.f[v3]) {
                        stringBuilder0.append('+');
                    }
                    break;
                }
                case 2: {
                    stringBuilder0.append('+');
                }
            }
        }
        else {
            int v4 = c.a[f0.ordinal()];
            if(v4 == 1 || v4 == 2) {
                stringBuilder0.append('-');
            }
            else {
                switch(v4) {
                    case 3: {
                        stringBuilder0.append('-');
                        break;
                    }
                    case 4: {
                        throw new b("Field " + q0 + " cannot be printed as the value " + v1 + " cannot be negative according to the SignStyle");  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                    }
                }
            }
        }
        for(int v = 0; v < v3 - s.length(); ++v) {
            stringBuilder0.append('0');
        }
        stringBuilder0.append(s);
        return true;
    }

    // This method was un-flattened
    @Override  // j$.time.format.f
    public int n(w w0, CharSequence charSequence0, int v) {
        long v16;
        int v14;
        long v12;
        int v11;
        BigInteger bigInteger0;
        int v9;
        int v8;
        boolean z2;
        boolean z1;
        boolean z;
        int v5;
        int v1 = charSequence0.length();
        if(v == v1) {
            return ~v;
        }
        int v2 = charSequence0.charAt(v);
        w0.g().getClass();
        int v3 = this.c;
        F f0 = this.d;
        int v4 = this.b;
        if(v2 == 43) {
            if(!f0.l(true, w0.l(), v4 == v3)) {
                return ~v;
            }
            v5 = v + 1;
            z = false;
            z1 = true;
        }
        else {
            w0.g().getClass();
            if(v2 == 45) {
                if(!f0.l(false, w0.l(), v4 == v3)) {
                    return ~v;
                }
                v5 = v + 1;
                z = true;
            }
            else {
                if(f0 == F.ALWAYS && w0.l()) {
                    return ~v;
                }
                v5 = v;
                z = false;
            }
            z1 = false;
        }
        int v6 = w0.l() || this.c(w0) ? v4 : 1;
        int v7 = v5 + v6;
        if(v7 > v1) {
            return ~v5;
        }
        if(w0.l() || this.c(w0)) {
            z2 = false;
            v8 = this.e;
            v9 = Math.max(v8, 0) + v3;
        }
        else {
            z2 = false;
            v8 = this.e;
            v9 = Math.max(v8, 0) + 9;
        }
        for(bigInteger0 = null; true; bigInteger0 = null) {
            int v10 = Math.min(v9 + v5, v1);
            v11 = v5;
            v12 = 0L;
            while(v11 < v10) {
                int v13 = w0.g().a(charSequence0.charAt(v11));
                if(v13 < 0) {
                    if(v11 >= v7) {
                        break;
                    }
                    return ~v5;
                }
                if(v11 + 1 - v5 > 18) {
                    if(bigInteger0 == null) {
                        bigInteger0 = BigInteger.valueOf(v12);
                    }
                    v14 = v10;
                    bigInteger0 = bigInteger0.multiply(BigInteger.TEN).add(BigInteger.valueOf(v13));
                }
                else {
                    v14 = v10;
                    v12 = v12 * 10L + ((long)v13);
                }
                v10 = v14;
                ++v11;
            }
            if(v8 <= 0 || z2) {
                break;
            }
            v9 = Math.max(v6, v11 - v5 - v8);
            z2 = true;
        }
        int v15 = v11;
        BigInteger bigInteger1 = bigInteger0;
        if(!z) {
            if(f0 == F.EXCEEDS_PAD && w0.l()) {
                int v17 = v15 - v5;
                if(z1) {
                    if(v17 <= v4) {
                        return ~(v5 - 1);
                    }
                }
                else if(v17 > v4) {
                    return ~v5;
                }
            }
            v16 = v12;
        }
        else if(bigInteger1 != null) {
            if(bigInteger1.equals(BigInteger.ZERO) && w0.l()) {
                return ~(v5 - 1);
            }
            bigInteger1 = bigInteger1.negate();
            v16 = v12;
        }
        else {
            if(v12 == 0L && w0.l()) {
                return ~(v5 - 1);
            }
            v16 = -v12;
        }
        if(bigInteger1 != null) {
            if(bigInteger1.bitLength() > 0x3F) {
                bigInteger1 = bigInteger1.divide(BigInteger.TEN);
                --v15;
            }
            return this.d(w0, bigInteger1.longValue(), v5, v15);
        }
        return this.d(w0, v16, v5, v15);
    }

    @Override
    public String toString() {
        int v = this.c;
        q q0 = this.a;
        F f0 = this.d;
        int v1 = this.b;
        if(v1 == 1 && v == 19 && f0 == F.NORMAL) {
            return "Value(" + q0 + ")";
        }
        return v1 != v || f0 != F.NOT_NEGATIVE ? "Value(" + q0 + "," + v1 + "," + v + "," + f0 + ")" : "Value(" + q0 + "," + v1 + ")";
    }
}

