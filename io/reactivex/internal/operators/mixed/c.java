package io.reactivex.internal.operators.mixed;

import e3.o;
import f3.n;
import io.reactivex.f;
import io.reactivex.i;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.queue.b;
import io.reactivex.internal.util.j;
import io.reactivex.internal.util.k;
import io.reactivex.l;
import io.reactivex.q;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.e;

public final class c extends io.reactivex.c {
    static final class a extends AtomicInteger implements io.reactivex.disposables.c, q {
        static final class io.reactivex.internal.operators.mixed.c.a.a extends AtomicReference implements f {
            final a a;
            private static final long b = 0x4E3F736D9160236FL;

            io.reactivex.internal.operators.mixed.c.a.a(a c$a0) {
                this.a = c$a0;
            }

            void a() {
                d.b(this);
            }

            @Override  // io.reactivex.f
            public void b(io.reactivex.disposables.c c0) {
                d.d(this, c0);
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
        final o b;
        final j c;
        final io.reactivex.internal.util.c d;
        final io.reactivex.internal.operators.mixed.c.a.a e;
        final int f;
        final n g;
        e h;
        volatile boolean i;
        volatile boolean j;
        volatile boolean k;
        int l;
        private static final long m = 3610901111000061034L;

        a(f f0, o o0, j j0, int v) {
            this.a = f0;
            this.b = o0;
            this.c = j0;
            this.f = v;
            this.d = new io.reactivex.internal.util.c();
            this.e = new io.reactivex.internal.operators.mixed.c.a.a(this);
            this.g = new b(v);
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.k;
        }

        void b() {
            i i0;
            if(this.getAndIncrement() != 0) {
                return;
            }
            do {
                if(this.k) {
                    this.g.clear();
                    return;
                }
                if(!this.i) {
                    if(this.c == j.b && this.d.get() != null) {
                        this.g.clear();
                        Throwable throwable0 = this.d.c();
                        this.a.onError(throwable0);
                        return;
                    }
                    boolean z = this.j;
                    Object object0 = this.g.poll();
                    if(z && object0 == null) {
                        Throwable throwable1 = this.d.c();
                        if(throwable1 != null) {
                            this.a.onError(throwable1);
                            return;
                        }
                        this.a.onComplete();
                        return;
                    }
                    if(object0 != null) {
                        int v = this.f - (this.f >> 1);
                        int v1 = this.l + 1;
                        if(v1 == v) {
                            this.l = 0;
                            this.h.request(((long)v));
                        }
                        else {
                            this.l = v1;
                        }
                        try {
                            i0 = (i)io.reactivex.internal.functions.b.g(this.b.apply(object0), "The mapper returned a null CompletableSource");
                        }
                        catch(Throwable throwable2) {
                            io.reactivex.exceptions.b.b(throwable2);
                            this.g.clear();
                            this.h.cancel();
                            this.d.a(throwable2);
                            Throwable throwable3 = this.d.c();
                            this.a.onError(throwable3);
                            return;
                        }
                        this.i = true;
                        i0.e(this.e);
                    }
                }
            }
            while(this.decrementAndGet() != 0);
        }

        void c() {
            this.i = false;
            this.b();
        }

        void d(Throwable throwable0) {
            if(this.d.a(throwable0)) {
                if(this.c != j.a) {
                    this.i = false;
                    this.b();
                    return;
                }
                this.h.cancel();
                Throwable throwable1 = this.d.c();
                if(throwable1 != k.a) {
                    this.a.onError(throwable1);
                }
                if(this.getAndIncrement() == 0) {
                    this.g.clear();
                }
            }
            else {
                io.reactivex.plugins.a.Y(throwable0);
            }
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            this.k = true;
            this.h.cancel();
            this.e.a();
            if(this.getAndIncrement() == 0) {
                this.g.clear();
            }
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            if(io.reactivex.internal.subscriptions.j.k(this.h, e0)) {
                this.h = e0;
                this.a.b(this);
                e0.request(((long)this.f));
            }
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            this.j = true;
            this.b();
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            if(this.d.a(throwable0)) {
                if(this.c != j.a) {
                    this.j = true;
                    this.b();
                    return;
                }
                this.e.a();
                Throwable throwable1 = this.d.c();
                if(throwable1 != k.a) {
                    this.a.onError(throwable1);
                }
                if(this.getAndIncrement() == 0) {
                    this.g.clear();
                }
            }
            else {
                io.reactivex.plugins.a.Y(throwable0);
            }
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            if(this.g.offer(object0)) {
                this.b();
                return;
            }
            this.h.cancel();
            this.onError(new io.reactivex.exceptions.c("Queue full?!"));
        }
    }

    final l a;
    final o b;
    final j c;
    final int d;

    public c(l l0, o o0, j j0, int v) {
        this.a = l0;
        this.b = o0;
        this.c = j0;
        this.d = v;
    }

    @Override  // io.reactivex.c
    protected void J0(f f0) {
        a c$a0 = new a(f0, this.b, this.c, this.d);
        this.a.l6(c$a0);
    }
}

