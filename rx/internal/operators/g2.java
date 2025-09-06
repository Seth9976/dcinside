package rx.internal.operators;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import rx.k.t;
import rx.k;
import rx.m;
import rx.plugins.c;

public final class g2 implements t {
    static final class a extends m {
        final class rx.internal.operators.g2.a.a extends m {
            final a b;

            @Override  // rx.m
            public void e(Object object0) {
                this.onError(new CancellationException("Single::takeUntil(Single) - Stream was canceled before emitting a terminal event."));
            }

            @Override  // rx.m
            public void onError(Throwable throwable0) {
                a.this.onError(throwable0);
            }
        }

        final m b;
        final AtomicBoolean c;
        final m d;

        a(m m0) {
            this.b = m0;
            this.c = new AtomicBoolean();
            rx.internal.operators.g2.a.a g2$a$a0 = new rx.internal.operators.g2.a.a(this);
            this.d = g2$a$a0;
            this.c(g2$a$a0);
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
    final k b;

    public g2(t k$t0, k k0) {
        this.a = k$t0;
        this.b = k0;
    }

    public void a(m m0) {
        a g2$a0 = new a(m0);
        m0.c(g2$a0);
        this.b.j0(g2$a0.d);
        this.a.b(g2$a0);
    }

    @Override  // rx.functions.b
    public void b(Object object0) {
        this.a(((m)object0));
    }
}

