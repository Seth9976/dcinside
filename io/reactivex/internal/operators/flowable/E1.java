package io.reactivex.internal.operators.flowable;

import e3.e;
import io.reactivex.exceptions.b;
import io.reactivex.internal.subscriptions.i;
import io.reactivex.l;
import io.reactivex.q;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.c;
import org.reactivestreams.d;

public final class e1 extends a {
    static final class io.reactivex.internal.operators.flowable.e1.a extends AtomicInteger implements q {
        final d a;
        final i b;
        final c c;
        final e d;
        long e;
        private static final long f = 0x9D7D8E56979D0010L;

        io.reactivex.internal.operators.flowable.e1.a(d d0, e e0, i i0, c c0) {
            this.a = d0;
            this.b = i0;
            this.c = c0;
            this.d = e0;
        }

        void a() {
            if(this.getAndIncrement() == 0) {
                int v = 1;
                while(true) {
                    if(this.b.e()) {
                        return;
                    }
                    long v1 = this.e;
                    if(v1 != 0L) {
                        this.e = 0L;
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
        public void g(org.reactivestreams.e e0) {
            this.b.i(e0);
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            try {
                if(this.d.a()) {
                    goto label_6;
                }
                goto label_8;
            }
            catch(Throwable throwable0) {
                b.b(throwable0);
                this.a.onError(throwable0);
                return;
            }
        label_6:
            this.a.onComplete();
            return;
        label_8:
            this.a();
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            this.a.onError(throwable0);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            ++this.e;
            this.a.onNext(object0);
        }
    }

    final e c;

    public e1(l l0, e e0) {
        super(l0);
        this.c = e0;
    }

    @Override  // io.reactivex.l
    public void m6(d d0) {
        i i0 = new i(false);
        d0.g(i0);
        new io.reactivex.internal.operators.flowable.e1.a(d0, this.c, i0, this.b).a();
    }
}

