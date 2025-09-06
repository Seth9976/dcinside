package com.google.common.util.concurrent;

import java.util.concurrent.Executor;

public final class g implements Executor {
    public final h a;

    public g(h h0) {
        this.a = h0;
    }

    @Override
    public final void execute(Runnable runnable0) {
        this.a.m(runnable0);
    }
}

