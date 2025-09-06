package kotlinx.coroutines.internal;

import A3.a;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.locks.ReentrantLock;
import y4.l;
import y4.m;

public final class e {
    @m
    private static final Method a;

    static {
        Method method0 = null;
        try {
            method0 = ScheduledThreadPoolExecutor.class.getMethod("setRemoveOnCancelPolicy", Boolean.TYPE);
        }
        catch(Throwable unused_ex) {
        }
        e.a = method0;
    }

    public static void a() {
    }

    public static void b() {
    }

    @l
    public static final Set c(int v) {
        return Collections.newSetFromMap(new IdentityHashMap(v));
    }

    public static final boolean d(@l Executor executor0) {
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = executor0 instanceof ScheduledThreadPoolExecutor ? ((ScheduledThreadPoolExecutor)executor0) : null;
            if(scheduledThreadPoolExecutor0 == null) {
                return false;
            }
            Method method0 = e.a;
            if(method0 == null) {
                return false;
            }
            method0.invoke(scheduledThreadPoolExecutor0, Boolean.TRUE);
            return true;
        }
        catch(Throwable unused_ex) {
            return false;
        }
    }

    public static final Object e(@l ReentrantLock reentrantLock0, @l a a0) {
        reentrantLock0.lock();
        try {
            return a0.invoke();
        }
        finally {
            reentrantLock0.unlock();
        }
    }
}

