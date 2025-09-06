package io.reactivex.internal.subscriptions;

import java.util.concurrent.atomic.AtomicBoolean;

public final class e extends AtomicBoolean implements org.reactivestreams.e {
    private static final long a = 0x8F346646FB76D0AAL;

    public boolean a() {
        return this.get();
    }

    @Override  // org.reactivestreams.e
    public void cancel() {
        this.lazySet(true);
    }

    @Override  // org.reactivestreams.e
    public void request(long v) {
        j.j(v);
    }

    @Override
    public String toString() {
        return "BooleanSubscription(cancelled=" + this.get() + ")";
    }
}

