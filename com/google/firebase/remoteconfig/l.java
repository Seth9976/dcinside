package com.google.firebase.remoteconfig;

import java.util.concurrent.Callable;

public final class l implements Callable {
    public final p a;

    public l(p p0) {
        this.a = p0;
    }

    @Override
    public final Object call() {
        return this.a.s();
    }
}

