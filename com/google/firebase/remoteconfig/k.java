package com.google.firebase.remoteconfig;

import java.util.concurrent.Callable;

public final class k implements Callable {
    public final p a;
    public final v b;

    public k(p p0, v v0) {
        this.a = p0;
        this.b = v0;
    }

    @Override
    public final Object call() {
        return this.a.H(this.b);
    }
}

