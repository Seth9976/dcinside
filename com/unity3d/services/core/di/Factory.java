package com.unity3d.services.core.di;

import A3.a;
import kotlin.D;
import kotlin.jvm.internal.L;
import y4.l;

final class Factory implements D {
    @l
    private final a initializer;

    public Factory(@l a a0) {
        L.p(a0, "initializer");
        super();
        this.initializer = a0;
    }

    @Override  // kotlin.D
    public Object getValue() {
        return this.initializer.invoke();
    }

    @Override  // kotlin.D
    public boolean isInitialized() {
        return false;
    }
}

