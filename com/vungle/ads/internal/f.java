package com.vungle.ads.internal;

import com.vungle.ads.d1;

public final class f implements Runnable {
    public final h a;
    public final d1 b;

    public f(h h0, d1 d10) {
        this.a = h0;
        this.b = d10;
    }

    @Override
    public final void run() {
        a.onFailure$lambda-5(this.a, this.b);
    }
}

