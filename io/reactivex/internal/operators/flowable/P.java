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
import org.reactivestreams.d;
import org.reactivestreams.e;

public final class p extends a {
    static final class io.reactivex.internal.operators.flowable.p.a extends b {
        final io.reactivex.internal.operators.flowable.p.b b;

        io.reactivex.internal.operators.flowable.p.a(io.reactivex.internal.operators.flowable.p.b p$b0) {
            this.b = p$b0;
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            this.b.onComplete();
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            this.b.onError(throwable0);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            this.b.q();
        }
    }

    static final class io.reactivex.internal.operators.flowable.p.b extends n implements c, q, e {
        final Callable S8;
        final org.reactivestreams.c T8;
        e U8;
        c V8;
        Collection W8;

        io.reactivex.internal.operators.flowable.p.b(d d0, Callable callable0, org.reactivestreams.c c0) {
            super(d0, new io.reactivex.internal.queue.a());
            this.S8 = callable0;
            this.T8 = c0;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.P8;
        }

        @Override  // org.reactivestreams.e
        public void cancel() {
            if(!this.P8) {
                this.P8 = true;
                this.V8.dispose();
                this.U8.cancel();
                if(this.h()) {
                    this.O8.clear();
                }
            }
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            this.cancel();
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            Collection collection0;
            if(!j.k(this.U8, e0)) {
                return;
            }
            try {
                this.U8 = e0;
                collection0 = (Collection)io.reactivex.internal.functions.b.g(this.S8.call(), "The buffer supplied is null");
            }
            catch(Throwable throwable0) {
                io.reactivex.exceptions.b.b(throwable0);
                this.P8 = true;
                e0.cancel();
                g.b(throwable0, this.N8);
                return;
            }
            this.W8 = collection0;
            io.reactivex.internal.operators.flowable.p.a p$a0 = new io.reactivex.internal.operators.flowable.p.a(this);
            this.V8 = p$a0;
            this.N8.g(this);
            if(!this.P8) {
                e0.request(0x7FFFFFFFFFFFFFFFL);
                this.T8.e(p$a0);
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
            Collection collection1;
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
            synchronized(this) {
                collection1 = this.W8;
                if(collection1 == null) {
                    return;
                }
                this.W8 = collection0;
            }
            this.l(collection1, false, this);
        }

        @Override  // org.reactivestreams.e
        public void request(long v) {
            this.o(v);
        }
    }

    final org.reactivestreams.c c;
    final Callable d;

    public p(l l0, org.reactivestreams.c c0, Callable callable0) {
        super(l0);
        this.c = c0;
        this.d = callable0;
    }

    @Override  // io.reactivex.l
    protected void m6(d d0) {
        io.reactivex.internal.operators.flowable.p.b p$b0 = new io.reactivex.internal.operators.flowable.p.b(new io.reactivex.subscribers.e(d0), this.d, this.c);
        this.b.l6(p$b0);
    }
}

