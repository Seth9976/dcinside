package com.vungle.ads.internal;

import com.vungle.ads.d1;

public final class s implements Runnable {
    public final w a;
    public final d1 b;

    public s(w w0, d1 d10) {
        this.a = w0;
        this.b = d10;
    }

    @Override
    public final void run() {
        w.onInitError$lambda-12(this.a, this.b);
    }
}

