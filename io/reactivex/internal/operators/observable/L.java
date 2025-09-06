package io.reactivex.internal.operators.observable;

import e3.g;
import io.reactivex.G;
import io.reactivex.I;
import io.reactivex.internal.functions.a;
import io.reactivex.internal.functions.b;
import io.reactivex.internal.observers.i;
import io.reactivex.internal.observers.u;
import io.reactivex.internal.util.e;
import io.reactivex.internal.util.f;
import io.reactivex.internal.util.k;
import io.reactivex.internal.util.q;
import java.util.concurrent.LinkedBlockingQueue;

public final class l {
    private l() {
        throw new IllegalStateException("No instances!");
    }

    public static void a(G g0) {
        f f0 = new f();
        u u0 = new u(a.h(), f0, f0, a.h());
        g0.d(u0);
        e.a(f0, u0);
        Throwable throwable0 = f0.a;
        if(throwable0 != null) {
            throw k.f(throwable0);
        }
    }

    public static void b(G g0, g g1, g g2, e3.a a0) {
        b.g(g1, "onNext is null");
        b.g(g2, "onError is null");
        b.g(a0, "onComplete is null");
        l.c(g0, new u(g1, g2, a0, a.h()));
    }

    public static void c(G g0, I i0) {
        LinkedBlockingQueue linkedBlockingQueue0 = new LinkedBlockingQueue();
        i i1 = new i(linkedBlockingQueue0);
        i0.b(i1);
        g0.d(i1);
        while(!i1.a()) {
            Object object0 = linkedBlockingQueue0.poll();
            if(object0 == null) {
                try {
                    object0 = linkedBlockingQueue0.take();
                }
                catch(InterruptedException interruptedException0) {
                    i1.dispose();
                    i0.onError(interruptedException0);
                    return;
                }
            }
            if(i1.a() || object0 == i.c || q.c(object0, i0)) {
                break;
            }
        }
    }
}

