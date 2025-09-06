package io.reactivex.internal.util;

import androidx.compose.animation.core.d;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class k {
    static final class a extends Throwable {
        private static final long a = -4649703670690200604L;

        a() {
            super("No further exceptions");
        }

        @Override
        public Throwable fillInStackTrace() {
            return this;
        }
    }

    public static final Throwable a;

    static {
        k.a = new a();
    }

    private k() {
        throw new IllegalStateException("No instances!");
    }

    public static boolean a(AtomicReference atomicReference0, Throwable throwable0) {
        do {
            Throwable throwable1 = (Throwable)atomicReference0.get();
            if(throwable1 == k.a) {
                return false;
            }
            Throwable throwable2 = throwable1 == null ? throwable0 : new io.reactivex.exceptions.a(new Throwable[]{throwable1, throwable0});
        }
        while(!d.a(atomicReference0, throwable1, throwable2));
        return true;
    }

    public static List b(Throwable throwable0) {
        List list0 = new ArrayList();
        ArrayDeque arrayDeque0 = new ArrayDeque();
        arrayDeque0.offer(throwable0);
        while(!arrayDeque0.isEmpty()) {
            Throwable throwable1 = (Throwable)arrayDeque0.removeFirst();
            if(throwable1 instanceof io.reactivex.exceptions.a) {
                List list1 = ((io.reactivex.exceptions.a)throwable1).b();
                for(int v = list1.size() - 1; v >= 0; --v) {
                    arrayDeque0.offerFirst(list1.get(v));
                }
            }
            else {
                list0.add(throwable1);
            }
        }
        return list0;
    }

    public static Throwable c(AtomicReference atomicReference0) {
        Throwable throwable0 = (Throwable)atomicReference0.get();
        return throwable0 == k.a ? throwable0 : ((Throwable)atomicReference0.getAndSet(k.a));
    }

    public static Exception d(Throwable throwable0) throws Throwable {
        if(!(throwable0 instanceof Exception)) {
            throw throwable0;
        }
        return (Exception)throwable0;
    }

    public static String e(long v, TimeUnit timeUnit0) {
        return "The source did not signal an event for " + v + " " + timeUnit0.toString().toLowerCase() + " and has been terminated.";
    }

    public static RuntimeException f(Throwable throwable0) {
        if(throwable0 instanceof Error) {
            throw (Error)throwable0;
        }
        return throwable0 instanceof RuntimeException ? ((RuntimeException)throwable0) : new RuntimeException(throwable0);
    }
}

