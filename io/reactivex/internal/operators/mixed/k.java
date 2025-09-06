package io.reactivex.internal.operators.mixed;

import e3.o;
import io.reactivex.disposables.c;
import io.reactivex.internal.functions.b;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.l;
import io.reactivex.q;
import io.reactivex.v;
import io.reactivex.y;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.d;
import org.reactivestreams.e;

public final class k extends l {
    static final class a extends AtomicReference implements q, v, e {
        final d a;
        final o b;
        c c;
        final AtomicLong d;
        private static final long e = 0x83D160F5B9057B50L;

        a(d d0, o o0) {
            this.a = d0;
            this.b = o0;
            this.d = new AtomicLong();
        }

        @Override  // io.reactivex.v
        public void b(c c0) {
            if(io.reactivex.internal.disposables.d.i(this.c, c0)) {
                this.c = c0;
                this.a.g(this);
            }
        }

        @Override  // org.reactivestreams.e
        public void cancel() {
            this.c.dispose();
            j.a(this);
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            j.c(this, this.d, e0);
        }

        @Override  // io.reactivex.v, org.reactivestreams.d
        public void onComplete() {
            this.a.onComplete();
        }

        @Override  // io.reactivex.v, org.reactivestreams.d
        public void onError(Throwable throwable0) {
            this.a.onError(throwable0);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            this.a.onNext(object0);
        }

        @Override  // io.reactivex.v
        public void onSuccess(Object object0) {
            org.reactivestreams.c c0;
            try {
                c0 = (org.reactivestreams.c)b.g(this.b.apply(object0), "The mapper returned a null Publisher");
            }
            catch(Throwable throwable0) {
                io.reactivex.exceptions.b.b(throwable0);
                this.a.onError(throwable0);
                return;
            }
            c0.e(this);
        }

        @Override  // org.reactivestreams.e
        public void request(long v) {
            j.b(this, this.d, v);
        }
    }

    final y b;
    final o c;

    public k(y y0, o o0) {
        this.b = y0;
        this.c = o0;
    }

    @Override  // io.reactivex.l
    protected void m6(d d0) {
        a k$a0 = new a(d0, this.c);
        this.b.a(k$a0);
    }
}

