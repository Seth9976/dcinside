package io.reactivex.internal.operators.flowable;

import e3.r;
import io.reactivex.exceptions.b;
import io.reactivex.internal.subscriptions.i;
import io.reactivex.l;
import io.reactivex.q;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.c;
import org.reactivestreams.d;
import org.reactivestreams.e;

public final class i1 extends a {
    static final class io.reactivex.internal.operators.flowable.i1.a extends AtomicInteger implements q {
        final d a;
        final i b;
        final c c;
        final r d;
        long e;
        long f;
        private static final long g = 0x9D7D8E56979D0010L;

        io.reactivex.internal.operators.flowable.i1.a(d d0, long v, r r0, i i0, c c0) {
            this.a = d0;
            this.b = i0;
            this.c = c0;
            this.d = r0;
            this.e = v;
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
            long v = this.e;
            if(v != 0x7FFFFFFFFFFFFFFFL) {
                this.e = v - 1L;
            }
            if(v == 0L) {
                this.a.onError(throwable0);
                return;
            }
            try {
                if(!this.d.test(throwable0)) {
                    goto label_13;
                }
                goto label_15;
            }
            catch(Throwable throwable1) {
                b.b(throwable1);
                io.reactivex.exceptions.a a0 = new io.reactivex.exceptions.a(new Throwable[]{throwable0, throwable1});
                this.a.onError(a0);
                return;
            }
        label_13:
            this.a.onError(throwable0);
            return;
        label_15:
            this.a();
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            ++this.f;
            this.a.onNext(object0);
        }
    }

    final r c;
    final long d;

    public i1(l l0, long v, r r0) {
        super(l0);
        this.c = r0;
        this.d = v;
    }

    @Override  // io.reactivex.l
    public void m6(d d0) {
        i i0 = new i(false);
        d0.g(i0);
        new io.reactivex.internal.operators.flowable.i1.a(d0, this.d, this.c, i0, this.b).a();
    }
}

