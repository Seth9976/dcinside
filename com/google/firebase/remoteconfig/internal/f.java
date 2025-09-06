package com.google.firebase.remoteconfig.internal;

import java.util.concurrent.Callable;

public final class f implements Callable {
    public final v a;

    public f(v v0) {
        this.a = v0;
    }

    @Override
    public final Object call() {
        return this.a.e();
    }
}

