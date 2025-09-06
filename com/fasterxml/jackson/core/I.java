package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.io.d;
import com.fasterxml.jackson.core.io.q;
import com.fasterxml.jackson.core.json.e;
import com.fasterxml.jackson.core.json.g;

public class i extends D {
    protected d n;
    protected w o;
    protected int p;
    protected char q;

    public i() {
        this.q = '\"';
        this.o = h.x;
        this.p = 0;
    }

    public i(h h0) {
        super(h0);
        this.q = '\"';
        this.n = h0.R0();
        this.o = h0.p;
        this.p = h0.q;
    }

    @Override  // com.fasterxml.jackson.core.D
    public D C(e e0) {
        return this.a0(e0);
    }

    @Override  // com.fasterxml.jackson.core.D
    public D D(e e0, e[] arr_e) {
        return this.b0(e0, arr_e);
    }

    @Override  // com.fasterxml.jackson.core.D
    public D E(g g0) {
        return this.c0(g0);
    }

    @Override  // com.fasterxml.jackson.core.D
    public D F(g g0, g[] arr_g) {
        return this.d0(g0, arr_g);
    }

    public i S(d d0) {
        this.n = d0;
        return this;
    }

    public d T() {
        return this.n;
    }

    // 去混淆评级： 低(20)
    public i U(e e0, boolean z) {
        return z ? this.a0(e0) : this.W(e0);
    }

    // 去混淆评级： 低(20)
    public i V(g g0, boolean z) {
        return z ? this.c0(g0) : this.Y(g0);
    }

    public i W(e e0) {
        this.d(e0.f());
        return this;
    }

    public i X(e e0, e[] arr_e) {
        this.d(e0.f());
        for(int v = 0; v < arr_e.length; ++v) {
            this.f(arr_e[v].f());
        }
        return this;
    }

    public i Y(g g0) {
        this.c(g0.f());
        return this;
    }

    public i Z(g g0, g[] arr_g) {
        this.c(g0.f());
        for(int v = 0; v < arr_g.length; ++v) {
            this.c(arr_g[v].f());
        }
        return this;
    }

    public i a0(e e0) {
        this.f(e0.f());
        return this;
    }

    public i b0(e e0, e[] arr_e) {
        this.f(e0.f());
        this.a0(e0);
        for(int v = 0; v < arr_e.length; ++v) {
            this.f(arr_e[v].f());
        }
        return this;
    }

    public i c0(g g0) {
        b k$b0 = g0.f();
        if(k$b0 != null) {
            this.e(k$b0);
        }
        return this;
    }

    public i d0(g g0, g[] arr_g) {
        this.e(g0.f());
        for(int v = 0; v < arr_g.length; ++v) {
            this.e(arr_g[v].f());
        }
        return this;
    }

    public int e0() {
        return this.p;
    }

    public i f0(int v) {
        this.p = v > 0 ? Math.max(0x7F, v) : 0;
        return this;
    }

    public char g0() {
        return this.q;
    }

    public i h0(char c) {
        if(c > 0x7F) {
            throw new IllegalArgumentException("Can only use Unicode characters up to 0x7F as quote characters");
        }
        this.q = c;
        return this;
    }

    @Override  // com.fasterxml.jackson.core.D
    public h i() {
        return new h(this);
    }

    public i i0(w w0) {
        this.o = w0;
        return this;
    }

    public i j0(String s) {
        this.o = s == null ? null : new q(s);
        return this;
    }

    public w k0() {
        return this.o;
    }

    @Override  // com.fasterxml.jackson.core.D
    public D m(e e0, boolean z) {
        return this.U(e0, z);
    }

    @Override  // com.fasterxml.jackson.core.D
    public D n(g g0, boolean z) {
        return this.V(g0, z);
    }

    @Override  // com.fasterxml.jackson.core.D
    public D t(e e0) {
        return this.W(e0);
    }

    @Override  // com.fasterxml.jackson.core.D
    public D u(e e0, e[] arr_e) {
        return this.X(e0, arr_e);
    }

    @Override  // com.fasterxml.jackson.core.D
    public D v(g g0) {
        return this.Y(g0);
    }

    @Override  // com.fasterxml.jackson.core.D
    public D w(g g0, g[] arr_g) {
        return this.Z(g0, arr_g);
    }
}

