package io.reactivex.internal.operators.mixed;

import io.reactivex.f;
import io.reactivex.i;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.l;
import io.reactivex.q;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.c;
import org.reactivestreams.d;
import org.reactivestreams.e;

public final class b extends l {
    static final class a extends AtomicReference implements f, q, e {
        final d a;
        c b;
        io.reactivex.disposables.c c;
        final AtomicLong d;
        private static final long e = 0x83D160F5B9057B50L;

        a(d d0, c c0) {
            this.a = d0;
            this.b = c0;
            this.d = new AtomicLong();
        }

        @Override  // io.reactivex.f
        public void b(io.reactivex.disposables.c c0) {
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

        @Override  // io.reactivex.f, org.reactivestreams.d
        public void onComplete() {
            c c0 = this.b;
            if(c0 == null) {
                this.a.onComplete();
                return;
            }
            this.b = null;
            c0.e(this);
        }

        @Override  // io.reactivex.f, org.reactivestreams.d
        public void onError(Throwable throwable0) {
            this.a.onError(throwable0);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            this.a.onNext(object0);
        }

        @Override  // org.reactivestreams.e
        public void request(long v) {
            j.b(this, this.d, v);
        }
    }

    final i b;
    final c c;

    public b(i i0, c c0) {
        this.b = i0;
        this.c = c0;
    }

    @Override  // io.reactivex.l
    protected void m6(d d0) {
        a b$a0 = new a(d0, this.c);
        this.b.e(b$a0);
    }
}

