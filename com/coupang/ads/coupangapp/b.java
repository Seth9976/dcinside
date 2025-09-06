package com.coupang.ads.coupangapp;

import java.util.concurrent.Callable;

public final class b implements Callable {
    public final d a;

    public b(d d0) {
        this.a = d0;
    }

    @Override
    public final Object call() {
        return d.m(this.a);
    }
}

