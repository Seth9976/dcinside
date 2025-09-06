package com.google.common.util.concurrent;

import java.util.concurrent.Future;

public final class g0 implements Runnable {
    public final Future a;

    public g0(Future future0) {
        this.a = future0;
    }

    @Override
    public final void run() {
        h0.s(this.a);
    }
}

