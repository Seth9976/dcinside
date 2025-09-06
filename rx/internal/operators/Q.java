package rx.internal.operators;

import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import rx.b.J;
import rx.d;
import rx.o;
import rx.subscriptions.b;

public final class q implements J {
    final Iterable a;

    public q(Iterable iterable0) {
        this.a = iterable0;
    }

    public void a(d d0) {
        class a implements d {
            final b a;
            final Queue b;
            final AtomicInteger c;
            final d d;
            final q e;

            a(b b0, Queue queue0, AtomicInteger atomicInteger0, d d0) {
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

        rx.b b1;
        Iterator iterator0;
        b b0 = new b();
        d0.a(b0);
        try {
            iterator0 = this.a.iterator();
        }
        catch(Throwable throwable0) {
            d0.onError(throwable0);
            return;
        }
        if(iterator0 == null) {
            d0.onError(new NullPointerException("The source iterator returned is null"));
            return;
        }
        AtomicInteger atomicInteger0 = new AtomicInteger(1);
        rx.internal.util.unsafe.o o0 = new rx.internal.util.unsafe.o();
        while(true) {
            if(b0.j()) {
                return;
            }
            try {
                if(!iterator0.hasNext()) {
                    goto label_24;
                }
                goto label_30;
            }
            catch(Throwable throwable1) {
                o0.offer(throwable1);
                if(atomicInteger0.decrementAndGet() == 0) {
                    if(o0.isEmpty()) {
                        d0.d();
                        return;
                    }
                    d0.onError(n.c(o0));
                }
                return;
            }
        label_24:
            if(atomicInteger0.decrementAndGet() == 0) {
                if(o0.isEmpty()) {
                    d0.d();
                    return;
                }
                d0.onError(n.c(o0));
            }
            return;
        label_30:
            if(b0.j()) {
                return;
            }
            try {
                Object object0 = iterator0.next();
                b1 = (rx.b)object0;
            }
            catch(Throwable throwable2) {
                o0.offer(throwable2);
                if(atomicInteger0.decrementAndGet() == 0) {
                    if(o0.isEmpty()) {
                        d0.d();
                        return;
                    }
                    d0.onError(n.c(o0));
                }
                return;
            }
            if(b0.j()) {
                return;
            }
            if(b1 == null) {
                o0.offer(new NullPointerException("A completable source is null"));
                if(atomicInteger0.decrementAndGet() == 0) {
                    if(o0.isEmpty()) {
                        d0.d();
                        return;
                    }
                    d0.onError(n.c(o0));
                }
                return;
            }
            atomicInteger0.getAndIncrement();
            b1.G0(new a(this, b0, o0, atomicInteger0, d0));
        }
    }

    @Override  // rx.functions.b
    public void b(Object object0) {
        this.a(((d)object0));
    }
}

