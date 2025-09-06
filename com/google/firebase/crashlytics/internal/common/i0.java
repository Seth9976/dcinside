package com.google.firebase.crashlytics.internal.common;

import O1.a;
import android.os.Looper;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class i0 {
    private static final int a = 4000;
    private static final int b = 3000;
    private static final ExecutorService c;

    static {
        i0.c = K.d("awaitEvenIfOnMainThread task continuation executor");
    }

    @Deprecated
    public static Object b(Task task0) throws InterruptedException, TimeoutException {
        CountDownLatch countDownLatch0 = new CountDownLatch(1);
        h0 h00 = (Task task0) -> {
            countDownLatch0.countDown();
            return null;
        };
        task0.continueWith(i0.c, h00);
        if(Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch0.await(3000L, TimeUnit.MILLISECONDS);
        }
        else {
            countDownLatch0.await(4000L, TimeUnit.MILLISECONDS);
        }
        if(task0.isSuccessful()) {
            return task0.getResult();
        }
        if(task0.isCanceled()) {
            throw new CancellationException("Task is already canceled");
        }
        if(!task0.isComplete()) {
            throw new TimeoutException();
        }
        throw new IllegalStateException(task0.getException());
    }

    @a
    public static boolean c(CountDownLatch countDownLatch0, long v, TimeUnit timeUnit0) {
        boolean z1;
        try {
            boolean z = false;
            long v1 = timeUnit0.toNanos(v);
            long v2 = System.nanoTime() + v1;
            while(true) {
                try {
                    z1 = countDownLatch0.await(v1, TimeUnit.NANOSECONDS);
                    break;
                }
                catch(InterruptedException unused_ex) {
                    z = true;
                    v1 = v2 - System.nanoTime();
                }
            }
        }
        catch(Throwable throwable0) {
            if(z) {
                Thread.currentThread().interrupt();
            }
            throw throwable0;
        }
        if(z) {
            Thread.currentThread().interrupt();
        }
        return z1;
    }

    // 检测为 Lambda 实现
    private static Object d(CountDownLatch countDownLatch0, Task task0) throws Exception [...]
}

