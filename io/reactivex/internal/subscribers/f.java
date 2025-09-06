package io.reactivex.internal.subscribers;

import io.reactivex.internal.subscriptions.j;
import io.reactivex.q;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.e;

public final class f extends AtomicReference implements q, e {
    final Queue a;
    private static final long b = 0xBC551743F607B3E4L;
    public static final Object c;

    static {
        f.c = new Object();
    }

    public f(Queue queue0) {
        this.a = queue0;
    }

    public boolean a() {
        return this.get() == j.a;
    }

    @Override  // org.reactivestreams.e
    public void cancel() {
        if(j.a(this)) {
            this.a.offer(f.c);
        }
    }

    @Override  // io.reactivex.q
    public void g(e e0) {
        if(j.h(this, e0)) {
            Object object0 = io.reactivex.internal.util.q.s(this);
            this.a.offer(object0);
        }
    }

    @Override  // org.reactivestreams.d
    public void onComplete() {
        this.a.offer(io.reactivex.internal.util.q.e());
    }

    @Override  // org.reactivestreams.d
    public void onError(Throwable throwable0) {
        Object object0 = io.reactivex.internal.util.q.g(throwable0);
        this.a.offer(object0);
    }

    @Override  // org.reactivestreams.d
    public void onNext(Object object0) {
        this.a.offer(object0);
    }

    @Override  // org.reactivestreams.e
    public void request(long v) {
        ((e)this.get()).request(v);
    }
}

