package rx.internal.operators;

import androidx.compose.animation.core.d;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import rx.g;
import rx.n;
import rx.o;

public final class e {
    private e() {
        throw new IllegalStateException("No instances!");
    }

    public static Future a(g g0) {
        static final class a extends n {
            final CountDownLatch f;
            final AtomicReference g;
            final AtomicReference h;

            a(CountDownLatch countDownLatch0, AtomicReference atomicReference0, AtomicReference atomicReference1) {
                this.f = countDownLatch0;
                this.g = atomicReference0;
                this.h = atomicReference1;
                super();
            }

            @Override  // rx.h
            public void d() {
                this.f.countDown();
            }

            @Override  // rx.h
            public void onError(Throwable throwable0) {
                d.a(this.g, null, throwable0);
                this.f.countDown();
            }

            @Override  // rx.h
            public void onNext(Object object0) {
                this.h.set(object0);
            }
        }


        static final class b implements Future {
            private volatile boolean a;
            final CountDownLatch b;
            final o c;
            final AtomicReference d;
            final AtomicReference e;

            b(CountDownLatch countDownLatch0, o o0, AtomicReference atomicReference0, AtomicReference atomicReference1) {
                this.b = countDownLatch0;
                this.c = o0;
                this.d = atomicReference0;
                this.e = atomicReference1;
                super();
            }

            private Object a() throws ExecutionException {
                Throwable throwable0 = (Throwable)this.d.get();
                if(throwable0 != null) {
                    throw new ExecutionException("Observable onError", throwable0);
                }
                if(this.a) {
                    throw new CancellationException("Subscription unsubscribed");
                }
                return this.e.get();
            }

            @Override
            public boolean cancel(boolean z) {
                if(this.b.getCount() > 0L) {
                    this.a = true;
                    this.c.l();
                    this.b.countDown();
                    return true;
                }
                return false;
            }

            @Override
            public Object get() throws InterruptedException, ExecutionException {
                this.b.await();
                return this.a();
            }

            @Override
            public Object get(long v, TimeUnit timeUnit0) throws InterruptedException, ExecutionException, TimeoutException {
                if(!this.b.await(v, timeUnit0)) {
                    throw new TimeoutException("Timed out after " + timeUnit0.toMillis(v) + "ms waiting for underlying Observable.");
                }
                return this.a();
            }

            @Override
            public boolean isCancelled() {
                return this.a;
            }

            @Override
            public boolean isDone() {
                return this.b.getCount() == 0L;
            }
        }

        CountDownLatch countDownLatch0 = new CountDownLatch(1);
        AtomicReference atomicReference0 = new AtomicReference();
        AtomicReference atomicReference1 = new AtomicReference();
        return new b(countDownLatch0, g0.U4().v5(new a(countDownLatch0, atomicReference1, atomicReference0)), atomicReference1, atomicReference0);
    }
}

