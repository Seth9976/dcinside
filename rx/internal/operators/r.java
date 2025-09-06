package rx.internal.operators;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import rx.b.J;
import rx.d;
import rx.o;
import rx.plugins.c;
import rx.subscriptions.b;

public final class r implements J {
    final Iterable a;

    public r(Iterable iterable0) {
        this.a = iterable0;
    }

    public void a(d d0) {
        class a implements d {
            final b a;
            final AtomicBoolean b;
            final d c;
            final AtomicInteger d;
            final r e;

            a(b b0, AtomicBoolean atomicBoolean0, d d0, AtomicInteger atomicInteger0) {
                this.a = b0;
                this.b = atomicBoolean0;
                this.c = d0;
                this.d = atomicInteger0;
                super();
            }

            @Override  // rx.d
            public void a(o o0) {
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
        AtomicBoolean atomicBoolean0 = new AtomicBoolean();
        while(true) {
            if(b0.j()) {
                return;
            }
            try {
                if(!iterator0.hasNext()) {
                    goto label_23;
                }
                goto label_26;
            }
            catch(Throwable throwable1) {
                b0.l();
                if(atomicBoolean0.compareAndSet(false, true)) {
                    d0.onError(throwable1);
                    return;
                }
                c.I(throwable1);
                return;
            }
        label_23:
            if(atomicInteger0.decrementAndGet() == 0 && atomicBoolean0.compareAndSet(false, true)) {
                d0.d();
            }
            return;
        label_26:
            if(b0.j()) {
                return;
            }
            try {
                Object object0 = iterator0.next();
                b1 = (rx.b)object0;
            }
            catch(Throwable throwable2) {
                b0.l();
                if(atomicBoolean0.compareAndSet(false, true)) {
                    d0.onError(throwable2);
                    return;
                }
                c.I(throwable2);
                return;
            }
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
                return;
            }
            atomicInteger0.getAndIncrement();
            b1.G0(new a(this, b0, atomicBoolean0, d0, atomicInteger0));
        }
    }

    @Override  // rx.functions.b
    public void b(Object object0) {
        this.a(((d)object0));
    }
}

