package io.reactivex.internal.operators.flowable;

import e3.c;
import io.reactivex.exceptions.b;
import io.reactivex.internal.subscriptions.g;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.l;
import io.reactivex.q;
import java.util.Iterator;
import org.reactivestreams.d;
import org.reactivestreams.e;

public final class d2 extends a {
    static final class io.reactivex.internal.operators.flowable.d2.a implements q, e {
        final d a;
        final Iterator b;
        final c c;
        e d;
        boolean e;

        io.reactivex.internal.operators.flowable.d2.a(d d0, Iterator iterator0, c c0) {
            this.a = d0;
            this.b = iterator0;
            this.c = c0;
        }

        void a(Throwable throwable0) {
            b.b(throwable0);
            this.e = true;
            this.d.cancel();
            this.a.onError(throwable0);
        }

        @Override  // org.reactivestreams.e
        public void cancel() {
            this.d.cancel();
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            if(j.k(this.d, e0)) {
                this.d = e0;
                this.a.g(this);
            }
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            if(this.e) {
                return;
            }
            this.e = true;
            this.a.onComplete();
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            if(this.e) {
                io.reactivex.plugins.a.Y(throwable0);
                return;
            }
            this.e = true;
            this.a.onError(throwable0);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            Object object3;
            Object object2;
            if(this.e) {
                return;
            }
            try {
                Object object1 = this.b.next();
                object2 = io.reactivex.internal.functions.b.g(object1, "The iterator returned a null value");
            }
            catch(Throwable throwable0) {
                this.a(throwable0);
                return;
            }
            try {
                object3 = io.reactivex.internal.functions.b.g(this.c.apply(object0, object2), "The zipper function returned a null value");
            }
            catch(Throwable throwable1) {
                this.a(throwable1);
                return;
            }
            this.a.onNext(object3);
            try {
                if(!this.b.hasNext()) {
                    goto label_19;
                }
            }
            catch(Throwable throwable2) {
                this.a(throwable2);
            }
            return;
        label_19:
            this.e = true;
            this.d.cancel();
            this.a.onComplete();
        }

        @Override  // org.reactivestreams.e
        public void request(long v) {
            this.d.request(v);
        }
    }

    final Iterable c;
    final c d;

    public d2(l l0, Iterable iterable0, c c0) {
        super(l0);
        this.c = iterable0;
        this.d = c0;
    }

    @Override  // io.reactivex.l
    public void m6(d d0) {
        Iterator iterator0;
        try {
            iterator0 = (Iterator)io.reactivex.internal.functions.b.g(this.c.iterator(), "The iterator returned by other is null");
        }
        catch(Throwable throwable0) {
            b.b(throwable0);
            g.b(throwable0, d0);
            return;
        }
        try {
            if(!iterator0.hasNext()) {
                goto label_12;
            }
            goto label_14;
        }
        catch(Throwable throwable1) {
            b.b(throwable1);
            g.b(throwable1, d0);
            return;
        }
    label_12:
        g.a(d0);
        return;
    label_14:
        io.reactivex.internal.operators.flowable.d2.a d2$a0 = new io.reactivex.internal.operators.flowable.d2.a(d0, iterator0, this.d);
        this.b.l6(d2$a0);
    }
}

