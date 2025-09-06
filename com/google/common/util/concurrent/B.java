package com.google.common.util.concurrent;

import java.util.concurrent.Executor;

public final class b implements Executor {
    public final e a;

    public b(e e0) {
        this.a = e0;
    }

    @Override
    public final void execute(Runnable runnable0) {
        this.a.m(runnable0);
    }
}

