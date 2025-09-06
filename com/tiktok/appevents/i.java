package com.tiktok.appevents;

public final class i implements Runnable {
    public final p a;
    public final int b;

    public i(p p0, int v) {
        this.a = p0;
        this.b = v;
    }

    @Override
    public final void run() {
        this.a.y(this.b);
    }
}

