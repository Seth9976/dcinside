package com.google.common.util.concurrent;

import J1.b;
import J1.c;
import J1.d;
import O1.a;
import com.google.common.base.H;
import com.google.common.base.X;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

@b(emulated = true)
@N
public final class h1 {
    @c
    @d
    public static void a(ExecutorService executorService0) {
        X.a(h1.b(executorService0, 0x7FFFFFFFFFFFFFFFL, TimeUnit.NANOSECONDS));
    }

    @c
    @d
    public static boolean b(ExecutorService executorService0, long v, TimeUnit timeUnit0) {
        boolean z1;
        try {
            boolean z = false;
            long v1 = timeUnit0.toNanos(v);
            long v2 = System.nanoTime() + v1;
            while(true) {
                try {
                    z1 = executorService0.awaitTermination(v1, TimeUnit.NANOSECONDS);
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

    @c
    @d
    public static void c(CountDownLatch countDownLatch0) {
        boolean z = false;
        while(true) {
            try {
                countDownLatch0.await();
                break;
            }
            catch(InterruptedException unused_ex) {
                z = true;
            }
            catch(Throwable throwable0) {
                if(z) {
                    Thread.currentThread().interrupt();
                }
                throw throwable0;
            }
        }
        if(z) {
            Thread.currentThread().interrupt();
        }
    }

    @c
    @d
    public static boolean d(CountDownLatch countDownLatch0, long v, TimeUnit timeUnit0) {
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

    @c
    @d
    public static boolean e(Condition condition0, long v, TimeUnit timeUnit0) {
        boolean z1;
        try {
            boolean z = false;
            long v1 = timeUnit0.toNanos(v);
            long v2 = System.nanoTime() + v1;
            while(true) {
                try {
                    z1 = condition0.await(v1, TimeUnit.NANOSECONDS);
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

    @a
    @F0
    public static Object f(Future future0) throws ExecutionException {
        Object object0;
        boolean z = false;
        while(true) {
            try {
                object0 = future0.get();
                break;
            }
            catch(InterruptedException unused_ex) {
                z = true;
            }
            catch(Throwable throwable0) {
                if(z) {
                    Thread.currentThread().interrupt();
                }
                throw throwable0;
            }
        }
        if(z) {
            Thread.currentThread().interrupt();
        }
        return object0;
    }

    @c
    @d
    @a
    @F0
    public static Object g(Future future0, long v, TimeUnit timeUnit0) throws ExecutionException, TimeoutException {
        Object object0;
        try {
            boolean z = false;
            long v1 = timeUnit0.toNanos(v);
            long v2 = System.nanoTime() + v1;
            while(true) {
                try {
                    object0 = future0.get(v1, TimeUnit.NANOSECONDS);
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
        return object0;
    }

    @c
    @d
    public static void h(Thread thread0) {
        boolean z = false;
        while(true) {
            try {
                thread0.join();
                break;
            }
            catch(InterruptedException unused_ex) {
                z = true;
            }
            catch(Throwable throwable0) {
                if(z) {
                    Thread.currentThread().interrupt();
                }
                throw throwable0;
            }
        }
        if(z) {
            Thread.currentThread().interrupt();
        }
    }

    @c
    @d
    public static void i(Thread thread0, long v, TimeUnit timeUnit0) {
        H.E(thread0);
        boolean z = false;
        try {
            long v1 = timeUnit0.toNanos(v);
            long v2 = System.nanoTime() + v1;
            while(true) {
                try {
                    TimeUnit.NANOSECONDS.timedJoin(thread0, v1);
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
    }

    @c
    @d
    public static void j(BlockingQueue blockingQueue0, Object object0) {
        boolean z = false;
        while(true) {
            try {
                blockingQueue0.put(object0);
                break;
            }
            catch(InterruptedException unused_ex) {
                z = true;
            }
            catch(Throwable throwable0) {
                if(z) {
                    Thread.currentThread().interrupt();
                }
                throw throwable0;
            }
        }
        if(z) {
            Thread.currentThread().interrupt();
        }
    }

    @c
    @d
    public static void k(long v, TimeUnit timeUnit0) {
        try {
            boolean z = false;
            long v1 = timeUnit0.toNanos(v);
            long v2 = System.nanoTime() + v1;
            while(true) {
                try {
                    TimeUnit.NANOSECONDS.sleep(v1);
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
    }

    @c
    @d
    public static Object l(BlockingQueue blockingQueue0) {
        Object object0;
        boolean z = false;
        while(true) {
            try {
                object0 = blockingQueue0.take();
                break;
            }
            catch(InterruptedException unused_ex) {
                z = true;
            }
            catch(Throwable throwable0) {
                if(z) {
                    Thread.currentThread().interrupt();
                }
                throw throwable0;
            }
        }
        if(z) {
            Thread.currentThread().interrupt();
        }
        return object0;
    }

    @c
    @d
    public static boolean m(Semaphore semaphore0, int v, long v1, TimeUnit timeUnit0) {
        boolean z1;
        try {
            boolean z = false;
            long v2 = timeUnit0.toNanos(v1);
            long v3 = System.nanoTime() + v2;
            while(true) {
                try {
                    z1 = semaphore0.tryAcquire(v, v2, TimeUnit.NANOSECONDS);
                    break;
                }
                catch(InterruptedException unused_ex) {
                    z = true;
                    v2 = v3 - System.nanoTime();
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

    @c
    @d
    public static boolean n(Semaphore semaphore0, long v, TimeUnit timeUnit0) {
        return h1.m(semaphore0, 1, v, timeUnit0);
    }

    @c
    @d
    public static boolean o(Lock lock0, long v, TimeUnit timeUnit0) {
        boolean z1;
        try {
            boolean z = false;
            long v1 = timeUnit0.toNanos(v);
            long v2 = System.nanoTime() + v1;
            while(true) {
                try {
                    z1 = lock0.tryLock(v1, TimeUnit.NANOSECONDS);
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
}

