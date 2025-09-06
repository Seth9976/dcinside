package rx.singles;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;
import rx.exceptions.c;
import rx.internal.operators.e;
import rx.k;
import rx.m;

public final class a {
    private final k a;

    private a(k k0) {
        this.a = k0;
    }

    public static a a(k k0) {
        return new a(k0);
    }

    public Future b() {
        return e.a(this.a.z0());
    }

    public Object c() {
        class rx.singles.a.a extends m {
            final AtomicReference b;
            final CountDownLatch c;
            final AtomicReference d;
            final a e;

            rx.singles.a.a(AtomicReference atomicReference0, CountDownLatch countDownLatch0, AtomicReference atomicReference1) {
                this.b = atomicReference0;
                this.c = countDownLatch0;
                this.d = atomicReference1;
                super();
            }

            @Override  // rx.m
            public void e(Object object0) {
                this.b.set(object0);
                this.c.countDown();
            }

            @Override  // rx.m
            public void onError(Throwable throwable0) {
                this.d.set(throwable0);
                this.c.countDown();
            }
        }

        AtomicReference atomicReference0 = new AtomicReference();
        AtomicReference atomicReference1 = new AtomicReference();
        CountDownLatch countDownLatch0 = new CountDownLatch(1);
        rx.singles.a.a a$a0 = new rx.singles.a.a(this, atomicReference0, countDownLatch0, atomicReference1);
        rx.internal.util.e.a(countDownLatch0, this.a.j0(a$a0));
        Throwable throwable0 = (Throwable)atomicReference1.get();
        if(throwable0 != null) {
            throw c.c(throwable0);
        }
        return atomicReference0.get();
    }
}

