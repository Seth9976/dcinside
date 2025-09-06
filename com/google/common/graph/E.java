package com.google.common.graph;

import com.google.common.base.H;
import com.google.common.collect.D4;
import com.google.common.collect.p3;
import com.google.common.collect.q3;
import com.google.common.collect.u5;
import com.google.common.math.f;
import j..util.DesugarCollections;
import j..util.Objects;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@x
abstract class e implements c0 {
    final Map a;
    final Map b;
    private int c;

    e(Map map0, Map map1, int v) {
        this.a = (Map)H.E(map0);
        this.b = (Map)H.E(map1);
        this.c = I.b(v);
        H.g0(v <= map0.size() && v <= map1.size());
    }

    @Override  // com.google.common.graph.c0
    public Set a() {
        return D4.O(this.c(), this.b());
    }

    @Override  // com.google.common.graph.c0
    public Object d(Object object0) {
        Object object1 = this.b.get(object0);
        Objects.requireNonNull(object1);
        return object1;
    }

    @Override  // com.google.common.graph.c0
    public Set e() {
        return DesugarCollections.unmodifiableSet(this.a.keySet());
    }

    @Override  // com.google.common.graph.c0
    public Object f(Object object0) {
        Object object1 = this.b.remove(object0);
        Objects.requireNonNull(object1);
        return object1;
    }

    @Override  // com.google.common.graph.c0
    public Set g() {
        return DesugarCollections.unmodifiableSet(this.b.keySet());
    }

    @Override  // com.google.common.graph.c0
    public Object h(Object object0, boolean z) {
        if(z) {
            int v = this.c - 1;
            this.c = v;
            I.b(v);
        }
        Object object1 = this.a.remove(object0);
        Objects.requireNonNull(object1);
        return object1;
    }

    @Override  // com.google.common.graph.c0
    public void i(Object object0, Object object1) {
        H.E(object0);
        H.E(object1);
        H.g0(this.b.put(object0, object1) == null);
    }

    @Override  // com.google.common.graph.c0
    public void j(Object object0, Object object1, boolean z) {
        H.E(object0);
        H.E(object1);
        boolean z1 = true;
        if(z) {
            int v = this.c + 1;
            this.c = v;
            I.d(v);
        }
        if(this.a.put(object0, object1) != null) {
            z1 = false;
        }
        H.g0(z1);
    }

    @Override  // com.google.common.graph.c0
    public Set k() {
        class a extends AbstractSet {
            final e a;

            public u5 a() {
                return e.this.c == 0 ? q3.e0(p3.f(e.this.a.keySet(), e.this.b.keySet()).iterator()) : q3.e0(D4.O(e.this.a.keySet(), e.this.b.keySet()).iterator());
            }

            // 去混淆评级： 低(20)
            @Override
            public boolean contains(@o3.a Object object0) {
                return e.this.a.containsKey(object0) || e.this.b.containsKey(object0);
            }

            @Override
            public Iterator iterator() {
                return this.a();
            }

            @Override
            public int size() {
                return f.t(e.this.a.size(), e.this.b.size() - e.this.c);
            }
        }

        return new a(this);
    }
}

