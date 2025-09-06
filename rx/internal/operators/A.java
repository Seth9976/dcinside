package rx.internal.operators;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import rx.functions.p;
import rx.internal.util.s;
import rx.n;

public final class a {
    static final long a = 0x8000000000000000L;
    static final long b = 0x7FFFFFFFFFFFFFFFL;

    private a() {
        throw new IllegalStateException("No instances!");
    }

    public static long a(long v, long v1) {
        long v2 = v + v1;
        return v2 >= 0L ? v2 : 0x7FFFFFFFFFFFFFFFL;
    }

    public static long b(AtomicLong atomicLong0, long v) {
        long v1;
        do {
            v1 = atomicLong0.get();
        }
        while(!atomicLong0.compareAndSet(v1, a.a(v1, v)));
        return v1;
    }

    public static long c(long v, long v1) {
        long v2 = v * v1;
        return (v | v1) >>> 0x1F == 0L || v1 == 0L || v2 / v1 == v ? v2 : 0x7FFFFFFFFFFFFFFFL;
    }

    public static void d(AtomicLong atomicLong0, Queue queue0, n n0) {
        a.e(atomicLong0, queue0, n0, s.c());
    }

    public static void e(AtomicLong atomicLong0, Queue queue0, n n0, p p0) {
        do {
            long v = atomicLong0.get();
            if((v & 0x8000000000000000L) != 0L) {
                return;
            }
        }
        while(!atomicLong0.compareAndSet(v, 0x8000000000000000L | v));
        if(v != 0L) {
            a.f(atomicLong0, queue0, n0, p0);
        }
    }

    static void f(AtomicLong atomicLong0, Queue queue0, n n0, p p0) {
        long v = atomicLong0.get();
        if(v == 0x7FFFFFFFFFFFFFFFL) {
            while(true) {
                if(n0.j()) {
                    return;
                }
                Object object0 = queue0.poll();
                if(object0 == null) {
                    n0.d();
                    return;
                }
                n0.onNext(p0.b(object0));
            }
        }
        do {
            long v1 = 0x8000000000000000L;
            while(true) {
                if(Long.compare(v1, v) == 0) {
                    if(n0.j()) {
                        return;
                    }
                    if(queue0.isEmpty()) {
                        n0.d();
                        return;
                    }
                    long v2 = atomicLong0.get();
                    if(v2 == v1) {
                        break;
                    }
                    v = v2;
                }
                else {
                    if(n0.j()) {
                        return;
                    }
                    Object object1 = queue0.poll();
                    if(object1 == null) {
                        n0.d();
                        return;
                    }
                    n0.onNext(p0.b(object1));
                    ++v1;
                }
            }
            v = atomicLong0.addAndGet(-(v1 & 0x7FFFFFFFFFFFFFFFL));
        }
        while(v != 0x8000000000000000L);
    }

    public static boolean g(AtomicLong atomicLong0, long v, Queue queue0, n n0) {
        return a.h(atomicLong0, v, queue0, n0, s.c());
    }

    public static boolean h(AtomicLong atomicLong0, long v, Queue queue0, n n0, p p0) {
        long v3;
        int v1 = Long.compare(v, 0L);
        if(v1 < 0) {
            throw new IllegalArgumentException("n >= 0 required but it was " + v);
        }
        if(v1 == 0) {
            return (atomicLong0.get() & 0x8000000000000000L) == 0L;
        }
        do {
            long v2 = atomicLong0.get();
            v3 = v2 & 0x8000000000000000L;
        }
        while(!atomicLong0.compareAndSet(v2, a.a(0x7FFFFFFFFFFFFFFFL & v2, v) | v3));
        if(v2 == 0x8000000000000000L) {
            a.f(atomicLong0, queue0, n0, p0);
            return false;
        }
        return v3 == 0L;
    }

    public static long i(AtomicLong atomicLong0, long v) {
        long v2;
        while(true) {
            long v1 = atomicLong0.get();
            if(v1 == 0x7FFFFFFFFFFFFFFFL) {
                return 0x7FFFFFFFFFFFFFFFL;
            }
            v2 = v1 - v;
            if(v2 < 0L) {
                break;
            }
            if(atomicLong0.compareAndSet(v1, v2)) {
                return v2;
            }
        }
        throw new IllegalStateException("More produced than requested: " + v2);
    }

    public static boolean j(long v) {
        int v1 = Long.compare(v, 0L);
        if(v1 < 0) {
            throw new IllegalArgumentException("n >= 0 required but it was " + v);
        }
        return v1 != 0;
    }
}

