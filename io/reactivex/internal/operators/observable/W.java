package io.reactivex.internal.operators.observable;

import e3.o;
import io.reactivex.G;
import io.reactivex.I;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.functions.b;
import io.reactivex.internal.observers.s;
import io.reactivex.internal.observers.t;
import io.reactivex.internal.util.j;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;

public final class w extends a {
    static final class io.reactivex.internal.operators.observable.w.a extends AtomicInteger implements I, c, t {
        final I a;
        final o b;
        final int c;
        final int d;
        final j e;
        final io.reactivex.internal.util.c f;
        final ArrayDeque g;
        f3.o h;
        c i;
        volatile boolean j;
        int k;
        volatile boolean l;
        s m;
        int n;
        private static final long o = 0x7023F1BCC236905EL;

        io.reactivex.internal.operators.observable.w.a(I i0, o o0, int v, int v1, j j0) {
            this.a = i0;
            this.b = o0;
            this.c = v;
            this.d = v1;
            this.e = j0;
            this.f = new io.reactivex.internal.util.c();
            this.g = new ArrayDeque();
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.l;
        }

        @Override  // io.reactivex.I
        public void b(c c0) {
            if(d.i(this.i, c0)) {
                this.i = c0;
                if(c0 instanceof f3.j) {
                    int v = ((f3.j)c0).i(3);
                    if(v == 1) {
                        this.k = 1;
                        this.h = (f3.j)c0;
                        this.j = true;
                        this.a.b(this);
                        this.d();
                        return;
                    }
                    if(v == 2) {
                        this.k = 2;
                        this.h = (f3.j)c0;
                        this.a.b(this);
                        return;
                    }
                }
                this.h = new io.reactivex.internal.queue.c(this.d);
                this.a.b(this);
            }
        }

        void c() {
            s s0 = this.m;
            if(s0 != null) {
                s0.dispose();
            }
            s s1;
            while((s1 = (s)this.g.poll()) != null) {
                s1.dispose();
            }
        }

        @Override  // io.reactivex.internal.observers.t
        public void d() {
            Object object1;
            G g0;
            if(this.getAndIncrement() != 0) {
                return;
            }
            f3.o o0 = this.h;
            ArrayDeque arrayDeque0 = this.g;
            I i0 = this.a;
            j j0 = this.e;
            int v = 1;
        alab1:
            while(true) {
                int v1;
                for(v1 = this.n; v1 != this.c; ++v1) {
                    if(this.l) {
                        o0.clear();
                        this.c();
                        return;
                    }
                    if(j0 == j.a && ((Throwable)this.f.get()) != null) {
                        o0.clear();
                        this.c();
                        i0.onError(this.f.c());
                        return;
                    }
                    try {
                        Object object0 = o0.poll();
                        if(object0 == null) {
                            break;
                        }
                        g0 = (G)b.g(this.b.apply(object0), "The mapper returned a null ObservableSource");
                    }
                    catch(Throwable throwable0) {
                        io.reactivex.exceptions.b.b(throwable0);
                        this.i.dispose();
                        o0.clear();
                        this.c();
                        this.f.a(throwable0);
                        i0.onError(this.f.c());
                        return;
                    }
                    s s0 = new s(this, this.d);
                    arrayDeque0.offer(s0);
                    g0.d(s0);
                }
                this.n = v1;
                if(this.l) {
                    o0.clear();
                    this.c();
                    return;
                }
                if(j0 == j.a && ((Throwable)this.f.get()) != null) {
                    o0.clear();
                    this.c();
                    i0.onError(this.f.c());
                    return;
                }
                s s1 = this.m;
                if(s1 == null) {
                    if(j0 == j.b && ((Throwable)this.f.get()) != null) {
                        o0.clear();
                        this.c();
                        i0.onError(this.f.c());
                        return;
                    }
                    boolean z = this.j;
                    s s2 = (s)arrayDeque0.poll();
                    if(z && s2 == null) {
                        if(((Throwable)this.f.get()) != null) {
                            o0.clear();
                            this.c();
                            i0.onError(this.f.c());
                            return;
                        }
                        i0.onComplete();
                        return;
                    }
                    if(s2 != null) {
                        this.m = s2;
                    }
                    s1 = s2;
                }
                if(s1 != null) {
                    f3.o o1 = s1.e();
                    while(true) {
                        if(this.l) {
                            o0.clear();
                            this.c();
                            return;
                        }
                        boolean z1 = s1.d();
                        if(j0 == j.a && ((Throwable)this.f.get()) != null) {
                            o0.clear();
                            this.c();
                            i0.onError(this.f.c());
                            return;
                        }
                        try {
                            object1 = o1.poll();
                        }
                        catch(Throwable throwable1) {
                            io.reactivex.exceptions.b.b(throwable1);
                            this.f.a(throwable1);
                            this.m = null;
                            --this.n;
                            continue alab1;
                        }
                        if(z1 && object1 == null) {
                            this.m = null;
                            --this.n;
                            continue alab1;
                        }
                        if(object1 == null) {
                            break;
                        }
                        i0.onNext(object1);
                    }
                }
                v = this.addAndGet(-v);
                if(v == 0) {
                    break;
                }
            }
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            if(this.l) {
                return;
            }
            this.l = true;
            this.i.dispose();
            this.h();
        }

        @Override  // io.reactivex.internal.observers.t
        public void e(s s0, Throwable throwable0) {
            if(this.f.a(throwable0)) {
                if(this.e == j.a) {
                    this.i.dispose();
                }
                s0.f();
                this.d();
                return;
            }
            io.reactivex.plugins.a.Y(throwable0);
        }

        @Override  // io.reactivex.internal.observers.t
        public void f(s s0) {
            s0.f();
            this.d();
        }

        @Override  // io.reactivex.internal.observers.t
        public void g(s s0, Object object0) {
            s0.e().offer(object0);
            this.d();
        }

        void h() {
            if(this.getAndIncrement() == 0) {
                while(true) {
                    this.h.clear();
                    this.c();
                    if(this.decrementAndGet() == 0) {
                        break;
                    }
                }
            }
        }

        @Override  // io.reactivex.I
        public void onComplete() {
            this.j = true;
            this.d();
        }

        @Override  // io.reactivex.I
        public void onError(Throwable throwable0) {
            if(this.f.a(throwable0)) {
                this.j = true;
                this.d();
                return;
            }
            io.reactivex.plugins.a.Y(throwable0);
        }

        @Override  // io.reactivex.I
        public void onNext(Object object0) {
            if(this.k == 0) {
                this.h.offer(object0);
            }
            this.d();
        }
    }

    final o b;
    final j c;
    final int d;
    final int e;

    public w(G g0, o o0, j j0, int v, int v1) {
        super(g0);
        this.b = o0;
        this.c = j0;
        this.d = v;
        this.e = v1;
    }

    @Override  // io.reactivex.B
    protected void I5(I i0) {
        io.reactivex.internal.operators.observable.w.a w$a0 = new io.reactivex.internal.operators.observable.w.a(i0, this.b, this.d, this.e, this.c);
        this.a.d(w$a0);
    }
}

