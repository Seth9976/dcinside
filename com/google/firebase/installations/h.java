package com.google.firebase.installations;

import java.util.concurrent.Callable;

public final class h implements Callable {
    public final j a;

    public h(j j0) {
        this.a = j0;
    }

    @Override
    public final Object call() {
        return this.a.m();
    }
}

