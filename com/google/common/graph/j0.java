package com.google.common.graph;

import com.google.common.base.H;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import o3.a;

@x
class j0 extends m {
    private final boolean a;
    private final boolean b;
    private final w c;
    final T d;
    long e;

    j0(g g0) {
        this(g0, g0.c.c(((int)(((Integer)g0.e.i(10))))), 0L);
    }

    j0(g g0, Map map0, long v) {
        this.a = g0.a;
        this.b = g0.b;
        this.c = g0.c;
        T t0 = map0 instanceof TreeMap ? new U(map0) : new T(map0);
        this.d = t0;
        this.e = I.c(v);
    }

    @Override  // com.google.common.graph.r0
    @a
    public Object C(Object object0, Object object1, @a Object object2) {
        return this.V(H.E(object0), H.E(object1), object2);
    }

    @Override  // com.google.common.graph.a
    protected long N() {
        return this.e;
    }

    private final G T(Object object0) {
        G g0 = (G)this.d.f(object0);
        if(g0 != null) {
            return g0;
        }
        H.E(object0);
        throw new IllegalArgumentException("Node " + object0 + " is not an element of this graph.");
    }

    final boolean U(@a Object object0) {
        return this.d.e(object0);
    }

    @a
    private final Object V(Object object0, Object object1, @a Object object2) {
        G g0 = (G)this.d.f(object0);
        Object object3 = g0 == null ? null : g0.e(object1);
        return object3 == null ? object2 : object3;
    }

    private final boolean W(Object object0, Object object1) {
        G g0 = (G)this.d.f(object0);
        return g0 != null && g0.b().contains(object1);
    }

    @Override  // com.google.common.graph.m
    public Iterable a(Object object0) {
        return this.a(object0);
    }

    @Override  // com.google.common.graph.r0, com.google.common.graph.o
    public Set a(Object object0) {
        return this.T(object0).b();
    }

    @Override  // com.google.common.graph.m
    public Iterable b(Object object0) {
        return this.b(object0);
    }

    @Override  // com.google.common.graph.r0, com.google.common.graph.o
    public Set b(Object object0) {
        return this.T(object0).c();
    }

    @Override  // com.google.common.graph.r0, com.google.common.graph.o
    public boolean c() {
        return this.a;
    }

    @Override  // com.google.common.graph.r0, com.google.common.graph.o
    public Set d(Object object0) {
        return this.T(object0).a();
    }

    @Override  // com.google.common.graph.r0, com.google.common.graph.o
    public Set e() {
        return this.d.k();
    }

    @Override  // com.google.common.graph.m
    public boolean h(Object object0, Object object1) {
        return this.W(H.E(object0), H.E(object1));
    }

    @Override  // com.google.common.graph.m
    public boolean i(y y0) {
        H.E(y0);
        return this.O(y0) && this.W(y0.d(), y0.g());
    }

    @Override  // com.google.common.graph.r0, com.google.common.graph.o
    public w k() {
        return this.c;
    }

    @Override  // com.google.common.graph.r0, com.google.common.graph.o
    public boolean m() {
        return this.b;
    }

    @Override  // com.google.common.graph.m
    public Set n(Object object0) {
        class com.google.common.graph.j0.a extends S {
            final G c;

            com.google.common.graph.j0.a(o o0, Object object0, G g0) {
                this.c = g0;
                super(o0, object0);
            }

            @Override
            public Iterator iterator() {
                return this.c.h(this.a);
            }
        }

        return new com.google.common.graph.j0.a(this, this, object0, this.T(object0));
    }

    @Override  // com.google.common.graph.r0
    @a
    public Object y(y y0, @a Object object0) {
        this.P(y0);
        return this.V(y0.d(), y0.g(), object0);
    }
}

