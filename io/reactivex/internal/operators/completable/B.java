package io.reactivex.internal.operators.completable;

import io.reactivex.c;
import io.reactivex.f;
import io.reactivex.i;
import io.reactivex.internal.disposables.d;
import java.util.concurrent.atomic.AtomicReference;

public final class b extends c {
    static final class a implements f {
        final AtomicReference a;
        final f b;

        a(AtomicReference atomicReference0, f f0) {
            this.a = atomicReference0;
            this.b = f0;
        }

        @Override  // io.reactivex.f
        public void b(io.reactivex.disposables.c c0) {
            d.d(this.a, c0);
        }

        @Override  // io.reactivex.f
        public void onComplete() {
            this.b.onComplete();
        }

        @Override  // io.reactivex.f
        public void onError(Throwable throwable0) {
            this.b.onError(throwable0);
        }
    }

    static final class io.reactivex.internal.operators.completable.b.b extends AtomicReference implements io.reactivex.disposables.c, f {
        final f a;
        final i b;
        private static final long c = -4101678820158072998L;

        io.reactivex.internal.operators.completable.b.b(f f0, i i0) {
            this.a = f0;
            this.b = i0;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return d.c(((io.reactivex.disposables.c)this.get()));
        }

        @Override  // io.reactivex.f
        public void b(io.reactivex.disposables.c c0) {
            if(d.g(this, c0)) {
                this.a.b(this);
            }
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            d.b(this);
        }

        @Override  // io.reactivex.f
        public void onComplete() {
            a b$a0 = new a(this, this.a);
            this.b.e(b$a0);
        }

        @Override  // io.reactivex.f
        public void onError(Throwable throwable0) {
            this.a.onError(throwable0);
        }
    }

    final i a;
    final i b;

    public b(i i0, i i1) {
        this.a = i0;
        this.b = i1;
    }

    @Override  // io.reactivex.c
    protected void J0(f f0) {
        io.reactivex.internal.operators.completable.b.b b$b0 = new io.reactivex.internal.operators.completable.b.b(f0, this.b);
        this.a.e(b$b0);
    }
}

