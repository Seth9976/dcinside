package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.i;
import io.reactivex.l;
import io.reactivex.q;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.c;
import org.reactivestreams.d;
import org.reactivestreams.e;

public final class d1 extends a {
    static final class io.reactivex.internal.operators.flowable.d1.a extends AtomicInteger implements q {
        final d a;
        final i b;
        final c c;
        long d;
        long e;
        private static final long f = 0x9D7D8E56979D0010L;

        io.reactivex.internal.operators.flowable.d1.a(d d0, long v, i i0, c c0) {
            this.a = d0;
            this.b = i0;
            this.c = c0;
            this.d = v;
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
        public void g(e e0) {
            this.b.i(e0);
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            long v = this.d;
            if(v != 0x7FFFFFFFFFFFFFFFL) {
                this.d = v - 1L;
            }
            if(v != 0L) {
                this.a();
                return;
            }
            this.a.onComplete();
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

    final long c;

    public d1(l l0, long v) {
        super(l0);
        this.c = v;
    }

    @Override  // io.reactivex.l
    public void m6(d d0) {
        i i0 = new i(false);
        d0.g(i0);
        new io.reactivex.internal.operators.flowable.d1.a(d0, (this.c == 0x7FFFFFFFFFFFFFFFL ? 0x7FFFFFFFFFFFFFFFL : this.c - 1L), i0, this.b).a();
    }
}

