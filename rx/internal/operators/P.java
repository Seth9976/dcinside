package rx.internal.operators;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import rx.b.J;
import rx.b;
import rx.d;
import rx.o;

public final class p implements J {
    final b[] a;

    public p(b[] arr_b) {
        this.a = arr_b;
    }

    public void a(d d0) {
        class a implements d {
            final rx.subscriptions.b a;
            final Queue b;
            final AtomicInteger c;
            final d d;
            final p e;

            a(rx.subscriptions.b b0, Queue queue0, AtomicInteger atomicInteger0, d d0) {
                this.a = b0;
                this.b = queue0;
                this.c = atomicInteger0;
                this.d = d0;
                super();
            }

            @Override  // rx.d
            public void a(o o0) {
                this.a.a(o0);
            }

            void b() {
                if(this.c.decrementAndGet() == 0) {
                    if(this.b.isEmpty()) {
                        this.d.d();
                        return;
                    }
                    Throwable throwable0 = n.c(this.b);
                    this.d.onError(throwable0);
                }
            }

            @Override  // rx.d
            public void d() {
                this.b();
            }

            @Override  // rx.d
            public void onError(Throwable throwable0) {
                this.b.offer(throwable0);
                this.b();
            }
        }

        rx.subscriptions.b b0 = new rx.subscriptions.b();
        AtomicInteger atomicInteger0 = new AtomicInteger(this.a.length + 1);
        ConcurrentLinkedQueue concurrentLinkedQueue0 = new ConcurrentLinkedQueue();
        d0.a(b0);
        b[] arr_b = this.a;
        for(int v = 0; v < arr_b.length; ++v) {
            b b1 = arr_b[v];
            if(b0.j()) {
                return;
            }
            if(b1 == null) {
                concurrentLinkedQueue0.offer(new NullPointerException("A completable source is null"));
                atomicInteger0.decrementAndGet();
            }
            else {
                b1.G0(new a(this, b0, concurrentLinkedQueue0, atomicInteger0, d0));
            }
        }
        if(atomicInteger0.decrementAndGet() == 0) {
            if(concurrentLinkedQueue0.isEmpty()) {
                d0.d();
                return;
            }
            d0.onError(n.c(concurrentLinkedQueue0));
        }
    }

    @Override  // rx.functions.b
    public void b(Object object0) {
        this.a(((d)object0));
    }
}

