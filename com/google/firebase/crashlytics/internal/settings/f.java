package com.google.firebase.crashlytics.internal.settings;

import java.util.concurrent.Callable;

public final class f implements Callable {
    public final a a;

    public f(a g$a0) {
        this.a = g$a0;
    }

    @Override
    public final Object call() {
        return this.a.b();
    }
}

