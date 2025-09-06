package io.reactivex.internal.operators.mixed;

import e3.o;
import io.reactivex.B;
import io.reactivex.I;
import io.reactivex.c;
import io.reactivex.f;
import io.reactivex.i;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.functions.b;
import io.reactivex.internal.util.j;
import io.reactivex.internal.util.k;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class l extends c {
    static final class a extends AtomicInteger implements I, io.reactivex.disposables.c {
        static final class io.reactivex.internal.operators.mixed.l.a.a extends AtomicReference implements f {
            final a a;
            private static final long b = 0x4E3F736D9160236FL;

            io.reactivex.internal.operators.mixed.l.a.a(a l$a0) {
                this.a = l$a0;
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
                this.a.d();
            }

            @Override  // io.reactivex.f
            public void onError(Throwable throwable0) {
                this.a.e(throwable0);
            }
        }

        final f a;
        final o b;
        final j c;
        final io.reactivex.internal.util.c d;
        final io.reactivex.internal.operators.mixed.l.a.a e;
        final int f;
        f3.o g;
        io.reactivex.disposables.c h;
        volatile boolean i;
        volatile boolean j;
        volatile boolean k;
        private static final long l = 3610901111000061034L;

        a(f f0, o o0, j j0, int v) {
            this.a = f0;
            this.b = o0;
            this.c = j0;
            this.f = v;
            this.d = new io.reactivex.internal.util.c();
            this.e = new io.reactivex.internal.operators.mixed.l.a.a(this);
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.k;
        }

        @Override  // io.reactivex.I
        public void b(io.reactivex.disposables.c c0) {
            if(d.i(this.h, c0)) {
                this.h = c0;
                if(c0 instanceof f3.j) {
                    int v = ((f3.j)c0).i(3);
                    if(v == 1) {
                        this.g = (f3.j)c0;
                        this.j = true;
                        this.a.b(this);
                        this.c();
                        return;
                    }
                    if(v == 2) {
                        this.g = (f3.j)c0;
                        this.a.b(this);
                        return;
                    }
                }
                this.g = new io.reactivex.internal.queue.c(this.f);
                this.a.b(this);
            }
        }

        void c() {
            boolean z1;
            i i0;
            if(this.getAndIncrement() != 0) {
                return;
            }
            io.reactivex.internal.util.c c0 = this.d;
            j j0 = this.c;
            do {
                if(this.k) {
                    this.g.clear();
                    return;
                }
                if(!this.i) {
                    if(j0 == j.b && c0.get() != null) {
                        this.k = true;
                        this.g.clear();
                        Throwable throwable0 = c0.c();
                        this.a.onError(throwable0);
                        return;
                    }
                    try {
                        boolean z = this.j;
                        Object object0 = this.g.poll();
                        if(object0 == null) {
                            i0 = null;
                            z1 = true;
                        }
                        else {
                            i0 = (i)b.g(this.b.apply(object0), "The mapper returned a null CompletableSource");
                            z1 = false;
                        }
                    }
                    catch(Throwable throwable1) {
                        io.reactivex.exceptions.b.b(throwable1);
                        this.k = true;
                        this.g.clear();
                        this.h.dispose();
                        c0.a(throwable1);
                        Throwable throwable2 = c0.c();
                        this.a.onError(throwable2);
                        return;
                    }
                    if(z && z1) {
                        this.k = true;
                        Throwable throwable3 = c0.c();
                        if(throwable3 != null) {
                            this.a.onError(throwable3);
                            return;
                        }
                        this.a.onComplete();
                        return;
                    }
                    if(!z1) {
                        this.i = true;
                        i0.e(this.e);
                    }
                }
            }
            while(this.decrementAndGet() != 0);
        }

        void d() {
            this.i = false;
            this.c();
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            this.k = true;
            this.h.dispose();
            this.e.a();
            if(this.getAndIncrement() == 0) {
                this.g.clear();
            }
        }

        void e(Throwable throwable0) {
            if(this.d.a(throwable0)) {
                if(this.c != j.a) {
                    this.i = false;
                    this.c();
                    return;
                }
                this.k = true;
                this.h.dispose();
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

        @Override  // io.reactivex.I
        public void onComplete() {
            this.j = true;
            this.c();
        }

        @Override  // io.reactivex.I
        public void onError(Throwable throwable0) {
            if(this.d.a(throwable0)) {
                if(this.c != j.a) {
                    this.j = true;
                    this.c();
                    return;
                }
                this.k = true;
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

        @Override  // io.reactivex.I
        public void onNext(Object object0) {
            if(object0 != null) {
                this.g.offer(object0);
            }
            this.c();
        }
    }

    final B a;
    final o b;
    final j c;
    final int d;

    public l(B b0, o o0, j j0, int v) {
        this.a = b0;
        this.b = o0;
        this.c = j0;
        this.d = v;
    }

    @Override  // io.reactivex.c
    protected void J0(f f0) {
        if(!r.a(this.a, this.b, f0)) {
            a l$a0 = new a(f0, this.b, this.c, this.d);
            this.a.d(l$a0);
        }
    }
}

