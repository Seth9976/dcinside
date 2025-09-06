package io.reactivex.internal.operators.single;

import d3.e;
import e3.o;
import io.reactivex.A;
import io.reactivex.K;
import io.reactivex.N;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.functions.b;
import io.reactivex.s;
import io.reactivex.v;

@e
public final class k extends s {
    static final class a implements N, c {
        final v a;
        final o b;
        c c;

        a(v v0, o o0) {
            this.a = v0;
            this.b = o0;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.c.a();
        }

        @Override  // io.reactivex.N
        public void b(c c0) {
            if(d.i(this.c, c0)) {
                this.c = c0;
                this.a.b(this);
            }
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            this.c.dispose();
        }

        @Override  // io.reactivex.N
        public void onError(Throwable throwable0) {
            this.a.onError(throwable0);
        }

        @Override  // io.reactivex.N
        public void onSuccess(Object object0) {
            A a0;
            try {
                a0 = (A)b.g(this.b.apply(object0), "The selector returned a null Notification");
            }
            catch(Throwable throwable0) {
                io.reactivex.exceptions.b.b(throwable0);
                this.a.onError(throwable0);
                return;
            }
            if(a0.h()) {
                Object object1 = a0.e();
                this.a.onSuccess(object1);
                return;
            }
            if(a0.f()) {
                this.a.onComplete();
                return;
            }
            Throwable throwable1 = a0.d();
            this.a.onError(throwable1);
        }
    }

    final K a;
    final o b;

    public k(K k0, o o0) {
        this.a = k0;
        this.b = o0;
    }

    @Override  // io.reactivex.s
    protected void r1(v v0) {
        a k$a0 = new a(v0, this.b);
        this.a.e(k$a0);
    }
}

