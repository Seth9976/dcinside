package io.reactivex.internal.subscribers;

import io.reactivex.internal.subscriptions.j;
import io.reactivex.internal.util.c;
import io.reactivex.internal.util.l;
import io.reactivex.q;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.d;
import org.reactivestreams.e;

public class u extends AtomicInteger implements q, e {
    final d a;
    final c b;
    final AtomicLong c;
    final AtomicReference d;
    final AtomicBoolean e;
    volatile boolean f;
    private static final long g = 0xBB5FBAB27DF42E38L;

    public u(d d0) {
        this.a = d0;
        this.b = new c();
        this.c = new AtomicLong();
        this.d = new AtomicReference();
        this.e = new AtomicBoolean();
    }

    @Override  // org.reactivestreams.e
    public void cancel() {
        if(!this.f) {
            j.a(this.d);
        }
    }

    @Override  // io.reactivex.q
    public void g(e e0) {
        if(this.e.compareAndSet(false, true)) {
            this.a.g(this);
            j.c(this.d, this.c, e0);
            return;
        }
        e0.cancel();
        this.cancel();
        this.onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
    }

    @Override  // org.reactivestreams.d
    public void onComplete() {
        this.f = true;
        l.b(this.a, this, this.b);
    }

    @Override  // org.reactivestreams.d
    public void onError(Throwable throwable0) {
        this.f = true;
        l.d(this.a, throwable0, this, this.b);
    }

    @Override  // org.reactivestreams.d
    public void onNext(Object object0) {
        l.f(this.a, object0, this, this.b);
    }

    @Override  // org.reactivestreams.e
    public void request(long v) {
        if(v <= 0L) {
            this.cancel();
            this.onError(new IllegalArgumentException("§3.9 violated: positive request amount required but it was " + v));
            return;
        }
        j.b(this.d, this.c, v);
    }
}

