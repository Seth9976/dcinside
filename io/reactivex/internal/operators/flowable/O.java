package io.reactivex.internal.operators.flowable;

import io.reactivex.disposables.c;
import io.reactivex.internal.subscribers.n;
import io.reactivex.internal.subscriptions.g;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.internal.util.v;
import io.reactivex.l;
import io.reactivex.q;
import io.reactivex.subscribers.b;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.d;
import org.reactivestreams.e;

public final class o extends a {
    static final class io.reactivex.internal.operators.flowable.o.a extends b {
        final io.reactivex.internal.operators.flowable.o.b b;
        boolean c;

        io.reactivex.internal.operators.flowable.o.a(io.reactivex.internal.operators.flowable.o.b o$b0) {
            this.b = o$b0;
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            if(this.c) {
                return;
            }
            this.c = true;
            this.b.r();
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            if(this.c) {
                io.reactivex.plugins.a.Y(throwable0);
                return;
            }
            this.c = true;
            this.b.onError(throwable0);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            if(this.c) {
                return;
            }
            this.c = true;
            this.b();
            this.b.r();
        }
    }

    static final class io.reactivex.internal.operators.flowable.o.b extends n implements c, q, e {
        final Callable S8;
        final Callable T8;
        e U8;
        final AtomicReference V8;
        Collection W8;

        io.reactivex.internal.operators.flowable.o.b(d d0, Callable callable0, Callable callable1) {
            super(d0, new io.reactivex.internal.queue.a());
            this.V8 = new AtomicReference();
            this.S8 = callable0;
            this.T8 = callable1;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.V8.get() == io.reactivex.internal.disposables.d.a;
        }

        @Override  // org.reactivestreams.e
        public void cancel() {
            if(!this.P8) {
                this.P8 = true;
                this.U8.cancel();
                this.q();
                if(this.h()) {
                    this.O8.clear();
                }
            }
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            this.U8.cancel();
            this.q();
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            org.reactivestreams.c c0;
            d d0;
            if(!j.k(this.U8, e0)) {
                return;
            }
            try {
                this.U8 = e0;
                d0 = this.N8;
                this.W8 = (Collection)io.reactivex.internal.functions.b.g(this.S8.call(), "The buffer supplied is null");
            }
            catch(Throwable throwable0) {
                io.reactivex.exceptions.b.b(throwable0);
                this.P8 = true;
                e0.cancel();
                g.b(throwable0, d0);
                return;
            }
            try {
                c0 = (org.reactivestreams.c)io.reactivex.internal.functions.b.g(this.T8.call(), "The boundary publisher supplied is null");
            }
            catch(Throwable throwable1) {
                io.reactivex.exceptions.b.b(throwable1);
                this.P8 = true;
                e0.cancel();
                g.b(throwable1, d0);
                return;
            }
            io.reactivex.internal.operators.flowable.o.a o$a0 = new io.reactivex.internal.operators.flowable.o.a(this);
            this.V8.set(o$a0);
            d0.g(this);
            if(!this.P8) {
                e0.request(0x7FFFFFFFFFFFFFFFL);
                c0.e(o$a0);
            }
        }

        @Override  // io.reactivex.internal.subscribers.n
        public boolean j(d d0, Object object0) {
            return this.p(d0, ((Collection)object0));
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            Collection collection0;
            synchronized(this) {
                collection0 = this.W8;
                if(collection0 == null) {
                    return;
                }
                this.W8 = null;
            }
            this.O8.offer(collection0);
            this.Q8 = true;
            if(this.h()) {
                v.e(this.O8, this.N8, false, this, this);
            }
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            this.cancel();
            this.N8.onError(throwable0);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            synchronized(this) {
                Collection collection0 = this.W8;
                if(collection0 == null) {
                    return;
                }
                collection0.add(object0);
            }
        }

        public boolean p(d d0, Collection collection0) {
            this.N8.onNext(collection0);
            return true;
        }

        void q() {
            io.reactivex.internal.disposables.d.b(this.V8);
        }

        void r() {
            Collection collection1;
            org.reactivestreams.c c0;
            Collection collection0;
            try {
                collection0 = (Collection)io.reactivex.internal.functions.b.g(this.S8.call(), "The buffer supplied is null");
            }
            catch(Throwable throwable0) {
                io.reactivex.exceptions.b.b(throwable0);
                this.cancel();
                this.N8.onError(throwable0);
                return;
            }
            try {
                c0 = (org.reactivestreams.c)io.reactivex.internal.functions.b.g(this.T8.call(), "The boundary publisher supplied is null");
            }
            catch(Throwable throwable1) {
                io.reactivex.exceptions.b.b(throwable1);
                this.P8 = true;
                this.U8.cancel();
                this.N8.onError(throwable1);
                return;
            }
            io.reactivex.internal.operators.flowable.o.a o$a0 = new io.reactivex.internal.operators.flowable.o.a(this);
            if(io.reactivex.internal.disposables.d.d(this.V8, o$a0)) {
                synchronized(this) {
                    collection1 = this.W8;
                    if(collection1 == null) {
                        return;
                    }
                    this.W8 = collection0;
                }
                c0.e(o$a0);
                this.l(collection1, false, this);
            }
        }

        @Override  // org.reactivestreams.e
        public void request(long v) {
            this.o(v);
        }
    }

    final Callable c;
    final Callable d;

    public o(l l0, Callable callable0, Callable callable1) {
        super(l0);
        this.c = callable0;
        this.d = callable1;
    }

    @Override  // io.reactivex.l
    protected void m6(d d0) {
        io.reactivex.internal.operators.flowable.o.b o$b0 = new io.reactivex.internal.operators.flowable.o.b(new io.reactivex.subscribers.e(d0), this.d, this.c);
        this.b.l6(o$b0);
    }
}

