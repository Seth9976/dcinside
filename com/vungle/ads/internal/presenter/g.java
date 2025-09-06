package com.vungle.ads.internal.presenter;

import com.vungle.ads.d1;

public final class g implements Runnable {
    public final k a;
    public final d1 b;
    public final boolean c;
    public final String d;

    public g(k k0, d1 d10, boolean z, String s) {
        this.a = k0;
        this.b = d10;
        this.c = z;
        this.d = s;
    }

    @Override
    public final void run() {
        k.processCommand$lambda-12(this.a, this.b, this.c, this.d);
    }
}

