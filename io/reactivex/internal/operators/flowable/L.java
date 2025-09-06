package io.reactivex.internal.operators.flowable;

import e3.g;
import io.reactivex.internal.functions.a;
import io.reactivex.internal.functions.b;
import io.reactivex.internal.subscribers.m;
import io.reactivex.internal.util.e;
import io.reactivex.internal.util.f;
import io.reactivex.internal.util.k;
import io.reactivex.internal.util.q;
import java.util.concurrent.LinkedBlockingQueue;
import org.reactivestreams.c;
import org.reactivestreams.d;

public final class l {
    private l() {
        throw new IllegalStateException("No instances!");
    }

    public static void a(c c0) {
        f f0 = new f();
        m m0 = new m(a.h(), f0, f0, a.l);
        c0.e(m0);
        e.a(f0, m0);
        Throwable throwable0 = f0.a;
        if(throwable0 != null) {
            throw k.f(throwable0);
        }
    }

    public static void b(c c0, g g0, g g1, e3.a a0) {
        b.g(g0, "onNext is null");
        b.g(g1, "onError is null");
        b.g(a0, "onComplete is null");
        l.d(c0, new m(g0, g1, a0, a.l));
    }

    public static void c(c c0, g g0, g g1, e3.a a0, int v) {
        b.g(g0, "onNext is null");
        b.g(g1, "onError is null");
        b.g(a0, "onComplete is null");
        b.h(v, "number > 0 required");
        l.d(c0, new io.reactivex.internal.subscribers.g(g0, g1, a0, a.d(v), v));
    }

    public static void d(c c0, d d0) {
        LinkedBlockingQueue linkedBlockingQueue0 = new LinkedBlockingQueue();
        io.reactivex.internal.subscribers.f f0 = new io.reactivex.internal.subscribers.f(linkedBlockingQueue0);
        c0.e(f0);
        while(true) {
            try {
                if(f0.a()) {
                    break;
                }
                Object object0 = linkedBlockingQueue0.poll();
                if(object0 == null) {
                    if(f0.a()) {
                        break;
                    }
                    e.b();
                    object0 = linkedBlockingQueue0.take();
                }
                if(f0.a() || object0 == io.reactivex.internal.subscribers.f.c || q.d(object0, d0)) {
                    return;
                }
                continue;
            }
            catch(InterruptedException interruptedException0) {
            }
            f0.cancel();
            d0.onError(interruptedException0);
            return;
        }
    }
}

