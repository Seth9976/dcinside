package io.reactivex.internal.operators.flowable;

import io.reactivex.K;
import io.reactivex.N;
import io.reactivex.disposables.c;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.q;
import java.util.NoSuchElementException;
import org.reactivestreams.e;

public final class z0 extends K {
    static final class a implements c, q {
        final N a;
        final Object b;
        e c;
        Object d;

        a(N n0, Object object0) {
            this.a = n0;
            this.b = object0;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.c == j.a;
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            this.c.cancel();
            this.c = j.a;
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            if(j.k(this.c, e0)) {
                this.c = e0;
                this.a.b(this);
                e0.request(0x7FFFFFFFFFFFFFFFL);
            }
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            this.c = j.a;
            Object object0 = this.d;
            if(object0 != null) {
                this.d = null;
                this.a.onSuccess(object0);
                return;
            }
            Object object1 = this.b;
            if(object1 != null) {
                this.a.onSuccess(object1);
                return;
            }
            NoSuchElementException noSuchElementException0 = new NoSuchElementException();
            this.a.onError(noSuchElementException0);
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            this.c = j.a;
            this.d = null;
            this.a.onError(throwable0);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            this.d = object0;
        }
    }

    final org.reactivestreams.c a;
    final Object b;

    public z0(org.reactivestreams.c c0, Object object0) {
        this.a = c0;
        this.b = object0;
    }

    @Override  // io.reactivex.K
    protected void c1(N n0) {
        a z0$a0 = new a(n0, this.b);
        this.a.e(z0$a0);
    }
}

