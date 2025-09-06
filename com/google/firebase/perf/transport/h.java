package com.google.firebase.perf.transport;

public final class h implements Runnable {
    public final k a;
    public final c b;

    public h(k k0, c c0) {
        this.a = k0;
        this.b = c0;
    }

    @Override
    public final void run() {
        this.a.y(this.b);
    }
}

