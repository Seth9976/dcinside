package com.google.common.graph;

import O1.a;
import com.google.common.base.H;
import com.google.common.collect.O2;
import com.google.common.collect.u5;
import j..util.Objects;

@x
final class h0 extends j0 implements Y {
    private final w f;

    h0(g g0) {
        super(g0);
        this.f = g0.d;
    }

    @Override  // com.google.common.graph.Y
    @a
    @o3.a
    public Object F(y y0, Object object0) {
        this.P(y0);
        return this.x(y0.d(), y0.g(), object0);
    }

    @a
    private G X(Object object0) {
        G g0 = this.Y();
        H.g0(this.d.i(object0, g0) == null);
        return g0;
    }

    private G Y() {
        return this.c() ? s.x(this.f) : n0.l(this.f);
    }

    @Override  // com.google.common.graph.Y
    @a
    public boolean o(Object object0) {
        H.F(object0, "node");
        G g0 = (G)this.d.f(object0);
        if(g0 == null) {
            return false;
        }
        if(this.m() && g0.f(object0) != null) {
            g0.g(object0);
            --this.e;
        }
        u5 u50 = O2.r(g0.b()).i();
        while(u50.hasNext()) {
            Object object1 = u50.next();
            G g1 = (G)this.d.h(object1);
            Objects.requireNonNull(g1);
            g1.g(object0);
            Objects.requireNonNull(g0.f(object1));
            --this.e;
        }
        if(this.c()) {
            u5 u51 = O2.r(g0.c()).i();
            while(u51.hasNext()) {
                Object object2 = u51.next();
                G g2 = (G)this.d.h(object2);
                Objects.requireNonNull(g2);
                H.g0(g2.f(object0) != null);
                g0.g(object2);
                --this.e;
            }
        }
        this.d.j(object0);
        I.c(this.e);
        return true;
    }

    @Override  // com.google.common.graph.Y
    @a
    public boolean p(Object object0) {
        H.F(object0, "node");
        if(this.U(object0)) {
            return false;
        }
        this.X(object0);
        return true;
    }

    @Override  // com.google.common.graph.m, com.google.common.graph.r0
    public w q() {
        return this.f;
    }

    @Override  // com.google.common.graph.Y
    @a
    @o3.a
    public Object r(Object object0, Object object1) {
        H.F(object0, "nodeU");
        H.F(object1, "nodeV");
        G g0 = (G)this.d.f(object0);
        G g1 = (G)this.d.f(object1);
        if(g0 != null && g1 != null) {
            Object object2 = g0.f(object1);
            if(object2 != null) {
                g1.g(object0);
                long v = this.e - 1L;
                this.e = v;
                I.c(v);
            }
            return object2;
        }
        return null;
    }

    @Override  // com.google.common.graph.Y
    @a
    @o3.a
    public Object s(y y0) {
        this.P(y0);
        return this.r(y0.d(), y0.g());
    }

    @Override  // com.google.common.graph.Y
    @a
    @o3.a
    public Object x(Object object0, Object object1, Object object2) {
        H.F(object0, "nodeU");
        H.F(object1, "nodeV");
        H.F(object2, "value");
        if(!this.m()) {
            H.u(!object0.equals(object1), "Cannot add self-loop edge on node %s, as self-loops are not allowed. To construct a graph that allows self-loops, call allowsSelfLoops(true) on the Builder.", object0);
        }
        G g0 = (G)this.d.f(object0);
        if(g0 == null) {
            g0 = this.X(object0);
        }
        Object object3 = g0.i(object1, object2);
        G g1 = (G)this.d.f(object1);
        if(g1 == null) {
            g1 = this.X(object1);
        }
        g1.d(object0, object2);
        if(object3 == null) {
            long v = this.e + 1L;
            this.e = v;
            I.e(v);
        }
        return object3;
    }
}

