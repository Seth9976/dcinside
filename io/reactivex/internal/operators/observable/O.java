package io.reactivex.internal.operators.observable;

import io.reactivex.G;
import io.reactivex.I;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.observers.v;
import io.reactivex.observers.e;
import io.reactivex.observers.m;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

public final class o extends a {
    static final class io.reactivex.internal.operators.observable.o.a extends e {
        final b b;
        boolean c;

        io.reactivex.internal.operators.observable.o.a(b o$b0) {
            this.b = o$b0;
        }

        @Override  // io.reactivex.I
        public void onComplete() {
            if(this.c) {
                return;
            }
            this.c = true;
            this.b.n();
        }

        @Override  // io.reactivex.I
        public void onError(Throwable throwable0) {
            if(this.c) {
                io.reactivex.plugins.a.Y(throwable0);
                return;
            }
            this.c = true;
            this.b.onError(throwable0);
        }

        @Override  // io.reactivex.I
        public void onNext(Object object0) {
            if(this.c) {
                return;
            }
            this.c = true;
            this.dispose();
            this.b.n();
        }
    }

    static final class b extends v implements I, c {
        final Callable K;
        final Callable L;
        c M;
        final AtomicReference N;
        Collection O;

        b(I i0, Callable callable0, Callable callable1) {
            super(i0, new io.reactivex.internal.queue.a());
            this.N = new AtomicReference();
            this.K = callable0;
            this.L = callable1;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.H;
        }

        @Override  // io.reactivex.I
        public void b(c c0) {
            G g0;
            I i0;
            if(d.i(this.M, c0)) {
                try {
                    this.M = c0;
                    i0 = this.F;
                    this.O = (Collection)io.reactivex.internal.functions.b.g(this.K.call(), "The buffer supplied is null");
                }
                catch(Throwable throwable0) {
                    io.reactivex.exceptions.b.b(throwable0);
                    this.H = true;
                    c0.dispose();
                    io.reactivex.internal.disposables.e.g(throwable0, i0);
                    return;
                }
                try {
                    g0 = (G)io.reactivex.internal.functions.b.g(this.L.call(), "The boundary ObservableSource supplied is null");
                }
                catch(Throwable throwable1) {
                    io.reactivex.exceptions.b.b(throwable1);
                    this.H = true;
                    c0.dispose();
                    io.reactivex.internal.disposables.e.g(throwable1, i0);
                    return;
                }
                io.reactivex.internal.operators.observable.o.a o$a0 = new io.reactivex.internal.operators.observable.o.a(this);
                this.N.set(o$a0);
                i0.b(this);
                if(!this.H) {
                    g0.d(o$a0);
                }
            }
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            if(!this.H) {
                this.H = true;
                this.M.dispose();
                this.m();
                if(this.h()) {
                    this.G.clear();
                }
            }
        }

        @Override  // io.reactivex.internal.observers.v
        public void j(I i0, Object object0) {
            this.l(i0, ((Collection)object0));
        }

        public void l(I i0, Collection collection0) {
            this.F.onNext(collection0);
        }

        void m() {
            d.b(this.N);
        }

        void n() {
            Collection collection1;
            G g0;
            Collection collection0;
            try {
                collection0 = (Collection)io.reactivex.internal.functions.b.g(this.K.call(), "The buffer supplied is null");
            }
            catch(Throwable throwable0) {
                io.reactivex.exceptions.b.b(throwable0);
                this.dispose();
                this.F.onError(throwable0);
                return;
            }
            try {
                g0 = (G)io.reactivex.internal.functions.b.g(this.L.call(), "The boundary ObservableSource supplied is null");
            }
            catch(Throwable throwable1) {
                io.reactivex.exceptions.b.b(throwable1);
                this.H = true;
                this.M.dispose();
                this.F.onError(throwable1);
                return;
            }
            io.reactivex.internal.operators.observable.o.a o$a0 = new io.reactivex.internal.operators.observable.o.a(this);
            if(d.d(this.N, o$a0)) {
                synchronized(this) {
                    collection1 = this.O;
                    if(collection1 == null) {
                        return;
                    }
                    this.O = collection0;
                }
                g0.d(o$a0);
                this.g(collection1, false, this);
            }
        }

        @Override  // io.reactivex.I
        public void onComplete() {
            Collection collection0;
            synchronized(this) {
                collection0 = this.O;
                if(collection0 == null) {
                    return;
                }
                this.O = null;
            }
            this.G.offer(collection0);
            this.I = true;
            if(this.h()) {
                io.reactivex.internal.util.v.d(this.G, this.F, false, this, this);
            }
        }

        @Override  // io.reactivex.I
        public void onError(Throwable throwable0) {
            this.dispose();
            this.F.onError(throwable0);
        }

        @Override  // io.reactivex.I
        public void onNext(Object object0) {
            synchronized(this) {
                Collection collection0 = this.O;
                if(collection0 == null) {
                    return;
                }
                collection0.add(object0);
            }
        }
    }

    final Callable b;
    final Callable c;

    public o(G g0, Callable callable0, Callable callable1) {
        super(g0);
        this.b = callable0;
        this.c = callable1;
    }

    @Override  // io.reactivex.B
    protected void I5(I i0) {
        b o$b0 = new b(new m(i0), this.c, this.b);
        this.a.d(o$b0);
    }
}

