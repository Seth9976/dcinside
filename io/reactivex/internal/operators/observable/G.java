package io.reactivex.internal.operators.observable;

import e3.r;
import f3.d;
import io.reactivex.B;
import io.reactivex.G;
import io.reactivex.I;
import io.reactivex.K;
import io.reactivex.N;
import io.reactivex.disposables.c;
import io.reactivex.exceptions.b;

public final class g extends K implements d {
    static final class a implements I, c {
        final N a;
        final r b;
        c c;
        boolean d;

        a(N n0, r r0) {
            this.a = n0;
            this.b = r0;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.c.a();
        }

        @Override  // io.reactivex.I
        public void b(c c0) {
            if(io.reactivex.internal.disposables.d.i(this.c, c0)) {
                this.c = c0;
                this.a.b(this);
            }
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            this.c.dispose();
        }

        @Override  // io.reactivex.I
        public void onComplete() {
            if(this.d) {
                return;
            }
            this.d = true;
            this.a.onSuccess(Boolean.TRUE);
        }

        @Override  // io.reactivex.I
        public void onError(Throwable throwable0) {
            if(this.d) {
                io.reactivex.plugins.a.Y(throwable0);
                return;
            }
            this.d = true;
            this.a.onError(throwable0);
        }

        @Override  // io.reactivex.I
        public void onNext(Object object0) {
            if(this.d) {
                return;
            }
            try {
                if(!this.b.test(object0)) {
                    goto label_9;
                }
            }
            catch(Throwable throwable0) {
                b.b(throwable0);
                this.c.dispose();
                this.onError(throwable0);
            }
            return;
        label_9:
            this.d = true;
            this.c.dispose();
            this.a.onSuccess(Boolean.FALSE);
        }
    }

    final G a;
    final r b;

    public g(G g0, r r0) {
        this.a = g0;
        this.b = r0;
    }

    @Override  // f3.d
    public B c() {
        return io.reactivex.plugins.a.R(new f(this.a, this.b));
    }

    @Override  // io.reactivex.K
    protected void c1(N n0) {
        a g$a0 = new a(n0, this.b);
        this.a.d(g$a0);
    }
}

