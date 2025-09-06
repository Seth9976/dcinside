package io.reactivex.internal.operators.maybe;

import e3.r;
import io.reactivex.N;
import io.reactivex.Q;
import io.reactivex.disposables.c;
import io.reactivex.exceptions.b;
import io.reactivex.internal.disposables.d;
import io.reactivex.s;
import io.reactivex.v;

public final class z extends s {
    static final class a implements N, c {
        final v a;
        final r b;
        c c;

        a(v v0, r r0) {
            this.a = v0;
            this.b = r0;
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
            c c0 = this.c;
            this.c = d.a;
            c0.dispose();
        }

        @Override  // io.reactivex.N
        public void onError(Throwable throwable0) {
            this.a.onError(throwable0);
        }

        @Override  // io.reactivex.N
        public void onSuccess(Object object0) {
            try {
                if(this.b.test(object0)) {
                    goto label_6;
                }
                goto label_8;
            }
            catch(Throwable throwable0) {
                b.b(throwable0);
                this.a.onError(throwable0);
                return;
            }
        label_6:
            this.a.onSuccess(object0);
            return;
        label_8:
            this.a.onComplete();
        }
    }

    final Q a;
    final r b;

    public z(Q q0, r r0) {
        this.a = q0;
        this.b = r0;
    }

    @Override  // io.reactivex.s
    protected void r1(v v0) {
        a z$a0 = new a(v0, this.b);
        this.a.e(z$a0);
    }
}

