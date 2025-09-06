package com.google.common.cache;

public final class w implements Runnable {
    public final v a;
    public final z b;

    public w(v v0, z z0) {
        this.a = v0;
        this.b = z0;
    }

    @Override
    public final void run() {
        y.d(this.a, this.b);
    }
}

