package io.reactivex.internal.operators.flowable;

import e3.g;
import io.reactivex.J;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.disposables.h;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.l;
import io.reactivex.q;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.e;

public final class c1 extends l {
    static final class a extends AtomicReference implements g, Runnable {
        final c1 a;
        c b;
        long c;
        boolean d;
        boolean e;
        private static final long f = 0xC0D3B02923EFE9DFL;

        a(c1 c10) {
            this.a = c10;
        }

        public void a(c c0) throws Exception {
            d.d(this, c0);
            synchronized(this.a) {
                if(this.e) {
                    ((io.reactivex.internal.disposables.g)this.a.b).f(c0);
                }
            }
        }

        @Override  // e3.g
        public void accept(Object object0) throws Exception {
            this.a(((c)object0));
        }

        @Override
        public void run() {
            this.a.S8(this);
        }
    }

    static final class b extends AtomicBoolean implements q, e {
        final org.reactivestreams.d a;
        final c1 b;
        final a c;
        e d;
        private static final long e = 0x9908220FAAB56A59L;

        b(org.reactivestreams.d d0, c1 c10, a c1$a0) {
            this.a = d0;
            this.b = c10;
            this.c = c1$a0;
        }

        @Override  // org.reactivestreams.e
        public void cancel() {
            this.d.cancel();
            if(this.compareAndSet(false, true)) {
                this.b.O8(this.c);
            }
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            if(j.k(this.d, e0)) {
                this.d = e0;
                this.a.g(this);
            }
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            if(this.compareAndSet(false, true)) {
                this.b.R8(this.c);
                this.a.onComplete();
            }
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            if(this.compareAndSet(false, true)) {
                this.b.R8(this.c);
                this.a.onError(throwable0);
                return;
            }
            io.reactivex.plugins.a.Y(throwable0);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            this.a.onNext(object0);
        }

        @Override  // org.reactivestreams.e
        public void request(long v) {
            this.d.request(v);
        }
    }

    final io.reactivex.flowables.a b;
    final int c;
    final long d;
    final TimeUnit e;
    final J f;
    a g;

    public c1(io.reactivex.flowables.a a0) {
        this(a0, 1, 0L, TimeUnit.NANOSECONDS, null);
    }

    public c1(io.reactivex.flowables.a a0, int v, long v1, TimeUnit timeUnit0, J j0) {
        this.b = a0;
        this.c = v;
        this.d = v1;
        this.e = timeUnit0;
        this.f = j0;
    }

    void O8(a c1$a0) {
        synchronized(this) {
            if(this.g != null && this.g == c1$a0) {
                long v1 = c1$a0.c - 1L;
                c1$a0.c = v1;
                if(v1 == 0L && c1$a0.d) {
                    if(this.d == 0L) {
                        this.S8(c1$a0);
                        return;
                    }
                    h h0 = new h();
                    c1$a0.b = h0;
                    h0.b(this.f.g(c1$a0, this.d, this.e));
                }
            }
        }
    }

    void P8(a c1$a0) {
        c c0 = c1$a0.b;
        if(c0 != null) {
            c0.dispose();
            c1$a0.b = null;
        }
    }

    void Q8(a c1$a0) {
        io.reactivex.flowables.a a0 = this.b;
        if(a0 instanceof c) {
            ((c)a0).dispose();
            return;
        }
        if(a0 instanceof io.reactivex.internal.disposables.g) {
            ((io.reactivex.internal.disposables.g)a0).f(((c)c1$a0.get()));
        }
    }

    void R8(a c1$a0) {
        synchronized(this) {
            if(this.b instanceof U0) {
                if(this.g != null && this.g == c1$a0) {
                    this.g = null;
                    this.P8(c1$a0);
                }
                long v1 = c1$a0.c - 1L;
                c1$a0.c = v1;
                if(v1 == 0L) {
                    this.Q8(c1$a0);
                }
            }
            else if(this.g != null && this.g == c1$a0) {
                this.P8(c1$a0);
                long v2 = c1$a0.c - 1L;
                c1$a0.c = v2;
                if(v2 == 0L) {
                    this.g = null;
                    this.Q8(c1$a0);
                }
            }
        }
    }

    void S8(a c1$a0) {
        synchronized(this) {
            if(c1$a0.c == 0L && c1$a0 == this.g) {
                this.g = null;
                c c0 = (c)c1$a0.get();
                d.b(c1$a0);
                io.reactivex.flowables.a a0 = this.b;
                if(a0 instanceof c) {
                    ((c)a0).dispose();
                }
                else if(a0 instanceof io.reactivex.internal.disposables.g) {
                    if(c0 == null) {
                        c1$a0.e = true;
                    }
                    else {
                        ((io.reactivex.internal.disposables.g)a0).f(c0);
                    }
                }
            }
        }
    }

    @Override  // io.reactivex.l
    protected void m6(org.reactivestreams.d d0) {
        a c1$a0;
        boolean z;
        synchronized(this) {
            c1$a0 = this.g;
            if(c1$a0 == null) {
                c1$a0 = new a(this);
                this.g = c1$a0;
            }
            long v1 = c1$a0.c;
            if(v1 == 0L) {
                c c0 = c1$a0.b;
                if(c0 != null) {
                    c0.dispose();
                }
            }
            c1$a0.c = v1 + 1L;
            if(c1$a0.d || v1 + 1L != ((long)this.c)) {
                z = false;
            }
            else {
                z = true;
                c1$a0.d = true;
            }
        }
        b c1$b0 = new b(d0, this, c1$a0);
        this.b.l6(c1$b0);
        if(z) {
            this.b.S8(c1$a0);
        }
    }
}

