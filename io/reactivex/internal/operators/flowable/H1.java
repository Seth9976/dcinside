package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.b;
import io.reactivex.internal.subscriptions.i;
import io.reactivex.l;
import io.reactivex.q;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.c;
import org.reactivestreams.d;
import org.reactivestreams.e;

public final class h1 extends a {
    static final class io.reactivex.internal.operators.flowable.h1.a extends AtomicInteger implements q {
        final d a;
        final i b;
        final c c;
        final e3.d d;
        int e;
        long f;
        private static final long g = 0x9D7D8E56979D0010L;

        io.reactivex.internal.operators.flowable.h1.a(d d0, e3.d d1, i i0, c c0) {
            this.a = d0;
            this.b = i0;
            this.c = c0;
            this.d = d1;
        }

        void a() {
            if(this.getAndIncrement() == 0) {
                int v = 1;
                while(true) {
                    if(this.b.e()) {
                        return;
                    }
                    long v1 = this.f;
                    if(v1 != 0L) {
                        this.f = 0L;
                        this.b.h(v1);
                    }
                    this.c.e(this);
                    v = this.addAndGet(-v);
                    if(v == 0) {
                        break;
                    }
                }
            }
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            this.b.i(e0);
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            this.a.onComplete();
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            try {
                int v = this.e + 1;
                this.e = v;
                if(!this.d.a(v, throwable0)) {
                    goto label_9;
                }
                goto label_11;
            }
            catch(Throwable throwable1) {
                b.b(throwable1);
                io.reactivex.exceptions.a a0 = new io.reactivex.exceptions.a(new Throwable[]{throwable0, throwable1});
                this.a.onError(a0);
                return;
            }
        label_9:
            this.a.onError(throwable0);
            return;
        label_11:
            this.a();
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            ++this.f;
            this.a.onNext(object0);
        }
    }

    final e3.d c;

    public h1(l l0, e3.d d0) {
        super(l0);
        this.c = d0;
    }

    @Override  // io.reactivex.l
    public void m6(d d0) {
        i i0 = new i(false);
        d0.g(i0);
        new io.reactivex.internal.operators.flowable.h1.a(d0, this.c, i0, this.b).a();
    }
}

