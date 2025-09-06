package io.reactivex.android.plugins;

import e3.o;
import io.reactivex.J;
import io.reactivex.exceptions.b;
import java.util.concurrent.Callable;

public final class a {
    private static volatile o a;
    private static volatile o b;

    private a() {
        throw new AssertionError("No instances.");
    }

    static Object a(o o0, Object object0) {
        try {
            return o0.apply(object0);
        }
        catch(Throwable throwable0) {
            throw b.a(throwable0);
        }
    }

    static J b(o o0, Callable callable0) {
        J j0 = (J)a.a(o0, callable0);
        if(j0 == null) {
            throw new NullPointerException("Scheduler Callable returned null");
        }
        return j0;
    }

    static J c(Callable callable0) {
        try {
            J j0 = (J)callable0.call();
            if(j0 == null) {
                throw new NullPointerException("Scheduler Callable returned null");
            }
            return j0;
        }
        catch(Throwable throwable0) {
            throw b.a(throwable0);
        }
    }

    public static o d() {
        return a.a;
    }

    public static o e() {
        return a.b;
    }

    public static J f(Callable callable0) {
        if(callable0 == null) {
            throw new NullPointerException("scheduler == null");
        }
        return a.a == null ? a.c(callable0) : a.b(a.a, callable0);
    }

    public static J g(J j0) {
        if(j0 == null) {
            throw new NullPointerException("scheduler == null");
        }
        return a.b == null ? j0 : ((J)a.a(a.b, j0));
    }

    public static void h() {
        a.i(null);
        a.j(null);
    }

    public static void i(o o0) {
        a.a = o0;
    }

    public static void j(o o0) {
        a.b = o0;
    }
}

