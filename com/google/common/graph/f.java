package com.google.common.graph;

import J1.a;
import O1.f;
import com.google.common.base.C;
import com.google.common.base.H;

@a
@f
@x
public final class F extends g {
    private F(boolean z) {
        super(z);
    }

    @O1.a
    public F a(boolean z) {
        this.b = z;
        return this;
    }

    public W b() {
        return new f0(this);
    }

    private F c() [...] // Inlined contents

    F d() {
        F f0 = new F(this.a);
        f0.b = this.b;
        f0.c = this.c;
        f0.e = this.e;
        f0.d = this.d;
        return f0;
    }

    public static F e() {
        return new F(true);
    }

    @O1.a
    public F f(int v) {
        this.e = C.f(I.b(v));
        return this;
    }

    public static F g(E e0) {
        return new F(e0.c()).a(e0.m()).j(e0.k()).i(e0.q());
    }

    public com.google.common.graph.K.a h() {
        return new com.google.common.graph.K.a(this);
    }

    public F i(w w0) {
        H.u(w0.h() == b.a || w0.h() == b.b, "The given elementOrder (%s) is unsupported. incidentEdgeOrder() only supports ElementOrder.unordered() and ElementOrder.stable().", w0);
        this.d = (w)H.E(w0);
        return this;
    }

    public F j(w w0) {
        this.c = (w)H.E(w0);
        return this;
    }

    public static F k() {
        return new F(false);
    }
}

