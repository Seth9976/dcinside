package io.reactivex.internal.operators.observable;

import io.reactivex.G;
import io.reactivex.I;
import io.reactivex.J;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.disposables.e;
import io.reactivex.internal.functions.b;
import io.reactivex.internal.observers.v;
import io.reactivex.observers.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class q extends a {
    static final class io.reactivex.internal.operators.observable.q.a extends v implements c, Runnable {
        final Callable K;
        final long L;
        final TimeUnit M;
        long M8;
        final int N;
        final boolean O;
        final io.reactivex.J.c P;
        Collection Q;
        c X;
        c Y;
        long Z;

        io.reactivex.internal.operators.observable.q.a(I i0, Callable callable0, long v, TimeUnit timeUnit0, int v1, boolean z, io.reactivex.J.c j$c0) {
            super(i0, new io.reactivex.internal.queue.a());
            this.K = callable0;
            this.L = v;
            this.M = timeUnit0;
            this.N = v1;
            this.O = z;
            this.P = j$c0;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.H;
        }

        @Override  // io.reactivex.I
        public void b(c c0) {
            Collection collection0;
            if(d.i(this.Y, c0)) {
                try {
                    this.Y = c0;
                    collection0 = (Collection)b.g(this.K.call(), "The buffer supplied is null");
                }
                catch(Throwable throwable0) {
                    io.reactivex.exceptions.b.b(throwable0);
                    c0.dispose();
                    e.g(throwable0, this.F);
                    this.P.dispose();
                    return;
                }
                this.Q = collection0;
                this.F.b(this);
                this.X = this.P.e(this, this.L, this.L, this.M);
            }
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            if(!this.H) {
                this.H = true;
                this.Y.dispose();
                this.P.dispose();
                synchronized(this) {
                    this.Q = null;
                }
            }
        }

        @Override  // io.reactivex.internal.observers.v
        public void j(I i0, Object object0) {
            this.l(i0, ((Collection)object0));
        }

        public void l(I i0, Collection collection0) {
            i0.onNext(collection0);
        }

        @Override  // io.reactivex.I
        public void onComplete() {
            Collection collection0;
            this.P.dispose();
            synchronized(this) {
                collection0 = this.Q;
                this.Q = null;
            }
            if(collection0 != null) {
                this.G.offer(collection0);
                this.I = true;
                if(this.h()) {
                    io.reactivex.internal.util.v.d(this.G, this.F, false, this, this);
                }
            }
        }

        @Override  // io.reactivex.I
        public void onError(Throwable throwable0) {
            synchronized(this) {
                this.Q = null;
            }
            this.F.onError(throwable0);
            this.P.dispose();
        }

        @Override  // io.reactivex.I
        public void onNext(Object object0) {
            Collection collection0;
            Collection collection1;
            synchronized(this) {
                collection0 = this.Q;
                if(collection0 == null) {
                    return;
                }
                collection0.add(object0);
                if(collection0.size() < this.N) {
                    return;
                }
                this.Q = null;
                ++this.Z;
            }
            if(this.O) {
                this.X.dispose();
            }
            this.k(collection0, false, this);
            try {
                collection1 = (Collection)b.g(this.K.call(), "The buffer supplied is null");
            }
            catch(Throwable throwable0) {
                io.reactivex.exceptions.b.b(throwable0);
                this.F.onError(throwable0);
                this.dispose();
                return;
            }
            synchronized(this) {
                this.Q = collection1;
                ++this.M8;
            }
            if(this.O) {
                this.X = this.P.e(this, this.L, this.L, this.M);
            }
        }

        @Override
        public void run() {
            Collection collection0;
            try {
                collection0 = (Collection)b.g(this.K.call(), "The bufferSupplier returned a null buffer");
            }
            catch(Throwable throwable0) {
                io.reactivex.exceptions.b.b(throwable0);
                this.dispose();
                this.F.onError(throwable0);
                return;
            }
            synchronized(this) {
                Collection collection1 = this.Q;
                if(collection1 != null && this.Z == this.M8) {
                    this.Q = collection0;
                    this.k(collection1, false, this);
                }
            }
        }
    }

    static final class io.reactivex.internal.operators.observable.q.b extends v implements c, Runnable {
        final Callable K;
        final long L;
        final TimeUnit M;
        final J N;
        c O;
        Collection P;
        final AtomicReference Q;

        io.reactivex.internal.operators.observable.q.b(I i0, Callable callable0, long v, TimeUnit timeUnit0, J j0) {
            super(i0, new io.reactivex.internal.queue.a());
            this.Q = new AtomicReference();
            this.K = callable0;
            this.L = v;
            this.M = timeUnit0;
            this.N = j0;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.Q.get() == d.a;
        }

        @Override  // io.reactivex.I
        public void b(c c0) {
            Collection collection0;
            if(d.i(this.O, c0)) {
                try {
                    this.O = c0;
                    collection0 = (Collection)b.g(this.K.call(), "The buffer supplied is null");
                }
                catch(Throwable throwable0) {
                    io.reactivex.exceptions.b.b(throwable0);
                    this.dispose();
                    e.g(throwable0, this.F);
                    return;
                }
                this.P = collection0;
                this.F.b(this);
                if(!this.H) {
                    c c1 = this.N.h(this, this.L, this.L, this.M);
                    if(!androidx.compose.animation.core.d.a(this.Q, null, c1)) {
                        c1.dispose();
                    }
                }
            }
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            d.b(this.Q);
            this.O.dispose();
        }

        @Override  // io.reactivex.internal.observers.v
        public void j(I i0, Object object0) {
            this.l(i0, ((Collection)object0));
        }

        public void l(I i0, Collection collection0) {
            this.F.onNext(collection0);
        }

        @Override  // io.reactivex.I
        public void onComplete() {
            Collection collection0;
            synchronized(this) {
                collection0 = this.P;
                this.P = null;
            }
            if(collection0 != null) {
                this.G.offer(collection0);
                this.I = true;
                if(this.h()) {
                    io.reactivex.internal.util.v.d(this.G, this.F, false, null, this);
                }
            }
            d.b(this.Q);
        }

        @Override  // io.reactivex.I
        public void onError(Throwable throwable0) {
            synchronized(this) {
                this.P = null;
            }
            this.F.onError(throwable0);
            d.b(this.Q);
        }

        @Override  // io.reactivex.I
        public void onNext(Object object0) {
            synchronized(this) {
                Collection collection0 = this.P;
                if(collection0 == null) {
                    return;
                }
                collection0.add(object0);
            }
        }

        @Override
        public void run() {
            Collection collection1;
            Collection collection0;
            try {
                collection0 = (Collection)b.g(this.K.call(), "The bufferSupplier returned a null buffer");
            }
            catch(Throwable throwable0) {
                io.reactivex.exceptions.b.b(throwable0);
                this.F.onError(throwable0);
                this.dispose();
                return;
            }
            synchronized(this) {
                collection1 = this.P;
                if(collection1 != null) {
                    this.P = collection0;
                }
            }
            if(collection1 == null) {
                d.b(this.Q);
                return;
            }
            this.g(collection1, false, this);
        }
    }

    static final class io.reactivex.internal.operators.observable.q.c extends v implements c, Runnable {
        final class io.reactivex.internal.operators.observable.q.c.a implements Runnable {
            private final Collection a;
            final io.reactivex.internal.operators.observable.q.c b;

            io.reactivex.internal.operators.observable.q.c.a(Collection collection0) {
                this.a = collection0;
            }

            @Override
            public void run() {
                synchronized(io.reactivex.internal.operators.observable.q.c.this) {
                    io.reactivex.internal.operators.observable.q.c.this.P.remove(this.a);
                }
                io.reactivex.internal.operators.observable.q.c.this.k(this.a, false, io.reactivex.internal.operators.observable.q.c.this.O);
            }
        }

        final class io.reactivex.internal.operators.observable.q.c.b implements Runnable {
            private final Collection a;
            final io.reactivex.internal.operators.observable.q.c b;

            io.reactivex.internal.operators.observable.q.c.b(Collection collection0) {
                this.a = collection0;
            }

            @Override
            public void run() {
                synchronized(io.reactivex.internal.operators.observable.q.c.this) {
                    io.reactivex.internal.operators.observable.q.c.this.P.remove(this.a);
                }
                io.reactivex.internal.operators.observable.q.c.this.k(this.a, false, io.reactivex.internal.operators.observable.q.c.this.O);
            }
        }

        final Callable K;
        final long L;
        final long M;
        final TimeUnit N;
        final io.reactivex.J.c O;
        final List P;
        c Q;

        io.reactivex.internal.operators.observable.q.c(I i0, Callable callable0, long v, long v1, TimeUnit timeUnit0, io.reactivex.J.c j$c0) {
            super(i0, new io.reactivex.internal.queue.a());
            this.K = callable0;
            this.L = v;
            this.M = v1;
            this.N = timeUnit0;
            this.O = j$c0;
            this.P = new LinkedList();
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.H;
        }

        @Override  // io.reactivex.I
        public void b(c c0) {
            Collection collection0;
            if(d.i(this.Q, c0)) {
                try {
                    this.Q = c0;
                    collection0 = (Collection)b.g(this.K.call(), "The buffer supplied is null");
                }
                catch(Throwable throwable0) {
                    io.reactivex.exceptions.b.b(throwable0);
                    c0.dispose();
                    e.g(throwable0, this.F);
                    this.O.dispose();
                    return;
                }
                this.P.add(collection0);
                this.F.b(this);
                this.O.e(this, this.M, this.M, this.N);
                io.reactivex.internal.operators.observable.q.c.b q$c$b0 = new io.reactivex.internal.operators.observable.q.c.b(this, collection0);
                this.O.d(q$c$b0, this.L, this.N);
            }
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            if(!this.H) {
                this.H = true;
                this.o();
                this.Q.dispose();
                this.O.dispose();
            }
        }

        @Override  // io.reactivex.internal.observers.v
        public void j(I i0, Object object0) {
            this.l(i0, ((Collection)object0));
        }

        public void l(I i0, Collection collection0) {
            i0.onNext(collection0);
        }

        void o() {
            synchronized(this) {
                this.P.clear();
            }
        }

        @Override  // io.reactivex.I
        public void onComplete() {
            synchronized(this) {
                ArrayList arrayList0 = new ArrayList(this.P);
                this.P.clear();
            }
            for(Object object0: arrayList0) {
                this.G.offer(((Collection)object0));
            }
            this.I = true;
            if(this.h()) {
                io.reactivex.internal.util.v.d(this.G, this.F, false, this.O, this);
            }
        }

        @Override  // io.reactivex.I
        public void onError(Throwable throwable0) {
            this.I = true;
            this.o();
            this.F.onError(throwable0);
            this.O.dispose();
        }

        @Override  // io.reactivex.I
        public void onNext(Object object0) {
            synchronized(this) {
                for(Object object1: this.P) {
                    ((Collection)object1).add(object0);
                }
            }
        }

        @Override
        public void run() {
            Collection collection0;
            if(this.H) {
                return;
            }
            try {
                collection0 = (Collection)b.g(this.K.call(), "The bufferSupplier returned a null buffer");
            }
            catch(Throwable throwable0) {
                io.reactivex.exceptions.b.b(throwable0);
                this.F.onError(throwable0);
                this.dispose();
                return;
            }
            synchronized(this) {
                if(this.H) {
                    return;
                }
                this.P.add(collection0);
            }
            io.reactivex.internal.operators.observable.q.c.a q$c$a0 = new io.reactivex.internal.operators.observable.q.c.a(this, collection0);
            this.O.d(q$c$a0, this.L, this.N);
        }
    }

    final long b;
    final long c;
    final TimeUnit d;
    final J e;
    final Callable f;
    final int g;
    final boolean h;

    public q(G g0, long v, long v1, TimeUnit timeUnit0, J j0, Callable callable0, int v2, boolean z) {
        super(g0);
        this.b = v;
        this.c = v1;
        this.d = timeUnit0;
        this.e = j0;
        this.f = callable0;
        this.g = v2;
        this.h = z;
    }

    @Override  // io.reactivex.B
    protected void I5(I i0) {
        if(this.b == this.c && this.g == 0x7FFFFFFF) {
            io.reactivex.internal.operators.observable.q.b q$b0 = new io.reactivex.internal.operators.observable.q.b(new m(i0), this.f, this.b, this.d, this.e);
            this.a.d(q$b0);
            return;
        }
        io.reactivex.J.c j$c0 = this.e.d();
        if(this.b == this.c) {
            io.reactivex.internal.operators.observable.q.a q$a0 = new io.reactivex.internal.operators.observable.q.a(new m(i0), this.f, this.b, this.d, this.g, this.h, j$c0);
            this.a.d(q$a0);
            return;
        }
        io.reactivex.internal.operators.observable.q.c q$c0 = new io.reactivex.internal.operators.observable.q.c(new m(i0), this.f, this.b, this.c, this.d, j$c0);
        this.a.d(q$c0);
    }
}

