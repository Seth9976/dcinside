package io.reactivex.internal.operators.completable;

import f3.l;
import f3.o;
import io.reactivex.c;
import io.reactivex.exceptions.b;
import io.reactivex.f;
import io.reactivex.i;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.q;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.e;

public final class d extends c {
    static final class a extends AtomicInteger implements io.reactivex.disposables.c, q {
        static final class io.reactivex.internal.operators.completable.d.a.a extends AtomicReference implements f {
            final a a;
            private static final long b = 0xB44CACFA3F64B7F1L;

            io.reactivex.internal.operators.completable.d.a.a(a d$a0) {
                this.a = d$a0;
            }

            @Override  // io.reactivex.f
            public void b(io.reactivex.disposables.c c0) {
                io.reactivex.internal.disposables.d.d(this, c0);
            }

            @Override  // io.reactivex.f
            public void onComplete() {
                this.a.c();
            }

            @Override  // io.reactivex.f
            public void onError(Throwable throwable0) {
                this.a.d(throwable0);
            }
        }

        final f a;
        final int b;
        final int c;
        final io.reactivex.internal.operators.completable.d.a.a d;
        final AtomicBoolean e;
        int f;
        int g;
        o h;
        e i;
        volatile boolean j;
        volatile boolean k;
        private static final long l = 0x7D58C452A57FAA4CL;

        a(f f0, int v) {
            this.a = f0;
            this.b = v;
            this.d = new io.reactivex.internal.operators.completable.d.a.a(this);
            this.e = new AtomicBoolean();
            this.c = v - (v >> 2);
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return io.reactivex.internal.disposables.d.c(((io.reactivex.disposables.c)this.d.get()));
        }

        void b() {
            i i0;
            if(this.getAndIncrement() != 0) {
                return;
            }
            do {
                if(this.a()) {
                    return;
                }
                if(!this.k) {
                    try {
                        boolean z = this.j;
                        i0 = (i)this.h.poll();
                    }
                    catch(Throwable throwable0) {
                        b.b(throwable0);
                        this.d(throwable0);
                        return;
                    }
                    if(z && i0 == null) {
                        if(this.e.compareAndSet(false, true)) {
                            this.a.onComplete();
                        }
                        return;
                    }
                    if(i0 != null) {
                        this.k = true;
                        i0.e(this.d);
                        this.f();
                    }
                }
            }
            while(this.decrementAndGet() != 0);
        }

        void c() {
            this.k = false;
            this.b();
        }

        void d(Throwable throwable0) {
            if(this.e.compareAndSet(false, true)) {
                this.i.cancel();
                this.a.onError(throwable0);
                return;
            }
            io.reactivex.plugins.a.Y(throwable0);
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            this.i.cancel();
            io.reactivex.internal.disposables.d.b(this.d);
        }

        public void e(i i0) {
            if(this.f == 0 && !this.h.offer(i0)) {
                this.onError(new io.reactivex.exceptions.c());
                return;
            }
            this.b();
        }

        void f() {
            if(this.f != 1) {
                int v = this.g + 1;
                if(v == this.c) {
                    this.g = 0;
                    this.i.request(((long)v));
                    return;
                }
                this.g = v;
            }
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            if(j.k(this.i, e0)) {
                this.i = e0;
                long v = this.b == 0x7FFFFFFF ? 0x7FFFFFFFFFFFFFFFL : ((long)this.b);
                if(e0 instanceof l) {
                    int v1 = ((l)e0).i(3);
                    if(v1 == 1) {
                        this.f = 1;
                        this.h = (l)e0;
                        this.j = true;
                        this.a.b(this);
                        this.b();
                        return;
                    }
                    if(v1 == 2) {
                        this.f = 2;
                        this.h = (l)e0;
                        this.a.b(this);
                        e0.request(v);
                        return;
                    }
                }
                this.h = this.b == 0x7FFFFFFF ? new io.reactivex.internal.queue.c(0x80) : new io.reactivex.internal.queue.b(this.b);
                this.a.b(this);
                e0.request(v);
            }
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            this.j = true;
            this.b();
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            if(this.e.compareAndSet(false, true)) {
                io.reactivex.internal.disposables.d.b(this.d);
                this.a.onError(throwable0);
                return;
            }
            io.reactivex.plugins.a.Y(throwable0);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            this.e(((i)object0));
        }
    }

    final org.reactivestreams.c a;
    final int b;

    public d(org.reactivestreams.c c0, int v) {
        this.a = c0;
        this.b = v;
    }

    @Override  // io.reactivex.c
    public void J0(f f0) {
        a d$a0 = new a(f0, this.b);
        this.a.e(d$a0);
    }
}

