package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.f;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.l;
import io.reactivex.q;
import java.util.NoSuchElementException;
import org.reactivestreams.d;
import org.reactivestreams.e;

public final class s1 extends a {
    static final class io.reactivex.internal.operators.flowable.s1.a extends f implements q {
        final Object m;
        final boolean n;
        e o;
        boolean p;
        private static final long q = 0xB34F876BA0FE37DFL;

        io.reactivex.internal.operators.flowable.s1.a(d d0, Object object0, boolean z) {
            super(d0);
            this.m = object0;
            this.n = z;
        }

        @Override  // io.reactivex.internal.subscriptions.f
        public void cancel() {
            super.cancel();
            this.o.cancel();
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            if(j.k(this.o, e0)) {
                this.o = e0;
                this.b.g(this);
                e0.request(0x7FFFFFFFFFFFFFFFL);
            }
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            if(this.p) {
                return;
            }
            this.p = true;
            Object object0 = this.c;
            this.c = null;
            if(object0 == null) {
                object0 = this.m;
            }
            if(object0 == null) {
                if(this.n) {
                    NoSuchElementException noSuchElementException0 = new NoSuchElementException();
                    this.b.onError(noSuchElementException0);
                    return;
                }
                this.b.onComplete();
                return;
            }
            this.a(object0);
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            if(this.p) {
                io.reactivex.plugins.a.Y(throwable0);
                return;
            }
            this.p = true;
            this.b.onError(throwable0);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            if(this.p) {
                return;
            }
            if(this.c != null) {
                this.p = true;
                this.o.cancel();
                IllegalArgumentException illegalArgumentException0 = new IllegalArgumentException("Sequence contains more than one element!");
                this.b.onError(illegalArgumentException0);
                return;
            }
            this.c = object0;
        }
    }

    final Object c;
    final boolean d;

    public s1(l l0, Object object0, boolean z) {
        super(l0);
        this.c = object0;
        this.d = z;
    }

    @Override  // io.reactivex.l
    protected void m6(d d0) {
        io.reactivex.internal.operators.flowable.s1.a s1$a0 = new io.reactivex.internal.operators.flowable.s1.a(d0, this.c, this.d);
        this.b.l6(s1$a0);
    }
}

