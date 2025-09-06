package com.google.common.util.concurrent;

import java.util.concurrent.Callable;

public final class i1 implements Runnable {
    public final Callable a;

    public i1(Callable callable0) {
        this.a = callable0;
    }

    @Override
    public final void run() {
        j1.b(this.a);
    }
}

