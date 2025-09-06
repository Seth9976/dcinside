package com.google.common.graph;

import com.google.common.base.t;

public final class q implements t {
    public final Object a;

    public q(Object object0) {
        this.a = object0;
    }

    @Override  // com.google.common.base.t
    public final Object apply(Object object0) {
        return s.v(this.a, object0);
    }
}

