package com.google.common.collect;

import J1.b;
import J1.e;
import com.google.common.base.B;
import com.google.common.base.H;
import java.util.Arrays;

@b(emulated = true, serializable = true)
@C1
class a4 {
    class a extends f {
        @d4
        final Object a;
        int b;
        final a4 c;

        a(int v) {
            this.a = a40.a[v];
            this.b = v;
        }

        @O1.a
        public int a(int v) {
            this.b();
            int v1 = this.b;
            if(v1 == -1) {
                a4.this.v(this.a, v);
                return 0;
            }
            int[] arr_v = a4.this.b;
            int v2 = arr_v[v1];
            arr_v[v1] = v;
            return v2;
        }

        void b() {
            if(this.b == -1 || this.b >= a4.this.D() || !B.a(this.a, a4.this.a[this.b])) {
                this.b = a4.this.n(this.a);
            }
        }

        @Override  // com.google.common.collect.S3$a
        @d4
        public Object b0() {
            return this.a;
        }

        @Override  // com.google.common.collect.S3$a
        public int getCount() {
            this.b();
            return this.b == -1 ? 0 : a4.this.b[this.b];
        }
    }

    transient Object[] a;
    transient int[] b;
    transient int c;
    transient int d;
    private transient int[] e;
    @e
    transient long[] f;
    private transient float g;
    private transient int h;
    private static final int i = 0x40000000;
    static final float j = 1.0f;
    private static final long k = 0xFFFFFFFFL;
    private static final long l = 0xFFFFFFFF00000000L;
    static final int m = 3;
    static final int n = -1;

    a4() {
        this.o(3, 1.0f);
    }

    a4(int v) {
        this(v, 1.0f);
    }

    a4(int v, float f) {
        this.o(v, f);
    }

    a4(a4 a40) {
        this.o(a40.D(), 1.0f);
        for(int v = a40.f(); v != -1; v = a40.t(v)) {
            this.v(a40.j(v), a40.l(v));
        }
    }

    private void A(int v) {
        int v1 = this.f.length;
        if(v > v1) {
            int v2 = Math.max(1, v1 >>> 1) + v1 >= 0 ? Math.max(1, v1 >>> 1) + v1 : 0x7FFFFFFF;
            if(v2 != v1) {
                this.z(v2);
            }
        }
    }

    private void B(int v) {
        if(this.e.length >= 0x40000000) {
            this.h = 0x7FFFFFFF;
            return;
        }
        int v1 = ((int)(((float)v) * this.g)) + 1;
        int[] arr_v = a4.s(v);
        long[] arr_v1 = this.f;
        int v2 = arr_v.length - 1;
        for(int v3 = 0; v3 < this.c; ++v3) {
            int v4 = a4.i(arr_v1[v3]);
            int v5 = v4 & v2;
            int v6 = arr_v[v5];
            arr_v[v5] = v3;
            arr_v1[v3] = ((long)v4) << 0x20 | ((long)v6) & 0xFFFFFFFFL;
        }
        this.h = v1;
        this.e = arr_v;
    }

    void C(int v, int v1) {
        H.C(v, this.c);
        this.b[v] = v1;
    }

    int D() {
        return this.c;
    }

    private static long E(long v, int v1) [...] // Inlined contents

    public void a() {
        ++this.d;
        Arrays.fill(this.a, 0, this.c, null);
        Arrays.fill(this.b, 0, this.c, 0);
        Arrays.fill(this.e, -1);
        Arrays.fill(this.f, -1L);
        this.c = 0;
    }

    public boolean b(@o3.a Object object0) {
        return this.n(object0) != -1;
    }

    static a4 c() {
        return new a4();
    }

    static a4 d(int v) {
        return new a4(v);
    }

    void e(int v) {
        if(v > this.f.length) {
            this.z(v);
        }
        if(v >= this.h) {
            this.B(Math.max(2, Integer.highestOneBit(v - 1) << 1));
        }
    }

    int f() {
        return this.c == 0 ? -1 : 0;
    }

    public int g(@o3.a Object object0) {
        int v = this.n(object0);
        return v == -1 ? 0 : this.b[v];
    }

    com.google.common.collect.S3.a h(int v) {
        H.C(v, this.c);
        return new a(this, v);
    }

    private static int i(long v) [...] // Inlined contents

    @d4
    Object j(int v) {
        H.C(v, this.c);
        return this.a[v];
    }

    private static int k(long v) [...] // Inlined contents

    int l(int v) {
        H.C(v, this.c);
        return this.b[v];
    }

    private int m() {
        return this.e.length - 1;
    }

    int n(@o3.a Object object0) {
        int v = F2.d(object0);
        for(int v1 = this.e[this.m() & v]; v1 != -1; v1 = (int)v2) {
            long v2 = this.f[v1];
            if(((int)(v2 >>> 0x20)) == v && B.a(object0, this.a[v1])) {
                return v1;
            }
        }
        return -1;
    }

    void o(int v, float f) {
        boolean z = false;
        H.e(v >= 0, "Initial capacity must be non-negative");
        if(f > 0.0f) {
            z = true;
        }
        H.e(z, "Illegal load factor");
        int v1 = F2.a(v, ((double)f));
        this.e = a4.s(v1);
        this.g = f;
        this.a = new Object[v];
        this.b = new int[v];
        this.f = a4.r(v);
        this.h = Math.max(1, ((int)(((float)v1) * f)));
    }

    void p(int v, @d4 Object object0, int v1, int v2) {
        this.f[v] = ((long)v2) << 0x20 | 0xFFFFFFFFL;
        this.a[v] = object0;
        this.b[v] = v1;
    }

    void q(int v) {
        long v5;
        int v1 = this.D();
        if(v < v1 - 1) {
            Object[] arr_object = this.a;
            arr_object[v] = arr_object[v1 - 1];
            int[] arr_v = this.b;
            arr_v[v] = arr_v[v1 - 1];
            arr_object[v1 - 1] = null;
            arr_v[v1 - 1] = 0;
            long[] arr_v1 = this.f;
            long v2 = arr_v1[v1 - 1];
            arr_v1[v] = v2;
            arr_v1[v1 - 1] = -1L;
            int v3 = ((int)(v2 >>> 0x20)) & this.m();
            int[] arr_v2 = this.e;
            int v4 = arr_v2[v3];
            if(v4 == v1 - 1) {
                arr_v2[v3] = v;
                return;
            }
            while(true) {
                v5 = this.f[v4];
                if(((int)v5) == v1 - 1) {
                    break;
                }
                v4 = (int)v5;
            }
            this.f[v4] = v5 & 0xFFFFFFFF00000000L | 0xFFFFFFFFL & ((long)v);
            return;
        }
        this.a[v] = null;
        this.b[v] = 0;
        this.f[v] = -1L;
    }

    private static long[] r(int v) {
        long[] arr_v = new long[v];
        Arrays.fill(arr_v, -1L);
        return arr_v;
    }

    private static int[] s(int v) {
        int[] arr_v = new int[v];
        Arrays.fill(arr_v, -1);
        return arr_v;
    }

    int t(int v) {
        return v + 1 < this.c ? v + 1 : -1;
    }

    int u(int v, int v1) {
        return v - 1;
    }

    @O1.a
    public int v(@d4 Object object0, int v) {
        c1.d(v, "count");
        long[] arr_v = this.f;
        Object[] arr_object = this.a;
        int[] arr_v1 = this.b;
        int v1 = F2.d(object0);
        int v2 = this.m() & v1;
        int v3 = this.c;
        int[] arr_v2 = this.e;
        int v4 = arr_v2[v2];
        if(v4 == -1) {
            arr_v2[v2] = v3;
            goto label_19;
        }
        while(true) {
            long v5 = arr_v[v4];
            if(((int)(v5 >>> 0x20)) == v1 && B.a(object0, arr_object[v4])) {
                int v6 = arr_v1[v4];
                arr_v1[v4] = v;
                return v6;
            }
            if(((int)v5) == -1) {
                arr_v[v4] = v5 & 0xFFFFFFFF00000000L | 0xFFFFFFFFL & ((long)v3);
            label_19:
                if(v3 == 0x7FFFFFFF) {
                    throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
                }
                this.A(v3 + 1);
                this.p(v3, object0, v, v1);
                this.c = v3 + 1;
                if(v3 >= this.h) {
                    this.B(this.e.length * 2);
                }
                ++this.d;
                return 0;
            }
            v4 = (int)v5;
        }
    }

    @O1.a
    public int w(@o3.a Object object0) {
        return this.x(object0, F2.d(object0));
    }

    private int x(@o3.a Object object0, int v) {
        int v1 = this.m() & v;
        int v2 = this.e[v1];
        if(v2 == -1) {
            return 0;
        }
        int v3 = -1;
        while(true) {
            if(a4.i(this.f[v2]) == v && B.a(object0, this.a[v2])) {
                int v4 = this.b[v2];
                if(v3 == -1) {
                    this.e[v1] = a4.k(this.f[v2]);
                }
                else {
                    this.f[v3] = a4.E(this.f[v3], a4.k(this.f[v2]));
                }
                this.q(v2);
                --this.c;
                ++this.d;
                return v4;
            }
            int v5 = a4.k(this.f[v2]);
            if(v5 == -1) {
                return 0;
            }
            v3 = v2;
            v2 = v5;
        }
    }

    @O1.a
    int y(int v) {
        return this.x(this.a[v], a4.i(this.f[v]));
    }

    void z(int v) {
        this.a = Arrays.copyOf(this.a, v);
        this.b = Arrays.copyOf(this.b, v);
        int v1 = this.f.length;
        long[] arr_v = Arrays.copyOf(this.f, v);
        if(v > v1) {
            Arrays.fill(arr_v, v1, v, -1L);
        }
        this.f = arr_v;
    }
}

