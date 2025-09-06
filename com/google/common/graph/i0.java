package com.google.common.graph;

import com.google.common.base.H;
import com.google.common.collect.a3;
import j..util.Objects;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

@x
class i0 extends j {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final w d;
    private final w e;
    final T f;
    final T g;

    i0(b0 b00) {
        this(b00, b00.c.c(((int)(((Integer)b00.e.i(10))))), b00.g.c(((int)(((Integer)b00.h.i(20))))));
    }

    i0(b0 b00, Map map0, Map map1) {
        this.a = b00.a;
        this.b = b00.f;
        this.c = b00.b;
        this.d = b00.c;
        this.e = b00.g;
        T t0 = map0 instanceof TreeMap ? new U(map0) : new T(map0);
        this.f = t0;
        this.g = new T(map1);
    }

    @Override  // com.google.common.graph.a0
    public boolean B() {
        return this.b;
    }

    @Override  // com.google.common.graph.a0
    public y I(Object object0) {
        Object object1 = this.S(object0);
        c0 c00 = (c0)this.f.f(object1);
        Objects.requireNonNull(c00);
        return y.i(this, object1, c00.d(object0));
    }

    final c0 R(Object object0) {
        c0 c00 = (c0)this.f.f(object0);
        if(c00 != null) {
            return c00;
        }
        H.E(object0);
        throw new IllegalArgumentException(String.format("Node %s is not an element of this graph.", object0));
    }

    final Object S(Object object0) {
        Object object1 = this.g.f(object0);
        if(object1 != null) {
            return object1;
        }
        H.E(object0);
        throw new IllegalArgumentException(String.format("Edge %s is not an element of this graph.", object0));
    }

    final boolean T(Object object0) {
        return this.g.e(object0);
    }

    final boolean U(Object object0) {
        return this.f.e(object0);
    }

    @Override  // com.google.common.graph.j
    public Iterable a(Object object0) {
        return this.a(object0);
    }

    @Override  // com.google.common.graph.a0
    public Set a(Object object0) {
        return this.R(object0).b();
    }

    @Override  // com.google.common.graph.j
    public Iterable b(Object object0) {
        return this.b(object0);
    }

    @Override  // com.google.common.graph.a0
    public Set b(Object object0) {
        return this.R(object0).c();
    }

    @Override  // com.google.common.graph.a0
    public boolean c() {
        return this.a;
    }

    @Override  // com.google.common.graph.a0
    public Set d(Object object0) {
        return this.R(object0).a();
    }

    @Override  // com.google.common.graph.a0
    public Set e() {
        return this.f.k();
    }

    @Override  // com.google.common.graph.a0
    public Set g() {
        return this.g.k();
    }

    @Override  // com.google.common.graph.a0
    public w k() {
        return this.d;
    }

    @Override  // com.google.common.graph.a0
    public boolean m() {
        return this.c;
    }

    @Override  // com.google.common.graph.a0
    public Set n(Object object0) {
        return this.R(object0).k();
    }

    @Override  // com.google.common.graph.j
    public Set u(Object object0, Object object1) {
        c0 c00 = this.R(object0);
        if(!this.c && object0 == object1) {
            return a3.B();
        }
        H.u(this.U(object1), "Node %s is not an element of this graph.", object1);
        return c00.l(object1);
    }

    @Override  // com.google.common.graph.a0
    public w v() {
        return this.e;
    }

    @Override  // com.google.common.graph.a0
    public Set w(Object object0) {
        return this.R(object0).e();
    }

    @Override  // com.google.common.graph.a0
    public Set z(Object object0) {
        return this.R(object0).g();
    }
}

