package io.reactivex.internal.operators.maybe;

import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.h;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.internal.util.q;
import io.reactivex.l;
import io.reactivex.v;
import io.reactivex.y;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.d;

public final class e extends l {
    static final class a extends AtomicInteger implements v, org.reactivestreams.e {
        final d a;
        final AtomicLong b;
        final AtomicReference c;
        final h d;
        final y[] e;
        int f;
        long g;
        private static final long h = 3520831347801429610L;

        a(d d0, y[] arr_y) {
            this.a = d0;
            this.e = arr_y;
            this.b = new AtomicLong();
            this.d = new h();
            this.c = new AtomicReference(q.a);
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
                            int v1 = this.f;
                            y[] arr_y = this.e;
                            if(v1 == arr_y.length) {
                                d0.onComplete();
                                return;
                            }
                            this.f = v1 + 1;
                            arr_y[v1].a(this);
                        }
                    }
                    else {
                        long v = this.g;
                        if(v != this.b.get()) {
                            this.g = v + 1L;
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
        public void b(c c0) {
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
            this.a.onError(throwable0);
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

    public e(y[] arr_y) {
        this.b = arr_y;
    }

    @Override  // io.reactivex.l
    protected void m6(d d0) {
        a e$a0 = new a(d0, this.b);
        d0.g(e$a0);
        e$a0.a();
    }
}

