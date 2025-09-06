package io.reactivex.internal.subscriptions;

import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.e;

public final class b extends AtomicLong implements c, e {
    final AtomicReference a;
    final AtomicReference b;
    private static final long c = 7028635084060361255L;

    public b() {
        this.b = new AtomicReference();
        this.a = new AtomicReference();
    }

    public b(c c0) {
        this.b.lazySet(c0);
    }

    @Override  // io.reactivex.disposables.c
    public boolean a() {
        return this.a.get() == j.a;
    }

    public boolean b(c c0) {
        return d.d(this.b, c0);
    }

    public boolean c(c c0) {
        return d.f(this.b, c0);
    }

    @Override  // org.reactivestreams.e
    public void cancel() {
        this.dispose();
    }

    public void d(e e0) {
        j.c(this.a, this, e0);
    }

    @Override  // io.reactivex.disposables.c
    public void dispose() {
        j.a(this.a);
        d.b(this.b);
    }

    @Override  // org.reactivestreams.e
    public void request(long v) {
        j.b(this.a, this, v);
    }
}

