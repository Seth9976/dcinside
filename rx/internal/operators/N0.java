package rx.internal.operators;

import java.util.concurrent.TimeUnit;
import rx.exceptions.c;
import rx.g.a;
import rx.j;
import rx.n;

public final class n0 implements a {
    final long a;
    final long b;
    final TimeUnit c;
    final j d;

    public n0(long v, long v1, TimeUnit timeUnit0, j j0) {
        this.a = v;
        this.b = v1;
        this.c = timeUnit0;
        this.d = j0;
    }

    public void a(n n0) {
        class rx.internal.operators.n0.a implements rx.functions.a {
            long a;
            final n b;
            final rx.j.a c;
            final n0 d;

            rx.internal.operators.n0.a(n n0, rx.j.a j$a0) {
                this.b = n0;
                this.c = j$a0;
                super();
            }

            @Override  // rx.functions.a
            public void call() {
                try {
                    long v = this.a;
                    this.a = v + 1L;
                    this.b.onNext(v);
                }
                catch(Throwable unused_ex) {
                    try {
                        this.c.l();
                    }
                    finally {
                        c.f(throwable0, this.b);
                    }
                }
            }
        }

        rx.j.a j$a0 = this.d.a();
        n0.q(j$a0);
        j$a0.e(new rx.internal.operators.n0.a(this, n0, j$a0), this.a, this.b, this.c);
    }

    @Override  // rx.functions.b
    public void b(Object object0) {
        this.a(((n)object0));
    }
}

