package io.reactivex.internal.operators.flowable;

import e3.r;
import io.reactivex.exceptions.b;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.l;
import io.reactivex.q;
import org.reactivestreams.d;
import org.reactivestreams.e;

public final class z1 extends a {
    static final class io.reactivex.internal.operators.flowable.z1.a implements q, e {
        final d a;
        final r b;
        e c;
        boolean d;

        io.reactivex.internal.operators.flowable.z1.a(d d0, r r0) {
            this.a = d0;
            this.b = r0;
        }

        @Override  // org.reactivestreams.e
        public void cancel() {
            this.c.cancel();
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            if(j.k(this.c, e0)) {
                this.c = e0;
                this.a.g(this);
            }
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            this.a.onComplete();
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            this.a.onError(throwable0);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            if(this.d) {
                this.a.onNext(object0);
                return;
            }
            try {
                if(this.b.test(object0)) {
                    goto label_10;
                }
                goto label_12;
            }
            catch(Throwable throwable0) {
                b.b(throwable0);
                this.c.cancel();
                this.a.onError(throwable0);
                return;
            }
        label_10:
            this.c.request(1L);
            return;
        label_12:
            this.d = true;
            this.a.onNext(object0);
        }

        @Override  // org.reactivestreams.e
        public void request(long v) {
            this.c.request(v);
        }
    }

    final r c;

    public z1(l l0, r r0) {
        super(l0);
        this.c = r0;
    }

    @Override  // io.reactivex.l
    protected void m6(d d0) {
        io.reactivex.internal.operators.flowable.z1.a z1$a0 = new io.reactivex.internal.operators.flowable.z1.a(d0, this.c);
        this.b.l6(z1$a0);
    }
}

