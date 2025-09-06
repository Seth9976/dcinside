package io.reactivex.internal.util;

import java.util.concurrent.atomic.AtomicReference;

public final class c extends AtomicReference {
    private static final long a = 3949248817947090603L;

    public boolean a(Throwable throwable0) {
        return k.a(this, throwable0);
    }

    public boolean b() {
        return this.get() == k.a;
    }

    public Throwable c() {
        return k.c(this);
    }
}

