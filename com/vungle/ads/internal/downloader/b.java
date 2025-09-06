package com.vungle.ads.internal.downloader;

public final class b implements Runnable {
    public final c a;
    public final d b;
    public final a c;

    public b(c c0, d d0, a a0) {
        this.a = c0;
        this.b = d0;
        this.c = a0;
    }

    @Override
    public final void run() {
        c.download$lambda-0(this.a, this.b, this.c);
    }
}

