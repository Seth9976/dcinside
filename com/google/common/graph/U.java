package com.google.common.graph;

import com.google.common.collect.B2;
import com.google.common.collect.I2;
import j..util.DesugarCollections;
import java.util.Map;
import java.util.Set;

@x
final class u extends e {
    u(Map map0, Map map1, int v) {
        super(map0, map1, v);
    }

    @Override  // com.google.common.graph.c0
    public Set b() {
        return DesugarCollections.unmodifiableSet(((com.google.common.collect.x)this.b).values());
    }

    @Override  // com.google.common.graph.c0
    public Set c() {
        return DesugarCollections.unmodifiableSet(((com.google.common.collect.x)this.a).values());
    }

    @Override  // com.google.common.graph.c0
    public Set l(Object object0) {
        return new v(((com.google.common.collect.x)this.b).Q1(), object0);
    }

    static u n() {
        return new u(B2.h(2), B2.h(2), 0);
    }

    static u o(Map map0, Map map1, int v) {
        return new u(I2.P(map0), I2.P(map1), v);
    }
}

