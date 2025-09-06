package io.reactivex.internal.operators.flowable;

import f3.b;
import io.reactivex.disposables.c;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.l;
import io.reactivex.q;
import io.reactivex.s;
import io.reactivex.v;
import org.reactivestreams.e;

public final class t1 extends s implements b {
    static final class a implements c, q {
        final v a;
        e b;
        boolean c;
        Object d;

        a(v v0) {
            this.a = v0;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.b == j.a;
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            this.b.cancel();
            this.b = j.a;
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            if(j.k(this.b, e0)) {
                this.b = e0;
                this.a.b(this);
                e0.request(0x7FFFFFFFFFFFFFFFL);
            }
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            if(this.c) {
                return;
            }
            this.c = true;
            this.b = j.a;
            Object object0 = this.d;
            this.d = null;
            if(object0 == null) {
                this.a.onComplete();
                return;
            }
            this.a.onSuccess(object0);
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            if(this.c) {
                io.reactivex.plugins.a.Y(throwable0);
                return;
            }
            this.c = true;
            this.b = j.a;
            this.a.onError(throwable0);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            if(this.c) {
                return;
            }
            if(this.d != null) {
                this.c = true;
                this.b.cancel();
                this.b = j.a;
                IllegalArgumentException illegalArgumentException0 = new IllegalArgumentException("Sequence contains more than one element!");
                this.a.onError(illegalArgumentException0);
                return;
            }
            this.d = object0;
        }
    }

    final l a;

    public t1(l l0) {
        this.a = l0;
    }

    @Override  // f3.b
    public l d() {
        return io.reactivex.plugins.a.P(new s1(this.a, null, false));
    }

    @Override  // io.reactivex.s
    protected void r1(v v0) {
        a t1$a0 = new a(v0);
        this.a.l6(t1$a0);
    }
}

