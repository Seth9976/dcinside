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

public final class p extends a {
    static final class io.reactivex.internal.operators.observable.p.a extends e {
        final b b;

        io.reactivex.internal.operators.observable.p.a(b p$b0) {
            this.b = p$b0;
        }

        @Override  // io.reactivex.I
        public void onComplete() {
            this.b.onComplete();
        }

        @Override  // io.reactivex.I
        public void onError(Throwable throwable0) {
            this.b.onError(throwable0);
        }

        @Override  // io.reactivex.I
        public void onNext(Object object0) {
            this.b.m();
        }
    }

    static final class b extends v implements I, c {
        final Callable K;
        final G L;
        c M;
        c N;
        Collection O;

        b(I i0, Callable callable0, G g0) {
            super(i0, new io.reactivex.internal.queue.a());
            this.K = callable0;
            this.L = g0;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.H;
        }

        @Override  // io.reactivex.I
        public void b(c c0) {
            Collection collection0;
            if(d.i(this.M, c0)) {
                try {
                    this.M = c0;
                    collection0 = (Collection)io.reactivex.internal.functions.b.g(this.K.call(), "The buffer supplied is null");
                }
                catch(Throwable throwable0) {
                    io.reactivex.exceptions.b.b(throwable0);
                    this.H = true;
                    c0.dispose();
                    io.reactivex.internal.disposables.e.g(throwable0, this.F);
                    return;
                }
                this.O = collection0;
                io.reactivex.internal.operators.observable.p.a p$a0 = new io.reactivex.internal.operators.observable.p.a(this);
                this.N = p$a0;
                this.F.b(this);
                if(!this.H) {
                    this.L.d(p$a0);
                }
            }
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            if(!this.H) {
                this.H = true;
                this.N.dispose();
                this.M.dispose();
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
            Collection collection1;
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
            synchronized(this) {
                collection1 = this.O;
                if(collection1 == null) {
                    return;
                }
                this.O = collection0;
            }
            this.g(collection1, false, this);
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

    final G b;
    final Callable c;

    public p(G g0, G g1, Callable callable0) {
        super(g0);
        this.b = g1;
        this.c = callable0;
    }

    @Override  // io.reactivex.B
    protected void I5(I i0) {
        b p$b0 = new b(new m(i0), this.c, this.b);
        this.a.d(p$b0);
    }
}

