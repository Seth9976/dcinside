package io.reactivex.internal.subscriptions;

import f3.l;
import org.reactivestreams.d;

public enum g implements l {
    INSTANCE;

    public static void a(d d0) {
        d0.g(g.a);
        d0.onComplete();
    }

    public static void b(Throwable throwable0, d d0) {
        d0.g(g.a);
        d0.onError(throwable0);
    }

    @Override  // org.reactivestreams.e
    public void cancel() {
    }

    @Override  // f3.o
    public void clear() {
    }

    @Override  // f3.k
    public int i(int v) {
        return v & 2;
    }

    @Override  // f3.o
    public boolean isEmpty() {
        return true;
    }

    @Override  // f3.o
    public boolean j(Object object0, Object object1) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override  // f3.o
    public boolean offer(Object object0) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override  // f3.o
    @d3.g
    public Object poll() {
        return null;
    }

    @Override  // org.reactivestreams.e
    public void request(long v) {
        j.j(v);
    }

    @Override
    public String toString() {
        return "EmptySubscription";
    }
}

