package com.dcinside.app.read;

public final class b0 implements Runnable {
    public final c0 a;
    public final x b;

    public b0(c0 c00, x x0) {
        this.a = c00;
        this.b = x0;
    }

    @Override
    public final void run() {
        c0.u(this.a, this.b);
    }
}

