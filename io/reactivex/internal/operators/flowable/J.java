package io.reactivex.internal.operators.flowable;

import e3.r;
import f3.b;
import io.reactivex.K;
import io.reactivex.N;
import io.reactivex.disposables.c;
import io.reactivex.l;
import io.reactivex.q;
import org.reactivestreams.e;

public final class j extends K implements b {
    static final class a implements c, q {
        final N a;
        final r b;
        e c;
        boolean d;

        a(N n0, r r0) {
            this.a = n0;
            this.b = r0;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.c == io.reactivex.internal.subscriptions.j.a;
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            this.c.cancel();
            this.c = io.reactivex.internal.subscriptions.j.a;
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            if(io.reactivex.internal.subscriptions.j.k(this.c, e0)) {
                this.c = e0;
                this.a.b(this);
                e0.request(0x7FFFFFFFFFFFFFFFL);
            }
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            if(!this.d) {
                this.d = true;
                this.c = io.reactivex.internal.subscriptions.j.a;
                this.a.onSuccess(Boolean.FALSE);
            }
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            if(this.d) {
                io.reactivex.plugins.a.Y(throwable0);
                return;
            }
            this.d = true;
            this.c = io.reactivex.internal.subscriptions.j.a;
            this.a.onError(throwable0);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            if(this.d) {
                return;
            }
            try {
                if(this.b.test(object0)) {
                    goto label_10;
                }
            }
            catch(Throwable throwable0) {
                io.reactivex.exceptions.b.b(throwable0);
                this.c.cancel();
                this.c = io.reactivex.internal.subscriptions.j.a;
                this.onError(throwable0);
            }
            return;
        label_10:
            this.d = true;
            this.c.cancel();
            this.c = io.reactivex.internal.subscriptions.j.a;
            this.a.onSuccess(Boolean.TRUE);
        }
    }

    final l a;
    final r b;

    public j(l l0, r r0) {
        this.a = l0;
        this.b = r0;
    }

    @Override  // io.reactivex.K
    protected void c1(N n0) {
        a j$a0 = new a(n0, this.b);
        this.a.l6(j$a0);
    }

    @Override  // f3.b
    public l d() {
        return io.reactivex.plugins.a.P(new i(this.a, this.b));
    }
}

