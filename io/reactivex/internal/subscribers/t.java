package io.reactivex.internal.subscribers;

import io.reactivex.internal.subscriptions.j;
import io.reactivex.q;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.d;
import org.reactivestreams.e;

public abstract class t extends AtomicLong implements q, e {
    protected final d a;
    protected e b;
    protected Object c;
    protected long d;
    private static final long e = 0x6DE1BA4FFE60EBE0L;
    static final long f = 0x8000000000000000L;
    static final long g = 0x7FFFFFFFFFFFFFFFL;

    public t(d d0) {
        this.a = d0;
    }

    protected final void a(Object object0) {
        long v = this.d;
        if(v != 0L) {
            io.reactivex.internal.util.d.e(this, v);
        }
        while(true) {
            long v1 = this.get();
            if((v1 & 0x8000000000000000L) != 0L) {
                this.c(object0);
                return;
            }
            if((v1 & 0x7FFFFFFFFFFFFFFFL) != 0L) {
                this.lazySet(0x8000000000000001L);
                this.a.onNext(object0);
                this.a.onComplete();
                return;
            }
            this.c = object0;
            if(this.compareAndSet(0L, 0x8000000000000000L)) {
                return;
            }
            this.c = null;
        }
    }

    protected void c(Object object0) {
    }

    @Override  // org.reactivestreams.e
    public void cancel() {
        this.b.cancel();
    }

    @Override  // io.reactivex.q
    public void g(e e0) {
        if(j.k(this.b, e0)) {
            this.b = e0;
            this.a.g(this);
        }
    }

    @Override  // org.reactivestreams.e
    public final void request(long v) {
        if(j.j(v)) {
            while(true) {
                long v1 = this.get();
                if((v1 & 0x8000000000000000L) != 0L) {
                    if(!this.compareAndSet(0x8000000000000000L, 0x8000000000000001L)) {
                        break;
                    }
                    this.a.onNext(this.c);
                    this.a.onComplete();
                    return;
                }
                if(this.compareAndSet(v1, io.reactivex.internal.util.d.c(v1, v))) {
                    this.b.request(v);
                    return;
                }
            }
        }
    }
}

