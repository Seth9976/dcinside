package io.reactivex.internal.operators.flowable;

import e3.o;
import io.reactivex.internal.functions.b;
import io.reactivex.internal.subscriptions.g;
import io.reactivex.l;
import io.reactivex.processors.h;
import org.reactivestreams.d;
import org.reactivestreams.e;

public final class j1 extends a {
    static final class io.reactivex.internal.operators.flowable.j1.a extends c {
        private static final long o = -2680129890138081029L;

        io.reactivex.internal.operators.flowable.j1.a(d d0, io.reactivex.processors.c c0, e e0) {
            super(d0, c0, e0);
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            this.l.cancel();
            this.j.onComplete();
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            this.j(throwable0);
        }
    }

    final o c;

    public j1(l l0, o o0) {
        super(l0);
        this.c = o0;
    }

    @Override  // io.reactivex.l
    public void m6(d d0) {
        org.reactivestreams.c c1;
        io.reactivex.subscribers.e e0 = new io.reactivex.subscribers.e(d0);
        io.reactivex.processors.c c0 = h.V8(8).S8();
        try {
            c1 = (org.reactivestreams.c)b.g(this.c.apply(c0), "handler returned a null Publisher");
        }
        catch(Throwable throwable0) {
            io.reactivex.exceptions.b.b(throwable0);
            g.b(throwable0, d0);
            return;
        }
        io.reactivex.internal.operators.flowable.f1.b f1$b0 = new io.reactivex.internal.operators.flowable.f1.b(this.b);
        io.reactivex.internal.operators.flowable.j1.a j1$a0 = new io.reactivex.internal.operators.flowable.j1.a(e0, c0, f1$b0);
        f1$b0.d = j1$a0;
        d0.g(j1$a0);
        c1.e(f1$b0);
        f1$b0.onNext(0);
    }
}

