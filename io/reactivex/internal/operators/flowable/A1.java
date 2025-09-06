package io.reactivex.internal.operators.flowable;

import io.reactivex.K;
import io.reactivex.N;
import io.reactivex.disposables.c;
import io.reactivex.internal.functions.b;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.q;
import org.reactivestreams.e;

public final class a1 extends K {
    static final class a implements c, q {
        final N a;
        final e3.c b;
        Object c;
        e d;

        a(N n0, e3.c c0, Object object0) {
            this.a = n0;
            this.c = object0;
            this.b = c0;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.d == j.a;
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            this.d.cancel();
            this.d = j.a;
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            if(j.k(this.d, e0)) {
                this.d = e0;
                this.a.b(this);
                e0.request(0x7FFFFFFFFFFFFFFFL);
            }
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            Object object0 = this.c;
            if(object0 != null) {
                this.c = null;
                this.d = j.a;
                this.a.onSuccess(object0);
            }
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            if(this.c != null) {
                this.c = null;
                this.d = j.a;
                this.a.onError(throwable0);
                return;
            }
            io.reactivex.plugins.a.Y(throwable0);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            Object object1 = this.c;
            if(object1 != null) {
                try {
                    this.c = b.g(this.b.apply(object1, object0), "The reducer returned a null value");
                }
                catch(Throwable throwable0) {
                    io.reactivex.exceptions.b.b(throwable0);
                    this.d.cancel();
                    this.onError(throwable0);
                }
            }
        }
    }

    final org.reactivestreams.c a;
    final Object b;
    final e3.c c;

    public a1(org.reactivestreams.c c0, Object object0, e3.c c1) {
        this.a = c0;
        this.b = object0;
        this.c = c1;
    }

    @Override  // io.reactivex.K
    protected void c1(N n0) {
        a a1$a0 = new a(n0, this.c, this.b);
        this.a.e(a1$a0);
    }
}

