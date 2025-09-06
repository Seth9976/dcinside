package rx.internal.operators;

import java.util.concurrent.TimeUnit;
import rx.g.b;
import rx.j;
import rx.n;

public final class x1 implements b {
    final long a;
    final j b;

    public x1(long v, TimeUnit timeUnit0, j j0) {
        this.a = timeUnit0.toMillis(v);
        this.b = j0;
    }

    public n a(n n0) {
        class a extends n {
            private long f;
            final n g;
            final x1 h;

            a(n n0, n n1) {
                this.g = n1;
                super(n0);
                this.f = -1L;
            }

            @Override  // rx.h
            public void d() {
                this.g.d();
            }

            @Override  // rx.h
            public void onError(Throwable throwable0) {
                this.g.onError(throwable0);
            }

            @Override  // rx.h
            public void onNext(Object object0) {
                long v = x1.this.b.b();
                if(this.f == -1L || v < this.f || v - this.f >= x1.this.a) {
                    this.f = v;
                    this.g.onNext(object0);
                }
            }

            @Override  // rx.n
            public void onStart() {
                this.v(0x7FFFFFFFFFFFFFFFL);
            }
        }

        return new a(this, n0, n0);
    }

    @Override  // rx.functions.p
    public Object b(Object object0) {
        return this.a(((n)object0));
    }
}

