package com.google.common.hash;

import J1.a;
import J1.e;
import com.google.common.base.B;
import com.google.common.base.H;
import com.google.common.base.I;
import com.google.common.primitives.t;
import com.google.common.primitives.u;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.math.RoundingMode;

@a
@k
public final class g implements I, Serializable {
    static class com.google.common.hash.g.a {
    }

    static class b implements Serializable {
        final long[] a;
        final int b;
        final n c;
        final c d;
        private static final long e = 1L;

        b(g g0) {
            this.a = com.google.common.hash.h.c.i(g0.a.a);
            this.b = g0.b;
            this.c = g0.c;
            this.d = g0.d;
        }

        Object a() {
            return new g(new com.google.common.hash.h.c(this.a), this.b, this.c, this.d, null);
        }
    }

    interface c extends Serializable {
        boolean d2(@com.google.common.hash.I Object arg1, n arg2, int arg3, com.google.common.hash.h.c arg4);

        int ordinal();

        boolean t(@com.google.common.hash.I Object arg1, n arg2, int arg3, com.google.common.hash.h.c arg4);
    }

    private final com.google.common.hash.h.c a;
    private final int b;
    private final n c;
    private final c d;
    private static final long e = 0xDECAFL;

    private g(com.google.common.hash.h.c h$c0, int v, n n0, c g$c0) {
        boolean z = false;
        H.k(v > 0, "numHashFunctions (%s) must be > 0", v);
        if(v <= 0xFF) {
            z = true;
        }
        H.k(z, "numHashFunctions (%s) must be <= 255", v);
        this.a = (com.google.common.hash.h.c)H.E(h$c0);
        this.b = v;
        this.c = (n)H.E(n0);
        this.d = (c)H.E(g$c0);
    }

    g(com.google.common.hash.h.c h$c0, int v, n n0, c g$c0, com.google.common.hash.g.a g$a0) {
        this(h$c0, v, n0, g$c0);
    }

    @Override  // com.google.common.base.I
    @Deprecated
    public boolean apply(@com.google.common.hash.I Object object0) {
        return this.o(object0);
    }

    public long e() {
        long v = this.a.b();
        return com.google.common.math.c.q(-Math.log1p(-(((double)this.a.a()) / ((double)v))) * ((double)v) / ((double)this.b), RoundingMode.HALF_UP);
    }

    // 去混淆评级： 中等(50)
    @Override  // com.google.common.base.I
    public boolean equals(@o3.a Object object0) {
        return object0 == this ? true : object0 instanceof g && (this.b == ((g)object0).b && this.c.equals(((g)object0).c) && this.a.equals(((g)object0).a) && this.d.equals(((g)object0).d));
    }

    @e
    long f() {
        return this.a.b();
    }

    public g g() {
        return new g(this.a.c(), this.b, this.c, this.d);
    }

    public static g h(n n0, int v) {
        return g.j(n0, ((long)v));
    }

    @Override
    public int hashCode() {
        return B.b(new Object[]{this.b, this.c, this.d, this.a});
    }

    public static g i(n n0, int v, double f) {
        return g.k(n0, ((long)v), f);
    }

    public static g j(n n0, long v) {
        return g.k(n0, v, 0.03);
    }

    public static g k(n n0, long v, double f) {
        return g.l(n0, v, f, h.b);
    }

    @e
    static g l(n n0, long v, double f, c g$c0) {
        long v2;
        H.E(n0);
        boolean z = false;
        int v1 = Long.compare(v, 0L);
        H.p(v1 >= 0, "Expected insertions (%s) must be >= 0", v);
        H.u(f > 0.0, "False positive probability (%s) must be > 0.0", f);
        if(f < 1.0) {
            z = true;
        }
        H.u(z, "False positive probability (%s) must be < 1.0", f);
        H.E(g$c0);
        if(v1 == 0) {
            v = 1L;
        }
        try {
            v2 = g.p(v, f);
            return new g(new com.google.common.hash.h.c(v2), g.q(v, v2), n0, g$c0);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            throw new IllegalArgumentException("Could not create BloomFilter of " + v2 + " bits", illegalArgumentException0);
        }
    }

    public double m() {
        return Math.pow(((double)this.a.a()) / ((double)this.f()), this.b);
    }

    public boolean n(g g0) {
        H.E(g0);
        return this != g0 && this.b == g0.b && this.f() == g0.f() && this.d.equals(g0.d) && this.c.equals(g0.c);
    }

    public boolean o(@com.google.common.hash.I Object object0) {
        return this.d.t(object0, this.c, this.b, this.a);
    }

    @e
    static long p(long v, double f) {
        if(f == 0.0) {
            f = 4.900000E-324;
        }
        return (long)(((double)(-v)) * Math.log(f) / 0.480453);
    }

    @e
    static int q(long v, long v1) {
        return Math.max(1, ((int)Math.round(((double)v1) / ((double)v) * 0.693147)));
    }

    @O1.a
    public boolean r(@com.google.common.hash.I Object object0) {
        return this.d.d2(object0, this.c, this.b, this.a);
    }

    public void s(g g0) {
        H.E(g0);
        H.e(this != g0, "Cannot combine a BloomFilter with itself.");
        H.m(this.b == g0.b, "BloomFilters must have the same number of hash functions (%s != %s)", this.b, g0.b);
        H.s(this.f() == g0.f(), "BloomFilters must have the same size underlying bit arrays (%s != %s)", this.f(), g0.f());
        H.y(this.d.equals(g0.d), "BloomFilters must have equal strategies (%s != %s)", this.d, g0.d);
        H.y(this.c.equals(g0.c), "BloomFilters must have equal funnels (%s != %s)", this.c, g0.c);
        this.a.f(g0.a);
    }

    public static g u(InputStream inputStream0, n n0) throws IOException {
        int v3;
        int v4;
        int v1;
        DataInputStream dataInputStream0;
        H.F(inputStream0, "InputStream");
        H.F(n0, "Funnel");
        int v = -1;
        try {
            dataInputStream0 = new DataInputStream(inputStream0);
            v1 = dataInputStream0.readByte();
            v3 = -1;
            v3 = u.p(dataInputStream0.readByte());
            v4 = dataInputStream0.readInt();
            goto label_18;
        }
        catch(IOException iOException0) {
            throw iOException0;
        }
        catch(Exception exception0) {
        }
        int v2 = -1;
        v3 = -1;
        throw new IOException("Unable to deserialize BloomFilter from InputStream. strategyOrdinal: " + v + " numHashFunctions: " + v3 + " dataLength: " + v2, exception0);
        try {
            v3 = -1;
            v3 = u.p(dataInputStream0.readByte());
            v4 = dataInputStream0.readInt();
            goto label_18;
        }
        catch(IOException iOException0) {
            throw iOException0;
        }
        catch(Exception exception0) {
        }
        v = v1;
        v2 = -1;
        throw new IOException("Unable to deserialize BloomFilter from InputStream. strategyOrdinal: " + v + " numHashFunctions: " + v3 + " dataLength: " + v2, exception0);
        try {
        label_18:
            h h0 = h.values()[v1];
            com.google.common.hash.h.c h$c0 = new com.google.common.hash.h.c(com.google.common.math.h.d(v4, 0x40L));
            for(int v5 = 0; v5 < v4; ++v5) {
                h$c0.g(v5, dataInputStream0.readLong());
            }
            return new g(h$c0, v3, n0, h0);
        }
        catch(IOException iOException0) {
        }
        catch(Exception exception0) {
            v = v1;
            v2 = v4;
            throw new IOException("Unable to deserialize BloomFilter from InputStream. strategyOrdinal: " + v + " numHashFunctions: " + v3 + " dataLength: " + v2, exception0);
        }
        throw iOException0;
    }

    private void w(ObjectInputStream objectInputStream0) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    private Object x() {
        return new b(this);
    }

    public void y(OutputStream outputStream0) throws IOException {
        DataOutputStream dataOutputStream0 = new DataOutputStream(outputStream0);
        dataOutputStream0.writeByte(t.a(this.d.ordinal()));
        dataOutputStream0.writeByte(u.a(this.b));
        dataOutputStream0.writeInt(this.a.a.length());
        for(int v = 0; v < this.a.a.length(); ++v) {
            dataOutputStream0.writeLong(this.a.a.get(v));
        }
    }
}

