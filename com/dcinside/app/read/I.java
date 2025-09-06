package com.dcinside.app.read;

import com.dcinside.app.type.k;

public final class i implements Runnable {
    public final x a;
    public final k b;

    public i(x x0, k k0) {
        this.a = x0;
        this.b = k0;
    }

    @Override
    public final void run() {
        this.a.k0(this.b);
    }
}

