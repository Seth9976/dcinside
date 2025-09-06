package com.vungle.ads.internal.load;

import com.vungle.ads.internal.model.m;
import com.vungle.ads.internal.network.f;

public final class h implements Runnable {
    public final i a;
    public final m b;
    public final f c;

    public h(i i0, m m0, f f0) {
        this.a = i0;
        this.b = m0;
        this.c = f0;
    }

    @Override
    public final void run() {
        a.onResponse$lambda-0(this.a, this.b, this.c);
    }
}

