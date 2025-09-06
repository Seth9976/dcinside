package com.google.common.hash;

import com.google.common.base.H;
import com.google.common.primitives.l;
import java.io.Serializable;

@k
public abstract class p {
    static final class a extends p implements Serializable {
        final byte[] b;
        private static final long c;

        a(byte[] arr_b) {
            this.b = (byte[])H.E(arr_b);
        }

        @Override  // com.google.common.hash.p
        public byte[] a() {
            return (byte[])this.b.clone();
        }

        @Override  // com.google.common.hash.p
        public int b() {
            H.n0(this.b.length >= 4, "HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", this.b.length);
            return (this.b[3] & 0xFF) << 24 | (this.b[0] & 0xFF | (this.b[1] & 0xFF) << 8 | (this.b[2] & 0xFF) << 16);
        }

        @Override  // com.google.common.hash.p
        public long c() {
            H.n0(this.b.length >= 8, "HashCode#asLong() requires >= 8 bytes (it only has %s bytes).", this.b.length);
            return this.m();
        }

        @Override  // com.google.common.hash.p
        public int d() {
            return this.b.length * 8;
        }

        @Override  // com.google.common.hash.p
        boolean f(p p0) {
            byte[] arr_b = p0.l();
            if(this.b.length != arr_b.length) {
                return false;
            }
            boolean z = true;
            for(int v = 0; true; ++v) {
                byte[] arr_b1 = this.b;
                if(v >= arr_b1.length) {
                    break;
                }
                z &= arr_b1[v] == p0.l()[v];
            }
            return z;
        }

        @Override  // com.google.common.hash.p
        byte[] l() {
            return this.b;
        }

        @Override  // com.google.common.hash.p
        public long m() {
            long v = (long)(this.b[0] & 0xFF);
            for(int v1 = 1; v1 < Math.min(this.b.length, 8); ++v1) {
                v |= (((long)this.b[v1]) & 0xFFL) << v1 * 8;
            }
            return v;
        }

        @Override  // com.google.common.hash.p
        void o(byte[] arr_b, int v, int v1) {
            System.arraycopy(this.b, 0, arr_b, v, v1);
        }
    }

    static final class b extends p implements Serializable {
        final int b;
        private static final long c;

        b(int v) {
            this.b = v;
        }

        @Override  // com.google.common.hash.p
        public byte[] a() {
            return new byte[]{((byte)this.b), ((byte)(this.b >> 8)), ((byte)(this.b >> 16)), ((byte)(this.b >> 24))};
        }

        @Override  // com.google.common.hash.p
        public int b() {
            return this.b;
        }

        @Override  // com.google.common.hash.p
        public long c() {
            throw new IllegalStateException("this HashCode only has 32 bits; cannot create a long");
        }

        @Override  // com.google.common.hash.p
        public int d() {
            return 0x20;
        }

        @Override  // com.google.common.hash.p
        boolean f(p p0) {
            int v = p0.b();
            return this.b == v;
        }

        @Override  // com.google.common.hash.p
        public long m() {
            return ((long)this.b) & 0xFFFFFFFFL;
        }

        @Override  // com.google.common.hash.p
        void o(byte[] arr_b, int v, int v1) {
            for(int v2 = 0; v2 < v1; ++v2) {
                arr_b[v + v2] = (byte)(this.b >> v2 * 8);
            }
        }
    }

    static final class c extends p implements Serializable {
        final long b;
        private static final long c;

        c(long v) {
            this.b = v;
        }

        @Override  // com.google.common.hash.p
        public byte[] a() {
            return new byte[]{((byte)(((int)this.b))), ((byte)(((int)(this.b >> 8)))), ((byte)(((int)(this.b >> 16)))), ((byte)(((int)(this.b >> 24)))), ((byte)(((int)(this.b >> 0x20)))), ((byte)(((int)(this.b >> 40)))), ((byte)(((int)(this.b >> 0x30)))), ((byte)(((int)(this.b >> 56))))};
        }

        @Override  // com.google.common.hash.p
        public int b() {
            return (int)this.b;
        }

        @Override  // com.google.common.hash.p
        public long c() {
            return this.b;
        }

        @Override  // com.google.common.hash.p
        public int d() {
            return 0x40;
        }

        @Override  // com.google.common.hash.p
        boolean f(p p0) {
            long v = p0.c();
            return this.b == v;
        }

        @Override  // com.google.common.hash.p
        public long m() {
            return this.b;
        }

        @Override  // com.google.common.hash.p
        void o(byte[] arr_b, int v, int v1) {
            for(int v2 = 0; v2 < v1; ++v2) {
                arr_b[v + v2] = (byte)(((int)(this.b >> v2 * 8)));
            }
        }
    }

    private static final char[] a;

    static {
        p.a = "0123456789abcdef".toCharArray();
    }

    public abstract byte[] a();

    public abstract int b();

    public abstract long c();

    public abstract int d();

    private static int e(char c) {
        if(c >= 0x30 && c <= 57) {
            return c - 0x30;
        }
        if(c < 97 || c > 102) {
            throw new IllegalArgumentException("Illegal hexadecimal character: " + c);
        }
        return c - 87;
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(@o3.a Object object0) {
        return object0 instanceof p && this.d() == ((p)object0).d() && this.f(((p)object0));
    }

    abstract boolean f(p arg1);

    public static p g(byte[] arr_b) {
        H.e(arr_b.length >= 1, "A HashCode must contain at least 1 byte.");
        return p.h(((byte[])arr_b.clone()));
    }

    static p h(byte[] arr_b) {
        return new a(arr_b);
    }

    @Override
    public final int hashCode() {
        if(this.d() >= 0x20) {
            return this.b();
        }
        byte[] arr_b = this.l();
        int v = arr_b[0] & 0xFF;
        for(int v1 = 1; v1 < arr_b.length; ++v1) {
            v |= (arr_b[v1] & 0xFF) << v1 * 8;
        }
        return v;
    }

    public static p i(int v) {
        return new b(v);
    }

    public static p j(long v) {
        return new c(v);
    }

    public static p k(String s) {
        boolean z = true;
        H.u(s.length() >= 2, "input string (%s) must have at least 2 characters", s);
        if(s.length() % 2 != 0) {
            z = false;
        }
        H.u(z, "input string (%s) must have an even number of characters", s);
        byte[] arr_b = new byte[s.length() / 2];
        for(int v = 0; v < s.length(); v += 2) {
            arr_b[v / 2] = (byte)((p.e(s.charAt(v)) << 4) + p.e(s.charAt(v + 1)));
        }
        return p.h(arr_b);
    }

    byte[] l() {
        return this.a();
    }

    public abstract long m();

    @O1.a
    public int n(byte[] arr_b, int v, int v1) {
        int v2 = l.u(new int[]{v1, this.d() / 8});
        H.f0(v, v + v2, arr_b.length);
        this.o(arr_b, v, v2);
        return v2;
    }

    abstract void o(byte[] arg1, int arg2, int arg3);

    @Override
    public final String toString() {
        byte[] arr_b = this.l();
        StringBuilder stringBuilder0 = new StringBuilder(arr_b.length * 2);
        for(int v = 0; v < arr_b.length; ++v) {
            int v1 = arr_b[v];
            stringBuilder0.append(p.a[v1 >> 4 & 15]);
            stringBuilder0.append(p.a[v1 & 15]);
        }
        return stringBuilder0.toString();
    }
}

