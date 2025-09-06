package rx.internal.operators;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import rx.j;
import rx.k.t;
import rx.m;
import rx.plugins.c;

public final class h2 implements t {
    static final class a extends m implements rx.functions.a {
        static final class rx.internal.operators.h2.a.a extends m {
            final m b;

            rx.internal.operators.h2.a.a(m m0) {
                this.b = m0;
            }

            @Override  // rx.m
            public void e(Object object0) {
                this.b.e(object0);
            }

            @Override  // rx.m
            public void onError(Throwable throwable0) {
                this.b.onError(throwable0);
            }
        }

        final m b;
        final AtomicBoolean c;
        final t d;

        a(m m0, t k$t0) {
            this.b = m0;
            this.d = k$t0;
            this.c = new AtomicBoolean();
        }

        @Override  // rx.functions.a
        public void call() {
            if(this.c.compareAndSet(false, true)) {
                try {
                    t k$t0 = this.d;
                    if(k$t0 == null) {
                        TimeoutException timeoutException0 = new TimeoutException();
                        this.b.onError(timeoutException0);
                    }
                    else {
                        rx.internal.operators.h2.a.a h2$a$a0 = new rx.internal.operators.h2.a.a(this.b);
                        this.b.c(h2$a$a0);
                        k$t0.b(h2$a$a0);
                    }
                }
                finally {
                    this.l();
                }
            }
        }

        @Override  // rx.m
        public void e(Object object0) {
            if(this.c.compareAndSet(false, true)) {
                try {
                    this.b.e(object0);
                }
                finally {
                    this.l();
                }
            }
        }

        @Override  // rx.m
        public void onError(Throwable throwable0) {
            if(this.c.compareAndSet(false, true)) {
                try {
                    this.b.onError(throwable0);
                }
                finally {
                    this.l();
                }
                return;
            }
            c.I(throwable0);
        }
    }

    final t a;
    final long b;
    final TimeUnit c;
    final j d;
    final t e;

    public h2(t k$t0, long v, TimeUnit timeUnit0, j j0, t k$t1) {
        this.a = k$t0;
        this.b = v;
        this.c = timeUnit0;
        this.d = j0;
        this.e = k$t1;
    }

    public void a(m m0) {
        a h2$a0 = new a(m0, this.e);
        rx.j.a j$a0 = this.d.a();
        h2$a0.c(j$a0);
        m0.c(h2$a0);
        j$a0.d(h2$a0, this.b, this.c);
        this.a.b(h2$a0);
    }

    @Override  // rx.functions.b
    public void b(Object object0) {
        this.a(((m)object0));
    }
}

