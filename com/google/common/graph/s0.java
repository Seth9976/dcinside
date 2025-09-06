package com.google.common.graph;

import J1.a;
import com.google.common.base.C;
import com.google.common.base.H;

@a
@x
public final class s0 extends g {
    private s0(boolean z) {
        super(z);
    }

    @O1.a
    public s0 a(boolean z) {
        this.b = z;
        return this;
    }

    public Y b() {
        return new h0(this);
    }

    private s0 c() [...] // Inlined contents

    s0 d() {
        s0 s00 = new s0(this.a);
        s00.b = this.b;
        s00.c = this.c;
        s00.e = this.e;
        s00.d = this.d;
        return s00;
    }

    public static s0 e() {
        return new s0(true);
    }

    @O1.a
    public s0 f(int v) {
        this.e = C.f(I.b(v));
        return this;
    }

    public static s0 g(r0 r00) {
        return new s0(r00.c()).a(r00.m()).j(r00.k()).i(r00.q());
    }

    public com.google.common.graph.Q.a h() {
        return new com.google.common.graph.Q.a(this);
    }

    public s0 i(w w0) {
        H.u(w0.h() == b.a || w0.h() == b.b, "The given elementOrder (%s) is unsupported. incidentEdgeOrder() only supports ElementOrder.unordered() and ElementOrder.stable().", w0);
        this.d = (w)H.E(w0);
        return this;
    }

    public s0 j(w w0) {
        this.c = (w)H.E(w0);
        return this;
    }

    public static s0 k() {
        return new s0(false);
    }
}

