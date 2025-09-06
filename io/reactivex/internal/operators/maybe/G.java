package io.reactivex.internal.operators.maybe;

import io.reactivex.disposables.c;
import io.reactivex.exceptions.b;
import io.reactivex.internal.disposables.h;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.internal.util.q;
import io.reactivex.l;
import io.reactivex.v;
import io.reactivex.y;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.d;
import org.reactivestreams.e;

public final class g extends l {
    static final class a extends AtomicInteger implements v, e {
        final d a;
        final AtomicLong b;
        final AtomicReference c;
        final h d;
        final Iterator e;
        long f;
        private static final long g = 3520831347801429610L;

        a(d d0, Iterator iterator0) {
            this.a = d0;
            this.e = iterator0;
            this.b = new AtomicLong();
            this.d = new h();
            this.c = new AtomicReference(q.a);
        }

        void a() {
            y y0;
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
                            try {
                                if(this.e.hasNext()) {
                                    goto label_25;
                                }
                                else {
                                    goto label_34;
                                }
                                continue;
                            }
                            catch(Throwable throwable0) {
                                b.b(throwable0);
                                d0.onError(throwable0);
                                return;
                            }
                            try {
                            label_25:
                                Object object1 = this.e.next();
                                y0 = (y)io.reactivex.internal.functions.b.g(object1, "The source Iterator returned a null MaybeSource");
                            }
                            catch(Throwable throwable1) {
                                b.b(throwable1);
                                d0.onError(throwable1);
                                return;
                            }
                            y0.a(this);
                            continue;
                        label_34:
                            d0.onComplete();
                        }
                    }
                    else {
                        long v = this.f;
                        if(v != this.b.get()) {
                            this.f = v + 1L;
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

    final Iterable b;

    public g(Iterable iterable0) {
        this.b = iterable0;
    }

    @Override  // io.reactivex.l
    protected void m6(d d0) {
        Iterator iterator0;
        try {
            iterator0 = (Iterator)io.reactivex.internal.functions.b.g(this.b.iterator(), "The sources Iterable returned a null Iterator");
        }
        catch(Throwable throwable0) {
            b.b(throwable0);
            io.reactivex.internal.subscriptions.g.b(throwable0, d0);
            return;
        }
        a g$a0 = new a(d0, iterator0);
        d0.g(g$a0);
        g$a0.a();
    }
}

