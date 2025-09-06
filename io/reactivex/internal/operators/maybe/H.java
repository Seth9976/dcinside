package io.reactivex.internal.operators.maybe;

import f3.f;
import io.reactivex.K;
import io.reactivex.N;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.functions.b;
import io.reactivex.v;
import io.reactivex.y;

public final class h extends K implements f {
    static final class a implements c, v {
        final N a;
        final Object b;
        c c;

        a(N n0, Object object0) {
            this.a = n0;
            this.b = object0;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.c.a();
        }

        @Override  // io.reactivex.v
        public void b(c c0) {
            if(d.i(this.c, c0)) {
                this.c = c0;
                this.a.b(this);
            }
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            this.c.dispose();
            this.c = d.a;
        }

        @Override  // io.reactivex.v
        public void onComplete() {
            this.c = d.a;
            this.a.onSuccess(Boolean.FALSE);
        }

        @Override  // io.reactivex.v
        public void onError(Throwable throwable0) {
            this.c = d.a;
            this.a.onError(throwable0);
        }

        @Override  // io.reactivex.v
        public void onSuccess(Object object0) {
            this.c = d.a;
            Boolean boolean0 = Boolean.valueOf(b.c(object0, this.b));
            this.a.onSuccess(boolean0);
        }
    }

    final y a;
    final Object b;

    public h(y y0, Object object0) {
        this.a = y0;
        this.b = object0;
    }

    @Override  // io.reactivex.K
    protected void c1(N n0) {
        a h$a0 = new a(n0, this.b);
        this.a.a(h$a0);
    }

    @Override  // f3.f
    public y source() {
        return this.a;
    }
}

