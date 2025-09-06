package io.reactivex.internal.subscriptions;

import d3.g;
import f3.l;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.d;

public final class h extends AtomicInteger implements l {
    final Object a;
    final d b;
    private static final long c = -3830916580126663321L;
    static final int d = 0;
    static final int e = 1;
    static final int f = 2;

    public h(d d0, Object object0) {
        this.b = d0;
        this.a = object0;
    }

    public boolean a() {
        return this.get() == 2;
    }

    @Override  // org.reactivestreams.e
    public void cancel() {
        this.lazySet(2);
    }

    @Override  // f3.o
    public void clear() {
        this.lazySet(1);
    }

    @Override  // f3.k
    public int i(int v) {
        return v & 1;
    }

    @Override  // f3.o
    public boolean isEmpty() {
        return this.get() != 0;
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
    @g
    public Object poll() {
        if(this.get() == 0) {
            this.lazySet(1);
            return this.a;
        }
        return null;
    }

    @Override  // org.reactivestreams.e
    public void request(long v) {
        if(!j.j(v)) {
            return;
        }
        if(this.compareAndSet(0, 1)) {
            d d0 = this.b;
            d0.onNext(this.a);
            if(this.get() != 2) {
                d0.onComplete();
            }
        }
    }
}

