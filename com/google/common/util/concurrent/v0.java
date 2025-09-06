package com.google.common.util.concurrent;

import com.google.common.base.Q;

public final class V0 implements Q {
    public final int a;

    public V0(int v) {
        this.a = v;
    }

    @Override  // com.google.common.base.Q
    public final Object get() {
        return Y0.m(this.a);
    }
}

