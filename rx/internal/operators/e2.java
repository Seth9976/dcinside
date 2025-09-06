package rx.internal.operators;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import rx.b;
import rx.d;
import rx.k.t;
import rx.m;
import rx.o;
import rx.plugins.c;

public final class e2 implements t {
    static final class a extends m implements d {
        final m b;
        final AtomicBoolean c;

        a(m m0) {
            this.b = m0;
            this.c = new AtomicBoolean();
        }

        @Override  // rx.d
        public void a(o o0) {
            this.c(o0);
        }

        @Override  // rx.d
        public void d() {
            this.onError(new CancellationException("Single::takeUntil(Completable) - Stream was canceled before emitting a terminal event."));
        }

        @Override  // rx.m
        public void e(Object object0) {
            if(this.c.compareAndSet(false, true)) {
                this.l();
                this.b.e(object0);
            }
        }

        @Override  // rx.m, rx.d
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
    final b b;

    public e2(t k$t0, b b0) {
        this.a = k$t0;
        this.b = b0;
    }

    public void a(m m0) {
        a e2$a0 = new a(m0);
        m0.c(e2$a0);
        this.b.q0(e2$a0);
        this.a.b(e2$a0);
    }

    @Override  // rx.functions.b
    public void b(Object object0) {
        this.a(((m)object0));
    }
}

