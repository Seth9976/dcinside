package com.google.firebase.heartbeatinfo;

import java.util.concurrent.Callable;

public final class d implements Callable {
    public final g a;

    public d(g g0) {
        this.a = g0;
    }

    @Override
    public final Object call() {
        return this.a.i();
    }
}

