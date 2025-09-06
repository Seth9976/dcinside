package io.reactivex.internal.schedulers;

import androidx.compose.animation.core.d;
import e3.o;
import j..util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class p {
    static final class a implements Runnable {
        @Override
        public void run() {
            for(Object object0: new ArrayList(p.f.keySet())) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = (ScheduledThreadPoolExecutor)object0;
                if(scheduledThreadPoolExecutor0.isShutdown()) {
                    p.f.remove(scheduledThreadPoolExecutor0);
                }
                else {
                    scheduledThreadPoolExecutor0.purge();
                }
            }
        }
    }

    static final class b implements o {
        public String a(String s) throws Exception {
            return System.getProperty(s);
        }

        @Override  // e3.o
        public Object apply(Object object0) throws Exception {
            return this.a(((String)object0));
        }
    }

    static final String a = "rx2.purge-enabled";
    public static final boolean b = false;
    static final String c = "rx2.purge-period-seconds";
    public static final int d;
    static final AtomicReference e;
    static final Map f;

    static {
        p.e = new AtomicReference();
        p.f = new ConcurrentHashMap();
        b p$b0 = new b();
        boolean z = p.b(true, "rx2.purge-enabled", true, true, p$b0);
        p.b = z;
        p.d = p.c(z, "rx2.purge-period-seconds", 1, 1, p$b0);
        p.e();
    }

    private p() {
        throw new IllegalStateException("No instances!");
    }

    public static ScheduledExecutorService a(ThreadFactory threadFactory0) {
        ScheduledExecutorService scheduledExecutorService0 = Executors.newScheduledThreadPool(1, threadFactory0);
        p.f(p.b, scheduledExecutorService0);
        return scheduledExecutorService0;
    }

    static boolean b(boolean z, String s, boolean z1, boolean z2, o o0) {
        if(z) {
            try {
                String s1 = (String)o0.apply(s);
                return s1 == null ? z1 : "true".equals(s1);
            }
            catch(Throwable unused_ex) {
                return z1;
            }
        }
        return z2;
    }

    static int c(boolean z, String s, int v, int v1, o o0) {
        if(z) {
            try {
                String s1 = (String)o0.apply(s);
                return s1 == null ? v : Integer.parseInt(s1);
            }
            catch(Throwable unused_ex) {
                return v;
            }
        }
        return v1;
    }

    public static void d() {
        ScheduledExecutorService scheduledExecutorService0 = (ScheduledExecutorService)p.e.getAndSet(null);
        if(scheduledExecutorService0 != null) {
            scheduledExecutorService0.shutdownNow();
        }
        p.f.clear();
    }

    public static void e() {
        p.g(p.b);
    }

    static void f(boolean z, ScheduledExecutorService scheduledExecutorService0) {
        if(z && scheduledExecutorService0 instanceof ScheduledThreadPoolExecutor) {
            p.f.put(((ScheduledThreadPoolExecutor)scheduledExecutorService0), scheduledExecutorService0);
        }
    }

    static void g(boolean z) {
        if(z) {
            while(true) {
                AtomicReference atomicReference0 = p.e;
                if(((ScheduledExecutorService)atomicReference0.get()) != null) {
                    return;
                }
                ScheduledExecutorService scheduledExecutorService0 = Executors.newScheduledThreadPool(1, new k("RxSchedulerPurge"));
                if(d.a(atomicReference0, null, scheduledExecutorService0)) {
                    scheduledExecutorService0.scheduleAtFixedRate(new a(), ((long)p.d), ((long)p.d), TimeUnit.SECONDS);
                    return;
                }
                scheduledExecutorService0.shutdownNow();
            }
        }
    }
}

