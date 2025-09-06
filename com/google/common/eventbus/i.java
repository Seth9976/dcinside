package com.google.common.eventbus;

public final class i implements Runnable {
    public final j a;
    public final Object b;

    public i(j j0, Object object0) {
        this.a = j0;
        this.b = object0;
    }

    @Override
    public final void run() {
        this.a.g(this.b);
    }
}

