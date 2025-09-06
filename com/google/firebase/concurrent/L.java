package com.google.firebase.concurrent;

import java.util.concurrent.Callable;

public final class l implements Runnable {
    public final Callable a;
    public final b b;

    public l(Callable callable0, b p$b0) {
        this.a = callable0;
        this.b = p$b0;
    }

    @Override
    public final void run() {
        o.p(this.a, this.b);
    }
}

