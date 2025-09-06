package io.reactivex.internal.operators.flowable;

import e3.o;
import io.reactivex.internal.functions.b;
import io.reactivex.internal.subscriptions.g;
import io.reactivex.internal.subscriptions.h;
import io.reactivex.l;
import java.util.concurrent.Callable;
import org.reactivestreams.c;
import org.reactivestreams.d;

public final class m1 {
    static final class a extends l {
        final Object b;
        final o c;

        a(Object object0, o o0) {
            this.b = object0;
            this.c = o0;
        }

        @Override  // io.reactivex.l
        public void m6(d d0) {
            Object object0;
            c c0;
            try {
                c0 = (c)b.g(this.c.apply(this.b), "The mapper returned a null Publisher");
            }
            catch(Throwable throwable0) {
                g.b(throwable0, d0);
                return;
            }
            if(c0 instanceof Callable) {
                try {
                    object0 = ((Callable)c0).call();
                }
                catch(Throwable throwable1) {
                    io.reactivex.exceptions.b.b(throwable1);
                    g.b(throwable1, d0);
                    return;
                }
                if(object0 == null) {
                    g.a(d0);
                    return;
                }
                d0.g(new h(d0, object0));
                return;
            }
            c0.e(d0);
        }
    }

    private m1() {
        throw new IllegalStateException("No instances!");
    }

    public static l a(Object object0, o o0) {
        return io.reactivex.plugins.a.P(new a(object0, o0));
    }

    public static boolean b(c c0, d d0, o o0) {
        Object object1;
        c c1;
        Object object0;
        if(c0 instanceof Callable) {
            try {
                object0 = ((Callable)c0).call();
            }
            catch(Throwable throwable0) {
                io.reactivex.exceptions.b.b(throwable0);
                g.b(throwable0, d0);
                return true;
            }
            if(object0 == null) {
                g.a(d0);
                return true;
            }
            try {
                c1 = (c)b.g(o0.apply(object0), "The mapper returned a null Publisher");
            }
            catch(Throwable throwable1) {
                io.reactivex.exceptions.b.b(throwable1);
                g.b(throwable1, d0);
                return true;
            }
            if(c1 instanceof Callable) {
                try {
                    object1 = ((Callable)c1).call();
                }
                catch(Throwable throwable2) {
                    io.reactivex.exceptions.b.b(throwable2);
                    g.b(throwable2, d0);
                    return true;
                }
                if(object1 == null) {
                    g.a(d0);
                    return true;
                }
                d0.g(new h(d0, object1));
                return true;
            }
            c1.e(d0);
            return true;
        }
        return false;
    }
}

