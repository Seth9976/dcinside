package io.reactivex.internal.util;

import io.reactivex.I;
import io.reactivex.plugins.a;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.d;

public final class l {
    private l() {
        throw new IllegalStateException("No instances!");
    }

    public static void a(I i0, AtomicInteger atomicInteger0, c c0) {
        if(atomicInteger0.getAndIncrement() == 0) {
            Throwable throwable0 = c0.c();
            if(throwable0 != null) {
                i0.onError(throwable0);
                return;
            }
            i0.onComplete();
        }
    }

    public static void b(d d0, AtomicInteger atomicInteger0, c c0) {
        if(atomicInteger0.getAndIncrement() == 0) {
            Throwable throwable0 = c0.c();
            if(throwable0 != null) {
                d0.onError(throwable0);
                return;
            }
            d0.onComplete();
        }
    }

    public static void c(I i0, Throwable throwable0, AtomicInteger atomicInteger0, c c0) {
        if(!c0.a(throwable0)) {
            a.Y(throwable0);
        }
        else if(atomicInteger0.getAndIncrement() == 0) {
            i0.onError(c0.c());
        }
    }

    public static void d(d d0, Throwable throwable0, AtomicInteger atomicInteger0, c c0) {
        if(!c0.a(throwable0)) {
            a.Y(throwable0);
        }
        else if(atomicInteger0.getAndIncrement() == 0) {
            d0.onError(c0.c());
        }
    }

    public static void e(I i0, Object object0, AtomicInteger atomicInteger0, c c0) {
        if(atomicInteger0.get() == 0 && atomicInteger0.compareAndSet(0, 1)) {
            i0.onNext(object0);
            if(atomicInteger0.decrementAndGet() != 0) {
                Throwable throwable0 = c0.c();
                if(throwable0 != null) {
                    i0.onError(throwable0);
                    return;
                }
                i0.onComplete();
            }
        }
    }

    public static void f(d d0, Object object0, AtomicInteger atomicInteger0, c c0) {
        if(atomicInteger0.get() == 0 && atomicInteger0.compareAndSet(0, 1)) {
            d0.onNext(object0);
            if(atomicInteger0.decrementAndGet() != 0) {
                Throwable throwable0 = c0.c();
                if(throwable0 != null) {
                    d0.onError(throwable0);
                    return;
                }
                d0.onComplete();
            }
        }
    }
}

