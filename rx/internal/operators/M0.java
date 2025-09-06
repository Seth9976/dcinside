package rx.internal.operators;

import java.util.concurrent.TimeUnit;
import rx.exceptions.c;
import rx.g.a;
import rx.j;
import rx.n;

public final class m0 implements a {
    final long a;
    final TimeUnit b;
    final j c;

    public m0(long v, TimeUnit timeUnit0, j j0) {
        this.a = v;
        this.b = timeUnit0;
        this.c = j0;
    }

    public void a(n n0) {
        class rx.internal.operators.m0.a implements rx.functions.a {
            final n a;
            final m0 b;

            rx.internal.operators.m0.a(n n0) {
                this.a = n0;
                super();
            }

            @Override  // rx.functions.a
            public void call() {
                try {
                    this.a.onNext(0L);
                }
                catch(Throwable throwable0) {
                    c.f(throwable0, this.a);
                    return;
                }
                this.a.d();
            }
        }

        rx.j.a j$a0 = this.c.a();
        n0.q(j$a0);
        j$a0.d(new rx.internal.operators.m0.a(this, n0), this.a, this.b);
    }

    @Override  // rx.functions.b
    public void b(Object object0) {
        this.a(((n)object0));
    }
}

