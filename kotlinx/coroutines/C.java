package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlin.S0;
import kotlin.internal.f;
import y4.m;

public final class c {
    @m
    private static b a;

    static {
    }

    @f
    private static final long c() {
        b b0 = c.a;
        return b0 == null ? System.currentTimeMillis() : b0.a();
    }

    public static final void d(@m b b0) {
        c.a = b0;
    }

    @f
    private static final long e() {
        b b0 = c.a;
        return b0 == null ? System.nanoTime() : b0.b();
    }

    @f
    private static final void f(Object object0, long v) {
        S0 s00;
        b b0 = c.a;
        if(b0 == null) {
            s00 = null;
        }
        else {
            b0.c(object0, v);
            s00 = S0.a;
        }
        if(s00 == null) {
            LockSupport.parkNanos(object0, v);
        }
    }

    @f
    private static final void g() {
        b b0 = c.a;
        if(b0 != null) {
            b0.d();
        }
    }

    @f
    private static final void h() {
        b b0 = c.a;
        if(b0 != null) {
            b0.e();
        }
    }

    @f
    private static final void i() {
        b b0 = c.a;
        if(b0 != null) {
            b0.f();
        }
    }

    @f
    private static final void j(Thread thread0) {
        S0 s00;
        b b0 = c.a;
        if(b0 == null) {
            s00 = null;
        }
        else {
            b0.g(thread0);
            s00 = S0.a;
        }
        if(s00 == null) {
            LockSupport.unpark(thread0);
        }
    }

    @f
    private static final void k() {
        b b0 = c.a;
        if(b0 != null) {
            b0.h();
        }
    }

    @f
    private static final Runnable l(Runnable runnable0) {
        b b0 = c.a;
        if(b0 != null) {
            Runnable runnable1 = b0.i(runnable0);
            return runnable1 == null ? runnable0 : runnable1;
        }
        return runnable0;
    }
}

