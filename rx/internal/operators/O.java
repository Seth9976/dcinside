package rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import rx.b.J;
import rx.b;
import rx.d;
import rx.plugins.c;

public final class o implements J {
    final b[] a;

    public o(b[] arr_b) {
        this.a = arr_b;
    }

    public void a(d d0) {
        class a implements d {
            final rx.subscriptions.b a;
            final AtomicBoolean b;
            final d c;
            final AtomicInteger d;
            final o e;

            a(rx.subscriptions.b b0, AtomicBoolean atomicBoolean0, d d0, AtomicInteger atomicInteger0) {
                this.a = b0;
                this.b = atomicBoolean0;
                this.c = d0;
                this.d = atomicInteger0;
                super();
            }

            @Override  // rx.d
            public void a(rx.o o0) {
                this.a.a(o0);
            }

            @Override  // rx.d
            public void d() {
                if(this.d.decrementAndGet() == 0 && this.b.compareAndSet(false, true)) {
                    this.c.d();
                }
            }

            @Override  // rx.d
            public void onError(Throwable throwable0) {
                this.a.l();
                if(this.b.compareAndSet(false, true)) {
                    this.c.onError(throwable0);
                    return;
                }
                c.I(throwable0);
            }
        }

        rx.subscriptions.b b0 = new rx.subscriptions.b();
        AtomicInteger atomicInteger0 = new AtomicInteger(this.a.length + 1);
        AtomicBoolean atomicBoolean0 = new AtomicBoolean();
        d0.a(b0);
        b[] arr_b = this.a;
        for(int v = 0; v < arr_b.length; ++v) {
            b b1 = arr_b[v];
            if(b0.j()) {
                return;
            }
            if(b1 == null) {
                b0.l();
                NullPointerException nullPointerException0 = new NullPointerException("A completable source is null");
                if(atomicBoolean0.compareAndSet(false, true)) {
                    d0.onError(nullPointerException0);
                    return;
                }
                c.I(nullPointerException0);
            }
            b1.G0(new a(this, b0, atomicBoolean0, d0, atomicInteger0));
        }
        if(atomicInteger0.decrementAndGet() == 0 && atomicBoolean0.compareAndSet(false, true)) {
            d0.d();
        }
    }

    @Override  // rx.functions.b
    public void b(Object object0) {
        this.a(((d)object0));
    }
}

