package io.reactivex.internal.subscriptions;

import io.reactivex.internal.functions.b;
import io.reactivex.internal.util.d;
import io.reactivex.plugins.a;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.e;

public enum j implements e {
    CANCELLED;

    public static boolean a(AtomicReference atomicReference0) {
        e e0 = (e)atomicReference0.get();
        j j0 = j.a;
        if(e0 != j0) {
            e e1 = (e)atomicReference0.getAndSet(j0);
            if(e1 != j0) {
                if(e1 != null) {
                    e1.cancel();
                }
                return true;
            }
        }
        return false;
    }

    public static void b(AtomicReference atomicReference0, AtomicLong atomicLong0, long v) {
        e e0 = (e)atomicReference0.get();
        if(e0 != null) {
            e0.request(v);
            return;
        }
        if(j.j(v)) {
            d.a(atomicLong0, v);
            e e1 = (e)atomicReference0.get();
            if(e1 != null) {
                long v1 = atomicLong0.getAndSet(0L);
                if(v1 != 0L) {
                    e1.request(v1);
                }
            }
        }
    }

    public static boolean c(AtomicReference atomicReference0, AtomicLong atomicLong0, e e0) {
        if(j.h(atomicReference0, e0)) {
            long v = atomicLong0.getAndSet(0L);
            if(v != 0L) {
                e0.request(v);
            }
            return true;
        }
        return false;
    }

    @Override  // org.reactivestreams.e
    public void cancel() {
    }

    public static boolean d(AtomicReference atomicReference0, e e0) {
        do {
            e e1 = (e)atomicReference0.get();
            if(e1 == j.a) {
                if(e0 != null) {
                    e0.cancel();
                }
                return false;
            }
        }
        while(!androidx.compose.animation.core.d.a(atomicReference0, e1, e0));
        return true;
    }

    public static void e(long v) {
        a.Y(new io.reactivex.exceptions.e("More produced than requested: " + v));
    }

    public static void f() {
        a.Y(new io.reactivex.exceptions.e("Subscription already set!"));
    }

    public static boolean g(AtomicReference atomicReference0, e e0) {
        e e1;
        do {
            e1 = (e)atomicReference0.get();
            if(e1 == j.a) {
                if(e0 != null) {
                    e0.cancel();
                }
                return false;
            }
        }
        while(!androidx.compose.animation.core.d.a(atomicReference0, e1, e0));
        if(e1 != null) {
            e1.cancel();
        }
        return true;
    }

    public static boolean h(AtomicReference atomicReference0, e e0) {
        b.g(e0, "s is null");
        if(!androidx.compose.animation.core.d.a(atomicReference0, null, e0)) {
            e0.cancel();
            if(atomicReference0.get() != j.a) {
                j.f();
            }
            return false;
        }
        return true;
    }

    public static boolean i(AtomicReference atomicReference0, e e0, long v) {
        if(j.h(atomicReference0, e0)) {
            e0.request(v);
            return true;
        }
        return false;
    }

    public static boolean j(long v) {
        if(v <= 0L) {
            a.Y(new IllegalArgumentException("n > 0 required but it was " + v));
            return false;
        }
        return true;
    }

    public static boolean k(e e0, e e1) {
        if(e1 == null) {
            a.Y(new NullPointerException("next is null"));
            return false;
        }
        if(e0 != null) {
            e1.cancel();
            j.f();
            return false;
        }
        return true;
    }

    @Override  // org.reactivestreams.e
    public void request(long v) {
    }
}

