package com.vungle.ads.internal.session;

import java.util.concurrent.Callable;

public final class a implements Callable {
    public final d a;

    public a(d d0) {
        this.a = d0;
    }

    @Override
    public final Object call() {
        return d.readUnclosedAdFromFile$lambda-2(this.a);
    }
}

