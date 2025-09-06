package io.reactivex.internal.operators.observable;

import f3.j;
import f3.o;
import io.reactivex.G;
import io.reactivex.I;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class p1 extends a {
    static final class io.reactivex.internal.operators.observable.p1.a extends AtomicReference implements I {
        final b a;
        final long b;
        final int c;
        volatile o d;
        volatile boolean e;
        private static final long f = 0x3540C639803A63B9L;

        io.reactivex.internal.operators.observable.p1.a(b p1$b0, long v, int v1) {
            this.a = p1$b0;
            this.b = v;
            this.c = v1;
        }

        public void a() {
            d.b(this);
        }

        @Override  // io.reactivex.I
        public void b(c c0) {
            if(d.g(this, c0)) {
                if(c0 instanceof j) {
                    int v = ((j)c0).i(7);
                    if(v == 1) {
                        this.d = (j)c0;
                        this.e = true;
                        this.a.d();
                        return;
                    }
                    if(v == 2) {
                        this.d = (j)c0;
                        return;
                    }
                }
                this.d = new io.reactivex.internal.queue.c(this.c);
            }
        }

        @Override  // io.reactivex.I
        public void onComplete() {
            if(this.b == this.a.j) {
                this.e = true;
                this.a.d();
            }
        }

        @Override  // io.reactivex.I
        public void onError(Throwable throwable0) {
            this.a.e(this, throwable0);
        }

        @Override  // io.reactivex.I
        public void onNext(Object object0) {
            if(this.b == this.a.j) {
                if(object0 != null) {
                    this.d.offer(object0);
                }
                this.a.d();
            }
        }
    }

    static final class b extends AtomicInteger implements I, c {
        final I a;
        final e3.o b;
        final int c;
        final boolean d;
        final io.reactivex.internal.util.c e;
        volatile boolean f;
        volatile boolean g;
        c h;
        final AtomicReference i;
        volatile long j;
        private static final long k = 0xCF8D368C2BFAAD95L;
        static final io.reactivex.internal.operators.observable.p1.a l;

        static {
            io.reactivex.internal.operators.observable.p1.a p1$a0 = new io.reactivex.internal.operators.observable.p1.a(null, -1L, 1);
            b.l = p1$a0;
            p1$a0.a();
        }

        b(I i0, e3.o o0, int v, boolean z) {
            this.i = new AtomicReference();
            this.a = i0;
            this.b = o0;
            this.c = v;
            this.d = z;
            this.e = new io.reactivex.internal.util.c();
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.g;
        }

        @Override  // io.reactivex.I
        public void b(c c0) {
            if(d.i(this.h, c0)) {
                this.h = c0;
                this.a.b(this);
            }
        }

        void c() {
            io.reactivex.internal.operators.observable.p1.a p1$a0 = (io.reactivex.internal.operators.observable.p1.a)this.i.get();
            io.reactivex.internal.operators.observable.p1.a p1$a1 = b.l;
            if(p1$a0 != p1$a1) {
                io.reactivex.internal.operators.observable.p1.a p1$a2 = (io.reactivex.internal.operators.observable.p1.a)this.i.getAndSet(p1$a1);
                if(p1$a2 != p1$a1 && p1$a2 != null) {
                    p1$a2.a();
                }
            }
        }

        void d() {
            Object object0;
            if(this.getAndIncrement() != 0) {
                return;
            }
            I i0 = this.a;
            AtomicReference atomicReference0 = this.i;
            boolean z = this.d;
            int v = 1;
            while(true) {
                if(this.g) {
                    return;
                }
                if(this.f) {
                    boolean z1 = atomicReference0.get() == null;
                    if(!z) {
                        if(((Throwable)this.e.get()) != null) {
                            i0.onError(this.e.c());
                            return;
                        }
                        if(z1) {
                            i0.onComplete();
                            return;
                        }
                    }
                    else if(z1) {
                        Throwable throwable0 = (Throwable)this.e.get();
                        if(throwable0 != null) {
                            i0.onError(throwable0);
                            return;
                        }
                        i0.onComplete();
                        return;
                    }
                }
                io.reactivex.internal.operators.observable.p1.a p1$a0 = (io.reactivex.internal.operators.observable.p1.a)atomicReference0.get();
                if(p1$a0 != null) {
                    o o0 = p1$a0.d;
                    if(o0 != null) {
                        if(p1$a0.e) {
                            boolean z2 = o0.isEmpty();
                            if(!z) {
                                if(((Throwable)this.e.get()) != null) {
                                    i0.onError(this.e.c());
                                    return;
                                }
                                if(z2) {
                                    androidx.compose.animation.core.d.a(atomicReference0, p1$a0, null);
                                    continue;
                                }
                            }
                            else if(z2) {
                                androidx.compose.animation.core.d.a(atomicReference0, p1$a0, null);
                                continue;
                            }
                        }
                        boolean z3 = false;
                        while(true) {
                            if(this.g) {
                                return;
                            }
                            if(p1$a0 != atomicReference0.get()) {
                                z3 = true;
                                break;
                            }
                            if(!z && ((Throwable)this.e.get()) != null) {
                                i0.onError(this.e.c());
                                return;
                            }
                            try {
                                boolean z4 = p1$a0.e;
                                object0 = o0.poll();
                            }
                            catch(Throwable throwable1) {
                                io.reactivex.exceptions.b.b(throwable1);
                                this.e.a(throwable1);
                                androidx.compose.animation.core.d.a(atomicReference0, p1$a0, null);
                                if(z) {
                                    p1$a0.a();
                                }
                                else {
                                    this.c();
                                    this.h.dispose();
                                    this.f = true;
                                }
                                object0 = null;
                                z3 = true;
                            }
                            if(z4 && object0 == null) {
                                androidx.compose.animation.core.d.a(atomicReference0, p1$a0, null);
                                z3 = true;
                                break;
                            }
                            if(object0 == null) {
                                break;
                            }
                            i0.onNext(object0);
                        }
                        if(!z3) {
                            goto label_71;
                        }
                        continue;
                    }
                }
            label_71:
                v = this.addAndGet(-v);
                if(v == 0) {
                    break;
                }
            }
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            if(!this.g) {
                this.g = true;
                this.h.dispose();
                this.c();
            }
        }

        void e(io.reactivex.internal.operators.observable.p1.a p1$a0, Throwable throwable0) {
            if(p1$a0.b == this.j && this.e.a(throwable0)) {
                if(!this.d) {
                    this.h.dispose();
                    this.f = true;
                }
                p1$a0.e = true;
                this.d();
                return;
            }
            io.reactivex.plugins.a.Y(throwable0);
        }

        @Override  // io.reactivex.I
        public void onComplete() {
            if(!this.f) {
                this.f = true;
                this.d();
            }
        }

        @Override  // io.reactivex.I
        public void onError(Throwable throwable0) {
            if(!this.f && this.e.a(throwable0)) {
                if(!this.d) {
                    this.c();
                }
                this.f = true;
                this.d();
                return;
            }
            io.reactivex.plugins.a.Y(throwable0);
        }

        @Override  // io.reactivex.I
        public void onNext(Object object0) {
            G g0;
            long v = this.j + 1L;
            this.j = v;
            io.reactivex.internal.operators.observable.p1.a p1$a0 = (io.reactivex.internal.operators.observable.p1.a)this.i.get();
            if(p1$a0 != null) {
                p1$a0.a();
            }
            try {
                g0 = (G)io.reactivex.internal.functions.b.g(this.b.apply(object0), "The ObservableSource returned is null");
            }
            catch(Throwable throwable0) {
                io.reactivex.exceptions.b.b(throwable0);
                this.h.dispose();
                this.onError(throwable0);
                return;
            }
            io.reactivex.internal.operators.observable.p1.a p1$a1 = new io.reactivex.internal.operators.observable.p1.a(this, v, this.c);
            io.reactivex.internal.operators.observable.p1.a p1$a2;
            while((p1$a2 = (io.reactivex.internal.operators.observable.p1.a)this.i.get()) != b.l) {
                if(androidx.compose.animation.core.d.a(this.i, p1$a2, p1$a1)) {
                    g0.d(p1$a1);
                    return;
                }
            }
        }
    }

    final e3.o b;
    final int c;
    final boolean d;

    public p1(G g0, e3.o o0, int v, boolean z) {
        super(g0);
        this.b = o0;
        this.c = v;
        this.d = z;
    }

    @Override  // io.reactivex.B
    public void I5(I i0) {
        if(a1.b(this.a, i0, this.b)) {
            return;
        }
        b p1$b0 = new b(i0, this.b, this.c, this.d);
        this.a.d(p1$b0);
    }
}

