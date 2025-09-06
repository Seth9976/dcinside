package com.google.common.graph;

import J1.a;
import O1.j;
import com.google.common.base.H;
import com.google.common.base.t;
import com.google.common.collect.D3;
import com.google.common.collect.Q2.b;
import com.google.common.collect.Q2;
import java.util.Map;
import java.util.Set;

@a
@j(containerOf = {"N", "E"})
@x
public final class O extends i0 {
    public static class com.google.common.graph.O.a {
        private final X a;

        com.google.common.graph.O.a(b0 b00) {
            this.a = b00.c();
        }

        @O1.a
        public com.google.common.graph.O.a a(y y0, Object object0) {
            this.a.D(y0, object0);
            return this;
        }

        @O1.a
        public com.google.common.graph.O.a b(Object object0, Object object1, Object object2) {
            this.a.M(object0, object1, object2);
            return this;
        }

        @O1.a
        public com.google.common.graph.O.a c(Object object0) {
            this.a.p(object0);
            return this;
        }

        public O d() {
            return O.c0(this.a);
        }
    }

    private O(a0 a00) {
        super(b0.i(a00), O.e0(a00), O.d0(a00));
    }

    @Override  // com.google.common.graph.i0
    public boolean B() {
        return super.B();
    }

    @Override  // com.google.common.graph.i0
    public y I(Object object0) {
        return super.I(object0);
    }

    private static t Y(a0 a00, Object object0) {
        return (Object object1) -> a00.I(object1).a(object0);
    }

    public K Z() {
        return new K(super.t());
    }

    @Override  // com.google.common.graph.i0
    public Set a(Object object0) {
        return super.a(object0);
    }

    private static c0 a0(a0 a00, Object object0) {
        if(a00.c()) {
            Map map0 = D3.j(a00.w(object0), O.i0(a00));
            Map map1 = D3.j(a00.z(object0), O.j0(a00));
            int v = a00.u(object0, object0).size();
            return a00.B() ? com.google.common.graph.t.q(map0, map1, v) : u.o(map0, map1, v);
        }
        Map map2 = D3.j(a00.n(object0), O.Y(a00, object0));
        return a00.B() ? o0.q(map2) : p0.n(map2);
    }

    @Override  // com.google.common.graph.i0
    public Set b(Object object0) {
        return super.b(object0);
    }

    @Deprecated
    public static O b0(O o0) {
        return (O)H.E(o0);
    }

    @Override  // com.google.common.graph.i0
    public boolean c() {
        return super.c();
    }

    // 去混淆评级： 低(20)
    public static O c0(a0 a00) {
        return a00 instanceof O ? ((O)a00) : new O(a00);
    }

    @Override  // com.google.common.graph.i0
    public Set d(Object object0) {
        return super.d(object0);
    }

    private static Map d0(a0 a00) {
        b q2$b0 = Q2.b();
        for(Object object0: a00.g()) {
            q2$b0.i(object0, a00.I(object0).d());
        }
        return q2$b0.d();
    }

    @Override  // com.google.common.graph.i0
    public Set e() {
        return super.e();
    }

    private static Map e0(a0 a00) {
        b q2$b0 = Q2.b();
        for(Object object0: a00.e()) {
            q2$b0.i(object0, O.a0(a00, object0));
        }
        return q2$b0.d();
    }

    // 检测为 Lambda 实现
    private static Object f0(a0 a00, Object object0, Object object1) [...]

    @Override  // com.google.common.graph.i0
    public Set g() {
        return super.g();
    }

    // 检测为 Lambda 实现
    private static Object g0(a0 a00, Object object0) [...]

    // 检测为 Lambda 实现
    private static Object h0(a0 a00, Object object0) [...]

    private static t i0(a0 a00) {
        return (Object object0) -> a00.I(object0).k();
    }

    private static t j0(a0 a00) {
        return (Object object0) -> a00.I(object0).l();
    }

    @Override  // com.google.common.graph.i0
    public w k() {
        return super.k();
    }

    @Override  // com.google.common.graph.i0
    public boolean m() {
        return super.m();
    }

    @Override  // com.google.common.graph.i0
    public Set n(Object object0) {
        return super.n(object0);
    }

    @Override  // com.google.common.graph.j
    public E t() {
        return this.Z();
    }

    @Override  // com.google.common.graph.i0
    public Set u(Object object0, Object object1) {
        return super.u(object0, object1);
    }

    @Override  // com.google.common.graph.i0
    public w v() {
        return super.v();
    }

    @Override  // com.google.common.graph.i0
    public Set w(Object object0) {
        return super.w(object0);
    }

    @Override  // com.google.common.graph.i0
    public Set z(Object object0) {
        return super.z(object0);
    }
}

