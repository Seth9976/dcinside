package com.google.common.collect;

import J1.b;
import J1.e;
import java.util.Arrays;

@b(emulated = true, serializable = true)
@C1
class b4 extends a4 {
    @e
    transient long[] o;
    private transient int p;
    private transient int q;
    private static final int r = -2;

    b4() {
        this(3);
    }

    b4(int v) {
        this(v, 1.0f);
    }

    b4(int v, float f) {
        super(v, f);
    }

    b4(a4 a40) {
        this.o(a40.D(), 1.0f);
        for(int v = a40.f(); v != -1; v = a40.t(v)) {
            this.v(a40.j(v), a40.l(v));
        }
    }

    static b4 F() {
        return new b4();
    }

    static b4 G(int v) {
        return new b4(v);
    }

    private int H(int v) {
        return (int)(this.o[v] >>> 0x20);
    }

    private int I(int v) {
        return (int)this.o[v];
    }

    private void J(int v, int v1) {
        this.o[v] = this.o[v] & 0xFFFFFFFFL | ((long)v1) << 0x20;
    }

    private void K(int v, int v1) {
        if(v == -2) {
            this.p = v1;
        }
        else {
            this.L(v, v1);
        }
        if(v1 == -2) {
            this.q = v;
            return;
        }
        this.J(v1, v);
    }

    private void L(int v, int v1) {
        this.o[v] = this.o[v] & 0xFFFFFFFF00000000L | ((long)v1) & 0xFFFFFFFFL;
    }

    @Override  // com.google.common.collect.a4
    public void a() {
        super.a();
        this.p = -2;
        this.q = -2;
    }

    @Override  // com.google.common.collect.a4
    int f() {
        return this.p == -2 ? -1 : this.p;
    }

    @Override  // com.google.common.collect.a4
    void o(int v, float f) {
        super.o(v, f);
        this.p = -2;
        this.q = -2;
        long[] arr_v = new long[v];
        this.o = arr_v;
        Arrays.fill(arr_v, -1L);
    }

    @Override  // com.google.common.collect.a4
    void p(int v, @d4 Object object0, int v1, int v2) {
        super.p(v, object0, v1, v2);
        this.K(this.q, v);
        this.K(v, -2);
    }

    @Override  // com.google.common.collect.a4
    void q(int v) {
        int v1 = this.D();
        this.K(this.H(v), this.I(v));
        if(v < v1 - 1) {
            this.K(this.H(v1 - 1), v);
            this.K(v, this.I(v1 - 1));
        }
        super.q(v);
    }

    @Override  // com.google.common.collect.a4
    int t(int v) {
        int v1 = this.I(v);
        return v1 == -2 ? -1 : v1;
    }

    @Override  // com.google.common.collect.a4
    int u(int v, int v1) {
        return v == this.D() ? v1 : v;
    }

    @Override  // com.google.common.collect.a4
    void z(int v) {
        super.z(v);
        int v1 = this.o.length;
        long[] arr_v = Arrays.copyOf(this.o, v);
        this.o = arr_v;
        Arrays.fill(arr_v, v1, v, -1L);
    }
}

