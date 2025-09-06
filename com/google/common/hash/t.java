package com.google.common.hash;

import O1.j;
import com.google.common.base.H;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.zip.Adler32;
import java.util.zip.CRC32;
import java.util.zip.Checksum;
import javax.crypto.spec.SecretKeySpec;

@k
public final class t {
    static class a {
    }

    @j
    static abstract enum b implements x {
        // 部分失败：枚举糖化
        // 枚举按原样呈现，而不是糖化为Java 5枚举。
        final class com.google.common.hash.t.b.a extends b {
            com.google.common.hash.t.b.a(String s, int v, String s1) {
                super(s1, null);
            }

            public Checksum b() {
                return new CRC32();
            }

            @Override  // com.google.common.base.Q
            public Object get() {
                return this.b();
            }
        }

        // 部分失败：枚举糖化
        // 枚举按原样呈现，而不是糖化为Java 5枚举。
        final class com.google.common.hash.t.b.b extends b {
            com.google.common.hash.t.b.b(String s, int v, String s1) {
                super(s1, null);
            }

            public Checksum b() {
                return new Adler32();
            }

            @Override  // com.google.common.base.Q
            public Object get() {
                return this.b();
            }
        }

        CRC_32("Hashing.crc32()") /* 警告！未生成枚举子类：com.google.common.hash.t$b$a */,
        ADLER_32("Hashing.adler32()") /* 警告！未生成枚举子类：com.google.common.hash.t$b$b */;

        public final q a;

        private b(String s1) {
            this.a = new i(this, 0x20, s1);
        }

        b(String s1, a t$a0) {
            this(s1);
        }

        private static b[] a() [...] // Inlined contents
    }

    static final class c extends com.google.common.hash.b {
        private c(q[] arr_q) {
            super(arr_q);
            for(int v = 0; v < arr_q.length; ++v) {
                q q0 = arr_q[v];
                H.o(q0.h() % 8 == 0, "the number of bits (%s) in hashFunction (%s) must be divisible by 8", q0.h(), q0);
            }
        }

        c(q[] arr_q, a t$a0) {
            this(arr_q);
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@o3.a Object object0) {
            return object0 instanceof c ? Arrays.equals(this.a, ((c)object0).a) : false;
        }

        @Override  // com.google.common.hash.q
        public int h() {
            q[] arr_q = this.a;
            int v1 = 0;
            for(int v = 0; v < arr_q.length; ++v) {
                v1 += arr_q[v].h();
            }
            return v1;
        }

        @Override
        public int hashCode() {
            return Arrays.hashCode(this.a);
        }

        @Override  // com.google.common.hash.b
        p m(s[] arr_s) {
            byte[] arr_b = new byte[this.h() / 8];
            int v1 = 0;
            for(int v = 0; v < arr_s.length; ++v) {
                p p0 = arr_s[v].n();
                v1 += p0.n(arr_b, v1, p0.d() / 8);
            }
            return p.h(arr_b);
        }
    }

    static final class d {
        private long a;

        public d(long v) {
            this.a = v;
        }

        public double a() {
            long v = this.a * 0x27BB2EE687B0B0FDL + 1L;
            this.a = v;
            return ((double)(((int)(v >>> 33)) + 1)) / 2147483648.0;
        }
    }

    static class e {
        static final q a;

        static {
            e.a = new F("MD5", "Hashing.md5()");
        }
    }

    static class f {
        static final q a;

        static {
            f.a = new F("SHA-1", "Hashing.sha1()");
        }
    }

    static class g {
        static final q a;

        static {
            g.a = new F("SHA-256", "Hashing.sha256()");
        }
    }

    static class h {
        static final q a;

        static {
            h.a = new F("SHA-384", "Hashing.sha384()");
        }
    }

    static class com.google.common.hash.t.i {
        static final q a;

        static {
            com.google.common.hash.t.i.a = new F("SHA-512", "Hashing.sha512()");
        }
    }

    static final int a;

    static {
        t.a = (int)System.currentTimeMillis();
    }

    @Deprecated
    public static q A(int v) {
        return new com.google.common.hash.H(v, false);
    }

    public static q B() {
        return com.google.common.hash.H.d;
    }

    public static q C(int v) {
        return new com.google.common.hash.H(v, true);
    }

    @Deprecated
    public static q D() {
        return f.a;
    }

    public static q E() {
        return g.a;
    }

    public static q F() {
        return h.a;
    }

    public static q G() {
        return com.google.common.hash.t.i.a;
    }

    public static q H() {
        return K.e;
    }

    public static q I(long v, long v1) {
        return new K(2, 4, v, v1);
    }

    public static q a() {
        return b.c.a;
    }

    static int b(int v) {
        H.e(v > 0, "Number of bits must be positive");
        return v + 0x1F & 0xFFFFFFE0;
    }

    public static p c(Iterable iterable0) {
        Iterator iterator0 = iterable0.iterator();
        H.e(iterator0.hasNext(), "Must be at least 1 hash code to combine.");
        Object object0 = iterator0.next();
        int v = ((p)object0).d();
        byte[] arr_b = new byte[v / 8];
        for(Object object1: iterable0) {
            byte[] arr_b1 = ((p)object1).a();
            H.e(arr_b1.length == v / 8, "All hashcodes must have the same bit length.");
            for(int v1 = 0; v1 < arr_b1.length; ++v1) {
                arr_b[v1] = (byte)(arr_b[v1] * 37 ^ arr_b1[v1]);
            }
        }
        return p.h(arr_b);
    }

    public static p d(Iterable iterable0) {
        Iterator iterator0 = iterable0.iterator();
        H.e(iterator0.hasNext(), "Must be at least 1 hash code to combine.");
        Object object0 = iterator0.next();
        int v = ((p)object0).d();
        byte[] arr_b = new byte[v / 8];
        for(Object object1: iterable0) {
            byte[] arr_b1 = ((p)object1).a();
            H.e(arr_b1.length == v / 8, "All hashcodes must have the same bit length.");
            for(int v1 = 0; v1 < arr_b1.length; ++v1) {
                arr_b[v1] = (byte)(arr_b[v1] + arr_b1[v1]);
            }
        }
        return p.h(arr_b);
    }

    public static q e(q q0, q q1, q[] arr_q) {
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(q0);
        arrayList0.add(q1);
        Collections.addAll(arrayList0, arr_q);
        return new c(((q[])arrayList0.toArray(new q[0])), null);
    }

    public static q f(Iterable iterable0) {
        H.E(iterable0);
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: iterable0) {
            arrayList0.add(((q)object0));
        }
        H.k(!arrayList0.isEmpty(), "number of hash functions (%s) must be > 0", arrayList0.size());
        return new c(((q[])arrayList0.toArray(new q[0])), null);
    }

    public static int g(long v, int v1) {
        int v2 = 0;
        H.k(v1 > 0, "buckets must be positive: %s", v1);
        d t$d0 = new d(v);
        while(true) {
            int v3 = (int)(((double)(v2 + 1)) / t$d0.a());
            if(v3 < 0 || v3 >= v1) {
                break;
            }
            v2 = v3;
        }
        return v2;
    }

    public static int h(p p0, int v) {
        return t.g(p0.m(), v);
    }

    public static q i() {
        return b.b.a;
    }

    public static q j() {
        return com.google.common.hash.j.a;
    }

    public static q k() {
        return l.a;
    }

    public static q l() {
        return m.a;
    }

    public static q m(int v) {
        int v1 = t.b(v);
        if(v1 == 0x20) {
            return com.google.common.hash.H.e;
        }
        if(v1 <= 0x80) {
            return G.c;
        }
        int v2 = (v1 + 0x7F) / 0x80;
        q[] arr_q = new q[v2];
        arr_q[0] = G.c;
        int v3 = t.a;
        for(int v4 = 1; v4 < v2; ++v4) {
            v3 += 0x596F0DDF;
            arr_q[v4] = t.y(v3);
        }
        return new c(arr_q, null);
    }

    public static q n(Key key0) {
        return new E("HmacMD5", key0, t.v("hmacMd5", key0));
    }

    public static q o(byte[] arr_b) {
        return t.n(new SecretKeySpec(((byte[])H.E(arr_b)), "HmacMD5"));
    }

    public static q p(Key key0) {
        return new E("HmacSHA1", key0, t.v("hmacSha1", key0));
    }

    public static q q(byte[] arr_b) {
        return t.p(new SecretKeySpec(((byte[])H.E(arr_b)), "HmacSHA1"));
    }

    public static q r(Key key0) {
        return new E("HmacSHA256", key0, t.v("hmacSha256", key0));
    }

    public static q s(byte[] arr_b) {
        return t.r(new SecretKeySpec(((byte[])H.E(arr_b)), "HmacSHA256"));
    }

    public static q t(Key key0) {
        return new E("HmacSHA512", key0, t.v("hmacSha512", key0));
    }

    public static q u(byte[] arr_b) {
        return t.t(new SecretKeySpec(((byte[])H.E(arr_b)), "HmacSHA512"));
    }

    private static String v(String s, Key key0) {
        return "Hashing." + s + "(Key[algorithm=" + key0.getAlgorithm() + ", format=" + key0.getFormat() + "])";
    }

    @Deprecated
    public static q w() {
        return e.a;
    }

    public static q x() {
        return G.b;
    }

    public static q y(int v) {
        return new G(v);
    }

    @Deprecated
    public static q z() {
        return com.google.common.hash.H.c;
    }
}

