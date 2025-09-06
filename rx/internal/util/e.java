package rx.internal.util;

import java.util.concurrent.CountDownLatch;
import rx.o;

public final class e {
    public static void a(CountDownLatch countDownLatch0, o o0) {
        if(countDownLatch0.getCount() == 0L) {
            return;
        }
        try {
            countDownLatch0.await();
        }
        catch(InterruptedException interruptedException0) {
            o0.l();
            Thread.currentThread().interrupt();
            throw new IllegalStateException("Interrupted while waiting for subscription to complete.", interruptedException0);
        }
    }
}

