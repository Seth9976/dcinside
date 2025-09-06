package io.reactivex.internal.util;

import io.reactivex.plugins.a;
import java.util.concurrent.atomic.AtomicLong;

public final class d {
    private d() {
        throw new IllegalStateException("No instances!");
    }

    public static long a(AtomicLong atomicLong0, long v) {
        long v1;
        do {
            v1 = atomicLong0.get();
            if(v1 == 0x7FFFFFFFFFFFFFFFL) {
                return 0x7FFFFFFFFFFFFFFFL;
            }
        }
        while(!atomicLong0.compareAndSet(v1, d.c(v1, v)));
        return v1;
    }

    public static long b(AtomicLong atomicLong0, long v) {
        long v1;
        do {
            v1 = atomicLong0.get();
            if(v1 == 0x8000000000000000L) {
                return 0x8000000000000000L;
            }
            if(v1 == 0x7FFFFFFFFFFFFFFFL) {
                return 0x7FFFFFFFFFFFFFFFL;
            }
        }
        while(!atomicLong0.compareAndSet(v1, d.c(v1, v)));
        return v1;
    }

    public static long c(long v, long v1) {
        long v2 = v + v1;
        return v2 >= 0L ? v2 : 0x7FFFFFFFFFFFFFFFL;
    }

    public static long d(long v, long v1) {
        long v2 = v * v1;
        return (v | v1) >>> 0x1F == 0L || v2 / v == v1 ? v2 : 0x7FFFFFFFFFFFFFFFL;
    }

    public static long e(AtomicLong atomicLong0, long v) {
        long v2;
        do {
            long v1 = atomicLong0.get();
            if(v1 == 0x7FFFFFFFFFFFFFFFL) {
                return 0x7FFFFFFFFFFFFFFFL;
            }
            v2 = v1 - v;
            if(v2 < 0L) {
                a.Y(new IllegalStateException("More produced than requested: " + v2));
                v2 = 0L;
            }
        }
        while(!atomicLong0.compareAndSet(v1, v2));
        return v2;
    }

    public static long f(AtomicLong atomicLong0, long v) {
        long v2;
        do {
            long v1 = atomicLong0.get();
            if(v1 == 0x8000000000000000L) {
                return 0x8000000000000000L;
            }
            if(v1 == 0x7FFFFFFFFFFFFFFFL) {
                return 0x7FFFFFFFFFFFFFFFL;
            }
            v2 = v1 - v;
            if(v2 < 0L) {
                a.Y(new IllegalStateException("More produced than requested: " + v2));
                v2 = 0L;
            }
        }
        while(!atomicLong0.compareAndSet(v1, v2));
        return v2;
    }
}

