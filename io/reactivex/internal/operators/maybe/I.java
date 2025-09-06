package io.reactivex.internal.operators.maybe;

import f3.f;
import io.reactivex.K;
import io.reactivex.N;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import io.reactivex.v;
import io.reactivex.y;

public final class i extends K implements f {
    static final class a implements c, v {
        final N a;
        c b;

        a(N n0) {
            this.a = n0;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.b.a();
        }

        @Override  // io.reactivex.v
        public void b(c c0) {
            if(d.i(this.b, c0)) {
                this.b = c0;
                this.a.b(this);
            }
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            this.b.dispose();
            this.b = d.a;
        }

        @Override  // io.reactivex.v
        public void onComplete() {
            this.b = d.a;
            this.a.onSuccess(0L);
        }

        @Override  // io.reactivex.v
        public void onError(Throwable throwable0) {
            this.b = d.a;
            this.a.onError(throwable0);
        }

        @Override  // io.reactivex.v
        public void onSuccess(Object object0) {
            this.b = d.a;
            this.a.onSuccess(1L);
        }
    }

    final y a;

    public i(y y0) {
        this.a = y0;
    }

    @Override  // io.reactivex.K
    protected void c1(N n0) {
        a i$a0 = new a(n0);
        this.a.a(i$a0);
    }

    @Override  // f3.f
    public y source() {
        return this.a;
    }
}

