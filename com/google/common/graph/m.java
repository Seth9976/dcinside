package com.google.common.graph;

import com.google.common.base.t;

public final class M implements t {
    public final a0 a;
    public final Object b;

    public M(a0 a00, Object object0) {
        this.a = a00;
        this.b = object0;
    }

    @Override  // com.google.common.base.t
    public final Object apply(Object object0) {
        return O.f0(this.a, this.b, object0);
    }
}

