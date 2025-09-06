package com.google.common.graph;

import com.google.common.collect.B2;
import com.google.common.collect.I2;
import j..util.DesugarCollections;
import java.util.Map;
import java.util.Set;

@x
final class p0 extends k {
    p0(Map map0) {
        super(map0);
    }

    @Override  // com.google.common.graph.c0
    public Set a() {
        return DesugarCollections.unmodifiableSet(((com.google.common.collect.x)this.a).values());
    }

    @Override  // com.google.common.graph.c0
    public Set l(Object object0) {
        return new v(((com.google.common.collect.x)this.a).Q1(), object0);
    }

    static p0 m() {
        return new p0(B2.h(2));
    }

    static p0 n(Map map0) {
        return new p0(I2.P(map0));
    }
}

