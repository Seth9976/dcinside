package rx.internal.operators;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import rx.g;
import rx.k.t;
import rx.m;
import rx.n;
import rx.plugins.c;

public final class f2 implements t {
    static final class a extends m {
        final class rx.internal.operators.f2.a.a extends n {
            final a f;

            @Override  // rx.h
            public void d() {
                this.onError(new CancellationException("Single::takeUntil(Observable) - Stream was canceled before emitting a terminal event."));
            }

            @Override  // rx.h
            public void onError(Throwable throwable0) {
                a.this.onError(throwable0);
            }

            @Override  // rx.h
            public void onNext(Object object0) {
                this.d();
            }
        }

        final m b;
        final AtomicBoolean c;
        final n d;

        a(m m0) {
            this.b = m0;
            this.c = new AtomicBoolean();
            rx.internal.operators.f2.a.a f2$a$a0 = new rx.internal.operators.f2.a.a(this);
            this.d = f2$a$a0;
            this.c(f2$a$a0);
        }

        @Override  // rx.m
        public void e(Object object0) {
            if(this.c.compareAndSet(false, true)) {
                this.l();
                this.b.e(object0);
            }
        }

        @Override  // rx.m
        public void onError(Throwable throwable0) {
            if(this.c.compareAndSet(false, true)) {
                this.l();
                this.b.onError(throwable0);
                return;
            }
            c.I(throwable0);
        }
    }

    final t a;
    final g b;

    public f2(t k$t0, g g0) {
        this.a = k$t0;
        this.b = g0;
    }

    public void a(m m0) {
        a f2$a0 = new a(m0);
        m0.c(f2$a0);
        this.b.v5(f2$a0.d);
        this.a.b(f2$a0);
    }

    @Override  // rx.functions.b
    public void b(Object object0) {
        this.a(((m)object0));
    }
}

