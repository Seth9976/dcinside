package io.reactivex.internal.operators.mixed;

import e3.o;
import f3.n;
import io.reactivex.N;
import io.reactivex.Q;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.queue.b;
import io.reactivex.internal.util.j;
import io.reactivex.l;
import io.reactivex.q;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class e extends l {
    static final class a extends AtomicInteger implements q, org.reactivestreams.e {
        static final class io.reactivex.internal.operators.mixed.e.a.a extends AtomicReference implements N {
            final a a;
            private static final long b = 0xD5A700F5220AE8BCL;

            io.reactivex.internal.operators.mixed.e.a.a(a e$a0) {
                this.a = e$a0;
            }

            void a() {
                d.b(this);
            }

            @Override  // io.reactivex.N
            public void b(c c0) {
                d.d(this, c0);
            }

            @Override  // io.reactivex.N
            public void onError(Throwable throwable0) {
                this.a.b(throwable0);
            }

            @Override  // io.reactivex.N
            public void onSuccess(Object object0) {
                this.a.c(object0);
            }
        }

        final org.reactivestreams.d a;
        final o b;
        final int c;
        final AtomicLong d;
        final io.reactivex.internal.util.c e;
        final io.reactivex.internal.operators.mixed.e.a.a f;
        final n g;
        final j h;
        org.reactivestreams.e i;
        volatile boolean j;
        volatile boolean k;
        long l;
        int m;
        Object n;
        volatile int o;
        private static final long p = -9140123220065488293L;
        static final int q = 0;
        static final int r = 1;
        static final int s = 2;

        a(org.reactivestreams.d d0, o o0, int v, j j0) {
            this.a = d0;
            this.b = o0;
            this.c = v;
            this.h = j0;
            this.d = new AtomicLong();
            this.e = new io.reactivex.internal.util.c();
            this.f = new io.reactivex.internal.operators.mixed.e.a.a(this);
            this.g = new b(v);
        }

        void a() {
            Q q0;
            if(this.getAndIncrement() != 0) {
                return;
            }
            org.reactivestreams.d d0 = this.a;
            j j0 = this.h;
            n n0 = this.g;
            io.reactivex.internal.util.c c0 = this.e;
            AtomicLong atomicLong0 = this.d;
            int v = this.c - (this.c >> 1);
            int v1 = 1;
            while(true) {
                if(this.k) {
                    n0.clear();
                    this.n = null;
                }
                else {
                    int v2 = this.o;
                    if(c0.get() != null && (j0 == j.a || j0 == j.b && v2 == 0)) {
                        n0.clear();
                        this.n = null;
                        d0.onError(c0.c());
                        return;
                    }
                    switch(v2) {
                        case 0: {
                            boolean z = this.j;
                            Object object0 = n0.poll();
                            if(z && object0 == null) {
                                Throwable throwable0 = c0.c();
                                if(throwable0 == null) {
                                    d0.onComplete();
                                    return;
                                }
                                d0.onError(throwable0);
                                return;
                            }
                            if(object0 != null) {
                                int v3 = this.m + 1;
                                if(v3 == v) {
                                    this.m = 0;
                                    this.i.request(((long)v));
                                }
                                else {
                                    this.m = v3;
                                }
                                try {
                                    q0 = (Q)io.reactivex.internal.functions.b.g(this.b.apply(object0), "The mapper returned a null SingleSource");
                                }
                                catch(Throwable throwable1) {
                                    io.reactivex.exceptions.b.b(throwable1);
                                    this.i.cancel();
                                    n0.clear();
                                    c0.a(throwable1);
                                    d0.onError(c0.c());
                                    return;
                                }
                                this.o = 1;
                                q0.e(this.f);
                            }
                            break;
                        }
                        case 2: {
                            long v4 = this.l;
                            if(v4 != atomicLong0.get()) {
                                Object object1 = this.n;
                                this.n = null;
                                d0.onNext(object1);
                                this.l = v4 + 1L;
                                this.o = 0;
                                continue;
                            }
                        }
                    }
                }
                v1 = this.addAndGet(-v1);
                if(v1 == 0) {
                    break;
                }
            }
        }

        void b(Throwable throwable0) {
            if(this.e.a(throwable0)) {
                if(this.h != j.c) {
                    this.i.cancel();
                }
                this.o = 0;
                this.a();
                return;
            }
            io.reactivex.plugins.a.Y(throwable0);
        }

        void c(Object object0) {
            this.n = object0;
            this.o = 2;
            this.a();
        }

        @Override  // org.reactivestreams.e
        public void cancel() {
            this.k = true;
            this.i.cancel();
            this.f.a();
            if(this.getAndIncrement() == 0) {
                this.g.clear();
                this.n = null;
            }
        }

        @Override  // io.reactivex.q
        public void g(org.reactivestreams.e e0) {
            if(io.reactivex.internal.subscriptions.j.k(this.i, e0)) {
                this.i = e0;
                this.a.g(this);
                e0.request(((long)this.c));
            }
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            this.j = true;
            this.a();
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            if(this.e.a(throwable0)) {
                if(this.h == j.a) {
                    this.f.a();
                }
                this.j = true;
                this.a();
                return;
            }
            io.reactivex.plugins.a.Y(throwable0);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            if(!this.g.offer(object0)) {
                this.i.cancel();
                this.onError(new io.reactivex.exceptions.c("queue full?!"));
                return;
            }
            this.a();
        }

        @Override  // org.reactivestreams.e
        public void request(long v) {
            io.reactivex.internal.util.d.a(this.d, v);
            this.a();
        }
    }

    final l b;
    final o c;
    final j d;
    final int e;

    public e(l l0, o o0, j j0, int v) {
        this.b = l0;
        this.c = o0;
        this.d = j0;
        this.e = v;
    }

    @Override  // io.reactivex.l
    protected void m6(org.reactivestreams.d d0) {
        a e$a0 = new a(d0, this.c, this.e, this.d);
        this.b.l6(e$a0);
    }
}

