package rx.internal.operators;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.TimeUnit;
import rx.g.b;
import rx.j;
import rx.n;
import rx.schedulers.f;

public class l1 implements b {
    final long a;
    final j b;

    public l1(long v, TimeUnit timeUnit0, j j0) {
        this.a = timeUnit0.toMillis(v);
        this.b = j0;
    }

    public n a(n n0) {
        class a extends n {
            private Deque f;
            final n g;
            final l1 h;

            a(n n0, n n1) {
                this.g = n1;
                super(n0);
                this.f = new ArrayDeque();
            }

            @Override  // rx.h
            public void d() {
                this.x(l1.this.b.b());
                this.g.d();
            }

            @Override  // rx.h
            public void onError(Throwable throwable0) {
                this.g.onError(throwable0);
            }

            @Override  // rx.h
            public void onNext(Object object0) {
                long v = l1.this.b.b();
                this.x(v);
                this.f.offerLast(new f(v, object0));
            }

            private void x(long v) {
                long v1 = v - l1.this.a;
                while(!this.f.isEmpty()) {
                    f f0 = (f)this.f.getFirst();
                    if(f0.a() >= v1) {
                        break;
                    }
                    this.f.removeFirst();
                    this.g.onNext(f0.b());
                }
            }
        }

        return new a(this, n0, n0);
    }

    @Override  // rx.functions.p
    public Object b(Object object0) {
        return this.a(((n)object0));
    }
}

