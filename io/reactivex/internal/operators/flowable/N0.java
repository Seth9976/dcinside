package io.reactivex.internal.operators.flowable;

import e3.c;
import e3.g;
import io.reactivex.exceptions.b;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.k;
import io.reactivex.l;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.d;
import org.reactivestreams.e;

public final class n0 extends l {
    static final class a extends AtomicLong implements k, e {
        final d a;
        final c b;
        final g c;
        Object d;
        volatile boolean e;
        boolean f;
        boolean g;
        private static final long h = 0x68FFC50B57428478L;

        a(d d0, c c0, g g0, Object object0) {
            this.a = d0;
            this.b = c0;
            this.c = g0;
            this.d = object0;
        }

        @Override  // org.reactivestreams.e
        public void cancel() {
            if(!this.e) {
                this.e = true;
                if(io.reactivex.internal.util.d.a(this, 1L) == 0L) {
                    Object object0 = this.d;
                    this.d = null;
                    this.f(object0);
                }
            }
        }

        private void f(Object object0) {
            try {
                this.c.accept(object0);
            }
            catch(Throwable throwable0) {
                b.b(throwable0);
                io.reactivex.plugins.a.Y(throwable0);
            }
        }

        @Override  // io.reactivex.k
        public void onComplete() {
            if(!this.f) {
                this.f = true;
                this.a.onComplete();
            }
        }

        @Override  // io.reactivex.k
        public void onError(Throwable throwable0) {
            if(this.f) {
                io.reactivex.plugins.a.Y(throwable0);
                return;
            }
            if(throwable0 == null) {
                throwable0 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            this.f = true;
            this.a.onError(throwable0);
        }

        @Override  // io.reactivex.k
        public void onNext(Object object0) {
            if(!this.f) {
                if(this.g) {
                    this.onError(new IllegalStateException("onNext already called in this generate turn"));
                    return;
                }
                if(object0 == null) {
                    this.onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                    return;
                }
                this.g = true;
                this.a.onNext(object0);
            }
        }

        @Override  // org.reactivestreams.e
        public void request(long v) {
            if(!j.j(v)) {
                return;
            }
            if(io.reactivex.internal.util.d.a(this, v) != 0L) {
                return;
            }
            Object object0 = this.d;
            c c0 = this.b;
            do {
                long v1 = 0L;
                while(true) {
                    if(v1 == v) {
                        long v2 = this.get();
                        if(v1 == v2) {
                            break;
                        }
                        v = v2;
                    }
                    else {
                        if(this.e) {
                            this.d = null;
                            this.f(object0);
                            return;
                        }
                        try {
                            this.g = false;
                            object0 = c0.apply(object0, this);
                        }
                        catch(Throwable throwable0) {
                            b.b(throwable0);
                            this.e = true;
                            this.d = null;
                            this.onError(throwable0);
                            this.f(object0);
                            return;
                        }
                        if(this.f) {
                            this.e = true;
                            this.d = null;
                            this.f(object0);
                            return;
                        }
                        ++v1;
                    }
                }
                this.d = object0;
                v = this.addAndGet(-v1);
            }
            while(v != 0L);
        }
    }

    final Callable b;
    final c c;
    final g d;

    public n0(Callable callable0, c c0, g g0) {
        this.b = callable0;
        this.c = c0;
        this.d = g0;
    }

    @Override  // io.reactivex.l
    public void m6(d d0) {
        Object object0;
        try {
            object0 = this.b.call();
        }
        catch(Throwable throwable0) {
            b.b(throwable0);
            io.reactivex.internal.subscriptions.g.b(throwable0, d0);
            return;
        }
        d0.g(new a(d0, this.c, this.d, object0));
    }
}

