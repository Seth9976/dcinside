package io.reactivex.internal.operators.flowable;

import e3.o;
import io.reactivex.exceptions.b;
import io.reactivex.internal.subscribers.k;
import io.reactivex.internal.subscribers.l;
import io.reactivex.internal.util.c;
import io.reactivex.internal.util.j;
import io.reactivex.q;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.d;
import org.reactivestreams.e;

public final class x extends a {
    static final class io.reactivex.internal.operators.flowable.x.a extends AtomicInteger implements l, q, e {
        final d a;
        final o b;
        final int c;
        final int d;
        final j e;
        final c f;
        final AtomicLong g;
        final io.reactivex.internal.queue.c h;
        e i;
        volatile boolean j;
        volatile boolean k;
        volatile k l;
        private static final long m = 0xC4F2239CA563EAB1L;

        io.reactivex.internal.operators.flowable.x.a(d d0, o o0, int v, int v1, j j0) {
            this.a = d0;
            this.b = o0;
            this.c = v;
            this.d = v1;
            this.e = j0;
            this.h = new io.reactivex.internal.queue.c(Math.min(v1, v));
            this.f = new c();
            this.g = new AtomicLong();
        }

        @Override  // io.reactivex.internal.subscribers.l
        public void a(k k0) {
            k0.d();
            this.d();
        }

        @Override  // io.reactivex.internal.subscribers.l
        public void b(k k0, Throwable throwable0) {
            if(this.f.a(throwable0)) {
                k0.d();
                if(this.e != j.c) {
                    this.i.cancel();
                }
                this.d();
                return;
            }
            io.reactivex.plugins.a.Y(throwable0);
        }

        @Override  // io.reactivex.internal.subscribers.l
        public void c(k k0, Object object0) {
            if(k0.b().offer(object0)) {
                this.d();
                return;
            }
            k0.cancel();
            this.b(k0, new io.reactivex.exceptions.c());
        }

        @Override  // org.reactivestreams.e
        public void cancel() {
            if(this.j) {
                return;
            }
            this.j = true;
            this.i.cancel();
            this.f();
        }

        @Override  // io.reactivex.internal.subscribers.l
        public void d() {
            boolean z1;
            Object object0;
            long v2;
            k k1;
            if(this.getAndIncrement() != 0) {
                return;
            }
            k k0 = this.l;
            d d0 = this.a;
            j j0 = this.e;
            int v = 1;
            while(true) {
                long v1 = this.g.get();
                if(k0 == null) {
                    if(j0 != j.c && ((Throwable)this.f.get()) != null) {
                        this.e();
                        d0.onError(this.f.c());
                        return;
                    }
                    boolean z = this.k;
                    k1 = (k)this.h.poll();
                    if(z && k1 == null) {
                        Throwable throwable0 = this.f.c();
                        if(throwable0 != null) {
                            d0.onError(throwable0);
                            return;
                        }
                        d0.onComplete();
                        return;
                    }
                    if(k1 != null) {
                        this.l = k1;
                    }
                }
                else {
                    k1 = k0;
                }
                if(k1 == null) {
                    z1 = false;
                    v2 = 0L;
                }
                else {
                    f3.o o0 = k1.b();
                    if(o0 == null) {
                        z1 = false;
                        v2 = 0L;
                    }
                    else {
                        v2 = 0L;
                        while(true) {
                            int v3 = Long.compare(v2, v1);
                            if(v3 != 0) {
                                if(this.j) {
                                    this.e();
                                    return;
                                }
                                if(j0 == j.a && ((Throwable)this.f.get()) != null) {
                                    this.l = null;
                                    k1.cancel();
                                    this.e();
                                    d0.onError(this.f.c());
                                    return;
                                }
                                try {
                                    object0 = o0.poll();
                                }
                                catch(Throwable throwable1) {
                                    b.b(throwable1);
                                    this.l = null;
                                    k1.cancel();
                                    this.e();
                                    d0.onError(throwable1);
                                    return;
                                }
                                if(k1.a() && object0 == null) {
                                    this.l = null;
                                    this.i.request(1L);
                                    k1 = null;
                                    z1 = true;
                                    break;
                                }
                                else if(object0 != null) {
                                    d0.onNext(object0);
                                    ++v2;
                                    k1.c();
                                    continue;
                                }
                            }
                            z1 = false;
                            break;
                        }
                        if(v3 == 0) {
                            if(this.j) {
                                this.e();
                                return;
                            }
                            if(j0 == j.a && ((Throwable)this.f.get()) != null) {
                                this.l = null;
                                k1.cancel();
                                this.e();
                                d0.onError(this.f.c());
                                return;
                            }
                            if(k1.a() && o0.isEmpty()) {
                                this.l = null;
                                this.i.request(1L);
                                k1 = null;
                                z1 = true;
                            }
                        }
                    }
                }
                if(v2 != 0L && v1 != 0x7FFFFFFFFFFFFFFFL) {
                    this.g.addAndGet(-v2);
                }
                if(!z1) {
                    v = this.addAndGet(-v);
                    if(v == 0) {
                        return;
                    }
                }
                k0 = k1;
            }
        }

        void e() {
            k k0 = this.l;
            this.l = null;
            if(k0 != null) {
                k0.cancel();
            }
            k k1;
            while((k1 = (k)this.h.poll()) != null) {
                k1.cancel();
            }
        }

        void f() {
            if(this.getAndIncrement() == 0) {
                while(true) {
                    this.e();
                    if(this.decrementAndGet() == 0) {
                        break;
                    }
                }
            }
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            if(io.reactivex.internal.subscriptions.j.k(this.i, e0)) {
                this.i = e0;
                this.a.g(this);
                e0.request((this.c == 0x7FFFFFFF ? 0x7FFFFFFFFFFFFFFFL : ((long)this.c)));
            }
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            this.k = true;
            this.d();
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            if(this.f.a(throwable0)) {
                this.k = true;
                this.d();
                return;
            }
            io.reactivex.plugins.a.Y(throwable0);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            org.reactivestreams.c c0;
            try {
                c0 = (org.reactivestreams.c)io.reactivex.internal.functions.b.g(this.b.apply(object0), "The mapper returned a null Publisher");
            }
            catch(Throwable throwable0) {
                b.b(throwable0);
                this.i.cancel();
                this.onError(throwable0);
                return;
            }
            k k0 = new k(this, this.d);
            if(this.j) {
                return;
            }
            this.h.offer(k0);
            c0.e(k0);
            if(this.j) {
                k0.cancel();
                this.f();
            }
        }

        @Override  // org.reactivestreams.e
        public void request(long v) {
            if(io.reactivex.internal.subscriptions.j.j(v)) {
                io.reactivex.internal.util.d.a(this.g, v);
                this.d();
            }
        }
    }

    final o c;
    final int d;
    final int e;
    final j f;

    public x(io.reactivex.l l0, o o0, int v, int v1, j j0) {
        super(l0);
        this.c = o0;
        this.d = v;
        this.e = v1;
        this.f = j0;
    }

    @Override  // io.reactivex.l
    protected void m6(d d0) {
        io.reactivex.internal.operators.flowable.x.a x$a0 = new io.reactivex.internal.operators.flowable.x.a(d0, this.c, this.d, this.e, this.f);
        this.b.l6(x$a0);
    }
}

