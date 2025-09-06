package io.reactivex.internal.operators.completable;

import io.reactivex.J;
import io.reactivex.c;
import io.reactivex.f;
import io.reactivex.internal.disposables.d;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class i extends c {
    static final class a extends AtomicReference implements io.reactivex.disposables.c, f, Runnable {
        final f a;
        final long b;
        final TimeUnit c;
        final J d;
        final boolean e;
        Throwable f;
        private static final long g = 465972761105851022L;

        a(f f0, long v, TimeUnit timeUnit0, J j0, boolean z) {
            this.a = f0;
            this.b = v;
            this.c = timeUnit0;
            this.d = j0;
            this.e = z;
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
            d.d(this, this.d.g(this, this.b, this.c));
        }

        @Override  // io.reactivex.f
        public void onError(Throwable throwable0) {
            this.f = throwable0;
            d.d(this, this.d.g(this, (this.e ? this.b : 0L), this.c));
        }

        @Override
        public void run() {
            Throwable throwable0 = this.f;
            this.f = null;
            if(throwable0 != null) {
                this.a.onError(throwable0);
                return;
            }
            this.a.onComplete();
        }
    }

    final io.reactivex.i a;
    final long b;
    final TimeUnit c;
    final J d;
    final boolean e;

    public i(io.reactivex.i i0, long v, TimeUnit timeUnit0, J j0, boolean z) {
        this.a = i0;
        this.b = v;
        this.c = timeUnit0;
        this.d = j0;
        this.e = z;
    }

    @Override  // io.reactivex.c
    protected void J0(f f0) {
        a i$a0 = new a(f0, this.b, this.c, this.d, this.e);
        this.a.e(i$a0);
    }
}

