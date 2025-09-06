package io.reactivex.internal.util;

import io.reactivex.disposables.c;
import java.util.concurrent.CountDownLatch;

public final class e {
    private e() {
        throw new IllegalStateException("No instances!");
    }

    public static void a(CountDownLatch countDownLatch0, c c0) {
        if(countDownLatch0.getCount() == 0L) {
            return;
        }
        try {
            e.b();
            countDownLatch0.await();
        }
        catch(InterruptedException interruptedException0) {
            c0.dispose();
            Thread.currentThread().interrupt();
            throw new IllegalStateException("Interrupted while waiting for subscription to complete.", interruptedException0);
        }
    }

    // 去混淆评级： 中等(110)
    public static void b() {
    }
}

