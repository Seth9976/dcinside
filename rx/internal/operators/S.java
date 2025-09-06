package rx.internal.operators;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import rx.b.J;
import rx.b;
import rx.d;
import rx.j;
import rx.o;

public final class s implements J {
    final b a;
    final long b;
    final TimeUnit c;
    final j d;
    final b e;

    public s(b b0, long v, TimeUnit timeUnit0, j j0, b b1) {
        this.a = b0;
        this.b = v;
        this.c = timeUnit0;
        this.d = j0;
        this.e = b1;
    }

    public void a(d d0) {
        class a implements rx.functions.a {
            final AtomicBoolean a;
            final rx.subscriptions.b b;
            final d c;
            final s d;

            a(AtomicBoolean atomicBoolean0, rx.subscriptions.b b0, d d0) {
                this.a = atomicBoolean0;
                this.b = b0;
                this.c = d0;
                super();
            }

            @Override  // rx.functions.a
            public void call() {
                class rx.internal.operators.s.a.a implements d {
                    final a a;

                    rx.internal.operators.s.a.a(a s$a0) {
                    }

                    @Override  // rx.d
                    public void a(o o0) {
                    }

                    @Override  // rx.d
                    public void d() {
                    }

                    @Override  // rx.d
                    public void onError(Throwable throwable0) {
                    }
                }

                if(this.a.compareAndSet(false, true)) {
                    this.b.c();
                    b b0 = s.this.e;
                    if(b0 == null) {
                        TimeoutException timeoutException0 = new TimeoutException();
                        this.c.onError(timeoutException0);
                        return;
                    }
                    b0.G0(new rx.internal.operators.s.a.a(this));
                }
            }
        }


        class rx.internal.operators.s.b implements d {
            final rx.subscriptions.b a;
            final AtomicBoolean b;
            final d c;
            final s d;

            rx.internal.operators.s.b(s s0, rx.subscriptions.b b0, AtomicBoolean atomicBoolean0, d d0) {
            }

            @Override  // rx.d
            public void a(o o0) {
            }

            @Override  // rx.d
            public void d() {
            }

            @Override  // rx.d
            public void onError(Throwable throwable0) {
            }
        }

        rx.subscriptions.b b0 = new rx.subscriptions.b();
        d0.a(b0);
        AtomicBoolean atomicBoolean0 = new AtomicBoolean();
        rx.j.a j$a0 = this.d.a();
        b0.a(j$a0);
        j$a0.d(new a(this, atomicBoolean0, b0, d0), this.b, this.c);
        rx.internal.operators.s.b s$b0 = new rx.internal.operators.s.b(this, b0, atomicBoolean0, d0);
        this.a.G0(s$b0);
    }

    @Override  // rx.functions.b
    public void b(Object object0) {
        this.a(((d)object0));
    }
}

