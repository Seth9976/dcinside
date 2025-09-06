package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.h;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.internal.util.c;
import io.reactivex.internal.util.q;
import io.reactivex.l;
import io.reactivex.v;
import io.reactivex.y;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.d;
import org.reactivestreams.e;

public final class f extends l {
    static final class a extends AtomicInteger implements v, e {
        final d a;
        final AtomicLong b;
        final AtomicReference c;
        final h d;
        final y[] e;
        final c f;
        int g;
        long h;
        private static final long i = 3520831347801429610L;

        a(d d0, y[] arr_y) {
            this.a = d0;
            this.e = arr_y;
            this.b = new AtomicLong();
            this.d = new h();
            this.c = new AtomicReference(q.a);
            this.f = new c();
        }

        void a() {
            if(this.getAndIncrement() != 0) {
                return;
            }
            AtomicReference atomicReference0 = this.c;
            d d0 = this.a;
            h h0 = this.d;
            do {
                if(h0.a()) {
                    atomicReference0.lazySet(null);
                    return;
                }
                Object object0 = atomicReference0.get();
                if(object0 != null) {
                    if(object0 == q.a) {
                        atomicReference0.lazySet(null);
                    label_18:
                        if(!h0.a()) {
                            int v1 = this.g;
                            y[] arr_y = this.e;
                            if(v1 == arr_y.length) {
                                if(((Throwable)this.f.get()) != null) {
                                    d0.onError(this.f.c());
                                    return;
                                }
                                d0.onComplete();
                                return;
                            }
                            this.g = v1 + 1;
                            arr_y[v1].a(this);
                        }
                    }
                    else {
                        long v = this.h;
                        if(v != this.b.get()) {
                            this.h = v + 1L;
                            atomicReference0.lazySet(null);
                            d0.onNext(object0);
                            goto label_18;
                        }
                    }
                }
            }
            while(this.decrementAndGet() != 0);
        }

        @Override  // io.reactivex.v
        public void b(io.reactivex.disposables.c c0) {
            this.d.b(c0);
        }

        @Override  // org.reactivestreams.e
        public void cancel() {
            this.d.dispose();
        }

        @Override  // io.reactivex.v
        public void onComplete() {
            this.c.lazySet(q.a);
            this.a();
        }

        @Override  // io.reactivex.v
        public void onError(Throwable throwable0) {
            this.c.lazySet(q.a);
            if(this.f.a(throwable0)) {
                this.a();
                return;
            }
            io.reactivex.plugins.a.Y(throwable0);
        }

        @Override  // io.reactivex.v
        public void onSuccess(Object object0) {
            this.c.lazySet(object0);
            this.a();
        }

        @Override  // org.reactivestreams.e
        public void request(long v) {
            if(j.j(v)) {
                io.reactivex.internal.util.d.a(this.b, v);
                this.a();
            }
        }
    }

    final y[] b;

    public f(y[] arr_y) {
        this.b = arr_y;
    }

    @Override  // io.reactivex.l
    protected void m6(d d0) {
        a f$a0 = new a(d0, this.b);
        d0.g(f$a0);
        f$a0.a();
    }
}

