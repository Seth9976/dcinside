package com.google.common.util.concurrent;

import J1.b;
import J1.c;
import J1.d;
import com.google.common.base.H;
import com.google.common.base.Q;
import java.util.concurrent.Callable;

@b(emulated = true)
@N
public final class F {
    // 检测为 Lambda 实现
    public static Object d(Object object0) [...]

    @c
    @d
    public static v e(Callable callable0, y0 y00) {
        H.E(callable0);
        H.E(y00);
        return new C(y00, callable0);
    }

    private static Object g(Object object0) throws Exception [...] // Inlined contents

    // 检测为 Lambda 实现
    private static Object h(Q q0, Callable callable0) throws Exception [...]

    // 检测为 Lambda 实现
    private static void i(Q q0, Runnable runnable0) [...]

    public static Callable j(@F0 Object object0) {
        return () -> object0;
    }

    @c
    @d
    static Runnable k(Runnable runnable0, Q q0) {
        H.E(q0);
        H.E(runnable0);
        return () -> {
            Thread thread0 = Thread.currentThread();
            boolean z = F.m(((String)q0.get()), thread0);
            try {
                runnable0.run();
            }
            catch(Throwable throwable0) {
                if(z) {
                    F.m("jeb-dexdec-sb-st-7674", thread0);
                }
                throw throwable0;
            }
            if(z) {
                F.m("jeb-dexdec-sb-st-7674", thread0);
            }
        };
    }

    @c
    @d
    static Callable l(Callable callable0, Q q0) {
        H.E(q0);
        H.E(callable0);
        return () -> {
            Object object0;
            Thread thread0 = Thread.currentThread();
            boolean z = F.m(((String)q0.get()), thread0);
            try {
                object0 = callable0.call();
            }
            catch(Throwable throwable0) {
                if(z) {
                    F.m("jeb-dexdec-sb-st-7680", thread0);
                }
                throw throwable0;
            }
            if(z) {
                F.m("jeb-dexdec-sb-st-7680", thread0);
            }
            return object0;
        };
    }

    @c
    @d
    private static boolean m(String s, Thread thread0) {
        try {
            thread0.setName(s);
            return true;
        }
        catch(SecurityException unused_ex) {
            return false;
        }
    }
}

