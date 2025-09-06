package com.google.common.graph;

import J1.a;
import com.google.common.base.C;
import com.google.common.base.H;

@a
@x
public final class b0 extends g {
    boolean f;
    w g;
    C h;

    private b0(boolean z) {
        super(z);
        this.f = false;
        this.g = w.d();
        this.h = C.a();
    }

    @O1.a
    public b0 a(boolean z) {
        this.f = z;
        return this;
    }

    @O1.a
    public b0 b(boolean z) {
        this.b = z;
        return this;
    }

    public X c() {
        return new g0(this);
    }

    private b0 d() [...] // Inlined contents

    public static b0 e() {
        return new b0(true);
    }

    public b0 f(w w0) {
        this.g = (w)H.E(w0);
        return this;
    }

    @O1.a
    public b0 g(int v) {
        this.h = C.f(I.b(v));
        return this;
    }

    @O1.a
    public b0 h(int v) {
        this.e = C.f(I.b(v));
        return this;
    }

    public static b0 i(a0 a00) {
        return new b0(a00.c()).a(a00.B()).b(a00.m()).k(a00.k()).f(a00.v());
    }

    public com.google.common.graph.O.a j() {
        return new com.google.common.graph.O.a(this);
    }

    public b0 k(w w0) {
        this.c = (w)H.E(w0);
        return this;
    }

    public static b0 l() {
        return new b0(false);
    }
}

