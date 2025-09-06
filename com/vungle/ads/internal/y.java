package com.vungle.ads.internal;

import com.vungle.ads.V;
import kotlin.D;

public final class y implements Runnable {
    public final V a;
    public final D b;

    public y(V v0, D d0) {
        this.a = v0;
        this.b = d0;
    }

    @Override
    public final void run() {
        z.getAvailableBidTokensAsync$lambda-6(this.a, this.b);
    }
}

