package io.reactivex.internal.operators.flowable;

import e3.o;
import io.reactivex.N;
import io.reactivex.Q;
import io.reactivex.disposables.b;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.l;
import io.reactivex.q;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.e;

public final class f0 extends a {
    static final class io.reactivex.internal.operators.flowable.f0.a extends AtomicInteger implements q, e {
        final class io.reactivex.internal.operators.flowable.f0.a.a extends AtomicReference implements N, c {
            final io.reactivex.internal.operators.flowable.f0.a a;
            private static final long b = 0xF90689EF97A3C632L;

            @Override  // io.reactivex.disposables.c
            public boolean a() {
                return d.c(((c)this.get()));
            }

            @Override  // io.reactivex.N
            public void b(c c0) {
                d.g(this, c0);
            }

            @Override  // io.reactivex.disposables.c
            public void dispose() {
                d.b(this);
            }

            @Override  // io.reactivex.N
            public void onError(Throwable throwable0) {
                io.reactivex.internal.operators.flowable.f0.a.this.e(this, throwable0);
            }

            @Override  // io.reactivex.N
            public void onSuccess(Object object0) {
                io.reactivex.internal.operators.flowable.f0.a.this.f(this, object0);
            }
        }

        final org.reactivestreams.d a;
        final boolean b;
        final int c;
        final AtomicLong d;
        final b e;
        final AtomicInteger f;
        final io.reactivex.internal.util.c g;
        final o h;
        final AtomicReference i;
        e j;
        volatile boolean k;
        private static final long l = 0x775A28D5B42D01B7L;

        io.reactivex.internal.operators.flowable.f0.a(org.reactivestreams.d d0, o o0, boolean z, int v) {
            this.a = d0;
            this.h = o0;
            this.b = z;
            this.c = v;
            this.d = new AtomicLong();
            this.e = new b();
            this.g = new io.reactivex.internal.util.c();
            this.f = new AtomicInteger(1);
            this.i = new AtomicReference();
        }

        void a() {
            io.reactivex.internal.queue.c c0 = (io.reactivex.internal.queue.c)this.i.get();
            if(c0 != null) {
                c0.clear();
            }
        }

        void b() {
            if(this.getAndIncrement() == 0) {
                this.c();
            }
        }

        void c() {
            boolean z;
            org.reactivestreams.d d0 = this.a;
            AtomicInteger atomicInteger0 = this.f;
            AtomicReference atomicReference0 = this.i;
            int v = 1;
            do {
                long v1 = this.d.get();
                long v2;
                for(v2 = 0L; true; ++v2) {
                    z = false;
                    int v3 = Long.compare(v2, v1);
                    if(v3 == 0) {
                        break;
                    }
                    if(this.k) {
                        this.a();
                        return;
                    }
                    if(!this.b && ((Throwable)this.g.get()) != null) {
                        Throwable throwable0 = this.g.c();
                        this.a();
                        d0.onError(throwable0);
                        return;
                    }
                    boolean z1 = atomicInteger0.get() == 0;
                    io.reactivex.internal.queue.c c0 = (io.reactivex.internal.queue.c)atomicReference0.get();
                    Object object0 = c0 == null ? null : c0.poll();
                    if(z1 && object0 == null) {
                        Throwable throwable1 = this.g.c();
                        if(throwable1 != null) {
                            d0.onError(throwable1);
                            return;
                        }
                        d0.onComplete();
                        return;
                    }
                    if(object0 == null) {
                        break;
                    }
                    d0.onNext(object0);
                }
                if(v3 == 0) {
                    if(this.k) {
                        this.a();
                        return;
                    }
                    if(!this.b && ((Throwable)this.g.get()) != null) {
                        Throwable throwable2 = this.g.c();
                        this.a();
                        d0.onError(throwable2);
                        return;
                    }
                    boolean z2 = atomicInteger0.get() == 0;
                    io.reactivex.internal.queue.c c1 = (io.reactivex.internal.queue.c)atomicReference0.get();
                    if(c1 == null || c1.isEmpty()) {
                        z = true;
                    }
                    if(z2 && z) {
                        Throwable throwable3 = this.g.c();
                        if(throwable3 != null) {
                            d0.onError(throwable3);
                            return;
                        }
                        d0.onComplete();
                        return;
                    }
                }
                if(v2 != 0L) {
                    io.reactivex.internal.util.d.e(this.d, v2);
                    if(this.c != 0x7FFFFFFF) {
                        this.j.request(v2);
                    }
                }
                v = this.addAndGet(-v);
            }
            while(v != 0);
        }

        @Override  // org.reactivestreams.e
        public void cancel() {
            this.k = true;
            this.j.cancel();
            this.e.dispose();
        }

        io.reactivex.internal.queue.c d() {
            io.reactivex.internal.queue.c c1;
            do {
                io.reactivex.internal.queue.c c0 = (io.reactivex.internal.queue.c)this.i.get();
                if(c0 != null) {
                    return c0;
                }
                c1 = new io.reactivex.internal.queue.c(0x80);
            }
            while(!androidx.compose.animation.core.d.a(this.i, null, c1));
            return c1;
        }

        void e(io.reactivex.internal.operators.flowable.f0.a.a f0$a$a0, Throwable throwable0) {
            this.e.c(f0$a$a0);
            if(this.g.a(throwable0)) {
                if(!this.b) {
                    this.j.cancel();
                    this.e.dispose();
                }
                else if(this.c != 0x7FFFFFFF) {
                    this.j.request(1L);
                }
                this.f.decrementAndGet();
                this.b();
                return;
            }
            io.reactivex.plugins.a.Y(throwable0);
        }

        void f(io.reactivex.internal.operators.flowable.f0.a.a f0$a$a0, Object object0) {
            boolean z = false;
            this.e.c(f0$a$a0);
            if(this.get() != 0 || !this.compareAndSet(0, 1)) {
                io.reactivex.internal.queue.c c2 = this.d();
                synchronized(c2) {
                    c2.offer(object0);
                }
                this.f.decrementAndGet();
                if(this.getAndIncrement() != 0) {
                    return;
                }
            }
            else {
                if(this.f.decrementAndGet() == 0) {
                    z = true;
                }
                if(this.d.get() == 0L) {
                    io.reactivex.internal.queue.c c1 = this.d();
                    synchronized(c1) {
                        c1.offer(object0);
                    }
                }
                else {
                    this.a.onNext(object0);
                    io.reactivex.internal.queue.c c0 = (io.reactivex.internal.queue.c)this.i.get();
                    if(z && (c0 == null || c0.isEmpty())) {
                        Throwable throwable0 = this.g.c();
                        if(throwable0 != null) {
                            this.a.onError(throwable0);
                            return;
                        }
                        this.a.onComplete();
                        return;
                    }
                    io.reactivex.internal.util.d.e(this.d, 1L);
                    if(this.c != 0x7FFFFFFF) {
                        this.j.request(1L);
                    }
                }
                if(this.decrementAndGet() == 0) {
                    return;
                }
            }
            this.c();
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            if(j.k(this.j, e0)) {
                this.j = e0;
                this.a.g(this);
                int v = this.c;
                if(v == 0x7FFFFFFF) {
                    e0.request(0x7FFFFFFFFFFFFFFFL);
                    return;
                }
                e0.request(((long)v));
            }
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            this.f.decrementAndGet();
            this.b();
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            this.f.decrementAndGet();
            if(this.g.a(throwable0)) {
                if(!this.b) {
                    this.e.dispose();
                }
                this.b();
                return;
            }
            io.reactivex.plugins.a.Y(throwable0);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            Q q0;
            try {
                q0 = (Q)io.reactivex.internal.functions.b.g(this.h.apply(object0), "The mapper returned a null SingleSource");
            }
            catch(Throwable throwable0) {
                io.reactivex.exceptions.b.b(throwable0);
                this.j.cancel();
                this.onError(throwable0);
                return;
            }
            this.f.getAndIncrement();
            io.reactivex.internal.operators.flowable.f0.a.a f0$a$a0 = new io.reactivex.internal.operators.flowable.f0.a.a(this);
            if(!this.k && this.e.d(f0$a$a0)) {
                q0.e(f0$a$a0);
            }
        }

        @Override  // org.reactivestreams.e
        public void request(long v) {
            if(j.j(v)) {
                io.reactivex.internal.util.d.a(this.d, v);
                this.b();
            }
        }
    }

    final o c;
    final boolean d;
    final int e;

    public f0(l l0, o o0, boolean z, int v) {
        super(l0);
        this.c = o0;
        this.d = z;
        this.e = v;
    }

    @Override  // io.reactivex.l
    protected void m6(org.reactivestreams.d d0) {
        io.reactivex.internal.operators.flowable.f0.a f0$a0 = new io.reactivex.internal.operators.flowable.f0.a(d0, this.c, this.d, this.e);
        this.b.l6(f0$a0);
    }
}

