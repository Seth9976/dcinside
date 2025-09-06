package com.google.firebase.heartbeatinfo;

import java.util.concurrent.Callable;

public final class f implements Callable {
    public final g a;

    public f(g g0) {
        this.a = g0;
    }

    @Override
    public final Object call() {
        return this.a.k();
    }
}

