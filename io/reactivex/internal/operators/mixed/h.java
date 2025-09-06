package io.reactivex.internal.operators.mixed;

import e3.o;
import io.reactivex.N;
import io.reactivex.Q;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.functions.b;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.l;
import io.reactivex.q;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.e;

public final class h extends l {
    static final class a extends AtomicInteger implements q, e {
        static final class io.reactivex.internal.operators.mixed.h.a.a extends AtomicReference implements N {
            final a a;
            volatile Object b;
            private static final long c = 0x6F9E30E36197FFC7L;

            io.reactivex.internal.operators.mixed.h.a.a(a h$a0) {
                this.a = h$a0;
            }

            void a() {
                d.b(this);
            }

            @Override  // io.reactivex.N
            public void b(c c0) {
                d.g(this, c0);
            }

            @Override  // io.reactivex.N
            public void onError(Throwable throwable0) {
                this.a.c(this, throwable0);
            }

            @Override  // io.reactivex.N
            public void onSuccess(Object object0) {
                this.b = object0;
                this.a.b();
            }
        }

        final org.reactivestreams.d a;
        final o b;
        final boolean c;
        final io.reactivex.internal.util.c d;
        final AtomicLong e;
        final AtomicReference f;
        e g;
        volatile boolean h;
        volatile boolean i;
        long j;
        private static final long k = 0xB50790B94F8997BEL;
        static final io.reactivex.internal.operators.mixed.h.a.a l;

        static {
            a.l = new io.reactivex.internal.operators.mixed.h.a.a(null);
        }

        a(org.reactivestreams.d d0, o o0, boolean z) {
            this.a = d0;
            this.b = o0;
            this.c = z;
            this.d = new io.reactivex.internal.util.c();
            this.e = new AtomicLong();
            this.f = new AtomicReference();
        }

        void a() {
            io.reactivex.internal.operators.mixed.h.a.a h$a$a0 = (io.reactivex.internal.operators.mixed.h.a.a)this.f.getAndSet(a.l);
            if(h$a$a0 != null && h$a$a0 != a.l) {
                h$a$a0.a();
            }
        }

        void b() {
            if(this.getAndIncrement() != 0) {
                return;
            }
            org.reactivestreams.d d0 = this.a;
            io.reactivex.internal.util.c c0 = this.d;
            AtomicReference atomicReference0 = this.f;
            AtomicLong atomicLong0 = this.e;
            long v = this.j;
            int v1 = 1;
            while(true) {
                if(this.i) {
                    return;
                }
                if(c0.get() != null && !this.c) {
                    d0.onError(c0.c());
                    return;
                }
                boolean z = this.h;
                io.reactivex.internal.operators.mixed.h.a.a h$a$a0 = (io.reactivex.internal.operators.mixed.h.a.a)atomicReference0.get();
                if(z && h$a$a0 == null) {
                    Throwable throwable0 = c0.c();
                    if(throwable0 != null) {
                        d0.onError(throwable0);
                        return;
                    }
                    d0.onComplete();
                    return;
                }
                if(h$a$a0 != null && h$a$a0.b != null && v != atomicLong0.get()) {
                    androidx.compose.animation.core.d.a(atomicReference0, h$a$a0, null);
                    d0.onNext(h$a$a0.b);
                    ++v;
                }
                else {
                    this.j = v;
                    v1 = this.addAndGet(-v1);
                    if(v1 == 0) {
                        break;
                    }
                }
            }
        }

        void c(io.reactivex.internal.operators.mixed.h.a.a h$a$a0, Throwable throwable0) {
            if(androidx.compose.animation.core.d.a(this.f, h$a$a0, null) && this.d.a(throwable0)) {
                if(!this.c) {
                    this.g.cancel();
                    this.a();
                }
                this.b();
                return;
            }
            io.reactivex.plugins.a.Y(throwable0);
        }

        @Override  // org.reactivestreams.e
        public void cancel() {
            this.i = true;
            this.g.cancel();
            this.a();
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            if(j.k(this.g, e0)) {
                this.g = e0;
                this.a.g(this);
                e0.request(0x7FFFFFFFFFFFFFFFL);
            }
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            this.h = true;
            this.b();
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            if(this.d.a(throwable0)) {
                if(!this.c) {
                    this.a();
                }
                this.h = true;
                this.b();
                return;
            }
            io.reactivex.plugins.a.Y(throwable0);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            Q q0;
            io.reactivex.internal.operators.mixed.h.a.a h$a$a0 = (io.reactivex.internal.operators.mixed.h.a.a)this.f.get();
            if(h$a$a0 != null) {
                h$a$a0.a();
            }
            try {
                q0 = (Q)b.g(this.b.apply(object0), "The mapper returned a null SingleSource");
            }
            catch(Throwable throwable0) {
                io.reactivex.exceptions.b.b(throwable0);
                this.g.cancel();
                this.f.getAndSet(a.l);
                this.onError(throwable0);
                return;
            }
            io.reactivex.internal.operators.mixed.h.a.a h$a$a1 = new io.reactivex.internal.operators.mixed.h.a.a(this);
            io.reactivex.internal.operators.mixed.h.a.a h$a$a2;
            while((h$a$a2 = (io.reactivex.internal.operators.mixed.h.a.a)this.f.get()) != a.l) {
                if(androidx.compose.animation.core.d.a(this.f, h$a$a2, h$a$a1)) {
                    q0.e(h$a$a1);
                    return;
                }
            }
        }

        @Override  // org.reactivestreams.e
        public void request(long v) {
            io.reactivex.internal.util.d.a(this.e, v);
            this.b();
        }
    }

    final l b;
    final o c;
    final boolean d;

    public h(l l0, o o0, boolean z) {
        this.b = l0;
        this.c = o0;
        this.d = z;
    }

    @Override  // io.reactivex.l
    protected void m6(org.reactivestreams.d d0) {
        a h$a0 = new a(d0, this.c, this.d);
        this.b.l6(h$a0);
    }
}

