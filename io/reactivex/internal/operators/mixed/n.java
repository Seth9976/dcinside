package io.reactivex.internal.operators.mixed;

import e3.o;
import io.reactivex.B;
import io.reactivex.I;
import io.reactivex.N;
import io.reactivex.Q;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.functions.b;
import io.reactivex.internal.util.j;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class n extends B {
    static final class a extends AtomicInteger implements I, c {
        static final class io.reactivex.internal.operators.mixed.n.a.a extends AtomicReference implements N {
            final a a;
            private static final long b = 0xD5A700F5220AE8BCL;

            io.reactivex.internal.operators.mixed.n.a.a(a n$a0) {
                this.a = n$a0;
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
                this.a.d(throwable0);
            }

            @Override  // io.reactivex.N
            public void onSuccess(Object object0) {
                this.a.e(object0);
            }
        }

        final I a;
        final o b;
        final io.reactivex.internal.util.c c;
        final io.reactivex.internal.operators.mixed.n.a.a d;
        final f3.n e;
        final j f;
        c g;
        volatile boolean h;
        volatile boolean i;
        Object j;
        volatile int k;
        private static final long l = -9140123220065488293L;
        static final int m = 0;
        static final int n = 1;
        static final int o = 2;

        a(I i0, o o0, int v, j j0) {
            this.a = i0;
            this.b = o0;
            this.f = j0;
            this.c = new io.reactivex.internal.util.c();
            this.d = new io.reactivex.internal.operators.mixed.n.a.a(this);
            this.e = new io.reactivex.internal.queue.c(v);
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.i;
        }

        @Override  // io.reactivex.I
        public void b(c c0) {
            if(d.i(this.g, c0)) {
                this.g = c0;
                this.a.b(this);
            }
        }

        void c() {
            Q q0;
            if(this.getAndIncrement() != 0) {
                return;
            }
            I i0 = this.a;
            j j0 = this.f;
            f3.n n0 = this.e;
            io.reactivex.internal.util.c c0 = this.c;
            int v = 1;
            while(true) {
                if(this.i) {
                    n0.clear();
                    this.j = null;
                }
                else {
                    boolean z = false;
                    int v1 = this.k;
                    if(c0.get() != null && (j0 == j.a || j0 == j.b && v1 == 0)) {
                        n0.clear();
                        this.j = null;
                        i0.onError(c0.c());
                        return;
                    }
                    switch(v1) {
                        case 0: {
                            boolean z1 = this.h;
                            Object object0 = n0.poll();
                            if(object0 == null) {
                                z = true;
                            }
                            if(z1 && z) {
                                Throwable throwable0 = c0.c();
                                if(throwable0 == null) {
                                    i0.onComplete();
                                    return;
                                }
                                i0.onError(throwable0);
                                return;
                            }
                            if(!z) {
                                try {
                                    q0 = (Q)b.g(this.b.apply(object0), "The mapper returned a null SingleSource");
                                }
                                catch(Throwable throwable1) {
                                    io.reactivex.exceptions.b.b(throwable1);
                                    this.g.dispose();
                                    n0.clear();
                                    c0.a(throwable1);
                                    i0.onError(c0.c());
                                    return;
                                }
                                this.k = 1;
                                q0.e(this.d);
                            }
                            break;
                        }
                        case 2: {
                            goto label_46;
                        }
                    }
                }
                v = this.addAndGet(-v);
                if(v == 0) {
                    return;
                label_46:
                    Object object1 = this.j;
                    this.j = null;
                    i0.onNext(object1);
                    this.k = 0;
                }
            }
        }

        void d(Throwable throwable0) {
            if(this.c.a(throwable0)) {
                if(this.f != j.c) {
                    this.g.dispose();
                }
                this.k = 0;
                this.c();
                return;
            }
            io.reactivex.plugins.a.Y(throwable0);
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            this.i = true;
            this.g.dispose();
            this.d.a();
            if(this.getAndIncrement() == 0) {
                this.e.clear();
                this.j = null;
            }
        }

        void e(Object object0) {
            this.j = object0;
            this.k = 2;
            this.c();
        }

        @Override  // io.reactivex.I
        public void onComplete() {
            this.h = true;
            this.c();
        }

        @Override  // io.reactivex.I
        public void onError(Throwable throwable0) {
            if(this.c.a(throwable0)) {
                if(this.f == j.a) {
                    this.d.a();
                }
                this.h = true;
                this.c();
                return;
            }
            io.reactivex.plugins.a.Y(throwable0);
        }

        @Override  // io.reactivex.I
        public void onNext(Object object0) {
            this.e.offer(object0);
            this.c();
        }
    }

    final B a;
    final o b;
    final j c;
    final int d;

    public n(B b0, o o0, j j0, int v) {
        this.a = b0;
        this.b = o0;
        this.c = j0;
        this.d = v;
    }

    @Override  // io.reactivex.B
    protected void I5(I i0) {
        if(!r.c(this.a, this.b, i0)) {
            a n$a0 = new a(i0, this.b, this.d, this.c);
            this.a.d(n$a0);
        }
    }
}

