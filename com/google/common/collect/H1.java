package com.google.common.collect;

import J1.c;
import J1.d;
import J1.e;
import j..util.Objects;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import o3.a;

@c
@d
@C1
class h1 extends e1 {
    @e
    @a
    transient long[] m;
    private transient int n;
    private transient int o;
    private final boolean p;
    private static final int q = -2;

    h1() {
        this(3);
    }

    h1(int v) {
        this(v, false);
    }

    h1(int v, boolean z) {
        super(v);
        this.p = z;
    }

    @Override  // com.google.common.collect.e1
    int F() {
        return this.n;
    }

    @Override  // com.google.common.collect.e1
    int G(int v) {
        return ((int)this.p0(v)) - 1;
    }

    @Override  // com.google.common.collect.e1
    void K(int v) {
        super.K(v);
        this.n = -2;
        this.o = -2;
    }

    @Override  // com.google.common.collect.e1
    void L(int v, @d4 Object object0, @d4 Object object1, int v1, int v2) {
        super.L(v, object0, object1, v1, v2);
        this.t0(this.o, v);
        this.t0(v, -2);
    }

    @Override  // com.google.common.collect.e1
    void O(int v, int v1) {
        int v2 = this.size();
        super.O(v, v1);
        this.t0(this.o0(v), this.G(v));
        if(v < v2 - 1) {
            this.t0(this.o0(v2 - 1), v);
            this.t0(v, this.G(v2 - 1));
        }
        this.r0(v2 - 1, 0L);
    }

    @Override  // com.google.common.collect.e1
    void Z(int v) {
        super.Z(v);
        this.m = Arrays.copyOf(this.q0(), v);
    }

    @Override  // com.google.common.collect.e1
    public void clear() {
        if(this.P()) {
            return;
        }
        this.n = -2;
        this.o = -2;
        long[] arr_v = this.m;
        if(arr_v != null) {
            Arrays.fill(arr_v, 0, this.size(), 0L);
        }
        super.clear();
    }

    public static h1 m0() {
        return new h1();
    }

    public static h1 n0(int v) {
        return new h1(v);
    }

    private int o0(int v) {
        return ((int)(this.p0(v) >>> 0x20)) - 1;
    }

    private long p0(int v) {
        return this.q0()[v];
    }

    @Override  // com.google.common.collect.e1
    void q(int v) {
        if(this.p) {
            this.t0(this.o0(v), this.G(v));
            this.t0(this.o, v);
            this.t0(v, -2);
            this.I();
        }
    }

    private long[] q0() {
        long[] arr_v = this.m;
        Objects.requireNonNull(arr_v);
        return arr_v;
    }

    @Override  // com.google.common.collect.e1
    int r(int v, int v1) {
        return v < this.size() ? v : v1;
    }

    private void r0(int v, long v1) {
        this.q0()[v] = v1;
    }

    @Override  // com.google.common.collect.e1
    int s() {
        int v = super.s();
        this.m = new long[v];
        return v;
    }

    private void s0(int v, int v1) {
        this.r0(v, this.p0(v) & 0xFFFFFFFFL | ((long)(v1 + 1)) << 0x20);
    }

    private void t0(int v, int v1) {
        if(v == -2) {
            this.n = v1;
        }
        else {
            this.u0(v, v1);
        }
        if(v1 == -2) {
            this.o = v;
            return;
        }
        this.s0(v1, v);
    }

    @Override  // com.google.common.collect.e1
    @O1.a
    Map u() {
        Map map0 = super.u();
        this.m = null;
        return map0;
    }

    private void u0(int v, int v1) {
        this.r0(v, this.p0(v) & 0xFFFFFFFF00000000L | ((long)(v1 + 1)) & 0xFFFFFFFFL);
    }

    @Override  // com.google.common.collect.e1
    Map y(int v) {
        return new LinkedHashMap(v, 1.0f, this.p);
    }
}

