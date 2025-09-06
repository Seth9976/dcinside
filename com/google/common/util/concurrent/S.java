package com.google.common.util.concurrent;

import com.google.common.collect.K2;

public final class s implements Runnable {
    public final t a;
    public final K2 b;

    public s(t t0, K2 k20) {
        this.a = t0;
        this.b = k20;
    }

    @Override
    public final void run() {
        this.a.W(this.b);
    }
}

