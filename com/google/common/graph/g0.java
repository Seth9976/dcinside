package com.google.common.graph;

import O1.a;
import com.google.common.base.H;
import com.google.common.collect.O2;
import com.google.common.collect.u5;
import j..util.Objects;

@x
final class g0 extends i0 implements X {
    g0(b0 b00) {
        super(b00);
    }

    @Override  // com.google.common.graph.X
    @a
    public boolean D(y y0, Object object0) {
        this.Q(y0);
        return this.M(y0.d(), y0.g(), object0);
    }

    @Override  // com.google.common.graph.X
    @a
    public boolean L(Object object0) {
        H.F(object0, "edge");
        Object object1 = this.g.f(object0);
        boolean z = false;
        if(object1 == null) {
            return false;
        }
        c0 c00 = (c0)this.f.f(object1);
        Objects.requireNonNull(c00);
        Object object2 = c00.d(object0);
        c0 c01 = (c0)this.f.f(object2);
        Objects.requireNonNull(c01);
        c00.f(object0);
        if(this.m() && object1.equals(object2)) {
            z = true;
        }
        c01.h(object0, z);
        this.g.j(object0);
        return true;
    }

    @Override  // com.google.common.graph.X
    @a
    public boolean M(Object object0, Object object1, Object object2) {
        H.F(object0, "nodeU");
        H.F(object1, "nodeV");
        H.F(object2, "edge");
        boolean z = false;
        if(this.T(object2)) {
            y y0 = this.I(object2);
            y y1 = y.i(this, object0, object1);
            H.z(y0.equals(y1), "Edge %s already exists between the following nodes: %s, so it cannot be reused to connect the following nodes: %s.", object2, y0, y1);
            return false;
        }
        c0 c00 = (c0)this.f.f(object0);
        if(!this.B()) {
            if(c00 == null || !c00.b().contains(object1)) {
                z = true;
            }
            H.y(z, "Nodes %s and %s are already connected by a different edge. To construct a graph that allows parallel edges, call allowsParallelEdges(true) on the Builder.", object0, object1);
        }
        boolean z1 = object0.equals(object1);
        if(!this.m()) {
            H.u(!z1, "Cannot add self-loop edge on node %s, as self-loops are not allowed. To construct a graph that allows self-loops, call allowsSelfLoops(true) on the Builder.", object0);
        }
        if(c00 == null) {
            c00 = this.V(object0);
        }
        c00.i(object2, object1);
        c0 c01 = (c0)this.f.f(object1);
        if(c01 == null) {
            c01 = this.V(object1);
        }
        c01.j(object2, object0, z1);
        this.g.i(object2, object0);
        return true;
    }

    @a
    private c0 V(Object object0) {
        c0 c00 = this.W();
        H.g0(this.f.i(object0, c00) == null);
        return c00;
    }

    private c0 W() {
        if(this.c()) {
            return this.B() ? t.p() : u.n();
        }
        return this.B() ? o0.p() : p0.m();
    }

    @Override  // com.google.common.graph.X
    @a
    public boolean o(Object object0) {
        H.F(object0, "node");
        c0 c00 = (c0)this.f.f(object0);
        if(c00 == null) {
            return false;
        }
        u5 u50 = O2.r(c00.k()).i();
        while(u50.hasNext()) {
            Object object1 = u50.next();
            this.L(object1);
        }
        this.f.j(object0);
        return true;
    }

    @Override  // com.google.common.graph.X
    @a
    public boolean p(Object object0) {
        H.F(object0, "node");
        if(this.U(object0)) {
            return false;
        }
        this.V(object0);
        return true;
    }
}

