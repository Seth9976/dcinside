package com.google.crypto.tink.shaded.protobuf;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public abstract class z {
    static class a {
    }

    static final class b extends z {
        private final byte[] i;
        private final boolean j;
        private int k;
        private int l;
        private int m;
        private int n;
        private int o;
        private boolean p;
        private int q;

        private b(byte[] arr_b, int v, int v1, boolean z) {
            super(null);
            this.q = 0x7FFFFFFF;
            this.i = arr_b;
            this.k = v1 + v;
            this.m = v;
            this.n = v;
            this.j = z;
        }

        b(byte[] arr_b, int v, int v1, boolean z, a z$a0) {
            this(arr_b, v, v1, z);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public int A() throws IOException {
            return this.O();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public int B() throws IOException {
            return this.M();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public long C() throws IOException {
            return this.N();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public float D() throws IOException {
            return Float.intBitsToFloat(this.M());
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public R0 E(int v, j1 j10, V v1) throws IOException {
            this.b();
            ++this.a;
            R0 r00 = (R0)j10.l(this, v1);
            this.a(v << 3 | 4);
            --this.a;
            return r00;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public void F(int v, com.google.crypto.tink.shaded.protobuf.R0.a r0$a0, V v1) throws IOException {
            this.b();
            ++this.a;
            r0$a0.j9(this, v1);
            this.a(v << 3 | 4);
            --this.a;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public int G() throws IOException {
            return this.O();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public long H() throws IOException {
            return this.R();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public R0 I(j1 j10, V v0) throws IOException {
            int v1 = this.O();
            this.b();
            int v2 = this.u(v1);
            ++this.a;
            R0 r00 = (R0)j10.l(this, v0);
            this.a(0);
            --this.a;
            if(this.g() != 0) {
                throw y0.n();
            }
            this.t(v2);
            return r00;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public void J(com.google.crypto.tink.shaded.protobuf.R0.a r0$a0, V v0) throws IOException {
            int v1 = this.O();
            this.b();
            int v2 = this.u(v1);
            ++this.a;
            r0$a0.j9(this, v0);
            this.a(0);
            --this.a;
            if(this.g() != 0) {
                throw y0.n();
            }
            this.t(v2);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public byte K() throws IOException {
            int v = this.m;
            if(v == this.k) {
                throw y0.n();
            }
            this.m = v + 1;
            return this.i[v];
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public byte[] L(int v) throws IOException {
            if(v > 0) {
                int v1 = this.m;
                if(v <= this.k - v1) {
                    int v2 = v + v1;
                    this.m = v2;
                    return Arrays.copyOfRange(this.i, v1, v2);
                }
            }
            if(v > 0) {
                throw y0.n();
            }
            if(v != 0) {
                throw y0.h();
            }
            return t0.e;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public int M() throws IOException {
            int v = this.m;
            if(this.k - v < 4) {
                throw y0.n();
            }
            this.m = v + 4;
            return (this.i[v + 3] & 0xFF) << 24 | (this.i[v] & 0xFF | (this.i[v + 1] & 0xFF) << 8 | (this.i[v + 2] & 0xFF) << 16);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public long N() throws IOException {
            int v = this.m;
            if(this.k - v < 8) {
                throw y0.n();
            }
            this.m = v + 8;
            return (((long)this.i[v + 7]) & 0xFFL) << 56 | (((long)this.i[v]) & 0xFFL | (((long)this.i[v + 1]) & 0xFFL) << 8 | (((long)this.i[v + 2]) & 0xFFL) << 16 | (((long)this.i[v + 3]) & 0xFFL) << 24 | (((long)this.i[v + 4]) & 0xFFL) << 0x20 | (((long)this.i[v + 5]) & 0xFFL) << 40 | (((long)this.i[v + 6]) & 0xFFL) << 0x30);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public int O() throws IOException {
            int v5;
            int v = this.m;
            int v1 = this.k;
            if(v1 != v) {
                byte[] arr_b = this.i;
                int v2 = arr_b[v];
                if(v2 >= 0) {
                    this.m = v + 1;
                    return v2;
                }
                if(v1 - (v + 1) >= 9) {
                    int v3 = v + 2;
                    int v4 = arr_b[v + 1] << 7 ^ v2;
                    if(v4 < 0) {
                        v5 = v4 ^ 0xFFFFFF80;
                        this.m = v3;
                        return v5;
                    }
                    int v6 = v + 3;
                    int v7 = arr_b[v3] << 14 ^ v4;
                    if(v7 >= 0) {
                        v5 = v7 ^ 0x3F80;
                        v3 = v6;
                        this.m = v3;
                        return v5;
                    }
                    int v8 = v + 4;
                    int v9 = v7 ^ arr_b[v6] << 21;
                    if(v9 < 0) {
                        v5 = 0xFFE03F80 ^ v9;
                        v3 = v8;
                        this.m = v3;
                        return v5;
                    }
                    v6 = v + 5;
                    int v10 = arr_b[v8];
                    int v11 = v9 ^ v10 << 28 ^ 0xFE03F80;
                    if(v10 >= 0) {
                        v3 = v6;
                        this.m = v3;
                        return v11;
                    }
                    v8 = v + 6;
                    if(arr_b[v6] >= 0) {
                        v3 = v8;
                        this.m = v3;
                        return v11;
                    }
                    v6 = v + 7;
                    if(arr_b[v8] >= 0) {
                        v3 = v6;
                        this.m = v3;
                        return v11;
                    }
                    v8 = v + 8;
                    if(arr_b[v6] >= 0) {
                        v3 = v8;
                        this.m = v3;
                        return v11;
                    }
                    v6 = v + 9;
                    if(arr_b[v8] >= 0) {
                        v3 = v6;
                        this.m = v3;
                        return v11;
                    }
                    else if(arr_b[v6] >= 0) {
                        v3 = v + 10;
                        this.m = v3;
                        return v11;
                    }
                }
            }
            return (int)this.S();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public long R() throws IOException {
            long v12;
            long v9;
            long v5;
            int v = this.m;
            int v1 = this.k;
            if(v1 != v) {
                byte[] arr_b = this.i;
                int v2 = arr_b[v];
                if(v2 >= 0) {
                    this.m = v + 1;
                    return (long)v2;
                }
                if(v1 - (v + 1) >= 9) {
                    int v3 = v + 2;
                    int v4 = arr_b[v + 1] << 7 ^ v2;
                    if(v4 < 0) {
                        v5 = (long)(v4 ^ 0xFFFFFF80);
                        this.m = v3;
                        return v5;
                    }
                    int v6 = arr_b[v3] << 14 ^ v4;
                    if(v6 >= 0) {
                        v5 = (long)(v6 ^ 0x3F80);
                        v3 = v + 3;
                        this.m = v3;
                        return v5;
                    }
                    int v7 = v6 ^ arr_b[v + 3] << 21;
                    if(v7 < 0) {
                        v3 = v + 4;
                        v5 = (long)(0xFFE03F80 ^ v7);
                        this.m = v3;
                        return v5;
                    }
                    v3 = v + 5;
                    long v8 = ((long)v7) ^ ((long)arr_b[v + 4]) << 28;
                    if(v8 >= 0L) {
                        v9 = 0xFE03F80L;
                        v5 = v8 ^ v9;
                        this.m = v3;
                        return v5;
                    }
                    int v10 = v + 6;
                    long v11 = v8 ^ ((long)arr_b[v3]) << 35;
                    if(v11 < 0L) {
                        v12 = 0xFFFFFFF80FE03F80L;
                        v5 = v11 ^ v12;
                        v3 = v10;
                        this.m = v3;
                        return v5;
                    }
                    v3 = v + 7;
                    v8 = v11 ^ ((long)arr_b[v10]) << 42;
                    if(v8 >= 0L) {
                        v9 = 0x3F80FE03F80L;
                        v5 = v8 ^ v9;
                        this.m = v3;
                        return v5;
                    }
                    v10 = v + 8;
                    v11 = v8 ^ ((long)arr_b[v3]) << 49;
                    if(v11 < 0L) {
                        v12 = 0xFFFE03F80FE03F80L;
                        v5 = v11 ^ v12;
                        v3 = v10;
                        this.m = v3;
                        return v5;
                    }
                    v3 = v + 9;
                    long v13 = v11 ^ ((long)arr_b[v10]) << 56 ^ 0xFE03F80FE03F80L;
                    boolean z = false;
                    if(v13 >= 0L) {
                        z = true;
                    }
                    else if(((long)arr_b[v3]) >= 0L) {
                        z = true;
                        v3 = v + 10;
                    }
                    if(z) {
                        this.m = v3;
                        return v13;
                    }
                }
            }
            return this.S();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        long S() throws IOException {
            long v = 0L;
            for(int v1 = 0; v1 < 0x40; v1 += 7) {
                int v2 = this.K();
                v |= ((long)(v2 & 0x7F)) << v1;
                if((v2 & 0x80) == 0) {
                    return v;
                }
            }
            throw y0.g();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public int T() throws IOException {
            return this.M();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public long U() throws IOException {
            return this.N();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public int V() throws IOException {
            return z.c(this.O());
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public long W() throws IOException {
            return z.d(this.R());
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public String X() throws IOException {
            int v = this.O();
            if(v > 0) {
                int v1 = this.m;
                if(v <= this.k - v1) {
                    String s = new String(this.i, v1, v, t0.b);
                    this.m += v;
                    return s;
                }
            }
            if(v != 0) {
                throw v >= 0 ? y0.n() : y0.h();
            }
            return "";
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public String Y() throws IOException {
            int v = this.O();
            if(v > 0) {
                int v1 = this.m;
                if(v <= this.k - v1) {
                    String s = Z1.h(this.i, v1, v);
                    this.m += v;
                    return s;
                }
            }
            if(v != 0) {
                throw v > 0 ? y0.n() : y0.h();
            }
            return "";
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public int Z() throws IOException {
            if(this.j()) {
                this.o = 0;
                return 0;
            }
            int v = this.O();
            this.o = v;
            if(v >>> 3 == 0) {
                throw y0.d();
            }
            return this.o;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public void a(int v) throws y0 {
            if(this.o != v) {
                throw y0.c();
            }
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public int a0() throws IOException {
            return this.O();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public long b0() throws IOException {
            return this.R();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        @Deprecated
        public void c0(int v, com.google.crypto.tink.shaded.protobuf.R0.a r0$a0) throws IOException {
            this.F(v, r0$a0, V.d());
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public void d0() {
            this.n = this.m;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public void f(boolean z) {
            this.p = z;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public int g() {
            return this.q == 0x7FFFFFFF ? -1 : this.q - this.i();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public int h() {
            return this.o;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public boolean h0(int v) throws IOException {
            switch(v & 7) {
                case 0: {
                    this.o0();
                    return true;
                }
                case 1: {
                    this.l0(8);
                    return true;
                }
                default: {
                    if((v & 7) != 2) {
                        switch(v & 7) {
                            case 3: {
                                this.j0();
                                this.a(v >>> 3 << 3 | 4);
                                return true;
                            }
                            case 4: {
                                return false;
                            }
                            default: {
                                if((v & 7) != 5) {
                                    throw y0.f();
                                }
                                this.l0(4);
                                return true;
                            }
                        }
                    }
                    this.l0(this.O());
                    return true;
                }
            }
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public int i() {
            return this.m - this.n;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public boolean i0(int v, B b0) throws IOException {
            switch(v & 7) {
                case 0: {
                    long v3 = this.H();
                    b0.u1(v);
                    b0.v1(v3);
                    return true;
                }
                case 1: {
                    long v4 = this.N();
                    b0.u1(v);
                    b0.Q0(v4);
                    return true;
                }
                default: {
                    if((v & 7) != 2) {
                        switch(v & 7) {
                            case 3: {
                                b0.u1(v);
                                this.k0(b0);
                                int v2 = v >>> 3 << 3 | 4;
                                this.a(v2);
                                b0.u1(v2);
                                return true;
                            }
                            case 4: {
                                return false;
                            }
                            default: {
                                if((v & 7) != 5) {
                                    throw y0.f();
                                }
                                int v1 = this.M();
                                b0.u1(v);
                                b0.P0(v1);
                                return true;
                            }
                        }
                    }
                    u u0 = this.y();
                    b0.u1(v);
                    b0.M0(u0);
                    return true;
                }
            }
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public boolean j() throws IOException {
            return this.m == this.k;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public void j0() throws IOException {
            do {
                int v = this.Z();
            }
            while(v != 0 && this.h0(v));
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public void k0(B b0) throws IOException {
            do {
                int v = this.Z();
            }
            while(v != 0 && this.i0(v, b0));
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public void l0(int v) throws IOException {
            if(v >= 0) {
                int v1 = this.m;
                if(v <= this.k - v1) {
                    this.m = v1 + v;
                    return;
                }
            }
            throw v >= 0 ? y0.n() : y0.h();
        }

        private void n0() {
            int v = this.k + this.l;
            this.k = v;
            int v1 = v - this.n;
            int v2 = this.q;
            if(v1 > v2) {
                int v3 = v1 - v2;
                this.l = v3;
                this.k = v - v3;
                return;
            }
            this.l = 0;
        }

        private void o0() throws IOException {
            if(this.k - this.m >= 10) {
                this.p0();
                return;
            }
            this.q0();
        }

        private void p0() throws IOException {
            for(int v = 0; v < 10; ++v) {
                int v1 = this.m;
                this.m = v1 + 1;
                if(this.i[v1] >= 0) {
                    return;
                }
            }
            throw y0.g();
        }

        private void q0() throws IOException {
            for(int v = 0; v < 10; ++v) {
                if(this.K() >= 0) {
                    return;
                }
            }
            throw y0.g();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public void t(int v) {
            this.q = v;
            this.n0();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public int u(int v) throws y0 {
            if(v < 0) {
                throw y0.h();
            }
            int v1 = v + this.i();
            if(v1 < 0) {
                throw y0.i();
            }
            int v2 = this.q;
            if(v1 > v2) {
                throw y0.n();
            }
            this.q = v1;
            this.n0();
            return v2;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public boolean v() throws IOException {
            return this.R() != 0L;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public byte[] w() throws IOException {
            return this.L(this.O());
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public ByteBuffer x() throws IOException {
            int v = this.O();
            if(v > 0) {
                int v1 = this.m;
                if(v <= this.k - v1) {
                    ByteBuffer byteBuffer0 = this.j || !this.p ? ByteBuffer.wrap(Arrays.copyOfRange(this.i, v1, v1 + v)) : ByteBuffer.wrap(this.i, v1, v).slice();
                    this.m += v;
                    return byteBuffer0;
                }
            }
            if(v != 0) {
                throw v >= 0 ? y0.n() : y0.h();
            }
            return t0.f;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public u y() throws IOException {
            int v = this.O();
            if(v > 0) {
                int v1 = this.m;
                if(v <= this.k - v1) {
                    u u0 = !this.j || !this.p ? u.q(this.i, v1, v) : u.o0(this.i, v1, v);
                    this.m += v;
                    return u0;
                }
            }
            return v == 0 ? u.e : u.n0(this.L(v));
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public double z() throws IOException {
            return Double.longBitsToDouble(this.N());
        }
    }

    static final class c extends z {
        private final Iterable i;
        private final Iterator j;
        private ByteBuffer k;
        private final boolean l;
        private boolean m;
        private int n;
        private int o;
        private int p;
        private int q;
        private int r;
        private int s;
        private long t;
        private long u;
        private long v;
        private long w;

        private c(Iterable iterable0, int v, boolean z) {
            super(null);
            this.p = 0x7FFFFFFF;
            this.n = v;
            this.i = iterable0;
            this.j = iterable0.iterator();
            this.l = z;
            this.r = 0;
            this.s = 0;
            if(v == 0) {
                this.k = t0.f;
                this.t = 0L;
                this.u = 0L;
                this.w = 0L;
                this.v = 0L;
                return;
            }
            this.u0();
        }

        c(Iterable iterable0, int v, boolean z, a z$a0) {
            this(iterable0, v, z);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public int A() throws IOException {
            return this.O();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public int B() throws IOException {
            return this.M();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public long C() throws IOException {
            return this.N();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public float D() throws IOException {
            return Float.intBitsToFloat(this.M());
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public R0 E(int v, j1 j10, V v1) throws IOException {
            this.b();
            ++this.a;
            R0 r00 = (R0)j10.l(this, v1);
            this.a(v << 3 | 4);
            --this.a;
            return r00;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public void F(int v, com.google.crypto.tink.shaded.protobuf.R0.a r0$a0, V v1) throws IOException {
            this.b();
            ++this.a;
            r0$a0.j9(this, v1);
            this.a(v << 3 | 4);
            --this.a;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public int G() throws IOException {
            return this.O();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public long H() throws IOException {
            return this.R();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public R0 I(j1 j10, V v0) throws IOException {
            int v1 = this.O();
            this.b();
            int v2 = this.u(v1);
            ++this.a;
            R0 r00 = (R0)j10.l(this, v0);
            this.a(0);
            --this.a;
            if(this.g() != 0) {
                throw y0.n();
            }
            this.t(v2);
            return r00;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public void J(com.google.crypto.tink.shaded.protobuf.R0.a r0$a0, V v0) throws IOException {
            int v1 = this.O();
            this.b();
            int v2 = this.u(v1);
            ++this.a;
            r0$a0.j9(this, v0);
            this.a(0);
            --this.a;
            if(this.g() != 0) {
                throw y0.n();
            }
            this.t(v2);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public byte K() throws IOException {
            if(this.n0() == 0L) {
                this.o0();
            }
            long v = this.t;
            this.t = v + 1L;
            return Y1.A(v);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public byte[] L(int v) throws IOException {
            if(v >= 0 && ((long)v) <= this.n0()) {
                byte[] arr_b = new byte[v];
                Y1.p(this.t, arr_b, 0L, v);
                this.t += (long)v;
                return arr_b;
            }
            if(v >= 0 && v <= this.r0()) {
                byte[] arr_b1 = new byte[v];
                this.p0(arr_b1, 0, v);
                return arr_b1;
            }
            if(v > 0) {
                throw y0.n();
            }
            if(v != 0) {
                throw y0.h();
            }
            return t0.e;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public int M() throws IOException {
            if(this.n0() >= 4L) {
                long v = this.t;
                this.t = v + 4L;
                int v1 = Y1.A(v);
                int v2 = Y1.A(v + 1L);
                int v3 = Y1.A(v + 2L);
                return (Y1.A(v + 3L) & 0xFF) << 24 | (v1 & 0xFF | (v2 & 0xFF) << 8 | (v3 & 0xFF) << 16);
            }
            return this.K() & 0xFF | (this.K() & 0xFF) << 8 | (this.K() & 0xFF) << 16 | (this.K() & 0xFF) << 24;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public long N() throws IOException {
            if(this.n0() >= 8L) {
                long v = this.t;
                this.t = v + 8L;
                long v1 = ((long)Y1.A(v)) & 0xFFL | (((long)Y1.A(v + 1L)) & 0xFFL) << 8;
                long v2 = (((long)Y1.A(v + 2L)) & 0xFFL) << 16 | v1 | (((long)Y1.A(v + 3L)) & 0xFFL) << 24 | (((long)Y1.A(v + 4L)) & 0xFFL) << 0x20 | (((long)Y1.A(v + 5L)) & 0xFFL) << 40 | (((long)Y1.A(v + 6L)) & 0xFFL) << 0x30;
                return (((long)Y1.A(v + 7L)) & 0xFFL) << 56 | v2;
            }
            return ((long)this.K()) & 0xFFL | (((long)this.K()) & 0xFFL) << 8 | (((long)this.K()) & 0xFFL) << 16 | (((long)this.K()) & 0xFFL) << 24 | (((long)this.K()) & 0xFFL) << 0x20 | (((long)this.K()) & 0xFFL) << 40 | (((long)this.K()) & 0xFFL) << 0x30 | (((long)this.K()) & 0xFFL) << 56;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public int O() throws IOException {
            int v4;
            long v = this.t;
            if(this.w != v) {
                int v1 = Y1.A(v);
                if(v1 >= 0) {
                    ++this.t;
                    return v1;
                }
                if(this.w - this.t >= 10L) {
                    long v2 = v + 2L;
                    int v3 = Y1.A(v + 1L) << 7 ^ v1;
                    if(v3 < 0) {
                        v4 = v3 ^ 0xFFFFFF80;
                        this.t = v2;
                        return v4;
                    }
                    long v5 = v + 3L;
                    int v6 = Y1.A(v2) << 14 ^ v3;
                    if(v6 >= 0) {
                        v4 = v6 ^ 0x3F80;
                        v2 = v5;
                        this.t = v2;
                        return v4;
                    }
                    long v7 = v + 4L;
                    int v8 = v6 ^ Y1.A(v5) << 21;
                    if(v8 < 0) {
                        v4 = 0xFFE03F80 ^ v8;
                        v2 = v7;
                        this.t = v2;
                        return v4;
                    }
                    v5 = v + 5L;
                    int v9 = Y1.A(v7);
                    int v10 = v8 ^ v9 << 28 ^ 0xFE03F80;
                    if(v9 >= 0) {
                        v2 = v5;
                        this.t = v2;
                        return v10;
                    }
                    v7 = v + 6L;
                    if(Y1.A(v5) >= 0) {
                        v2 = v7;
                        this.t = v2;
                        return v10;
                    }
                    v5 = v + 7L;
                    if(Y1.A(v7) >= 0) {
                        v2 = v5;
                        this.t = v2;
                        return v10;
                    }
                    v7 = v + 8L;
                    if(Y1.A(v5) >= 0) {
                        v2 = v7;
                        this.t = v2;
                        return v10;
                    }
                    v5 = v + 9L;
                    if(Y1.A(v7) >= 0) {
                        v2 = v5;
                        this.t = v2;
                        return v10;
                    }
                    else if(Y1.A(v5) >= 0) {
                        v2 = v + 10L;
                        this.t = v2;
                        return v10;
                    }
                }
            }
            return (int)this.S();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public long R() throws IOException {
            long v12;
            long v9;
            long v4;
            long v = this.t;
            if(this.w != v) {
                int v1 = Y1.A(v);
                if(v1 >= 0) {
                    ++this.t;
                    return (long)v1;
                }
                if(this.w - this.t >= 10L) {
                    long v2 = v + 2L;
                    int v3 = Y1.A(v + 1L) << 7 ^ v1;
                    if(v3 < 0) {
                        v4 = (long)(v3 ^ 0xFFFFFF80);
                        this.t = v2;
                        return v4;
                    }
                    int v5 = Y1.A(v2) << 14 ^ v3;
                    if(v5 >= 0) {
                        v4 = (long)(v5 ^ 0x3F80);
                        v2 = v + 3L;
                        this.t = v2;
                        return v4;
                    }
                    int v6 = v5 ^ Y1.A(v + 3L) << 21;
                    if(v6 < 0) {
                        v4 = (long)(0xFFE03F80 ^ v6);
                        v2 = v + 4L;
                        this.t = v2;
                        return v4;
                    }
                    long v7 = v + 5L;
                    long v8 = ((long)Y1.A(v + 4L)) << 28 ^ ((long)v6);
                    if(v8 >= 0L) {
                        v9 = 0xFE03F80L;
                        v4 = v9 ^ v8;
                        v2 = v7;
                        this.t = v2;
                        return v4;
                    }
                    long v10 = v + 6L;
                    long v11 = v8 ^ ((long)Y1.A(v7)) << 35;
                    if(v11 < 0L) {
                        v12 = 0xFFFFFFF80FE03F80L;
                        v4 = v12 ^ v11;
                        v2 = v10;
                        this.t = v2;
                        return v4;
                    }
                    v7 = v + 7L;
                    v8 = v11 ^ ((long)Y1.A(v10)) << 42;
                    if(v8 >= 0L) {
                        v9 = 0x3F80FE03F80L;
                        v4 = v9 ^ v8;
                        v2 = v7;
                        this.t = v2;
                        return v4;
                    }
                    v10 = v + 8L;
                    v11 = v8 ^ ((long)Y1.A(v7)) << 49;
                    if(v11 < 0L) {
                        v12 = 0xFFFE03F80FE03F80L;
                        v4 = v12 ^ v11;
                        v2 = v10;
                        this.t = v2;
                        return v4;
                    }
                    v7 = v + 9L;
                    long v13 = v11 ^ ((long)Y1.A(v10)) << 56 ^ 0xFE03F80FE03F80L;
                    if(v13 >= 0L) {
                        v2 = v7;
                        this.t = v2;
                        return v13;
                    }
                    else if(((long)Y1.A(v7)) >= 0L) {
                        v2 = v + 10L;
                        this.t = v2;
                        return v13;
                    }
                }
            }
            return this.S();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        long S() throws IOException {
            long v = 0L;
            for(int v1 = 0; v1 < 0x40; v1 += 7) {
                int v2 = this.K();
                v |= ((long)(v2 & 0x7F)) << v1;
                if((v2 & 0x80) == 0) {
                    return v;
                }
            }
            throw y0.g();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public int T() throws IOException {
            return this.M();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public long U() throws IOException {
            return this.N();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public int V() throws IOException {
            return z.c(this.O());
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public long W() throws IOException {
            return z.d(this.R());
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public String X() throws IOException {
            int v = this.O();
            if(v > 0) {
                long v1 = this.t;
                if(((long)v) <= this.w - v1) {
                    byte[] arr_b = new byte[v];
                    Y1.p(v1, arr_b, 0L, v);
                    this.t += (long)v;
                    return new String(arr_b, t0.b);
                }
            }
            if(v > 0 && v <= this.r0()) {
                byte[] arr_b1 = new byte[v];
                this.p0(arr_b1, 0, v);
                return new String(arr_b1, t0.b);
            }
            if(v != 0) {
                throw v >= 0 ? y0.n() : y0.h();
            }
            return "";
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public String Y() throws IOException {
            int v = this.O();
            if(v > 0) {
                long v1 = this.t;
                if(((long)v) <= this.w - v1) {
                    String s = Z1.g(this.k, ((int)(v1 - this.u)), v);
                    this.t += (long)v;
                    return s;
                }
            }
            if(v >= 0 && v <= this.r0()) {
                byte[] arr_b = new byte[v];
                this.p0(arr_b, 0, v);
                return Z1.h(arr_b, 0, v);
            }
            if(v != 0) {
                throw v > 0 ? y0.n() : y0.h();
            }
            return "";
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public int Z() throws IOException {
            if(this.j()) {
                this.q = 0;
                return 0;
            }
            int v = this.O();
            this.q = v;
            if(v >>> 3 == 0) {
                throw y0.d();
            }
            return this.q;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public void a(int v) throws y0 {
            if(this.q != v) {
                throw y0.c();
            }
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public int a0() throws IOException {
            return this.O();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public long b0() throws IOException {
            return this.R();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        @Deprecated
        public void c0(int v, com.google.crypto.tink.shaded.protobuf.R0.a r0$a0) throws IOException {
            this.F(v, r0$a0, V.d());
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public void d0() {
            this.s = (int)(((long)this.r) + this.t - this.u);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public void f(boolean z) {
            this.m = z;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public int g() {
            return this.p == 0x7FFFFFFF ? -1 : this.p - this.i();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public int h() {
            return this.q;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public boolean h0(int v) throws IOException {
            switch(v & 7) {
                case 0: {
                    this.s0();
                    return true;
                }
                case 1: {
                    this.l0(8);
                    return true;
                }
                default: {
                    if((v & 7) != 2) {
                        switch(v & 7) {
                            case 3: {
                                this.j0();
                                this.a(v >>> 3 << 3 | 4);
                                return true;
                            }
                            case 4: {
                                return false;
                            }
                            default: {
                                if((v & 7) != 5) {
                                    throw y0.f();
                                }
                                this.l0(4);
                                return true;
                            }
                        }
                    }
                    this.l0(this.O());
                    return true;
                }
            }
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public int i() {
            return (int)(((long)(this.r - this.s)) + this.t - this.u);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public boolean i0(int v, B b0) throws IOException {
            switch(v & 7) {
                case 0: {
                    long v3 = this.H();
                    b0.u1(v);
                    b0.v1(v3);
                    return true;
                }
                case 1: {
                    long v4 = this.N();
                    b0.u1(v);
                    b0.Q0(v4);
                    return true;
                }
                default: {
                    if((v & 7) != 2) {
                        switch(v & 7) {
                            case 3: {
                                b0.u1(v);
                                this.k0(b0);
                                int v2 = v >>> 3 << 3 | 4;
                                this.a(v2);
                                b0.u1(v2);
                                return true;
                            }
                            case 4: {
                                return false;
                            }
                            default: {
                                if((v & 7) != 5) {
                                    throw y0.f();
                                }
                                int v1 = this.M();
                                b0.u1(v);
                                b0.P0(v1);
                                return true;
                            }
                        }
                    }
                    u u0 = this.y();
                    b0.u1(v);
                    b0.M0(u0);
                    return true;
                }
            }
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public boolean j() throws IOException {
            return ((long)this.r) + this.t - this.u == ((long)this.n);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public void j0() throws IOException {
            do {
                int v = this.Z();
            }
            while(v != 0 && this.h0(v));
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public void k0(B b0) throws IOException {
            do {
                int v = this.Z();
            }
            while(v != 0 && this.i0(v, b0));
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public void l0(int v) throws IOException {
            if(v < 0 || ((long)v) > ((long)(this.n - this.r)) - this.t + this.u) {
                throw v >= 0 ? y0.n() : y0.h();
            }
            while(v > 0) {
                if(this.n0() == 0L) {
                    this.o0();
                }
                int v1 = Math.min(v, ((int)this.n0()));
                v -= v1;
                this.t += (long)v1;
            }
        }

        private long n0() {
            return this.w - this.t;
        }

        private void o0() throws y0 {
            if(!this.j.hasNext()) {
                throw y0.n();
            }
            this.u0();
        }

        private void p0(byte[] arr_b, int v, int v1) throws IOException {
            if(v1 >= 0 && v1 <= this.r0()) {
                int v2 = v1;
                while(v2 > 0) {
                    if(this.n0() == 0L) {
                        this.o0();
                    }
                    int v3 = Math.min(v2, ((int)this.n0()));
                    Y1.p(this.t, arr_b, v1 - v2 + v, v3);
                    v2 -= v3;
                    this.t += (long)v3;
                }
                return;
            }
            if(v1 > 0) {
                throw y0.n();
            }
            if(v1 != 0) {
                throw y0.h();
            }
        }

        private void q0() {
            int v = this.n + this.o;
            this.n = v;
            int v1 = v - this.s;
            int v2 = this.p;
            if(v1 > v2) {
                int v3 = v1 - v2;
                this.o = v3;
                this.n = v - v3;
                return;
            }
            this.o = 0;
        }

        private int r0() {
            return (int)(((long)(this.n - this.r)) - this.t + this.u);
        }

        private void s0() throws IOException {
            for(int v = 0; v < 10; ++v) {
                if(this.K() >= 0) {
                    return;
                }
            }
            throw y0.g();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public void t(int v) {
            this.p = v;
            this.q0();
        }

        private ByteBuffer t0(int v, int v1) throws IOException {
            int v2 = this.k.position();
            int v3 = this.k.limit();
            ByteBuffer byteBuffer0 = this.k;
            try {
                byteBuffer0.position(v);
                byteBuffer0.limit(v1);
                return this.k.slice();
            }
            catch(IllegalArgumentException unused_ex) {
                throw y0.n();
            }
            finally {
                byteBuffer0.position(v2);
                byteBuffer0.limit(v3);
            }
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public int u(int v) throws y0 {
            if(v < 0) {
                throw y0.h();
            }
            int v1 = v + this.i();
            int v2 = this.p;
            if(v1 > v2) {
                throw y0.n();
            }
            this.p = v1;
            this.q0();
            return v2;
        }

        private void u0() {
            Object object0 = this.j.next();
            this.k = (ByteBuffer)object0;
            this.r += (int)(this.t - this.u);
            long v = (long)((ByteBuffer)object0).position();
            this.t = v;
            this.u = v;
            this.w = (long)this.k.limit();
            long v1 = Y1.k(this.k);
            this.v = v1;
            this.t += v1;
            this.u += v1;
            this.w += v1;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public boolean v() throws IOException {
            return this.R() != 0L;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public byte[] w() throws IOException {
            return this.L(this.O());
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public ByteBuffer x() throws IOException {
            int v = this.O();
            if(v > 0 && ((long)v) <= this.n0()) {
                if(!this.l && this.m) {
                    long v1 = this.t + ((long)v);
                    this.t = v1;
                    return this.t0(((int)(v1 - this.v - ((long)v))), ((int)(v1 - this.v)));
                }
                byte[] arr_b = new byte[v];
                Y1.p(this.t, arr_b, 0L, v);
                this.t += (long)v;
                return ByteBuffer.wrap(arr_b);
            }
            if(v > 0 && v <= this.r0()) {
                byte[] arr_b1 = new byte[v];
                this.p0(arr_b1, 0, v);
                return ByteBuffer.wrap(arr_b1);
            }
            if(v != 0) {
                throw v >= 0 ? y0.n() : y0.h();
            }
            return t0.f;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public u y() throws IOException {
            int v = this.O();
            if(v > 0) {
                long v1 = this.t;
                if(((long)v) <= this.w - v1) {
                    if(this.l && this.m) {
                        int v2 = (int)(v1 - this.v);
                        u u0 = u.m0(this.t0(v2, v + v2));
                        this.t += (long)v;
                        return u0;
                    }
                    byte[] arr_b = new byte[v];
                    Y1.p(v1, arr_b, 0L, v);
                    this.t += (long)v;
                    return u.n0(arr_b);
                }
            }
            if(v > 0 && v <= this.r0()) {
                if(this.l && this.m) {
                    ArrayList arrayList0 = new ArrayList();
                    while(v > 0) {
                        if(this.n0() == 0L) {
                            this.o0();
                        }
                        int v3 = Math.min(v, ((int)this.n0()));
                        int v4 = (int)(this.t - this.v);
                        arrayList0.add(u.m0(this.t0(v4, v4 + v3)));
                        v -= v3;
                        this.t += (long)v3;
                    }
                    return u.k(arrayList0);
                }
                byte[] arr_b1 = new byte[v];
                this.p0(arr_b1, 0, v);
                return u.n0(arr_b1);
            }
            if(v != 0) {
                throw v >= 0 ? y0.n() : y0.h();
            }
            return u.e;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public double z() throws IOException {
            return Double.longBitsToDouble(this.N());
        }
    }

    static final class d extends z {
        interface com.google.crypto.tink.shaded.protobuf.z.d.a {
            void onRefill();
        }

        class com.google.crypto.tink.shaded.protobuf.z.d.b implements com.google.crypto.tink.shaded.protobuf.z.d.a {
            private int a;
            private ByteArrayOutputStream b;
            final d c;

            private com.google.crypto.tink.shaded.protobuf.z.d.b() {
                this.a = z$d0.m;
            }

            ByteBuffer a() {
                ByteArrayOutputStream byteArrayOutputStream0 = this.b;
                if(byteArrayOutputStream0 == null) {
                    return ByteBuffer.wrap(d.this.j, this.a, d.this.m - this.a);
                }
                byteArrayOutputStream0.write(d.this.j, this.a, d.this.m);
                return ByteBuffer.wrap(this.b.toByteArray());
            }

            @Override  // com.google.crypto.tink.shaded.protobuf.z$d$a
            public void onRefill() {
                if(this.b == null) {
                    this.b = new ByteArrayOutputStream();
                }
                this.b.write(d.this.j, this.a, d.this.m - this.a);
                this.a = 0;
            }
        }

        private final InputStream i;
        private final byte[] j;
        private int k;
        private int l;
        private int m;
        private int n;
        private int o;
        private int p;
        private com.google.crypto.tink.shaded.protobuf.z.d.a q;

        private d(InputStream inputStream0, int v) {
            super(null);
            this.p = 0x7FFFFFFF;
            this.q = null;
            t0.e(inputStream0, "input");
            this.i = inputStream0;
            this.j = new byte[v];
            this.k = 0;
            this.m = 0;
            this.o = 0;
        }

        d(InputStream inputStream0, int v, a z$a0) {
            this(inputStream0, v);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public int A() throws IOException {
            return this.O();
        }

        private void A0() throws IOException {
            for(int v = 0; v < 10; ++v) {
                int v1 = this.m;
                this.m = v1 + 1;
                if(this.j[v1] >= 0) {
                    return;
                }
            }
            throw y0.g();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public int B() throws IOException {
            return this.M();
        }

        private void B0() throws IOException {
            for(int v = 0; v < 10; ++v) {
                if(this.K() >= 0) {
                    return;
                }
            }
            throw y0.g();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public long C() throws IOException {
            return this.N();
        }

        private boolean C0(int v) throws IOException {
            int v1 = this.m;
            if(v1 + v <= this.k) {
                throw new IllegalStateException("refillBuffer() called when " + v + " bytes were already available in buffer");
            }
            int v2 = this.o;
            if(v > this.c - v2 - v1) {
                return false;
            }
            if(v2 + v1 + v > this.p) {
                return false;
            }
            com.google.crypto.tink.shaded.protobuf.z.d.a z$d$a0 = this.q;
            if(z$d$a0 != null) {
                z$d$a0.onRefill();
            }
            int v3 = this.m;
            if(v3 > 0) {
                int v4 = this.k;
                if(v4 > v3) {
                    System.arraycopy(this.j, v3, this.j, 0, v4 - v3);
                }
                this.o += v3;
                this.k -= v3;
                this.m = 0;
            }
            int v5 = d.q0(this.i, this.j, this.k, Math.min(this.j.length - this.k, this.c - this.o - this.k));
            if(v5 == 0 || v5 < -1 || v5 > this.j.length) {
                throw new IllegalStateException(this.i.getClass() + "#read(byte[]) returned invalid result: " + v5 + "\nThe InputStream implementation is buggy.");
            }
            if(v5 > 0) {
                this.k += v5;
                this.v0();
                return this.k < v ? this.C0(v) : true;
            }
            return false;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public float D() throws IOException {
            return Float.intBitsToFloat(this.M());
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public R0 E(int v, j1 j10, V v1) throws IOException {
            this.b();
            ++this.a;
            R0 r00 = (R0)j10.l(this, v1);
            this.a(v << 3 | 4);
            --this.a;
            return r00;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public void F(int v, com.google.crypto.tink.shaded.protobuf.R0.a r0$a0, V v1) throws IOException {
            this.b();
            ++this.a;
            r0$a0.j9(this, v1);
            this.a(v << 3 | 4);
            --this.a;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public int G() throws IOException {
            return this.O();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public long H() throws IOException {
            return this.R();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public R0 I(j1 j10, V v0) throws IOException {
            int v1 = this.O();
            this.b();
            int v2 = this.u(v1);
            ++this.a;
            R0 r00 = (R0)j10.l(this, v0);
            this.a(0);
            --this.a;
            if(this.g() != 0) {
                throw y0.n();
            }
            this.t(v2);
            return r00;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public void J(com.google.crypto.tink.shaded.protobuf.R0.a r0$a0, V v0) throws IOException {
            int v1 = this.O();
            this.b();
            int v2 = this.u(v1);
            ++this.a;
            r0$a0.j9(this, v0);
            this.a(0);
            --this.a;
            if(this.g() != 0) {
                throw y0.n();
            }
            this.t(v2);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public byte K() throws IOException {
            if(this.m == this.k) {
                this.w0(1);
            }
            int v = this.m;
            this.m = v + 1;
            return this.j[v];
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public byte[] L(int v) throws IOException {
            int v1 = this.m;
            if(v <= this.k - v1 && v > 0) {
                int v2 = v + v1;
                this.m = v2;
                return Arrays.copyOfRange(this.j, v1, v2);
            }
            return this.s0(v, false);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public int M() throws IOException {
            int v = this.m;
            if(this.k - v < 4) {
                this.w0(4);
                v = this.m;
            }
            this.m = v + 4;
            return (this.j[v + 3] & 0xFF) << 24 | (this.j[v] & 0xFF | (this.j[v + 1] & 0xFF) << 8 | (this.j[v + 2] & 0xFF) << 16);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public long N() throws IOException {
            int v = this.m;
            if(this.k - v < 8) {
                this.w0(8);
                v = this.m;
            }
            this.m = v + 8;
            return (((long)this.j[v + 7]) & 0xFFL) << 56 | (((long)this.j[v]) & 0xFFL | (((long)this.j[v + 1]) & 0xFFL) << 8 | (((long)this.j[v + 2]) & 0xFFL) << 16 | (((long)this.j[v + 3]) & 0xFFL) << 24 | (((long)this.j[v + 4]) & 0xFFL) << 0x20 | (((long)this.j[v + 5]) & 0xFFL) << 40 | (((long)this.j[v + 6]) & 0xFFL) << 0x30);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public int O() throws IOException {
            int v5;
            int v = this.m;
            int v1 = this.k;
            if(v1 != v) {
                byte[] arr_b = this.j;
                int v2 = arr_b[v];
                if(v2 >= 0) {
                    this.m = v + 1;
                    return v2;
                }
                if(v1 - (v + 1) >= 9) {
                    int v3 = v + 2;
                    int v4 = arr_b[v + 1] << 7 ^ v2;
                    if(v4 < 0) {
                        v5 = v4 ^ 0xFFFFFF80;
                        this.m = v3;
                        return v5;
                    }
                    int v6 = v + 3;
                    int v7 = arr_b[v3] << 14 ^ v4;
                    if(v7 >= 0) {
                        v5 = v7 ^ 0x3F80;
                        v3 = v6;
                        this.m = v3;
                        return v5;
                    }
                    int v8 = v + 4;
                    int v9 = v7 ^ arr_b[v6] << 21;
                    if(v9 < 0) {
                        v5 = 0xFFE03F80 ^ v9;
                        v3 = v8;
                        this.m = v3;
                        return v5;
                    }
                    v6 = v + 5;
                    int v10 = arr_b[v8];
                    int v11 = v9 ^ v10 << 28 ^ 0xFE03F80;
                    if(v10 >= 0) {
                        v3 = v6;
                        this.m = v3;
                        return v11;
                    }
                    v8 = v + 6;
                    if(arr_b[v6] >= 0) {
                        v3 = v8;
                        this.m = v3;
                        return v11;
                    }
                    v6 = v + 7;
                    if(arr_b[v8] >= 0) {
                        v3 = v6;
                        this.m = v3;
                        return v11;
                    }
                    v8 = v + 8;
                    if(arr_b[v6] >= 0) {
                        v3 = v8;
                        this.m = v3;
                        return v11;
                    }
                    v6 = v + 9;
                    if(arr_b[v8] >= 0) {
                        v3 = v6;
                        this.m = v3;
                        return v11;
                    }
                    else if(arr_b[v6] >= 0) {
                        v3 = v + 10;
                        this.m = v3;
                        return v11;
                    }
                }
            }
            return (int)this.S();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public long R() throws IOException {
            long v12;
            long v9;
            long v5;
            int v = this.m;
            int v1 = this.k;
            if(v1 != v) {
                byte[] arr_b = this.j;
                int v2 = arr_b[v];
                if(v2 >= 0) {
                    this.m = v + 1;
                    return (long)v2;
                }
                if(v1 - (v + 1) >= 9) {
                    int v3 = v + 2;
                    int v4 = arr_b[v + 1] << 7 ^ v2;
                    if(v4 < 0) {
                        v5 = (long)(v4 ^ 0xFFFFFF80);
                        this.m = v3;
                        return v5;
                    }
                    int v6 = arr_b[v3] << 14 ^ v4;
                    if(v6 >= 0) {
                        v5 = (long)(v6 ^ 0x3F80);
                        v3 = v + 3;
                        this.m = v3;
                        return v5;
                    }
                    int v7 = v6 ^ arr_b[v + 3] << 21;
                    if(v7 < 0) {
                        v3 = v + 4;
                        v5 = (long)(0xFFE03F80 ^ v7);
                        this.m = v3;
                        return v5;
                    }
                    v3 = v + 5;
                    long v8 = ((long)v7) ^ ((long)arr_b[v + 4]) << 28;
                    if(v8 >= 0L) {
                        v9 = 0xFE03F80L;
                        v5 = v8 ^ v9;
                        this.m = v3;
                        return v5;
                    }
                    int v10 = v + 6;
                    long v11 = v8 ^ ((long)arr_b[v3]) << 35;
                    if(v11 < 0L) {
                        v12 = 0xFFFFFFF80FE03F80L;
                        v5 = v11 ^ v12;
                        v3 = v10;
                        this.m = v3;
                        return v5;
                    }
                    v3 = v + 7;
                    v8 = v11 ^ ((long)arr_b[v10]) << 42;
                    if(v8 >= 0L) {
                        v9 = 0x3F80FE03F80L;
                        v5 = v8 ^ v9;
                        this.m = v3;
                        return v5;
                    }
                    v10 = v + 8;
                    v11 = v8 ^ ((long)arr_b[v3]) << 49;
                    if(v11 < 0L) {
                        v12 = 0xFFFE03F80FE03F80L;
                        v5 = v11 ^ v12;
                        v3 = v10;
                        this.m = v3;
                        return v5;
                    }
                    v3 = v + 9;
                    long v13 = v11 ^ ((long)arr_b[v10]) << 56 ^ 0xFE03F80FE03F80L;
                    boolean z = false;
                    if(v13 >= 0L) {
                        z = true;
                    }
                    else if(((long)arr_b[v3]) >= 0L) {
                        z = true;
                        v3 = v + 10;
                    }
                    if(z) {
                        this.m = v3;
                        return v13;
                    }
                }
            }
            return this.S();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        long S() throws IOException {
            long v = 0L;
            for(int v1 = 0; v1 < 0x40; v1 += 7) {
                int v2 = this.K();
                v |= ((long)(v2 & 0x7F)) << v1;
                if((v2 & 0x80) == 0) {
                    return v;
                }
            }
            throw y0.g();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public int T() throws IOException {
            return this.M();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public long U() throws IOException {
            return this.N();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public int V() throws IOException {
            return z.c(this.O());
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public long W() throws IOException {
            return z.d(this.R());
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public String X() throws IOException {
            int v = this.O();
            if(v > 0) {
                int v1 = this.m;
                if(v <= this.k - v1) {
                    String s = new String(this.j, v1, v, t0.b);
                    this.m += v;
                    return s;
                }
            }
            if(v == 0) {
                return "";
            }
            if(v <= this.k) {
                this.w0(v);
                String s1 = new String(this.j, this.m, v, t0.b);
                this.m += v;
                return s1;
            }
            return new String(this.s0(v, false), t0.b);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public String Y() throws IOException {
            int v = this.O();
            int v1 = this.m;
            int v2 = this.k;
            if(v <= v2 - v1 && v > 0) {
                this.m = v1 + v;
                return Z1.h(this.j, v1, v);
            }
            if(v == 0) {
                return "";
            }
            if(v <= v2) {
                this.w0(v);
                this.m = v;
                return Z1.h(this.j, v1, v);
            }
            return Z1.h(this.s0(v, false), v1, v);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public int Z() throws IOException {
            if(this.j()) {
                this.n = 0;
                return 0;
            }
            int v = this.O();
            this.n = v;
            if(v >>> 3 == 0) {
                throw y0.d();
            }
            return this.n;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public void a(int v) throws y0 {
            if(this.n != v) {
                throw y0.c();
            }
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public int a0() throws IOException {
            return this.O();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public long b0() throws IOException {
            return this.R();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        @Deprecated
        public void c0(int v, com.google.crypto.tink.shaded.protobuf.R0.a r0$a0) throws IOException {
            this.F(v, r0$a0, V.d());
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public void d0() {
            this.o = -this.m;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public void f(boolean z) {
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public int g() {
            return this.p == 0x7FFFFFFF ? -1 : this.p - (this.o + this.m);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public int h() {
            return this.n;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public boolean h0(int v) throws IOException {
            switch(v & 7) {
                case 0: {
                    this.z0();
                    return true;
                }
                case 1: {
                    this.l0(8);
                    return true;
                }
                default: {
                    if((v & 7) != 2) {
                        switch(v & 7) {
                            case 3: {
                                this.j0();
                                this.a(v >>> 3 << 3 | 4);
                                return true;
                            }
                            case 4: {
                                return false;
                            }
                            default: {
                                if((v & 7) != 5) {
                                    throw y0.f();
                                }
                                this.l0(4);
                                return true;
                            }
                        }
                    }
                    this.l0(this.O());
                    return true;
                }
            }
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public int i() {
            return this.o + this.m;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public boolean i0(int v, B b0) throws IOException {
            switch(v & 7) {
                case 0: {
                    long v3 = this.H();
                    b0.u1(v);
                    b0.v1(v3);
                    return true;
                }
                case 1: {
                    long v4 = this.N();
                    b0.u1(v);
                    b0.Q0(v4);
                    return true;
                }
                default: {
                    if((v & 7) != 2) {
                        switch(v & 7) {
                            case 3: {
                                b0.u1(v);
                                this.k0(b0);
                                int v2 = v >>> 3 << 3 | 4;
                                this.a(v2);
                                b0.u1(v2);
                                return true;
                            }
                            case 4: {
                                return false;
                            }
                            default: {
                                if((v & 7) != 5) {
                                    throw y0.f();
                                }
                                int v1 = this.M();
                                b0.u1(v);
                                b0.P0(v1);
                                return true;
                            }
                        }
                    }
                    u u0 = this.y();
                    b0.u1(v);
                    b0.M0(u0);
                    return true;
                }
            }
        }

        // 去混淆评级： 低(20)
        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public boolean j() throws IOException {
            return this.m == this.k && !this.C0(1);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public void j0() throws IOException {
            do {
                int v = this.Z();
            }
            while(v != 0 && this.h0(v));
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public void k0(B b0) throws IOException {
            do {
                int v = this.Z();
            }
            while(v != 0 && this.i0(v, b0));
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public void l0(int v) throws IOException {
            int v1 = this.m;
            if(v <= this.k - v1 && v >= 0) {
                this.m = v1 + v;
                return;
            }
            this.y0(v);
        }

        private static int p0(InputStream inputStream0) throws IOException {
            try {
                return inputStream0.available();
            }
            catch(y0 y00) {
                y00.k();
                throw y00;
            }
        }

        private static int q0(InputStream inputStream0, byte[] arr_b, int v, int v1) throws IOException {
            try {
                return inputStream0.read(arr_b, v, v1);
            }
            catch(y0 y00) {
                y00.k();
                throw y00;
            }
        }

        private u r0(int v) throws IOException {
            byte[] arr_b = this.t0(v);
            if(arr_b != null) {
                return u.p(arr_b);
            }
            int v1 = this.m;
            int v2 = this.k - v1;
            this.o += this.k;
            this.m = 0;
            this.k = 0;
            List list0 = this.u0(v - v2);
            byte[] arr_b1 = new byte[v];
            System.arraycopy(this.j, v1, arr_b1, 0, v2);
            for(Object object0: list0) {
                System.arraycopy(((byte[])object0), 0, arr_b1, v2, ((byte[])object0).length);
                v2 += ((byte[])object0).length;
            }
            return u.n0(arr_b1);
        }

        private byte[] s0(int v, boolean z) throws IOException {
            byte[] arr_b = this.t0(v);
            if(arr_b != null) {
                return z ? ((byte[])arr_b.clone()) : arr_b;
            }
            int v1 = this.m;
            int v2 = this.k - v1;
            this.o += this.k;
            this.m = 0;
            this.k = 0;
            List list0 = this.u0(v - v2);
            byte[] arr_b1 = new byte[v];
            System.arraycopy(this.j, v1, arr_b1, 0, v2);
            for(Object object0: list0) {
                System.arraycopy(((byte[])object0), 0, arr_b1, v2, ((byte[])object0).length);
                v2 += ((byte[])object0).length;
            }
            return arr_b1;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public void t(int v) {
            this.p = v;
            this.v0();
        }

        private byte[] t0(int v) throws IOException {
            if(v == 0) {
                return t0.e;
            }
            if(v < 0) {
                throw y0.h();
            }
            int v1 = this.o;
            int v2 = this.m;
            int v3 = v1 + v2 + v;
            if(v3 - this.c > 0) {
                throw y0.m();
            }
            int v4 = this.p;
            if(v3 <= v4) {
                int v5 = this.k - v2;
                if(v - v5 >= 0x1000 && v - v5 > d.p0(this.i)) {
                    return null;
                }
                byte[] arr_b = new byte[v];
                System.arraycopy(this.j, this.m, arr_b, 0, v5);
                this.o += this.k;
                this.m = 0;
                this.k = 0;
                while(v5 < v) {
                    int v6 = d.q0(this.i, arr_b, v5, v - v5);
                    if(v6 == -1) {
                        throw y0.n();
                    }
                    this.o += v6;
                    v5 += v6;
                }
                return arr_b;
            }
            this.l0(v4 - v1 - v2);
            throw y0.n();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public int u(int v) throws y0 {
            if(v < 0) {
                throw y0.h();
            }
            int v1 = v + (this.o + this.m);
            int v2 = this.p;
            if(v1 > v2) {
                throw y0.n();
            }
            this.p = v1;
            this.v0();
            return v2;
        }

        private List u0(int v) throws IOException {
            List list0 = new ArrayList();
            while(v > 0) {
                int v1 = Math.min(v, 0x1000);
                byte[] arr_b = new byte[v1];
                for(int v2 = 0; v2 < v1; v2 += v3) {
                    int v3 = this.i.read(arr_b, v2, v1 - v2);
                    if(v3 == -1) {
                        throw y0.n();
                    }
                    this.o += v3;
                }
                v -= v1;
                list0.add(arr_b);
            }
            return list0;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public boolean v() throws IOException {
            return this.R() != 0L;
        }

        private void v0() {
            int v = this.k + this.l;
            this.k = v;
            int v1 = this.o + v;
            int v2 = this.p;
            if(v1 > v2) {
                int v3 = v1 - v2;
                this.l = v3;
                this.k = v - v3;
                return;
            }
            this.l = 0;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public byte[] w() throws IOException {
            int v = this.O();
            int v1 = this.m;
            if(v <= this.k - v1 && v > 0) {
                byte[] arr_b = Arrays.copyOfRange(this.j, v1, v1 + v);
                this.m += v;
                return arr_b;
            }
            return this.s0(v, false);
        }

        private void w0(int v) throws IOException {
            if(!this.C0(v)) {
                throw v <= this.c - this.o - this.m ? y0.n() : y0.m();
            }
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public ByteBuffer x() throws IOException {
            int v = this.O();
            int v1 = this.m;
            if(v <= this.k - v1 && v > 0) {
                ByteBuffer byteBuffer0 = ByteBuffer.wrap(Arrays.copyOfRange(this.j, v1, v1 + v));
                this.m += v;
                return byteBuffer0;
            }
            return v == 0 ? t0.f : ByteBuffer.wrap(this.s0(v, true));
        }

        private static long x0(InputStream inputStream0, long v) throws IOException {
            try {
                return inputStream0.skip(v);
            }
            catch(y0 y00) {
                y00.k();
                throw y00;
            }
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public u y() throws IOException {
            int v = this.O();
            int v1 = this.m;
            if(v <= this.k - v1 && v > 0) {
                u u0 = u.q(this.j, v1, v);
                this.m += v;
                return u0;
            }
            return v == 0 ? u.e : this.r0(v);
        }

        private void y0(int v) throws IOException {
            int v11;
            if(v < 0) {
                throw y0.h();
            }
            int v1 = 0;
            int v2 = this.o;
            int v3 = this.m;
            int v4 = this.p;
            if(v2 + v3 + v <= v4) {
                if(this.q == null) {
                    this.o = v2 + v3;
                    int v5 = this.k - v3;
                    this.k = 0;
                    this.m = 0;
                    v1 = v5;
                    try {
                        while(v1 < v) {
                            long v7 = (long)(v - v1);
                            long v8 = d.x0(this.i, v7);
                            int v9 = Long.compare(v8, 0L);
                            if(v9 < 0 || v8 > v7) {
                                throw new IllegalStateException(this.i.getClass() + "#skip returned invalid result: " + v8 + "\nThe InputStream implementation is buggy.");
                            }
                            if(v9 == 0) {
                                break;
                            }
                            v1 += (int)v8;
                        }
                    }
                    finally {
                        this.o += v1;
                        this.v0();
                    }
                }
                if(v1 < v) {
                    int v10 = this.k - this.m;
                    this.m = this.k;
                    this.w0(1);
                    while(true) {
                        v11 = v - v10;
                        int v12 = this.k;
                        if(v11 <= v12) {
                            break;
                        }
                        v10 += v12;
                        this.m = v12;
                        this.w0(1);
                    }
                    this.m = v11;
                }
                return;
            }
            this.l0(v4 - v2 - v3);
            throw y0.n();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public double z() throws IOException {
            return Double.longBitsToDouble(this.N());
        }

        private void z0() throws IOException {
            if(this.k - this.m >= 10) {
                this.A0();
                return;
            }
            this.B0();
        }
    }

    static final class e extends z {
        private final ByteBuffer i;
        private final boolean j;
        private final long k;
        private long l;
        private long m;
        private long n;
        private int o;
        private int p;
        private boolean q;
        private int r;

        private e(ByteBuffer byteBuffer0, boolean z) {
            super(null);
            this.r = 0x7FFFFFFF;
            this.i = byteBuffer0;
            long v = Y1.k(byteBuffer0);
            this.k = v;
            this.l = ((long)byteBuffer0.limit()) + v;
            long v1 = v + ((long)byteBuffer0.position());
            this.m = v1;
            this.n = v1;
            this.j = z;
        }

        e(ByteBuffer byteBuffer0, boolean z, a z$a0) {
            this(byteBuffer0, z);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public int A() throws IOException {
            return this.O();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public int B() throws IOException {
            return this.M();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public long C() throws IOException {
            return this.N();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public float D() throws IOException {
            return Float.intBitsToFloat(this.M());
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public R0 E(int v, j1 j10, V v1) throws IOException {
            this.b();
            ++this.a;
            R0 r00 = (R0)j10.l(this, v1);
            this.a(v << 3 | 4);
            --this.a;
            return r00;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public void F(int v, com.google.crypto.tink.shaded.protobuf.R0.a r0$a0, V v1) throws IOException {
            this.b();
            ++this.a;
            r0$a0.j9(this, v1);
            this.a(v << 3 | 4);
            --this.a;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public int G() throws IOException {
            return this.O();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public long H() throws IOException {
            return this.R();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public R0 I(j1 j10, V v0) throws IOException {
            int v1 = this.O();
            this.b();
            int v2 = this.u(v1);
            ++this.a;
            R0 r00 = (R0)j10.l(this, v0);
            this.a(0);
            --this.a;
            if(this.g() != 0) {
                throw y0.n();
            }
            this.t(v2);
            return r00;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public void J(com.google.crypto.tink.shaded.protobuf.R0.a r0$a0, V v0) throws IOException {
            int v1 = this.O();
            this.b();
            int v2 = this.u(v1);
            ++this.a;
            r0$a0.j9(this, v0);
            this.a(0);
            --this.a;
            if(this.g() != 0) {
                throw y0.n();
            }
            this.t(v2);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public byte K() throws IOException {
            long v = this.m;
            if(v == this.l) {
                throw y0.n();
            }
            this.m = v + 1L;
            return Y1.A(v);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public byte[] L(int v) throws IOException {
            if(v >= 0 && v <= this.q0()) {
                byte[] arr_b = new byte[v];
                this.u0(this.m, this.m + ((long)v)).get(arr_b);
                this.m += (long)v;
                return arr_b;
            }
            if(v > 0) {
                throw y0.n();
            }
            if(v != 0) {
                throw y0.h();
            }
            return t0.e;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public int M() throws IOException {
            long v = this.m;
            if(this.l - v < 4L) {
                throw y0.n();
            }
            this.m = v + 4L;
            int v1 = Y1.A(v);
            int v2 = Y1.A(v + 1L);
            int v3 = Y1.A(v + 2L);
            return (Y1.A(v + 3L) & 0xFF) << 24 | (v1 & 0xFF | (v2 & 0xFF) << 8 | (v3 & 0xFF) << 16);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public long N() throws IOException {
            long v = this.m;
            if(this.l - v < 8L) {
                throw y0.n();
            }
            this.m = v + 8L;
            long v1 = ((long)Y1.A(v)) & 0xFFL | (((long)Y1.A(v + 1L)) & 0xFFL) << 8 | (((long)Y1.A(v + 2L)) & 0xFFL) << 16 | (((long)Y1.A(v + 3L)) & 0xFFL) << 24 | (((long)Y1.A(v + 4L)) & 0xFFL) << 0x20 | (((long)Y1.A(v + 5L)) & 0xFFL) << 40 | (((long)Y1.A(v + 6L)) & 0xFFL) << 0x30;
            return (((long)Y1.A(v + 7L)) & 0xFFL) << 56 | v1;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public int O() throws IOException {
            int v4;
            long v = this.m;
            if(this.l != v) {
                int v1 = Y1.A(v);
                if(v1 >= 0) {
                    this.m = v + 1L;
                    return v1;
                }
                if(this.l - (v + 1L) >= 9L) {
                    long v2 = v + 2L;
                    int v3 = Y1.A(v + 1L) << 7 ^ v1;
                    if(v3 < 0) {
                        v4 = v3 ^ 0xFFFFFF80;
                        this.m = v2;
                        return v4;
                    }
                    long v5 = v + 3L;
                    int v6 = v3 ^ Y1.A(v2) << 14;
                    if(v6 >= 0) {
                        v4 = v6 ^ 0x3F80;
                        v2 = v5;
                        this.m = v2;
                        return v4;
                    }
                    v2 = v + 4L;
                    int v7 = v6 ^ Y1.A(v5) << 21;
                    if(v7 < 0) {
                        v4 = 0xFFE03F80 ^ v7;
                        this.m = v2;
                        return v4;
                    }
                    v5 = v + 5L;
                    int v8 = Y1.A(v2);
                    int v9 = v7 ^ v8 << 28 ^ 0xFE03F80;
                    if(v8 >= 0) {
                        v2 = v5;
                        this.m = v2;
                        return v9;
                    }
                    v2 = v + 6L;
                    if(Y1.A(v5) >= 0) {
                        this.m = v2;
                        return v9;
                    }
                    v5 = v + 7L;
                    if(Y1.A(v2) >= 0) {
                        v2 = v5;
                        this.m = v2;
                        return v9;
                    }
                    v2 = v + 8L;
                    if(Y1.A(v5) >= 0) {
                        this.m = v2;
                        return v9;
                    }
                    v5 = v + 9L;
                    if(Y1.A(v2) >= 0) {
                        v2 = v5;
                        this.m = v2;
                        return v9;
                    }
                    v2 = v + 10L;
                    if(Y1.A(v5) >= 0) {
                        this.m = v2;
                        return v9;
                    }
                }
            }
            return (int)this.S();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public long R() throws IOException {
            long v13;
            long v10;
            long v6;
            int v4;
            long v = this.m;
            if(this.l != v) {
                int v1 = Y1.A(v);
                if(v1 >= 0) {
                    this.m = v + 1L;
                    return (long)v1;
                }
                if(this.l - (v + 1L) >= 9L) {
                    long v2 = v + 2L;
                    int v3 = Y1.A(v + 1L) << 7 ^ v1;
                    if(v3 < 0) {
                        v4 = v3 ^ 0xFFFFFF80;
                        this.m = v2;
                        return (long)v4;
                    }
                    int v5 = v3 ^ Y1.A(v2) << 14;
                    if(v5 >= 0) {
                        v6 = (long)(v5 ^ 0x3F80);
                        v2 = v + 3L;
                        this.m = v2;
                        return v6;
                    }
                    v2 = v + 4L;
                    int v7 = v5 ^ Y1.A(v + 3L) << 21;
                    if(v7 < 0) {
                        v4 = 0xFFE03F80 ^ v7;
                        this.m = v2;
                        return (long)v4;
                    }
                    long v8 = v + 5L;
                    long v9 = ((long)v7) ^ ((long)Y1.A(v2)) << 28;
                    if(v9 >= 0L) {
                        v10 = 0xFE03F80L;
                        v6 = v10 ^ v9;
                        v2 = v8;
                        this.m = v2;
                        return v6;
                    }
                    long v11 = v + 6L;
                    long v12 = v9 ^ ((long)Y1.A(v8)) << 35;
                    if(v12 < 0L) {
                        v13 = 0xFFFFFFF80FE03F80L;
                        v6 = v13 ^ v12;
                        v2 = v11;
                        this.m = v2;
                        return v6;
                    }
                    v8 = v + 7L;
                    v9 = v12 ^ ((long)Y1.A(v11)) << 42;
                    if(v9 >= 0L) {
                        v10 = 0x3F80FE03F80L;
                        v6 = v10 ^ v9;
                        v2 = v8;
                        this.m = v2;
                        return v6;
                    }
                    v11 = v + 8L;
                    v12 = v9 ^ ((long)Y1.A(v8)) << 49;
                    if(v12 < 0L) {
                        v13 = 0xFFFE03F80FE03F80L;
                        v6 = v13 ^ v12;
                        v2 = v11;
                        this.m = v2;
                        return v6;
                    }
                    long v14 = v12 ^ ((long)Y1.A(v11)) << 56 ^ 0xFE03F80FE03F80L;
                    if(v14 >= 0L) {
                        v2 = v + 9L;
                        this.m = v2;
                        return v14;
                    }
                    else if(((long)Y1.A(v + 9L)) >= 0L) {
                        v2 = v + 10L;
                        this.m = v2;
                        return v14;
                    }
                }
            }
            return this.S();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        long S() throws IOException {
            long v = 0L;
            for(int v1 = 0; v1 < 0x40; v1 += 7) {
                int v2 = this.K();
                v |= ((long)(v2 & 0x7F)) << v1;
                if((v2 & 0x80) == 0) {
                    return v;
                }
            }
            throw y0.g();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public int T() throws IOException {
            return this.M();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public long U() throws IOException {
            return this.N();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public int V() throws IOException {
            return z.c(this.O());
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public long W() throws IOException {
            return z.d(this.R());
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public String X() throws IOException {
            int v = this.O();
            if(v > 0 && v <= this.q0()) {
                byte[] arr_b = new byte[v];
                Y1.p(this.m, arr_b, 0L, v);
                this.m += (long)v;
                return new String(arr_b, t0.b);
            }
            if(v != 0) {
                throw v >= 0 ? y0.n() : y0.h();
            }
            return "";
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public String Y() throws IOException {
            int v = this.O();
            if(v > 0 && v <= this.q0()) {
                String s = Z1.g(this.i, this.n0(this.m), v);
                this.m += (long)v;
                return s;
            }
            if(v != 0) {
                throw v > 0 ? y0.n() : y0.h();
            }
            return "";
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public int Z() throws IOException {
            if(this.j()) {
                this.p = 0;
                return 0;
            }
            int v = this.O();
            this.p = v;
            if(v >>> 3 == 0) {
                throw y0.d();
            }
            return this.p;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public void a(int v) throws y0 {
            if(this.p != v) {
                throw y0.c();
            }
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public int a0() throws IOException {
            return this.O();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public long b0() throws IOException {
            return this.R();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        @Deprecated
        public void c0(int v, com.google.crypto.tink.shaded.protobuf.R0.a r0$a0) throws IOException {
            this.F(v, r0$a0, V.d());
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public void d0() {
            this.n = this.m;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public void f(boolean z) {
            this.q = z;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public int g() {
            return this.r == 0x7FFFFFFF ? -1 : this.r - this.i();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public int h() {
            return this.p;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public boolean h0(int v) throws IOException {
            switch(v & 7) {
                case 0: {
                    this.r0();
                    return true;
                }
                case 1: {
                    this.l0(8);
                    return true;
                }
                default: {
                    if((v & 7) != 2) {
                        switch(v & 7) {
                            case 3: {
                                this.j0();
                                this.a(v >>> 3 << 3 | 4);
                                return true;
                            }
                            case 4: {
                                return false;
                            }
                            default: {
                                if((v & 7) != 5) {
                                    throw y0.f();
                                }
                                this.l0(4);
                                return true;
                            }
                        }
                    }
                    this.l0(this.O());
                    return true;
                }
            }
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public int i() {
            return (int)(this.m - this.n);
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public boolean i0(int v, B b0) throws IOException {
            switch(v & 7) {
                case 0: {
                    long v3 = this.H();
                    b0.u1(v);
                    b0.v1(v3);
                    return true;
                }
                case 1: {
                    long v4 = this.N();
                    b0.u1(v);
                    b0.Q0(v4);
                    return true;
                }
                default: {
                    if((v & 7) != 2) {
                        switch(v & 7) {
                            case 3: {
                                b0.u1(v);
                                this.k0(b0);
                                int v2 = v >>> 3 << 3 | 4;
                                this.a(v2);
                                b0.u1(v2);
                                return true;
                            }
                            case 4: {
                                return false;
                            }
                            default: {
                                if((v & 7) != 5) {
                                    throw y0.f();
                                }
                                int v1 = this.M();
                                b0.u1(v);
                                b0.P0(v1);
                                return true;
                            }
                        }
                    }
                    u u0 = this.y();
                    b0.u1(v);
                    b0.M0(u0);
                    return true;
                }
            }
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public boolean j() throws IOException {
            return this.m == this.l;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public void j0() throws IOException {
            do {
                int v = this.Z();
            }
            while(v != 0 && this.h0(v));
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public void k0(B b0) throws IOException {
            do {
                int v = this.Z();
            }
            while(v != 0 && this.i0(v, b0));
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public void l0(int v) throws IOException {
            if(v < 0 || v > this.q0()) {
                throw v >= 0 ? y0.n() : y0.h();
            }
            this.m += (long)v;
        }

        private int n0(long v) {
            return (int)(v - this.k);
        }

        // 去混淆评级： 低(20)
        static boolean o0() [...] // 潜在的解密器

        private void p0() {
            long v = this.l + ((long)this.o);
            this.l = v;
            int v1 = (int)(v - this.n);
            int v2 = this.r;
            if(v1 > v2) {
                int v3 = v1 - v2;
                this.o = v3;
                this.l = v - ((long)v3);
                return;
            }
            this.o = 0;
        }

        private int q0() {
            return (int)(this.l - this.m);
        }

        private void r0() throws IOException {
            if(this.q0() >= 10) {
                this.s0();
                return;
            }
            this.t0();
        }

        private void s0() throws IOException {
            for(int v = 0; v < 10; ++v) {
                long v1 = this.m;
                this.m = v1 + 1L;
                if(Y1.A(v1) >= 0) {
                    return;
                }
            }
            throw y0.g();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public void t(int v) {
            this.r = v;
            this.p0();
        }

        private void t0() throws IOException {
            for(int v = 0; v < 10; ++v) {
                if(this.K() >= 0) {
                    return;
                }
            }
            throw y0.g();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public int u(int v) throws y0 {
            if(v < 0) {
                throw y0.h();
            }
            int v1 = v + this.i();
            int v2 = this.r;
            if(v1 > v2) {
                throw y0.n();
            }
            this.r = v1;
            this.p0();
            return v2;
        }

        private ByteBuffer u0(long v, long v1) throws IOException {
            int v2 = this.i.position();
            int v3 = this.i.limit();
            ByteBuffer byteBuffer0 = this.i;
            try {
                byteBuffer0.position(this.n0(v));
                byteBuffer0.limit(this.n0(v1));
                return this.i.slice();
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                y0 y00 = y0.n();
                y00.initCause(illegalArgumentException0);
                throw y00;
            }
            finally {
                byteBuffer0.position(v2);
                byteBuffer0.limit(v3);
            }
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public boolean v() throws IOException {
            return this.R() != 0L;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public byte[] w() throws IOException {
            return this.L(this.O());
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public ByteBuffer x() throws IOException {
            int v = this.O();
            if(v > 0 && v <= this.q0()) {
                if(!this.j && this.q) {
                    ByteBuffer byteBuffer0 = this.u0(this.m, this.m + ((long)v));
                    this.m += (long)v;
                    return byteBuffer0;
                }
                byte[] arr_b = new byte[v];
                Y1.p(this.m, arr_b, 0L, v);
                this.m += (long)v;
                return ByteBuffer.wrap(arr_b);
            }
            if(v != 0) {
                throw v >= 0 ? y0.n() : y0.h();
            }
            return t0.f;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public u y() throws IOException {
            int v = this.O();
            if(v > 0 && v <= this.q0()) {
                if(this.j && this.q) {
                    ByteBuffer byteBuffer0 = this.u0(this.m, this.m + ((long)v));
                    this.m += (long)v;
                    return u.m0(byteBuffer0);
                }
                byte[] arr_b = new byte[v];
                Y1.p(this.m, arr_b, 0L, v);
                this.m += (long)v;
                return u.n0(arr_b);
            }
            if(v != 0) {
                throw v >= 0 ? y0.n() : y0.h();
            }
            return u.e;
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.z
        public double z() throws IOException {
            return Double.longBitsToDouble(this.N());
        }
    }

    int a;
    int b;
    int c;
    A d;
    private boolean e;
    private static final int f = 0x1000;
    private static final int g = 0x7FFFFFFF;
    private static volatile int h = 100;

    static {
    }

    private z() {
        this.b = z.h;
        this.c = 0x7FFFFFFF;
        this.e = false;
    }

    z(a z$a0) {
    }

    public abstract int A() throws IOException;

    public abstract int B() throws IOException;

    public abstract long C() throws IOException;

    public abstract float D() throws IOException;

    public abstract R0 E(int arg1, j1 arg2, V arg3) throws IOException;

    public abstract void F(int arg1, com.google.crypto.tink.shaded.protobuf.R0.a arg2, V arg3) throws IOException;

    public abstract int G() throws IOException;

    public abstract long H() throws IOException;

    public abstract R0 I(j1 arg1, V arg2) throws IOException;

    public abstract void J(com.google.crypto.tink.shaded.protobuf.R0.a arg1, V arg2) throws IOException;

    public abstract byte K() throws IOException;

    public abstract byte[] L(int arg1) throws IOException;

    public abstract int M() throws IOException;

    public abstract long N() throws IOException;

    public abstract int O() throws IOException;

    public static int P(int v, InputStream inputStream0) throws IOException {
        if((v & 0x80) == 0) {
            return v;
        }
        int v1 = v & 0x7F;
        int v2;
        for(v2 = 7; v2 < 0x20; v2 += 7) {
            int v3 = inputStream0.read();
            if(v3 == -1) {
                throw y0.n();
            }
            v1 |= (v3 & 0x7F) << v2;
            if((v3 & 0x80) == 0) {
                return v1;
            }
        }
        while(v2 < 0x40) {
            int v4 = inputStream0.read();
            if(v4 == -1) {
                throw y0.n();
            }
            if((v4 & 0x80) == 0) {
                return v1;
            }
            v2 += 7;
        }
        throw y0.g();
    }

    static int Q(InputStream inputStream0) throws IOException {
        int v = inputStream0.read();
        if(v == -1) {
            throw y0.n();
        }
        return z.P(v, inputStream0);
    }

    public abstract long R() throws IOException;

    abstract long S() throws IOException;

    public abstract int T() throws IOException;

    public abstract long U() throws IOException;

    public abstract int V() throws IOException;

    public abstract long W() throws IOException;

    public abstract String X() throws IOException;

    public abstract String Y() throws IOException;

    public abstract int Z() throws IOException;

    public abstract void a(int arg1) throws y0;

    public abstract int a0() throws IOException;

    public void b() throws y0 {
        if(this.a >= this.b) {
            throw y0.j();
        }
    }

    public abstract long b0() throws IOException;

    public static int c(int v) [...] // Inlined contents

    @Deprecated
    public abstract void c0(int arg1, com.google.crypto.tink.shaded.protobuf.R0.a arg2) throws IOException;

    public static long d(long v) [...] // Inlined contents

    public abstract void d0();

    final void e() {
        this.e = true;
    }

    public final int e0(int v) {
        if(v < 0) {
            throw new IllegalArgumentException("Recursion limit cannot be negative: " + v);
        }
        int v1 = this.b;
        this.b = v;
        return v1;
    }

    public abstract void f(boolean arg1);

    public final int f0(int v) {
        if(v < 0) {
            throw new IllegalArgumentException("Size limit cannot be negative: " + v);
        }
        int v1 = this.c;
        this.c = v;
        return v1;
    }

    public abstract int g();

    final boolean g0() {
        return this.e;
    }

    public abstract int h();

    public abstract boolean h0(int arg1) throws IOException;

    public abstract int i();

    @Deprecated
    public abstract boolean i0(int arg1, B arg2) throws IOException;

    public abstract boolean j() throws IOException;

    public abstract void j0() throws IOException;

    public static z k(InputStream inputStream0) {
        return z.l(inputStream0, 0x1000);
    }

    public abstract void k0(B arg1) throws IOException;

    public static z l(InputStream inputStream0, int v) {
        if(v <= 0) {
            throw new IllegalArgumentException("bufferSize must be > 0");
        }
        return inputStream0 == null ? z.q(t0.e) : new d(inputStream0, v, null);
    }

    public abstract void l0(int arg1) throws IOException;

    // 去混淆评级： 低(30)
    public static z m(Iterable iterable0) {
        return z.n(iterable0, false);
    }

    final void m0() {
        this.e = false;
    }

    static z n(Iterable iterable0, boolean z) {
        int v = 0;
        int v1 = 0;
        for(Object object0: iterable0) {
            ByteBuffer byteBuffer0 = (ByteBuffer)object0;
            v1 += byteBuffer0.remaining();
            if(byteBuffer0.hasArray()) {
                v |= 1;
            }
            else {
                v |= (byteBuffer0.isDirect() ? 2 : 4);
            }
        }
        return v == 2 ? new c(iterable0, v1, z, null) : z.k(new z0(iterable0));
    }

    public static z o(ByteBuffer byteBuffer0) {
        return z.p(byteBuffer0, false);
    }

    static z p(ByteBuffer byteBuffer0, boolean z) {
        if(byteBuffer0.hasArray()) {
            return z.s(byteBuffer0.array(), byteBuffer0.arrayOffset() + byteBuffer0.position(), byteBuffer0.remaining(), z);
        }
        if(byteBuffer0.isDirect()) {
            return new e(byteBuffer0, z, null);
        }
        int v = byteBuffer0.remaining();
        byte[] arr_b = new byte[v];
        byteBuffer0.duplicate().get(arr_b);
        return z.s(arr_b, 0, v, true);
    }

    public static z q(byte[] arr_b) {
        return z.r(arr_b, 0, arr_b.length);
    }

    public static z r(byte[] arr_b, int v, int v1) {
        return z.s(arr_b, v, v1, false);
    }

    static z s(byte[] arr_b, int v, int v1, boolean z) {
        z z1 = new b(arr_b, v, v1, z, null);
        try {
            ((b)z1).u(v1);
            return z1;
        }
        catch(y0 y00) {
            throw new IllegalArgumentException(y00);
        }
    }

    public abstract void t(int arg1);

    public abstract int u(int arg1) throws y0;

    public abstract boolean v() throws IOException;

    public abstract byte[] w() throws IOException;

    public abstract ByteBuffer x() throws IOException;

    public abstract u y() throws IOException;

    public abstract double z() throws IOException;
}

