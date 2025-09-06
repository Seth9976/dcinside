package com.google.common.graph;

import com.google.common.base.H;
import j..util.DesugarCollections;
import j..util.Objects;
import java.util.Map;
import java.util.Set;
import o3.a;

@x
abstract class k implements c0 {
    final Map a;

    k(Map map0) {
        this.a = (Map)H.E(map0);
    }

    @Override  // com.google.common.graph.c0
    public Set b() {
        return this.a();
    }

    @Override  // com.google.common.graph.c0
    public Set c() {
        return this.a();
    }

    @Override  // com.google.common.graph.c0
    public Object d(Object object0) {
        Object object1 = this.a.get(object0);
        Objects.requireNonNull(object1);
        return object1;
    }

    @Override  // com.google.common.graph.c0
    public Set e() {
        return this.k();
    }

    @Override  // com.google.common.graph.c0
    public Object f(Object object0) {
        Object object1 = this.a.remove(object0);
        Objects.requireNonNull(object1);
        return object1;
    }

    @Override  // com.google.common.graph.c0
    public Set g() {
        return this.k();
    }

    @Override  // com.google.common.graph.c0
    @a
    public Object h(Object object0, boolean z) {
        return z ? null : this.f(object0);
    }

    @Override  // com.google.common.graph.c0
    public void i(Object object0, Object object1) {
        H.g0(this.a.put(object0, object1) == null);
    }

    @Override  // com.google.common.graph.c0
    public void j(Object object0, Object object1, boolean z) {
        if(!z) {
            this.i(object0, object1);
        }
    }

    @Override  // com.google.common.graph.c0
    public Set k() {
        return DesugarCollections.unmodifiableSet(this.a.keySet());
    }
}

