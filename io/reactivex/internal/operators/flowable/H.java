package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.g;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.l;
import io.reactivex.q;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.c;
import org.reactivestreams.d;
import org.reactivestreams.e;

public final class h extends l {
    static final class a implements e {
        final d a;
        final b[] b;
        final AtomicInteger c;

        a(d d0, int v) {
            this.c = new AtomicInteger();
            this.a = d0;
            this.b = new b[v];
        }

        public void a(c[] arr_c) {
            b[] arr_h$b = this.b;
            for(int v1 = 0; v1 < arr_h$b.length; ++v1) {
                arr_h$b[v1] = new b(this, v1 + 1, this.a);
            }
            this.c.lazySet(0);
            this.a.g(this);
            for(int v = 0; v < arr_h$b.length && this.c.get() == 0; ++v) {
                arr_c[v].e(arr_h$b[v]);
            }
        }

        public boolean b(int v) {
            if(this.c.get() == 0 && this.c.compareAndSet(0, v)) {
                b[] arr_h$b = this.b;
                for(int v1 = 0; v1 < arr_h$b.length; ++v1) {
                    if(v1 + 1 != v) {
                        arr_h$b[v1].cancel();
                    }
                }
                return true;
            }
            return false;
        }

        @Override  // org.reactivestreams.e
        public void cancel() {
            if(this.c.get() != -1) {
                this.c.lazySet(-1);
                b[] arr_h$b = this.b;
                for(int v = 0; v < arr_h$b.length; ++v) {
                    arr_h$b[v].cancel();
                }
            }
        }

        @Override  // org.reactivestreams.e
        public void request(long v) {
            if(j.j(v)) {
                int v1 = this.c.get();
                if(v1 > 0) {
                    this.b[v1 - 1].request(v);
                    return;
                }
                if(v1 == 0) {
                    b[] arr_h$b = this.b;
                    for(int v2 = 0; v2 < arr_h$b.length; ++v2) {
                        arr_h$b[v2].request(v);
                    }
                }
            }
        }
    }

    static final class b extends AtomicReference implements q, e {
        final a a;
        final int b;
        final d c;
        boolean d;
        final AtomicLong e;
        private static final long f = 0xEF8A929D55EBD234L;

        b(a h$a0, int v, d d0) {
            this.e = new AtomicLong();
            this.a = h$a0;
            this.b = v;
            this.c = d0;
        }

        @Override  // org.reactivestreams.e
        public void cancel() {
            j.a(this);
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            j.c(this, this.e, e0);
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            if(this.d) {
                this.c.onComplete();
                return;
            }
            if(this.a.b(this.b)) {
                this.d = true;
                this.c.onComplete();
                return;
            }
            ((e)this.get()).cancel();
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            if(this.d) {
                this.c.onError(throwable0);
                return;
            }
            if(this.a.b(this.b)) {
                this.d = true;
                this.c.onError(throwable0);
                return;
            }
            ((e)this.get()).cancel();
            io.reactivex.plugins.a.Y(throwable0);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            if(this.d) {
                this.c.onNext(object0);
                return;
            }
            if(this.a.b(this.b)) {
                this.d = true;
                this.c.onNext(object0);
                return;
            }
            ((e)this.get()).cancel();
        }

        @Override  // org.reactivestreams.e
        public void request(long v) {
            j.b(this, this.e, v);
        }
    }

    final c[] b;
    final Iterable c;

    public h(c[] arr_c, Iterable iterable0) {
        this.b = arr_c;
        this.c = iterable0;
    }

    @Override  // io.reactivex.l
    public void m6(d d0) {
        int v;
        c[] arr_c = this.b;
        if(arr_c == null) {
            try {
                arr_c = new c[8];
                v = 0;
                Iterator iterator0 = this.c.iterator();
                while(true) {
                    if(!iterator0.hasNext()) {
                        goto label_22;
                    }
                    Object object0 = iterator0.next();
                    if(((c)object0) == null) {
                        g.b(new NullPointerException("One of the sources is null"), d0);
                        return;
                    }
                    if(v == arr_c.length) {
                        c[] arr_c1 = new c[(v >> 2) + v];
                        System.arraycopy(arr_c, 0, arr_c1, 0, v);
                        arr_c = arr_c1;
                    }
                    arr_c[v] = (c)object0;
                    ++v;
                }
            }
            catch(Throwable throwable0) {
            }
            io.reactivex.exceptions.b.b(throwable0);
            g.b(throwable0, d0);
            return;
        }
        else {
            v = arr_c.length;
        }
    label_22:
        if(v == 0) {
            g.a(d0);
            return;
        }
        if(v == 1) {
            arr_c[0].e(d0);
            return;
        }
        new a(d0, v).a(arr_c);
    }
}

