package io.reactivex.internal.operators.maybe;

import f3.f;
import io.reactivex.K;
import io.reactivex.N;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import io.reactivex.v;
import io.reactivex.y;
import java.util.NoSuchElementException;

public final class q0 extends K implements f {
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
            Object object0 = this.b;
            if(object0 != null) {
                this.a.onSuccess(object0);
                return;
            }
            NoSuchElementException noSuchElementException0 = new NoSuchElementException("The MaybeSource is empty");
            this.a.onError(noSuchElementException0);
        }

        @Override  // io.reactivex.v
        public void onError(Throwable throwable0) {
            this.c = d.a;
            this.a.onError(throwable0);
        }

        @Override  // io.reactivex.v
        public void onSuccess(Object object0) {
            this.c = d.a;
            this.a.onSuccess(object0);
        }
    }

    final y a;
    final Object b;

    public q0(y y0, Object object0) {
        this.a = y0;
        this.b = object0;
    }

    @Override  // io.reactivex.K
    protected void c1(N n0) {
        a q0$a0 = new a(n0, this.b);
        this.a.a(q0$a0);
    }

    @Override  // f3.f
    public y source() {
        return this.a;
    }
}

