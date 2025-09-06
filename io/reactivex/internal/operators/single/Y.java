package io.reactivex.internal.operators.single;

import e3.o;
import io.reactivex.N;
import io.reactivex.Q;
import io.reactivex.c;
import io.reactivex.f;
import io.reactivex.i;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.functions.b;
import java.util.concurrent.atomic.AtomicReference;

public final class y extends c {
    static final class a extends AtomicReference implements N, io.reactivex.disposables.c, f {
        final f a;
        final o b;
        private static final long c = 0xE1C948C7933B35BBL;

        a(f f0, o o0) {
            this.a = f0;
            this.b = o0;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return d.c(((io.reactivex.disposables.c)this.get()));
        }

        @Override  // io.reactivex.N, io.reactivex.f
        public void b(io.reactivex.disposables.c c0) {
            d.d(this, c0);
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            d.b(this);
        }

        @Override  // io.reactivex.f
        public void onComplete() {
            this.a.onComplete();
        }

        @Override  // io.reactivex.N, io.reactivex.f
        public void onError(Throwable throwable0) {
            this.a.onError(throwable0);
        }

        @Override  // io.reactivex.N
        public void onSuccess(Object object0) {
            i i0;
            try {
                i0 = (i)b.g(this.b.apply(object0), "The mapper returned a null CompletableSource");
            }
            catch(Throwable throwable0) {
                io.reactivex.exceptions.b.b(throwable0);
                this.onError(throwable0);
                return;
            }
            if(!this.a()) {
                i0.e(this);
            }
        }
    }

    final Q a;
    final o b;

    public y(Q q0, o o0) {
        this.a = q0;
        this.b = o0;
    }

    @Override  // io.reactivex.c
    protected void J0(f f0) {
        a y$a0 = new a(f0, this.b);
        f0.b(y$a0);
        this.a.e(y$a0);
    }
}

