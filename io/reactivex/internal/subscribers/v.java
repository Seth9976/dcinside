package io.reactivex.internal.subscribers;

import io.reactivex.disposables.c;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.q;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.d;
import org.reactivestreams.e;

public final class v extends AtomicReference implements c, q, e {
    final d a;
    final AtomicReference b;
    private static final long c = -8612022020200669122L;

    public v(d d0) {
        this.b = new AtomicReference();
        this.a = d0;
    }

    @Override  // io.reactivex.disposables.c
    public boolean a() {
        return this.b.get() == j.a;
    }

    public void b(c c0) {
        io.reactivex.internal.disposables.d.f(this, c0);
    }

    @Override  // org.reactivestreams.e
    public void cancel() {
        this.dispose();
    }

    @Override  // io.reactivex.disposables.c
    public void dispose() {
        j.a(this.b);
        io.reactivex.internal.disposables.d.b(this);
    }

    @Override  // io.reactivex.q
    public void g(e e0) {
        if(j.h(this.b, e0)) {
            this.a.g(this);
        }
    }

    @Override  // org.reactivestreams.d
    public void onComplete() {
        io.reactivex.internal.disposables.d.b(this);
        this.a.onComplete();
    }

    @Override  // org.reactivestreams.d
    public void onError(Throwable throwable0) {
        io.reactivex.internal.disposables.d.b(this);
        this.a.onError(throwable0);
    }

    @Override  // org.reactivestreams.d
    public void onNext(Object object0) {
        this.a.onNext(object0);
    }

    @Override  // org.reactivestreams.e
    public void request(long v) {
        if(j.j(v)) {
            ((e)this.b.get()).request(v);
        }
    }
}

