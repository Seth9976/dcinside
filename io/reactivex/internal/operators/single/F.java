package io.reactivex.internal.operators.single;

import io.reactivex.J;
import io.reactivex.K;
import io.reactivex.N;
import io.reactivex.Q;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.h;
import java.util.concurrent.TimeUnit;

public final class f extends K {
    final class a implements N {
        final class io.reactivex.internal.operators.single.f.a.a implements Runnable {
            private final Throwable a;
            final a b;

            io.reactivex.internal.operators.single.f.a.a(Throwable throwable0) {
                this.a = throwable0;
            }

            @Override
            public void run() {
                a.this.b.onError(this.a);
            }
        }

        final class b implements Runnable {
            private final Object a;
            final a b;

            b(Object object0) {
                this.a = object0;
            }

            @Override
            public void run() {
                a.this.b.onSuccess(this.a);
            }
        }

        private final h a;
        final N b;
        final f c;

        a(h h0, N n0) {
            this.a = h0;
            this.b = n0;
        }

        @Override  // io.reactivex.N
        public void b(c c0) {
            this.a.b(c0);
        }

        @Override  // io.reactivex.N
        public void onError(Throwable throwable0) {
            io.reactivex.internal.operators.single.f.a.a f$a$a0 = new io.reactivex.internal.operators.single.f.a.a(this, throwable0);
            this.a.b(f.this.d.g(f$a$a0, (f.this.e ? f.this.b : 0L), f.this.c));
        }

        @Override  // io.reactivex.N
        public void onSuccess(Object object0) {
            b f$a$b0 = new b(this, object0);
            c c0 = f.this.d.g(f$a$b0, f.this.b, f.this.c);
            this.a.b(c0);
        }
    }

    final Q a;
    final long b;
    final TimeUnit c;
    final J d;
    final boolean e;

    public f(Q q0, long v, TimeUnit timeUnit0, J j0, boolean z) {
        this.a = q0;
        this.b = v;
        this.c = timeUnit0;
        this.d = j0;
        this.e = z;
    }

    @Override  // io.reactivex.K
    protected void c1(N n0) {
        h h0 = new h();
        n0.b(h0);
        a f$a0 = new a(this, h0, n0);
        this.a.e(f$a0);
    }
}

