package io.reactivex.internal.subscriptions;

import f3.l;
import java.util.concurrent.atomic.AtomicLong;

public abstract class d extends AtomicLong implements l {
    private static final long a = 0xA36A0055D1C5E19AL;

    @Override  // f3.o
    public final boolean j(Object object0, Object object1) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override  // f3.o
    public final boolean offer(Object object0) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}

