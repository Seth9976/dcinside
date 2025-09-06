package com.google.firebase.remoteconfig;

import java.util.concurrent.Callable;

public final class j implements Callable {
    public final p a;

    public j(p p0) {
        this.a = p0;
    }

    @Override
    public final Object call() {
        return this.a.G();
    }
}

