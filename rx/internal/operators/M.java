package rx.internal.operators;

import F4.b;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import rx.b.J;
import rx.d;
import rx.o;
import rx.subscriptions.f;

public final class m implements J {
    static final class a extends AtomicInteger implements d {
        final d a;
        final Iterator b;
        final b c;
        private static final long d = -7965400327305809232L;

        public a(d d0, Iterator iterator0) {
            this.a = d0;
            this.b = iterator0;
            this.c = new b();
        }

        @Override  // rx.d
        public void a(o o0) {
            this.c.b(o0);
        }

        void b() {
            rx.b b0;
            if(this.c.j()) {
                return;
            }
            if(this.getAndIncrement() != 0) {
                return;
            }
            Iterator iterator0 = this.b;
            do {
                if(this.c.j()) {
                    return;
                }
                try {
                    if(!iterator0.hasNext()) {
                        goto label_12;
                    }
                    goto label_14;
                }
                catch(Throwable throwable0) {
                    this.a.onError(throwable0);
                    return;
                }
            label_12:
                this.a.d();
                return;
                try {
                label_14:
                    Object object0 = iterator0.next();
                    b0 = (rx.b)object0;
                }
                catch(Throwable throwable1) {
                    this.a.onError(throwable1);
                    return;
                }
                if(b0 == null) {
                    NullPointerException nullPointerException0 = new NullPointerException("The completable returned is null");
                    this.a.onError(nullPointerException0);
                    return;
                }
                b0.G0(this);
            }
            while(this.decrementAndGet() != 0);
        }

        @Override  // rx.d
        public void d() {
            this.b();
        }

        @Override  // rx.d
        public void onError(Throwable throwable0) {
            this.a.onError(throwable0);
        }
    }

    final Iterable a;

    public m(Iterable iterable0) {
        this.a = iterable0;
    }

    public void a(d d0) {
        Iterator iterator0;
        try {
            iterator0 = this.a.iterator();
        }
        catch(Throwable throwable0) {
            d0.a(f.e());
            d0.onError(throwable0);
            return;
        }
        if(iterator0 == null) {
            d0.a(f.e());
            d0.onError(new NullPointerException("The iterator returned is null"));
            return;
        }
        a m$a0 = new a(d0, iterator0);
        d0.a(m$a0.c);
        m$a0.b();
    }

    @Override  // rx.functions.b
    public void b(Object object0) {
        this.a(((d)object0));
    }
}

