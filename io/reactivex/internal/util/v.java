package io.reactivex.internal.util;

import e3.e;
import f3.n;
import f3.o;
import io.reactivex.I;
import io.reactivex.disposables.c;
import io.reactivex.internal.queue.b;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.d;

public final class v {
    static final long a = 0x8000000000000000L;
    static final long b = 0x7FFFFFFFFFFFFFFFL;

    private v() {
        throw new IllegalStateException("No instances!");
    }

    public static boolean a(boolean z, boolean z1, I i0, boolean z2, o o0, c c0, r r0) {
        if(r0.i()) {
            o0.clear();
            c0.dispose();
            return true;
        }
        if(z) {
            if(!z2) {
                Throwable throwable1 = r0.d();
                if(throwable1 != null) {
                    o0.clear();
                    if(c0 != null) {
                        c0.dispose();
                    }
                    i0.onError(throwable1);
                    return true;
                }
                if(z1) {
                    if(c0 != null) {
                        c0.dispose();
                    }
                    i0.onComplete();
                    return true;
                }
            }
            else if(z1) {
                if(c0 != null) {
                    c0.dispose();
                }
                Throwable throwable0 = r0.d();
                if(throwable0 != null) {
                    i0.onError(throwable0);
                    return true;
                }
                i0.onComplete();
                return true;
            }
        }
        return false;
    }

    public static boolean b(boolean z, boolean z1, d d0, boolean z2, o o0, u u0) {
        if(u0.i()) {
            o0.clear();
            return true;
        }
        if(z) {
            if(!z2) {
                Throwable throwable1 = u0.d();
                if(throwable1 != null) {
                    o0.clear();
                    d0.onError(throwable1);
                    return true;
                }
                if(z1) {
                    d0.onComplete();
                    return true;
                }
            }
            else if(z1) {
                Throwable throwable0 = u0.d();
                if(throwable0 != null) {
                    d0.onError(throwable0);
                    return true;
                }
                d0.onComplete();
                return true;
            }
        }
        return false;
    }

    public static o c(int v) {
        return v < 0 ? new io.reactivex.internal.queue.c(-v) : new b(v);
    }

    public static void d(n n0, I i0, boolean z, c c0, r r0) {
        int v = 1;
        do {
            if(v.a(r0.c(), n0.isEmpty(), i0, z, n0, c0, r0)) {
                return;
            }
            while(true) {
                boolean z1 = r0.c();
                Object object0 = n0.poll();
                if(v.a(z1, object0 == null, i0, z, n0, c0, r0)) {
                    return;
                }
                if(object0 == null) {
                    break;
                }
                r0.j(i0, object0);
            }
            v = r0.f(-v);
        }
        while(v != 0);
    }

    public static void e(n n0, d d0, boolean z, c c0, u u0) {
        int v = 1;
        while(true) {
            boolean z1 = u0.c();
            Object object0 = n0.poll();
            if(v.b(z1, object0 == null, d0, z, n0, u0)) {
                if(c0 != null) {
                    c0.dispose();
                }
                return;
            }
            if(object0 == null) {
                v = u0.f(-v);
                if(v != 0) {
                    continue;
                }
                return;
            }
            long v1 = u0.e();
            if(v1 == 0L) {
                break;
            }
            if(u0.j(d0, object0) && v1 != 0x7FFFFFFFFFFFFFFFL) {
                u0.b(1L);
            }
        }
        n0.clear();
        if(c0 != null) {
            c0.dispose();
        }
        d0.onError(new io.reactivex.exceptions.c("Could not emit value due to lack of requests."));
    }

    static boolean f(e e0) {
        try {
            return e0.a();
        }
        catch(Throwable throwable0) {
            io.reactivex.exceptions.b.b(throwable0);
            return true;
        }
    }

    public static void g(d d0, Queue queue0, AtomicLong atomicLong0, e e0) {
        long v;
        if(queue0.isEmpty()) {
            d0.onComplete();
            return;
        }
        if(v.h(atomicLong0.get(), d0, queue0, atomicLong0, e0)) {
            return;
        }
        do {
            v = atomicLong0.get();
            if((v & 0x8000000000000000L) != 0L) {
                return;
            }
        }
        while(!atomicLong0.compareAndSet(v, v | 0x8000000000000000L));
        if(v != 0L) {
            v.h(v | 0x8000000000000000L, d0, queue0, atomicLong0, e0);
        }
    }

    static boolean h(long v, d d0, Queue queue0, AtomicLong atomicLong0, e e0) {
        long v1 = v & 0x8000000000000000L;
        while(true) {
            if(v1 == v) {
                if(v.f(e0)) {
                    return true;
                }
                if(queue0.isEmpty()) {
                    d0.onComplete();
                    return true;
                }
                long v2 = atomicLong0.get();
                if(v2 == v1) {
                    long v3 = atomicLong0.addAndGet(-(v1 & 0x7FFFFFFFFFFFFFFFL));
                    if((0x7FFFFFFFFFFFFFFFL & v3) == 0L) {
                        return false;
                    }
                    v = v3;
                    v1 = v3 & 0x8000000000000000L;
                }
                else {
                    v = v2;
                }
            }
            else {
                if(v.f(e0)) {
                    return true;
                }
                Object object0 = queue0.poll();
                if(object0 == null) {
                    d0.onComplete();
                    return true;
                }
                d0.onNext(object0);
                ++v1;
            }
        }
    }

    public static boolean i(long v, d d0, Queue queue0, AtomicLong atomicLong0, e e0) {
        do {
            long v1 = atomicLong0.get();
        }
        while(!atomicLong0.compareAndSet(v1, io.reactivex.internal.util.d.c(0x7FFFFFFFFFFFFFFFL & v1, v) | v1 & 0x8000000000000000L));
        if(v1 == 0x8000000000000000L) {
            v.h(v | 0x8000000000000000L, d0, queue0, atomicLong0, e0);
            return true;
        }
        return false;
    }

    public static void j(org.reactivestreams.e e0, int v) {
        e0.request((v >= 0 ? ((long)v) : 0x7FFFFFFFFFFFFFFFL));
    }
}

